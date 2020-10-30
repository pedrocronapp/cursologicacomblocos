package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
* Classe que representa a tabela ROLE
* @generated
*/
@Entity
@Table(name = "\"ROLE\"")
@XmlRootElement
@CronappSecurity(post = "Administrators", get = "Administrators", delete = "Administrators", put = "Administrators")
@JsonFilter("app.entity.Role")
public class Role implements Serializable {

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
    @Column(name = "builtin", nullable = false, unique = false, insertable=true, updatable=true)
        
        private java.lang.Boolean builtIn = false;

    /**
    * @generated
    */
    @Column(name = "membership_enabled", nullable = false, unique = false, insertable=true, updatable=true)
        
        private java.lang.Boolean membershipEnabled = true;

    /**
    * @generated
    */
    @Column(name = "name", nullable = false, unique = false, length=255, insertable=true, updatable=true)
        
        private java.lang.String name;

    /**
    * @generated
    */
    @Column(name = "normalized_name", nullable = false, unique = false, length=255, insertable=true, updatable=true)
        
        private java.lang.String normalizedName = "";

    /**
    * Construtor
    * @generated
    */
    public Role(){
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
    public Role setId(java.lang.String id){
        this.id = id;
        return this;
    }
    /**
    * Obtém builtIn
    * return builtIn
    * @generated
    */
    
    public java.lang.Boolean getBuiltIn(){
        return this.builtIn;
    }

    /**
    * Define builtIn
    * @param builtIn builtIn
    * @generated
    */
    public Role setBuiltIn(java.lang.Boolean builtIn){
        this.builtIn = builtIn;
        return this;
    }
    /**
    * Obtém membershipEnabled
    * return membershipEnabled
    * @generated
    */
    
    public java.lang.Boolean getMembershipEnabled(){
        return this.membershipEnabled;
    }

    /**
    * Define membershipEnabled
    * @param membershipEnabled membershipEnabled
    * @generated
    */
    public Role setMembershipEnabled(java.lang.Boolean membershipEnabled){
        this.membershipEnabled = membershipEnabled;
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
    public Role setName(java.lang.String name){
        this.name = name;
        return this;
    }
    /**
    * Obtém normalizedName
    * return normalizedName
    * @generated
    */
    
    public java.lang.String getNormalizedName(){
        return this.normalizedName;
    }

    /**
    * Define normalizedName
    * @param normalizedName normalizedName
    * @generated
    */
    public Role setNormalizedName(java.lang.String normalizedName){
        this.normalizedName = normalizedName;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Role object = (Role)obj;
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