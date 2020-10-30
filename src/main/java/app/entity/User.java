package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;
    import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


/**
* Classe que representa a tabela USER
* @generated
*/
@Entity
@Table(name = "\"USER\"")
@XmlRootElement
@CronappSecurity(post = "Administrators", get = "Administrators", delete = "Administrators", put = "Administrators")
@JsonFilter("app.entity.User")
public class User implements Serializable {
    /**
    * Variável privada para verificação da criptofrafia
    *
    * @generated
    */
    private static final String ENCRYPT = "$2a$10$";

    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @Column(name = "id", nullable = false, length=255, insertable=true, updatable=true)
        private java.lang.String id = UUID.randomUUID().toString().toUpperCase();

    /**
    * @generated
    */
    @Column(name = "access_failed_count", nullable = false, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer accessFailedCount = 0;

    /**
    * @generated
    */
    @Column(name = "email", nullable = false, unique = false, length=255, insertable=true, updatable=true)
        
        private java.lang.String email;

    /**
    * @generated
    */
    @Column(name = "email_confirmed", nullable = false, unique = false, insertable=true, updatable=true)
        
        private java.lang.Boolean emailConfirmed = true;

    /**
    * @generated
    */
    @Column(name = "lockout_enabled", nullable = false, unique = false, insertable=true, updatable=true)
        
        private java.lang.Boolean lockoutEnabled = false;

    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "lockout_end", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.util.Date lockoutEnd;

    /**
    * @generated
    */
    @Column(name = "name", nullable = false, unique = false, length=255, insertable=true, updatable=true)
        
        private java.lang.String name;

    /**
    * @generated
    */
    @Column(name = "normalized_email", nullable = false, unique = false, length=255, insertable=true, updatable=true)
        
        private java.lang.String normalizedEmail = "";

    /**
    * @generated
    */
    @Column(name = "normalized_user_name", nullable = false, unique = false, length=255, insertable=true, updatable=true)
        
        private java.lang.String normalizedUserName = "";

    /**
    * @generated
    */
    @Column(name = "password", nullable = false, unique = false, length=255, insertable=true, updatable=true)
        
        private java.lang.String password;

    /**
    * @generated
    */
    @Column(name = "phone_number", nullable = true, unique = false, length=255, insertable=true, updatable=true)
        
        private java.lang.String phoneNumber;

    /**
    * @generated
    */
    @Column(name = "phone_number_confirmed", nullable = false, unique = false, insertable=true, updatable=true)
        
        private java.lang.Boolean phoneNumberConfirmed = true;

    /**
    * @generated
    */
    @Column(name = "security_stamp", nullable = false, unique = false, length=255, insertable=true, updatable=true)
        
        private java.lang.String securityStamp = UUID.randomUUID().toString().toUpperCase();

    /**
    * @generated
    */
    @Column(name = "two_factor_enabled", nullable = false, unique = false, insertable=true, updatable=true)
        
        private java.lang.Boolean twoFactorEnabled = false;

    /**
    * @generated
    */
    @Column(name = "user_name", nullable = false, unique = false, length=255, insertable=true, updatable=true)
        
        private java.lang.String userName;

    /**
    * @generated
    */
    @Column(name = "theme", nullable = true, unique = false, length=255, insertable=true, updatable=true)
        
        private java.lang.String theme;

    /**
    * @generated
    */
    @Column(name = "picture", nullable = true, unique = false, length=255, insertable=true, updatable=true)
        
        private java.lang.String picture;

    /**
    * Construtor
    * @generated
    */
    public User(){
    }

    /**
    * Obtém id
    * return id
    * @generated
    */
    
    public java.lang.String getId(){
        return this.id;
    }

    /**
    * Define id
    * @param id id
    * @generated
    */
    public User setId(java.lang.String id){
        this.id = id;
        return this;
    }
    /**
    * Obtém accessFailedCount
    * return accessFailedCount
    * @generated
    */
    
    public java.lang.Integer getAccessFailedCount(){
        return this.accessFailedCount;
    }

    /**
    * Define accessFailedCount
    * @param accessFailedCount accessFailedCount
    * @generated
    */
    public User setAccessFailedCount(java.lang.Integer accessFailedCount){
        this.accessFailedCount = accessFailedCount;
        return this;
    }
    /**
    * Obtém email
    * return email
    * @generated
    */
    
    public java.lang.String getEmail(){
        return this.email;
    }

    /**
    * Define email
    * @param email email
    * @generated
    */
    public User setEmail(java.lang.String email){
        this.email = email;
        return this;
    }
    /**
    * Obtém emailConfirmed
    * return emailConfirmed
    * @generated
    */
    
    public java.lang.Boolean getEmailConfirmed(){
        return this.emailConfirmed;
    }

    /**
    * Define emailConfirmed
    * @param emailConfirmed emailConfirmed
    * @generated
    */
    public User setEmailConfirmed(java.lang.Boolean emailConfirmed){
        this.emailConfirmed = emailConfirmed;
        return this;
    }
    /**
    * Obtém lockoutEnabled
    * return lockoutEnabled
    * @generated
    */
    
    public java.lang.Boolean getLockoutEnabled(){
        return this.lockoutEnabled;
    }

    /**
    * Define lockoutEnabled
    * @param lockoutEnabled lockoutEnabled
    * @generated
    */
    public User setLockoutEnabled(java.lang.Boolean lockoutEnabled){
        this.lockoutEnabled = lockoutEnabled;
        return this;
    }
    /**
    * Obtém lockoutEnd
    * return lockoutEnd
    * @generated
    */
    
    public java.util.Date getLockoutEnd(){
        return this.lockoutEnd;
    }

    /**
    * Define lockoutEnd
    * @param lockoutEnd lockoutEnd
    * @generated
    */
    public User setLockoutEnd(java.util.Date lockoutEnd){
        this.lockoutEnd = lockoutEnd;
        return this;
    }
    /**
    * Obtém name
    * return name
    * @generated
    */
    
    public java.lang.String getName(){
        return this.name;
    }

    /**
    * Define name
    * @param name name
    * @generated
    */
    public User setName(java.lang.String name){
        this.name = name;
        return this;
    }
    /**
    * Obtém normalizedEmail
    * return normalizedEmail
    * @generated
    */
    
    public java.lang.String getNormalizedEmail(){
        return this.normalizedEmail;
    }

    /**
    * Define normalizedEmail
    * @param normalizedEmail normalizedEmail
    * @generated
    */
    public User setNormalizedEmail(java.lang.String normalizedEmail){
        this.normalizedEmail = normalizedEmail;
        return this;
    }
    /**
    * Obtém normalizedUserName
    * return normalizedUserName
    * @generated
    */
    
    public java.lang.String getNormalizedUserName(){
        return this.normalizedUserName;
    }

    /**
    * Define normalizedUserName
    * @param normalizedUserName normalizedUserName
    * @generated
    */
    public User setNormalizedUserName(java.lang.String normalizedUserName){
        this.normalizedUserName = normalizedUserName;
        return this;
    }
    /**
    * Obtém password
    * return password
    * @generated
    */
    
    public java.lang.String getPassword(){
        return this.password;
    }

    /**
    * Define password
    * @param password password
    * @generated
    */
    public User setPassword(java.lang.String password){
        password = password.startsWith(ENCRYPT) ? password : new BCryptPasswordEncoder().encode(password);
        this.password = password;
        return this;
    }
    /**
    * Obtém phoneNumber
    * return phoneNumber
    * @generated
    */
    
    public java.lang.String getPhoneNumber(){
        return this.phoneNumber;
    }

    /**
    * Define phoneNumber
    * @param phoneNumber phoneNumber
    * @generated
    */
    public User setPhoneNumber(java.lang.String phoneNumber){
        this.phoneNumber = phoneNumber;
        return this;
    }
    /**
    * Obtém phoneNumberConfirmed
    * return phoneNumberConfirmed
    * @generated
    */
    
    public java.lang.Boolean getPhoneNumberConfirmed(){
        return this.phoneNumberConfirmed;
    }

    /**
    * Define phoneNumberConfirmed
    * @param phoneNumberConfirmed phoneNumberConfirmed
    * @generated
    */
    public User setPhoneNumberConfirmed(java.lang.Boolean phoneNumberConfirmed){
        this.phoneNumberConfirmed = phoneNumberConfirmed;
        return this;
    }
    /**
    * Obtém securityStamp
    * return securityStamp
    * @generated
    */
    
    public java.lang.String getSecurityStamp(){
        return this.securityStamp;
    }

    /**
    * Define securityStamp
    * @param securityStamp securityStamp
    * @generated
    */
    public User setSecurityStamp(java.lang.String securityStamp){
        this.securityStamp = securityStamp;
        return this;
    }
    /**
    * Obtém twoFactorEnabled
    * return twoFactorEnabled
    * @generated
    */
    
    public java.lang.Boolean getTwoFactorEnabled(){
        return this.twoFactorEnabled;
    }

    /**
    * Define twoFactorEnabled
    * @param twoFactorEnabled twoFactorEnabled
    * @generated
    */
    public User setTwoFactorEnabled(java.lang.Boolean twoFactorEnabled){
        this.twoFactorEnabled = twoFactorEnabled;
        return this;
    }
    /**
    * Obtém userName
    * return userName
    * @generated
    */
    
    public java.lang.String getUserName(){
        return this.userName;
    }

    /**
    * Define userName
    * @param userName userName
    * @generated
    */
    public User setUserName(java.lang.String userName){
        this.userName = userName;
        return this;
    }
    /**
    * Obtém theme
    * return theme
    * @generated
    */
    
    public java.lang.String getTheme(){
        return this.theme;
    }

    /**
    * Define theme
    * @param theme theme
    * @generated
    */
    public User setTheme(java.lang.String theme){
        this.theme = theme;
        return this;
    }
    /**
    * Obtém picture
    * return picture
    * @generated
    */
    
    public java.lang.String getPicture(){
        return this.picture;
    }

    /**
    * Define picture
    * @param picture picture
    * @generated
    */
    public User setPicture(java.lang.String picture){
        this.picture = picture;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
User object = (User)obj;
        if (id != null ? !id.equals(object.id) : object.id != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

}