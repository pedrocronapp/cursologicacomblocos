package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
* Classe que representa a tabela LOGIN
* @generated
*/
@Entity
@Table(name = "\"LOGIN\"")
@XmlRootElement
@CronappSecurity(post = "Administrators", get = "Administrators", delete = "Administrators", put = "Administrators")
@JsonFilter("app.entity.Login")
public class Login implements Serializable {

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
        private java.lang.String id;

    /**
    * @generated
    */
    @Column(name = "login_provider", nullable = false, unique = false, length=255, insertable=true, updatable=true)
        
        private java.lang.String loginProvider;

    /**
    * @generated
    */
    @Column(name = "provider_display_name", nullable = false, unique = false, length=255, insertable=true, updatable=true)
        
        private java.lang.String providerDisplayName;

    /**
    * @generated
    */
    @Column(name = "provider_key", nullable = false, unique = false, length=255, insertable=true, updatable=true)
        
        private java.lang.String providerKey;

    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="user_id", nullable = false, referencedColumnName = "id", insertable=true, updatable=true)
        
        private User user;

    /**
    * Construtor
    * @generated
    */
    public Login(){
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
    public Login setId(java.lang.String id){
        this.id = id;
        return this;
    }
    /**
    * Obtém loginProvider
    * return loginProvider
    * @generated
    */
    
    public java.lang.String getLoginProvider(){
        return this.loginProvider;
    }

    /**
    * Define loginProvider
    * @param loginProvider loginProvider
    * @generated
    */
    public Login setLoginProvider(java.lang.String loginProvider){
        this.loginProvider = loginProvider;
        return this;
    }
    /**
    * Obtém providerDisplayName
    * return providerDisplayName
    * @generated
    */
    
    public java.lang.String getProviderDisplayName(){
        return this.providerDisplayName;
    }

    /**
    * Define providerDisplayName
    * @param providerDisplayName providerDisplayName
    * @generated
    */
    public Login setProviderDisplayName(java.lang.String providerDisplayName){
        this.providerDisplayName = providerDisplayName;
        return this;
    }
    /**
    * Obtém providerKey
    * return providerKey
    * @generated
    */
    
    public java.lang.String getProviderKey(){
        return this.providerKey;
    }

    /**
    * Define providerKey
    * @param providerKey providerKey
    * @generated
    */
    public Login setProviderKey(java.lang.String providerKey){
        this.providerKey = providerKey;
        return this;
    }
    /**
    * Obtém user
    * return user
    * @generated
    */
    
    public User getUser(){
        return this.user;
    }

    /**
    * Define user
    * @param user user
    * @generated
    */
    public Login setUser(User user){
        this.user = user;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Login object = (Login)obj;
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