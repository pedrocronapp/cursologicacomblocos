var cordovaApp = {
  init: function() {
    document.addEventListener('deviceready', this.onDeviceReady.bind(this), false);
  },
  onDeviceReady: function() {
      // push notification
      let firebase = window.FirebasePlugin;
      let hostapp = window.hostApp;
      let device = window.device;
      let build = window.BuildInfo;

    // get token firebase
    if (firebase && hostapp && device) {

      firebase.hasPermission((data) => {
        if (data.isEnabled) {
          console.log("Firebase Permission Already Granted");
        } else {
          firebase.grantPermission(() => {
            console.log("Firebase Permission Granted", data.isEnabled);
          }, (error) => {
            console.error("Unable to Grant Firebase Permission", error);
          });
        }
      }, error => {
        console.log("Firebase hasPermission Failed", error);
      });

      let appURL = hostapp + 'device';
      firebase.getToken(function(code) {
        let data  = { id : device.uuid,
                      appName : build.packageName,
                      appVersion : build.version,
                      platform : device.platform,
                      platformVersion : device.version,
                      model : device.model,
                      token : code };
        $.post(appURL, data).done(function(d) {
          console.log('Received Event: device send');
        });
      }.bind(this),
      function(err) {
        console.error(err);
      });
    }
  }
};
cordovaApp.init();