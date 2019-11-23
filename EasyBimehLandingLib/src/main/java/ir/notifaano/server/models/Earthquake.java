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
public class Earthquake 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 8470987634418043642L;
    private boolean hasPlan;
    private int insuranceCentreProvinceId;
    private int insuranceCentreCityId;
    private List<ComboDataModel> insuranceCentreCities;
    private List<ComboDataModel> buildingTypes;
    private List<ComboDataModel> skeletonTypeBuildings;
    private List<ComboDataModel> buildingUseTypes;
    private List<InsurancePolicyTerm> insurancePolicyTerms;
    private List<String> insuranceExtraCoverage;
    private List<EverySquareMeterCoverage> everySquareMeterCoverage;
    private List<Province> provinces;
    private List<String> cities;
    private List<String> cityRegions;
    private List<ShippingType> shippingTypes;
    private List<PostType> postTypes;
    private InsurancePolicyCondition insurancePolicyCondition;
    private InsuranceDataFireInsurance insuranceData;
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
    @JsonGetter("insuranceCentreProvinceId")
    public int getInsuranceCentreProvinceId ( ) { 
        return this.insuranceCentreProvinceId;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("insuranceCentreProvinceId")
    public void setInsuranceCentreProvinceId (int value) { 
        this.insuranceCentreProvinceId = value;
        notifyObservers(this.insuranceCentreProvinceId);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("insuranceCentreCityId")
    public int getInsuranceCentreCityId ( ) { 
        return this.insuranceCentreCityId;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("insuranceCentreCityId")
    public void setInsuranceCentreCityId (int value) { 
        this.insuranceCentreCityId = value;
        notifyObservers(this.insuranceCentreCityId);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("insuranceCentreCities")
    public List<ComboDataModel> getInsuranceCentreCities ( ) { 
        return this.insuranceCentreCities;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("insuranceCentreCities")
    public void setInsuranceCentreCities (List<ComboDataModel> value) { 
        this.insuranceCentreCities = value;
        notifyObservers(this.insuranceCentreCities);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("buildingTypes")
    public List<ComboDataModel> getBuildingTypes ( ) { 
        return this.buildingTypes;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("buildingTypes")
    public void setBuildingTypes (List<ComboDataModel> value) { 
        this.buildingTypes = value;
        notifyObservers(this.buildingTypes);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("skeletonTypeBuildings")
    public List<ComboDataModel> getSkeletonTypeBuildings ( ) { 
        return this.skeletonTypeBuildings;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("skeletonTypeBuildings")
    public void setSkeletonTypeBuildings (List<ComboDataModel> value) { 
        this.skeletonTypeBuildings = value;
        notifyObservers(this.skeletonTypeBuildings);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("buildingUseTypes")
    public List<ComboDataModel> getBuildingUseTypes ( ) { 
        return this.buildingUseTypes;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("buildingUseTypes")
    public void setBuildingUseTypes (List<ComboDataModel> value) { 
        this.buildingUseTypes = value;
        notifyObservers(this.buildingUseTypes);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("insurancePolicyTerms")
    public List<InsurancePolicyTerm> getInsurancePolicyTerms ( ) { 
        return this.insurancePolicyTerms;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("insurancePolicyTerms")
    public void setInsurancePolicyTerms (List<InsurancePolicyTerm> value) { 
        this.insurancePolicyTerms = value;
        notifyObservers(this.insurancePolicyTerms);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("insuranceExtraCoverage")
    public List<String> getInsuranceExtraCoverage ( ) { 
        return this.insuranceExtraCoverage;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("insuranceExtraCoverage")
    public void setInsuranceExtraCoverage (List<String> value) { 
        this.insuranceExtraCoverage = value;
        notifyObservers(this.insuranceExtraCoverage);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("everySquareMeterCoverage")
    public List<EverySquareMeterCoverage> getEverySquareMeterCoverage ( ) { 
        return this.everySquareMeterCoverage;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("everySquareMeterCoverage")
    public void setEverySquareMeterCoverage (List<EverySquareMeterCoverage> value) { 
        this.everySquareMeterCoverage = value;
        notifyObservers(this.everySquareMeterCoverage);
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
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("insuranceData")
    public InsuranceDataFireInsurance getInsuranceData ( ) { 
        return this.insuranceData;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("insuranceData")
    public void setInsuranceData (InsuranceDataFireInsurance value) { 
        this.insuranceData = value;
        notifyObservers(this.insuranceData);
    }
 
}
