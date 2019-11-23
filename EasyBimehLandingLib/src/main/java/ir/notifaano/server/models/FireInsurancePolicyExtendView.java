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
public class FireInsurancePolicyExtendView 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 9155768184667449710L;
    private String buildingTypeParamId;
    private String skeletonTypeBuildingParamId;
    private String buildingUseTypeParamId;
    private String unitCount;
    private int everySquareMeterCoverageRateId;
    private String cityId;
    private String provinceId;
    private String buildingArea;
    private String valueOfAppliancesFurnishing;
    private String insuranceCoverageIds;
    private boolean onlyAppliancesFurnishings;
    private String insuranceCoveragePrice;
    private String insurancePolicyCommitmentCeiling;
    private String valuePerSquareMeterRate;
    private String buildYear;
    private String zipCode;
    private String addressPlaceBuilding;
    private int riskLevelDiscount;
    private String basePremium;
    private String allPremium;
    private int insuranceCompanyDiscountRate;
    private int insuranceCompanyDiscount;
    private int insuranceCentreDiscount;
    private int coupenDiscount;
    private int allDiscount;
    private int exchangePremium;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("buildingTypeParamId")
    public String getBuildingTypeParamId ( ) { 
        return this.buildingTypeParamId;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("buildingTypeParamId")
    public void setBuildingTypeParamId (String value) { 
        this.buildingTypeParamId = value;
        notifyObservers(this.buildingTypeParamId);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("skeletonTypeBuildingParamId")
    public String getSkeletonTypeBuildingParamId ( ) { 
        return this.skeletonTypeBuildingParamId;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("skeletonTypeBuildingParamId")
    public void setSkeletonTypeBuildingParamId (String value) { 
        this.skeletonTypeBuildingParamId = value;
        notifyObservers(this.skeletonTypeBuildingParamId);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("buildingUseTypeParamId")
    public String getBuildingUseTypeParamId ( ) { 
        return this.buildingUseTypeParamId;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("buildingUseTypeParamId")
    public void setBuildingUseTypeParamId (String value) { 
        this.buildingUseTypeParamId = value;
        notifyObservers(this.buildingUseTypeParamId);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("unitCount")
    public String getUnitCount ( ) { 
        return this.unitCount;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("unitCount")
    public void setUnitCount (String value) { 
        this.unitCount = value;
        notifyObservers(this.unitCount);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("everySquareMeterCoverageRateId")
    public int getEverySquareMeterCoverageRateId ( ) { 
        return this.everySquareMeterCoverageRateId;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("everySquareMeterCoverageRateId")
    public void setEverySquareMeterCoverageRateId (int value) { 
        this.everySquareMeterCoverageRateId = value;
        notifyObservers(this.everySquareMeterCoverageRateId);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("cityId")
    public String getCityId ( ) { 
        return this.cityId;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("cityId")
    public void setCityId (String value) { 
        this.cityId = value;
        notifyObservers(this.cityId);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("provinceId")
    public String getProvinceId ( ) { 
        return this.provinceId;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("provinceId")
    public void setProvinceId (String value) { 
        this.provinceId = value;
        notifyObservers(this.provinceId);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("buildingArea")
    public String getBuildingArea ( ) { 
        return this.buildingArea;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("buildingArea")
    public void setBuildingArea (String value) { 
        this.buildingArea = value;
        notifyObservers(this.buildingArea);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("valueOfAppliancesFurnishing")
    public String getValueOfAppliancesFurnishing ( ) { 
        return this.valueOfAppliancesFurnishing;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("valueOfAppliancesFurnishing")
    public void setValueOfAppliancesFurnishing (String value) { 
        this.valueOfAppliancesFurnishing = value;
        notifyObservers(this.valueOfAppliancesFurnishing);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("_InsuranceCoverageIds")
    public String getInsuranceCoverageIds ( ) { 
        return this.insuranceCoverageIds;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("_InsuranceCoverageIds")
    public void setInsuranceCoverageIds (String value) { 
        this.insuranceCoverageIds = value;
        notifyObservers(this.insuranceCoverageIds);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("onlyAppliancesFurnishings")
    public boolean getOnlyAppliancesFurnishings ( ) { 
        return this.onlyAppliancesFurnishings;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("onlyAppliancesFurnishings")
    public void setOnlyAppliancesFurnishings (boolean value) { 
        this.onlyAppliancesFurnishings = value;
        notifyObservers(this.onlyAppliancesFurnishings);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("insuranceCoveragePrice")
    public String getInsuranceCoveragePrice ( ) { 
        return this.insuranceCoveragePrice;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("insuranceCoveragePrice")
    public void setInsuranceCoveragePrice (String value) { 
        this.insuranceCoveragePrice = value;
        notifyObservers(this.insuranceCoveragePrice);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("insurancePolicyCommitmentCeiling")
    public String getInsurancePolicyCommitmentCeiling ( ) { 
        return this.insurancePolicyCommitmentCeiling;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("insurancePolicyCommitmentCeiling")
    public void setInsurancePolicyCommitmentCeiling (String value) { 
        this.insurancePolicyCommitmentCeiling = value;
        notifyObservers(this.insurancePolicyCommitmentCeiling);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("valuePerSquareMeterRate")
    public String getValuePerSquareMeterRate ( ) { 
        return this.valuePerSquareMeterRate;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("valuePerSquareMeterRate")
    public void setValuePerSquareMeterRate (String value) { 
        this.valuePerSquareMeterRate = value;
        notifyObservers(this.valuePerSquareMeterRate);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("buildYear")
    public String getBuildYear ( ) { 
        return this.buildYear;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("buildYear")
    public void setBuildYear (String value) { 
        this.buildYear = value;
        notifyObservers(this.buildYear);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("zipCode")
    public String getZipCode ( ) { 
        return this.zipCode;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("zipCode")
    public void setZipCode (String value) { 
        this.zipCode = value;
        notifyObservers(this.zipCode);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("addressPlaceBuilding")
    public String getAddressPlaceBuilding ( ) { 
        return this.addressPlaceBuilding;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("addressPlaceBuilding")
    public void setAddressPlaceBuilding (String value) { 
        this.addressPlaceBuilding = value;
        notifyObservers(this.addressPlaceBuilding);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("riskLevelDiscount")
    public int getRiskLevelDiscount ( ) { 
        return this.riskLevelDiscount;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("riskLevelDiscount")
    public void setRiskLevelDiscount (int value) { 
        this.riskLevelDiscount = value;
        notifyObservers(this.riskLevelDiscount);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("basePremium")
    public String getBasePremium ( ) { 
        return this.basePremium;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("basePremium")
    public void setBasePremium (String value) { 
        this.basePremium = value;
        notifyObservers(this.basePremium);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("allPremium")
    public String getAllPremium ( ) { 
        return this.allPremium;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("allPremium")
    public void setAllPremium (String value) { 
        this.allPremium = value;
        notifyObservers(this.allPremium);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("insuranceCompanyDiscountRate")
    public int getInsuranceCompanyDiscountRate ( ) { 
        return this.insuranceCompanyDiscountRate;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("insuranceCompanyDiscountRate")
    public void setInsuranceCompanyDiscountRate (int value) { 
        this.insuranceCompanyDiscountRate = value;
        notifyObservers(this.insuranceCompanyDiscountRate);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("insuranceCompanyDiscount")
    public int getInsuranceCompanyDiscount ( ) { 
        return this.insuranceCompanyDiscount;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("insuranceCompanyDiscount")
    public void setInsuranceCompanyDiscount (int value) { 
        this.insuranceCompanyDiscount = value;
        notifyObservers(this.insuranceCompanyDiscount);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("insuranceCentreDiscount")
    public int getInsuranceCentreDiscount ( ) { 
        return this.insuranceCentreDiscount;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("insuranceCentreDiscount")
    public void setInsuranceCentreDiscount (int value) { 
        this.insuranceCentreDiscount = value;
        notifyObservers(this.insuranceCentreDiscount);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("coupenDiscount")
    public int getCoupenDiscount ( ) { 
        return this.coupenDiscount;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("coupenDiscount")
    public void setCoupenDiscount (int value) { 
        this.coupenDiscount = value;
        notifyObservers(this.coupenDiscount);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("allDiscount")
    public int getAllDiscount ( ) { 
        return this.allDiscount;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("allDiscount")
    public void setAllDiscount (int value) { 
        this.allDiscount = value;
        notifyObservers(this.allDiscount);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("exchangePremium")
    public int getExchangePremium ( ) { 
        return this.exchangePremium;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("exchangePremium")
    public void setExchangePremium (int value) { 
        this.exchangePremium = value;
        notifyObservers(this.exchangePremium);
    }
 
}