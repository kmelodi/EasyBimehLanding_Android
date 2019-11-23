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
public class InsuranceData 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 901645960124383770L;
    private ElectronicEquipmentInsurancePolicyExtendView electronicEquipmentInsurancePolicyExtendView;
    private ElectronicEquipmentInsurancePolicyFilter electronicEquipmentInsurancePolicyFilter;
    private int id;
    private boolean selectedInsurancePolicyHasBeenChanged;
    private boolean isPaymented;
    private String payable;
    private String paymented;
    private String conflict;
    private boolean hasConflictDocument;
    private String initialPrice;
    private String finalPrice;
    private String insuranceCompanyName;
    private String insuranceCentreName;
    private boolean isInsuranceCentreAdmin;
    private List<String> insurancePolicyPaymentDocuments;
    private String insurancePolicyConflict;
    private String insurancePolicyCondition;
    private String person;
    private String insurancePolicy;
    private String shoppingCard;
    private String shoppingCardPostalPacket;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("electronicEquipmentInsurancePolicyExtendView")
    public ElectronicEquipmentInsurancePolicyExtendView getElectronicEquipmentInsurancePolicyExtendView ( ) { 
        return this.electronicEquipmentInsurancePolicyExtendView;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("electronicEquipmentInsurancePolicyExtendView")
    public void setElectronicEquipmentInsurancePolicyExtendView (ElectronicEquipmentInsurancePolicyExtendView value) { 
        this.electronicEquipmentInsurancePolicyExtendView = value;
        notifyObservers(this.electronicEquipmentInsurancePolicyExtendView);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("electronicEquipmentInsurancePolicyFilter")
    public ElectronicEquipmentInsurancePolicyFilter getElectronicEquipmentInsurancePolicyFilter ( ) { 
        return this.electronicEquipmentInsurancePolicyFilter;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("electronicEquipmentInsurancePolicyFilter")
    public void setElectronicEquipmentInsurancePolicyFilter (ElectronicEquipmentInsurancePolicyFilter value) { 
        this.electronicEquipmentInsurancePolicyFilter = value;
        notifyObservers(this.electronicEquipmentInsurancePolicyFilter);
    }
 
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
    @JsonGetter("selectedInsurancePolicyHasBeenChanged")
    public boolean getSelectedInsurancePolicyHasBeenChanged ( ) { 
        return this.selectedInsurancePolicyHasBeenChanged;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("selectedInsurancePolicyHasBeenChanged")
    public void setSelectedInsurancePolicyHasBeenChanged (boolean value) { 
        this.selectedInsurancePolicyHasBeenChanged = value;
        notifyObservers(this.selectedInsurancePolicyHasBeenChanged);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("isPaymented")
    public boolean getIsPaymented ( ) { 
        return this.isPaymented;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("isPaymented")
    public void setIsPaymented (boolean value) { 
        this.isPaymented = value;
        notifyObservers(this.isPaymented);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("payable")
    public String getPayable ( ) { 
        return this.payable;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("payable")
    public void setPayable (String value) { 
        this.payable = value;
        notifyObservers(this.payable);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("paymented")
    public String getPaymented ( ) { 
        return this.paymented;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("paymented")
    public void setPaymented (String value) { 
        this.paymented = value;
        notifyObservers(this.paymented);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("conflict")
    public String getConflict ( ) { 
        return this.conflict;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("conflict")
    public void setConflict (String value) { 
        this.conflict = value;
        notifyObservers(this.conflict);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("hasConflictDocument")
    public boolean getHasConflictDocument ( ) { 
        return this.hasConflictDocument;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("hasConflictDocument")
    public void setHasConflictDocument (boolean value) { 
        this.hasConflictDocument = value;
        notifyObservers(this.hasConflictDocument);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("initialPrice")
    public String getInitialPrice ( ) { 
        return this.initialPrice;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("initialPrice")
    public void setInitialPrice (String value) { 
        this.initialPrice = value;
        notifyObservers(this.initialPrice);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("finalPrice")
    public String getFinalPrice ( ) { 
        return this.finalPrice;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("finalPrice")
    public void setFinalPrice (String value) { 
        this.finalPrice = value;
        notifyObservers(this.finalPrice);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("insuranceCompanyName")
    public String getInsuranceCompanyName ( ) { 
        return this.insuranceCompanyName;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("insuranceCompanyName")
    public void setInsuranceCompanyName (String value) { 
        this.insuranceCompanyName = value;
        notifyObservers(this.insuranceCompanyName);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("insuranceCentreName")
    public String getInsuranceCentreName ( ) { 
        return this.insuranceCentreName;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("insuranceCentreName")
    public void setInsuranceCentreName (String value) { 
        this.insuranceCentreName = value;
        notifyObservers(this.insuranceCentreName);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("isInsuranceCentreAdmin")
    public boolean getIsInsuranceCentreAdmin ( ) { 
        return this.isInsuranceCentreAdmin;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("isInsuranceCentreAdmin")
    public void setIsInsuranceCentreAdmin (boolean value) { 
        this.isInsuranceCentreAdmin = value;
        notifyObservers(this.isInsuranceCentreAdmin);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("insurancePolicyPaymentDocuments")
    public List<String> getInsurancePolicyPaymentDocuments ( ) { 
        return this.insurancePolicyPaymentDocuments;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("insurancePolicyPaymentDocuments")
    public void setInsurancePolicyPaymentDocuments (List<String> value) { 
        this.insurancePolicyPaymentDocuments = value;
        notifyObservers(this.insurancePolicyPaymentDocuments);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("insurancePolicyConflict")
    public String getInsurancePolicyConflict ( ) { 
        return this.insurancePolicyConflict;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("insurancePolicyConflict")
    public void setInsurancePolicyConflict (String value) { 
        this.insurancePolicyConflict = value;
        notifyObservers(this.insurancePolicyConflict);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("insurancePolicyCondition")
    public String getInsurancePolicyCondition ( ) { 
        return this.insurancePolicyCondition;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("insurancePolicyCondition")
    public void setInsurancePolicyCondition (String value) { 
        this.insurancePolicyCondition = value;
        notifyObservers(this.insurancePolicyCondition);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("person")
    public String getPerson ( ) { 
        return this.person;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("person")
    public void setPerson (String value) { 
        this.person = value;
        notifyObservers(this.person);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("insurancePolicy")
    public String getInsurancePolicy ( ) { 
        return this.insurancePolicy;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("insurancePolicy")
    public void setInsurancePolicy (String value) { 
        this.insurancePolicy = value;
        notifyObservers(this.insurancePolicy);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("shoppingCard")
    public String getShoppingCard ( ) { 
        return this.shoppingCard;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("shoppingCard")
    public void setShoppingCard (String value) { 
        this.shoppingCard = value;
        notifyObservers(this.shoppingCard);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("shoppingCardPostalPacket")
    public String getShoppingCardPostalPacket ( ) { 
        return this.shoppingCardPostalPacket;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("shoppingCardPostalPacket")
    public void setShoppingCardPostalPacket (String value) { 
        this.shoppingCardPostalPacket = value;
        notifyObservers(this.shoppingCardPostalPacket);
    }
 
}
