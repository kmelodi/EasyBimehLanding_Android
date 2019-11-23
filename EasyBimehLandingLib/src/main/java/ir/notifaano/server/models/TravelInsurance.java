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
public class TravelInsurance 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = -8610312968211639252L;
    private boolean hasPlan;
    private boolean isSamanInsurance;
    private List<Zone> zones;
    private List<TravelDuration> travelDurations;
    private List<TravelAge> travelAges;
    private List<Province> provinces;
    private List<String> cities;
    private List<String> cityRegions;
    private List<ShippingType> shippingTypes;
    private List<PostType> postTypes;
    private InsuranceDataTravelInsurance insuranceData;
    private InsurancePolicyCondition insurancePolicyCondition;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("hasPlan")
    public boolean getHasPlan ( ) { 
        return this.hasPlan;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("hasPlan")
    public void setHasPlan (boolean value) { 
        this.hasPlan = value;
        notifyObservers(this.hasPlan);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("isSamanInsurance")
    public boolean getIsSamanInsurance ( ) { 
        return this.isSamanInsurance;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("isSamanInsurance")
    public void setIsSamanInsurance (boolean value) { 
        this.isSamanInsurance = value;
        notifyObservers(this.isSamanInsurance);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("zones")
    public List<Zone> getZones ( ) { 
        return this.zones;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("zones")
    public void setZones (List<Zone> value) { 
        this.zones = value;
        notifyObservers(this.zones);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("travelDurations")
    public List<TravelDuration> getTravelDurations ( ) { 
        return this.travelDurations;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("travelDurations")
    public void setTravelDurations (List<TravelDuration> value) { 
        this.travelDurations = value;
        notifyObservers(this.travelDurations);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("travelAges")
    public List<TravelAge> getTravelAges ( ) { 
        return this.travelAges;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("travelAges")
    public void setTravelAges (List<TravelAge> value) { 
        this.travelAges = value;
        notifyObservers(this.travelAges);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("provinces")
    public List<Province> getProvinces ( ) { 
        return this.provinces;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("provinces")
    public void setProvinces (List<Province> value) { 
        this.provinces = value;
        notifyObservers(this.provinces);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("cities")
    public List<String> getCities ( ) { 
        return this.cities;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("cities")
    public void setCities (List<String> value) { 
        this.cities = value;
        notifyObservers(this.cities);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("cityRegions")
    public List<String> getCityRegions ( ) { 
        return this.cityRegions;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("cityRegions")
    public void setCityRegions (List<String> value) { 
        this.cityRegions = value;
        notifyObservers(this.cityRegions);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("shippingTypes")
    public List<ShippingType> getShippingTypes ( ) { 
        return this.shippingTypes;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("shippingTypes")
    public void setShippingTypes (List<ShippingType> value) { 
        this.shippingTypes = value;
        notifyObservers(this.shippingTypes);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("postTypes")
    public List<PostType> getPostTypes ( ) { 
        return this.postTypes;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("postTypes")
    public void setPostTypes (List<PostType> value) { 
        this.postTypes = value;
        notifyObservers(this.postTypes);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("insuranceData")
    public InsuranceDataTravelInsurance getInsuranceData ( ) { 
        return this.insuranceData;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("insuranceData")
    public void setInsuranceData (InsuranceDataTravelInsurance value) { 
        this.insuranceData = value;
        notifyObservers(this.insuranceData);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("insurancePolicyCondition")
    public InsurancePolicyCondition getInsurancePolicyCondition ( ) { 
        return this.insurancePolicyCondition;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("insurancePolicyCondition")
    public void setInsurancePolicyCondition (InsurancePolicyCondition value) { 
        this.insurancePolicyCondition = value;
        notifyObservers(this.insurancePolicyCondition);
    }
 
}