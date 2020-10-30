window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.MeuPrimeiroBloco = window.blockly.js.blockly.MeuPrimeiroBloco || {};

/**
 * MeuPrimeiroBloco
 */
window.blockly.js.blockly.MeuPrimeiroBloco.olamundo = async function() {
 var item;
  this.cronapi.screen.notify('success','Olá mundo!');
  console.log('Olá mundo!');
}
