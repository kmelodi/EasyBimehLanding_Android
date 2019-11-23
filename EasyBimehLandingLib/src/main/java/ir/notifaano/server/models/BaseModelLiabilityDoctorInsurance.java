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
public class BaseModelLiabilityDoctorInsurance 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 6066814620017736723L;
    private boolean isSuccess;
    private int status;
    private LiabilityDoctorInsurance message;
    private String extraData;
    private String exception;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("isSuccess")
    public boolean getIsSuccess ( ) { 
        return this.isSuccess;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("isSuccess")
    public void setIsSuccess (boolean value) { 
        this.isSuccess = value;
        notifyObservers(this.isSuccess);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("status")
    public int getStatus ( ) { 
        return this.status;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("status")
    public void setStatus (int value) { 
        this.status = value;
        notifyObservers(this.status);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("message")
    public LiabilityDoctorInsurance getMessage ( ) { 
        return this.message;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("message")
    public void setMessage (LiabilityDoctorInsurance value) { 
        this.message = value;
        notifyObservers(this.message);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("extraData")
    public String getExtraData ( ) { 
        return this.extraData;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("extraData")
    public void setExtraData (String value) { 
        this.extraData = value;
        notifyObservers(this.extraData);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("exception")
    public String getException ( ) { 
        return this.exception;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("exception")
    public void setException (String value) { 
        this.exception = value;
        notifyObservers(this.exception);
    }
 
}
