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
public class DeviceBrandTypes 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 4898857671128839098L;
    private int id;
    private String title;
    private int deviceGroup;
    private Integer deviceTypeId;
    private String deviceBrandId;
    private String createOn;
    private String updateOn;
    private String createdBy;
    private String updatedBy;
    private String createOnPersianDate;
    private String updateOnPersianDate;
    private String deviceTypeTitle;
    private String deviceBrandTitle;
    private String deviceTypeBrandModelTitle;
    private List<String> deviceBrandIds;
    private String deviceBrandsTitle;
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
     * TODO: Write general description for this method
     */
    @JsonGetter("title")
    public String getTitle ( ) { 
        return this.title;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("title")
    public void setTitle (String value) { 
        this.title = value;
        notifyObservers(this.title);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("deviceGroup")
    public int getDeviceGroup ( ) { 
        return this.deviceGroup;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("deviceGroup")
    public void setDeviceGroup (int value) { 
        this.deviceGroup = value;
        notifyObservers(this.deviceGroup);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("deviceTypeId")
    public Integer getDeviceTypeId ( ) { 
        return this.deviceTypeId;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("deviceTypeId")
    public void setDeviceTypeId (Integer value) { 
        this.deviceTypeId = value;
        notifyObservers(this.deviceTypeId);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("deviceBrandId")
    public String getDeviceBrandId ( ) { 
        return this.deviceBrandId;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("deviceBrandId")
    public void setDeviceBrandId (String value) { 
        this.deviceBrandId = value;
        notifyObservers(this.deviceBrandId);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("createOn")
    public String getCreateOn ( ) { 
        return this.createOn;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("createOn")
    public void setCreateOn (String value) { 
        this.createOn = value;
        notifyObservers(this.createOn);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("updateOn")
    public String getUpdateOn ( ) { 
        return this.updateOn;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("updateOn")
    public void setUpdateOn (String value) { 
        this.updateOn = value;
        notifyObservers(this.updateOn);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("createdBy")
    public String getCreatedBy ( ) { 
        return this.createdBy;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("createdBy")
    public void setCreatedBy (String value) { 
        this.createdBy = value;
        notifyObservers(this.createdBy);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("updatedBy")
    public String getUpdatedBy ( ) { 
        return this.updatedBy;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("updatedBy")
    public void setUpdatedBy (String value) { 
        this.updatedBy = value;
        notifyObservers(this.updatedBy);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("createOnPersianDate")
    public String getCreateOnPersianDate ( ) { 
        return this.createOnPersianDate;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("createOnPersianDate")
    public void setCreateOnPersianDate (String value) { 
        this.createOnPersianDate = value;
        notifyObservers(this.createOnPersianDate);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("updateOnPersianDate")
    public String getUpdateOnPersianDate ( ) { 
        return this.updateOnPersianDate;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("updateOnPersianDate")
    public void setUpdateOnPersianDate (String value) { 
        this.updateOnPersianDate = value;
        notifyObservers(this.updateOnPersianDate);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("deviceTypeTitle")
    public String getDeviceTypeTitle ( ) { 
        return this.deviceTypeTitle;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("deviceTypeTitle")
    public void setDeviceTypeTitle (String value) { 
        this.deviceTypeTitle = value;
        notifyObservers(this.deviceTypeTitle);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("deviceBrandTitle")
    public String getDeviceBrandTitle ( ) { 
        return this.deviceBrandTitle;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("deviceBrandTitle")
    public void setDeviceBrandTitle (String value) { 
        this.deviceBrandTitle = value;
        notifyObservers(this.deviceBrandTitle);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("deviceTypeBrandModelTitle")
    public String getDeviceTypeBrandModelTitle ( ) { 
        return this.deviceTypeBrandModelTitle;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("deviceTypeBrandModelTitle")
    public void setDeviceTypeBrandModelTitle (String value) { 
        this.deviceTypeBrandModelTitle = value;
        notifyObservers(this.deviceTypeBrandModelTitle);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("deviceBrandIds")
    public List<String> getDeviceBrandIds ( ) { 
        return this.deviceBrandIds;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("deviceBrandIds")
    public void setDeviceBrandIds (List<String> value) { 
        this.deviceBrandIds = value;
        notifyObservers(this.deviceBrandIds);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("deviceBrandsTitle")
    public String getDeviceBrandsTitle ( ) { 
        return this.deviceBrandsTitle;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("deviceBrandsTitle")
    public void setDeviceBrandsTitle (String value) { 
        this.deviceBrandsTitle = value;
        notifyObservers(this.deviceBrandsTitle);
    }
 
}
