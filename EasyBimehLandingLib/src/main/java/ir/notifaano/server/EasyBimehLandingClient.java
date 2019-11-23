/*
 * EasyBimehLandingLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ir.notifaano.server;

import ir.notifaano.server.controllers.*;
import ir.notifaano.server.http.client.HttpClient;

public class EasyBimehLandingClient {
    /**
     * Singleton access to FileManager controller
     * @return	Returns the FileManagerController instance 
     */
    public FileManagerController getFileManager() {
        return FileManagerController.getInstance();
    }

    /**
     * Singleton access to LiabilityDoctorInsurance controller
     * @return	Returns the LiabilityDoctorInsuranceController instance 
     */
    public LiabilityDoctorInsuranceController getLiabilityDoctorInsurance() {
        return LiabilityDoctorInsuranceController.getInstance();
    }

    /**
     * Singleton access to CarBody controller
     * @return	Returns the CarBodyController instance 
     */
    public CarBodyController getCarBody() {
        return CarBodyController.getInstance();
    }

    /**
     * Singleton access to ElectronicEquipmentInsurance controller
     * @return	Returns the ElectronicEquipmentInsuranceController instance 
     */
    public ElectronicEquipmentInsuranceController getElectronicEquipmentInsurance() {
        return ElectronicEquipmentInsuranceController.getInstance();
    }

    /**
     * Singleton access to OtherInsuranceTypes controller
     * @return	Returns the OtherInsuranceTypesController instance 
     */
    public OtherInsuranceTypesController getOtherInsuranceTypes() {
        return OtherInsuranceTypesController.getInstance();
    }

    /**
     * Singleton access to ThirdPartyInsurance controller
     * @return	Returns the ThirdPartyInsuranceController instance 
     */
    public ThirdPartyInsuranceController getThirdPartyInsurance() {
        return ThirdPartyInsuranceController.getInstance();
    }

    /**
     * Singleton access to MotorcycleInsurance controller
     * @return	Returns the MotorcycleInsuranceController instance 
     */
    public MotorcycleInsuranceController getMotorcycleInsurance() {
        return MotorcycleInsuranceController.getInstance();
    }

    /**
     * Singleton access to FireInsurance controller
     * @return	Returns the FireInsuranceController instance 
     */
    public FireInsuranceController getFireInsurance() {
        return FireInsuranceController.getInstance();
    }

    /**
     * Singleton access to EarthquakeInsurance controller
     * @return	Returns the EarthquakeInsuranceController instance 
     */
    public EarthquakeInsuranceController getEarthquakeInsurance() {
        return EarthquakeInsuranceController.getInstance();
    }

    /**
     * Singleton access to TravelInsurance controller
     * @return	Returns the TravelInsuranceController instance 
     */
    public TravelInsuranceController getTravelInsurance() {
        return TravelInsuranceController.getInstance();
    }

    /**
     * Singleton access to ElevatorInsurance controller
     * @return	Returns the ElevatorInsuranceController instance 
     */
    public ElevatorInsuranceController getElevatorInsurance() {
        return ElevatorInsuranceController.getInstance();
    }

    /**
     * Singleton access to Main controller
     * @return	Returns the MainController instance 
     */
    public MainController getMain() {
        return MainController.getInstance();
    }

    /**
     * Singleton access to ComboData controller
     * @return	Returns the ComboDataController instance 
     */
    public ComboDataController getComboData() {
        return ComboDataController.getInstance();
    }

    /**
     * Singleton access to TrackingDamage controller
     * @return	Returns the TrackingDamageController instance 
     */
    public TrackingDamageController getTrackingDamage() {
        return TrackingDamageController.getInstance();
    }

    /**
     * Singleton access to Footer controller
     * @return	Returns the FooterController instance 
     */
    public FooterController getFooter() {
        return FooterController.getInstance();
    }

    /**
     * Singleton access to InsurancePolicyPlan controller
     * @return	Returns the InsurancePolicyPlanController instance 
     */
    public InsurancePolicyPlanController getInsurancePolicyPlan() {
        return InsurancePolicyPlanController.getInstance();
    }

    /**
     * Get the shared http client currently being used for API calls
     * @return The http client instance currently being used
     */
    public HttpClient getSharedHttpClient() {
        return BaseController.getClientInstance();
    }
    
    /**
     * Set a shared http client to be used for API calls
     * @param httpClient The http client to use
     */
    public void setSharedHttpClient(HttpClient httpClient) {
        BaseController.setClientInstance(httpClient);
    }

    /**
     * Default constructor 
     */     
    public EasyBimehLandingClient() {
    }

}