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
public class TravelInsurancePolicyExtend 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = -908944425674829887L;
    private int insurancePolicyId;
    private String travelDurationParam;
    private int passengersCount;
    private String birthDate;
    private String birthDatePersian;
    private int riskLevelDiscount;
    private String basePremium;
    private String allPremium;
    private int insuranceCompanyDiscountRate;
    private int insuranceCompanyDiscount;
    private int insuranceCentreDiscount;
    private int coupenDiscount;
    private int allDiscount;
    private int exchangePremium;
    private String travelRatePlanId;
    private String planTitle;
    private String travelInsurancePolicyExtendAges;
    private String travelInsurancePolicyExtendPassengers;
    private String zoneIds;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("insurancePolicyId")
    public int getInsurancePolicyId ( ) { 
        return this.insurancePolicyId;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("insurancePolicyId")
    public void setInsurancePolicyId (int value) { 
        this.insurancePolicyId = value;
        notifyObservers(this.insurancePolicyId);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("travelDurationParam")
    public String getTravelDurationParam ( ) { 
        return this.travelDurationParam;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("travelDurationParam")
    public void setTravelDurationParam (String value) { 
        this.travelDurationParam = value;
        notifyObservers(this.travelDurationParam);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("passengersCount")
    public int getPassengersCount ( ) { 
        return this.passengersCount;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("passengersCount")
    public void setPassengersCount (int value) { 
        this.passengersCount = value;
        notifyObservers(this.passengersCount);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("birthDate")
    public String getBirthDate ( ) { 
        return this.birthDate;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("birthDate")
    public void setBirthDate (String value) { 
        this.birthDate = value;
        notifyObservers(this.birthDate);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("birthDatePersian")
    public String getBirthDatePersian ( ) { 
        return this.birthDatePersian;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("birthDatePersian")
    public void setBirthDatePersian (String value) { 
        this.birthDatePersian = value;
        notifyObservers(this.birthDatePersian);
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
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("travelRatePlanId")
    public String getTravelRatePlanId ( ) { 
        return this.travelRatePlanId;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("travelRatePlanId")
    public void setTravelRatePlanId (String value) { 
        this.travelRatePlanId = value;
        notifyObservers(this.travelRatePlanId);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("planTitle")
    public String getPlanTitle ( ) { 
        return this.planTitle;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("planTitle")
    public void setPlanTitle (String value) { 
        this.planTitle = value;
        notifyObservers(this.planTitle);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("travelInsurancePolicyExtendAges")
    public String getTravelInsurancePolicyExtendAges ( ) { 
        return this.travelInsurancePolicyExtendAges;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("travelInsurancePolicyExtendAges")
    public void setTravelInsurancePolicyExtendAges (String value) { 
        this.travelInsurancePolicyExtendAges = value;
        notifyObservers(this.travelInsurancePolicyExtendAges);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("travelInsurancePolicyExtendPassengers")
    public String getTravelInsurancePolicyExtendPassengers ( ) { 
        return this.travelInsurancePolicyExtendPassengers;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("travelInsurancePolicyExtendPassengers")
    public void setTravelInsurancePolicyExtendPassengers (String value) { 
        this.travelInsurancePolicyExtendPassengers = value;
        notifyObservers(this.travelInsurancePolicyExtendPassengers);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("zoneIds")
    public String getZoneIds ( ) { 
        return this.zoneIds;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("zoneIds")
    public void setZoneIds (String value) { 
        this.zoneIds = value;
        notifyObservers(this.zoneIds);
    }
 
}
