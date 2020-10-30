package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
* Classe que representa a tabela AUDIT_LOG
* @generated
*/
@Entity
@Table(name = "\"AUDIT_LOG\"")
@XmlRootElement
@CronappSecurity(post = "Administrators", get = "Administrators", delete = "Administrators", put = "Administrators")
@JsonFilter("app.entity.AuditLog")
public class AuditLog implements Serializable {

    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, insertable=true, updatable=true)
        private java.lang.Integer id;

    /**
    * @generated
    */
    @Column(name = "type", nullable = false, unique = false, insertable=true, updatable=true)
        
        private java.lang.String type;

    /**
    * @generated
    */
    @Column(name = "command", nullable = false, unique = false, insertable=true, updatable=true)
        
        private java.lang.String command;

    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "dateCreated", nullable = false, unique = false, insertable=true, updatable=true, columnDefinition = "TIMESTAMP")
        
        private java.util.Date date;

    /**
    * @generated
    */
    @Column(name = "objectData", nullable = true, unique = false, insertable=true, updatable=true, columnDefinition = "TEXT")
        
        private java.lang.String objectData;

    /**
    * @generated
    */
    @Column(name = "userName", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String user;

    /**
    * @generated
    */
    @Column(name = "host", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String host;

    /**
    * @generated
    */
    @Column(name = "agent", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String agent;

    /**
    * @generated
    */
    @Column(name = "server", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String server;

    /**
    * @generated
    */
    @Column(name = "affectedFields", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String affectedFields;

    /**
    * @generated
    */
    @Column(name = "category", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String category;

    /**
    * @generated
    */
    @Column(name = "application", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String application;

    /**
    * @generated
    */
    @Column(name = "error", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String error;

    /**
    * Construtor
    * @generated
    */
    public AuditLog(){
    }

    /**
    * Obtém id
    * return id
    * @generated
    */
    
    public java.lang.Integer getId(){
        return this.id;
    }

    /**
    * Define id
    * @param id id
    * @generated
    */
    public AuditLog setId(java.lang.Integer id){
        this.id = id;
        return this;
    }
    /**
    * Obtém type
    * return type
    * @generated
    */
    
    public java.lang.String getType(){
        return this.type;
    }

    /**
    * Define type
    * @param type type
    * @generated
    */
    public AuditLog setType(java.lang.String type){
        this.type = type;
        return this;
    }
    /**
    * Obtém command
    * return command
    * @generated
    */
    
    public java.lang.String getCommand(){
        return this.command;
    }

    /**
    * Define command
    * @param command command
    * @generated
    */
    public AuditLog setCommand(java.lang.String command){
        this.command = command;
        return this;
    }
    /**
    * Obtém date
    * return date
    * @generated
    */
    
    public java.util.Date getDate(){
        return this.date;
    }

    /**
    * Define date
    * @param date date
    * @generated
    */
    public AuditLog setDate(java.util.Date date){
        this.date = date;
        return this;
    }
    /**
    * Obtém objectData
    * return objectData
    * @generated
    */
    
    public java.lang.String getObjectData(){
        return this.objectData;
    }

    /**
    * Define objectData
    * @param objectData objectData
    * @generated
    */
    public AuditLog setObjectData(java.lang.String objectData){
        this.objectData = objectData;
        return this;
    }
    /**
    * Obtém user
    * return user
    * @generated
    */
    
    public java.lang.String getUser(){
        return this.user;
    }

    /**
    * Define user
    * @param user user
    * @generated
    */
    public AuditLog setUser(java.lang.String user){
        this.user = user;
        return this;
    }
    /**
    * Obtém host
    * return host
    * @generated
    */
    
    public java.lang.String getHost(){
        return this.host;
    }

    /**
    * Define host
    * @param host host
    * @generated
    */
    public AuditLog setHost(java.lang.String host){
        this.host = host;
        return this;
    }
    /**
    * Obtém agent
    * return agent
    * @generated
    */
    
    public java.lang.String getAgent(){
        return this.agent;
    }

    /**
    * Define agent
    * @param agent agent
    * @generated
    */
    public AuditLog setAgent(java.lang.String agent){
        this.agent = agent;
        return this;
    }
    /**
    * Obtém server
    * return server
    * @generated
    */
    
    public java.lang.String getServer(){
        return this.server;
    }

    /**
    * Define server
    * @param server server
    * @generated
    */
    public AuditLog setServer(java.lang.String server){
        this.server = server;
        return this;
    }
    /**
    * Obtém affectedFields
    * return affectedFields
    * @generated
    */
    
    public java.lang.String getAffectedFields(){
        return this.affectedFields;
    }

    /**
    * Define affectedFields
    * @param affectedFields affectedFields
    * @generated
    */
    public AuditLog setAffectedFields(java.lang.String affectedFields){
        this.affectedFields = affectedFields;
        return this;
    }
    /**
    * Obtém category
    * return category
    * @generated
    */
    
    public java.lang.String getCategory(){
        return this.category;
    }

    /**
    * Define category
    * @param category category
    * @generated
    */
    public AuditLog setCategory(java.lang.String category){
        this.category = category;
        return this;
    }
    /**
    * Obtém application
    * return application
    * @generated
    */
    
    public java.lang.String getApplication(){
        return this.application;
    }

    /**
    * Define application
    * @param application application
    * @generated
    */
    public AuditLog setApplication(java.lang.String application){
        this.application = application;
        return this;
    }
    /**
    * Obtém error
    * return error
    * @generated
    */
    
    public java.lang.String getError(){
        return this.error;
    }

    /**
    * Define error
    * @param error error
    * @generated
    */
    public AuditLog setError(java.lang.String error){
        this.error = error;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
AuditLog object = (AuditLog)obj;
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