/*
 * EasyBimehLandingLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ir.notifaano.server.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.ALWAYS)
public class ComboDataModel 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 6779183065654557909L;
    private int id;
    private String title;
    private String extraData;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("id")
    public int getId ( ) { 
        return this.id;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("id")
    public void setId (int value) { 
        this.id = value;
        notifyObservers(this.id);
    }
 
    /** GETTER
     * عنوان
     */
    @JsonGetter("title")
    public String getTitle ( ) { 
        return this.title;
    }
    
    /** SETTER
     * عنوان
     */
    @JsonSetter("title")
    public void setTitle (String value) { 
        this.title = value;
        notifyObservers(this.title);
    }
 
    /** GETTER
     * اطلاعات اضافه
     */
    @JsonGetter("extraData")
    public String getExtraData ( ) { 
        return this.extraData;
    }
    
    /** SETTER
     * اطلاعات اضافه
     */
    @JsonSetter("extraData")
    public void setExtraData (String value) { 
        this.extraData = value;
        notifyObservers(this.extraData);
    }
 
}
