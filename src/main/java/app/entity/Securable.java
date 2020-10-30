package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
* Classe que representa a tabela SECURABLE
* @generated
*/
@Entity
@Table(name = "\"SECURABLE\"")
@XmlRootElement
@CronappSecurity(post = "Administrators", get = "Administrators", delete = "Administrators", put = "Administrators")
@JsonFilter("app.entity.Securable")
public class Securable implements Serializable {

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
    @Column(name = "name", nullable = false, unique = false, length=255, insertable=true, updatable=true)
        
        private java.lang.String name;

    /**
    * Construtor
    * @generated
    */
    public Securable(){
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
    public Securable setId(java.lang.String id){
        this.id = id;
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
    public Securable setName(java.lang.String name){
        this.name = name;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Securable object = (Securable)obj;
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