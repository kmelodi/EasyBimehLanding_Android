# Getting started

EasyBimehConnect یک ساب برند از ایزی بیمه است که وظیفه ارائه خدمات B2B را برپایه API و B2B2C را بر پایه وایت لیبل بر عهده دارد. اگر اپلیکیشن و یا سایت غیر بیمه‌ای دارید و تمایل به فروش بیمه نامه دارید از امروز میتوانید با کمترین هزینه و کمترین زمان به زنجیره نوآوری در صنعت بیمه متصل شوید و تجارت جدیدی بسازید.

## How to Build

The generated code uses a few Gradle dependencies e.g., Jackson, Volley,
and Apache HttpClient. The reference to these dependencies is already
added in the build.gradle file will be installed automatically. Therefore,
you will need internet access for a successful build.

* In order to open the client library in Android Studio click on ``` Open an Existing Android Project ```.

![Importing SDK into Android Studio - Step 1](https://apidocs.io/illustration/android?step=import1&workspaceFolder=Easy%20Bimeh%20Landing&workspaceName=EasyBimehLanding&projectName=EasyBimehLandingLib&rootNamespace=ir.notifaano.server)

* Browse to locate the folder containing the source code. Select the location of the EasyBimehLanding gradle project and click ``` Ok ```.

![Importing SDK into Android Studio - Step 2](https://apidocs.io/illustration/android?step=import2&workspaceFolder=Easy%20Bimeh%20Landing&workspaceName=EasyBimehLanding&projectName=EasyBimehLandingLib&rootNamespace=ir.notifaano.server)

* Upon successful import, the project can be built by clicking on ``` Build > Make Project ``` or  pressing ``` Ctrl + F9 ```.

![Importing SDK into Android Studio - Step 3](https://apidocs.io/illustration/android?step=import3&workspaceFolder=Easy%20Bimeh%20Landing&workspaceName=EasyBimehLanding&projectName=EasyBimehLandingLib&rootNamespace=ir.notifaano.server)

## How to Use

The following section explains how to use the EasyBimehLanding library in a new project.

### 1. Starting a new project 

For starting a new project, click on ``` Create New Android Studio Project ```.

![Add a new project in Android Studio - Step 1](https://apidocs.io/illustration/android?step=createNewProject0&workspaceFolder=Easy%20Bimeh%20Landing&workspaceName=EasyBimehLanding&projectName=EasyBimehLandingLib&rootNamespace=ir.notifaano.server)

Here, configure the new project by adding the name, domain and location of the sample application followed by clicking ``` Next ```.

![Create a new Android Studio Project - Step 2](https://apidocs.io/illustration/android?step=createNewProject1&workspaceFolder=Easy%20Bimeh%20Landing&workspaceName=EasyBimehLanding&projectName=EasyBimehLandingLib&rootNamespace=ir.notifaano.server)

Following this, select the `Phone and Tablet` option as shown in the illustration below and click `Next`.

![Create a new Android Studio Project - Step 3](https://apidocs.io/illustration/android?step=createNewProject2&workspaceFolder=Easy%20Bimeh%20Landing&workspaceName=EasyBimehLanding&projectName=EasyBimehLandingLib&rootNamespace=ir.notifaano.server)

In the following step, choose ``` Empty Activity ``` as the activity type and click ``` Next ```.

![Create a new Android Studio Project - Step 4](https://apidocs.io/illustration/android?step=createNewProject3&workspaceFolder=Easy%20Bimeh%20Landing&workspaceName=EasyBimehLanding&projectName=EasyBimehLandingLib&rootNamespace=ir.notifaano.server)

In this step, provide an ``` Activity Name ``` and ``` Layout Name ``` and click ``` Finish ```.  This would take you to the newly created project.

![Create a new Android Studio Project - Step 4](https://apidocs.io/illustration/android?step=createNewProject4&workspaceFolder=Easy%20Bimeh%20Landing&workspaceName=EasyBimehLanding&projectName=EasyBimehLandingLib&rootNamespace=ir.notifaano.server)

### 2. Add reference of the library project

In order to add a dependency to this sample application, click on the android button shown in the project explorer on the left side as shown in the picture. Click on ``` Project ``` in the drop down that emerges.  

![Adding dependency to the client library - Step 1](https://apidocs.io/illustration/android?step=testProject0&workspaceFolder=Easy%20Bimeh%20Landing&workspaceName=EasyBimehLanding&projectName=EasyBimehLandingLib&rootNamespace=ir.notifaano.server)

Right click the sample application in the project explorer and click on ``` New > Module ```  as shown in the picture.

![Adding dependency to the client library - Step 2](https://apidocs.io/illustration/android?step=testProject1&workspaceFolder=Easy%20Bimeh%20Landing&workspaceName=EasyBimehLanding&projectName=EasyBimehLandingLib&rootNamespace=ir.notifaano.server)

Choose ``` Import Gradle Project ``` and click ``` Next ```.

![Adding dependency to the client library - Step 3](https://apidocs.io/illustration/android?step=testProject2&workspaceFolder=Easy%20Bimeh%20Landing&workspaceName=EasyBimehLanding&projectName=EasyBimehLandingLib&rootNamespace=ir.notifaano.server)

Click on ``` Finish ``` which would take you back to the sample application with the refernced SDK. 

![Adding dependency to the client library - Step 4](https://apidocs.io/illustration/android?step=testProject3&workspaceFolder=Easy%20Bimeh%20Landing&workspaceName=EasyBimehLanding&projectName=EasyBimehLandingLib&rootNamespace=ir.notifaano.server)

In the following step first navigate to the ``` SampleApplication > settings.gradle ``` file and add the line
```include ':EasyBimehLandingLib'```

Then navigate to the ``` SampleApplication >  app > build.gradle ``` file and add the following line 
```implementation project(path: ':EasyBimehLandingLib')```
to the dependencies section as shown in the illustration below. Also add the following packagingOptions.

packagingOptions
    exclude 'META-INF/LICENSE'
    exclude 'META-INF/NOTICE'
    exclude 'META-INF/DEPENDENCIES'
}

![Adding dependency to the client library - Step 5](https://apidocs.io/illustration/android?step=testProject4&workspaceFolder=Easy%20Bimeh%20Landing&workspaceName=EasyBimehLanding&projectName=EasyBimehLandingLib&rootNamespace=ir.notifaano.server)

Finally, press ``` Sync Now ``` in the warning visible as shown in the picture below.

![Adding dependency to the client library - Step 6](https://apidocs.io/illustration/android?step=testProject5&workspaceFolder=Easy%20Bimeh%20Landing&workspaceName=EasyBimehLanding&projectName=EasyBimehLandingLib&rootNamespace=ir.notifaano.server)

### 3. Write sample code

Once the ``` SampleApplication ``` is created, a file named ``` SampleApplication > app > src > main > java > MainActivity ``` will be visible in the *Project Explorer* with an ``` onCreate ``` method. This is the entry point for the execution of the created project.
Here, you can add code to initialize the client library and instantiate a *Controller* class. Sample code to initialize the client library and using controller methods is given in the subsequent sections.

## How to Test

The generated code and the server can be tested using automatically generated test cases. 
JUnit is used as the testing framework and test runner.

In Android Studio, for running the tests do the following:

1. Right click on *SampleApplication > EasyBimehLandingLib > androidTest > java)* from the project explorer.
2. Select "Run All Tests" or use "Ctrl + Shift + F10" to run the Tests.

## Initialization

### 

API client can be initialized as following. The `appContext` being passed is the Android application [`Context`](https://developer.android.com/reference/android/content/Context.html).

```java

ir.notifaano.server.Configuration.initialize(appContext);
EasyBimehLandingClient client = new EasyBimehLandingClient();
```


# Class Reference

## <a name="list_of_controllers"></a>List of Controllers

* [FileManagerController](#file_manager_controller)
* [LiabilityDoctorInsuranceController](#liability_doctor_insurance_controller)
* [CarBodyController](#car_body_controller)
* [ElectronicEquipmentInsuranceController](#electronic_equipment_insurance_controller)
* [OtherInsuranceTypesController](#other_insurance_types_controller)
* [ThirdPartyInsuranceController](#third_party_insurance_controller)
* [MotorcycleInsuranceController](#motorcycle_insurance_controller)
* [FireInsuranceController](#fire_insurance_controller)
* [EarthquakeInsuranceController](#earthquake_insurance_controller)
* [TravelInsuranceController](#travel_insurance_controller)
* [ElevatorInsuranceController](#elevator_insurance_controller)
* [MainController](#main_controller)
* [ComboDataController](#combo_data_controller)
* [TrackingDamageController](#tracking_damage_controller)
* [FooterController](#footer_controller)
* [InsurancePolicyPlanController](#insurance_policy_plan_controller)

## <a name="file_manager_controller"></a>![Class: ](https://apidocs.io/img/class.png "ir.notifaano.server.controllers.FileManagerController") FileManagerController

### Get singleton instance

The singleton instance of the ``` FileManagerController ``` class can be accessed from the API Client.

```java
FileManagerController fileManager = client.getFileManager();
```

### <a name="upload_async"></a>![Method: ](https://apidocs.io/img/method.png "ir.notifaano.server.controllers.FileManagerController.uploadAsync") uploadAsync

> آپلود فایل در ایزی بیمه
> بعد از آپلود، ادرس فایل باید در api های بعدی ارسال شود.


```java
void uploadAsync(
        final String subDomain,
        final String xApiKey,
        final String file,
        final APICallBack<BaseModelUpload> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| subDomain |  ``` Required ```  | دامنه یا زیر دامنه ی مرکز بیمه |
| xApiKey |  ``` Required ```  | کلید اختصاصی ارتباط با سرور |
| file |  ``` Required ```  | فایل ارسالی |


#### Example Usage

```java
String subDomain = "hfz1";
String xApiKey = "d6dfd932-75d8-e911-811a-000c294ecf01";
String file = "file";
// Invoking the API call with sample inputs
fileManager.uploadAsync(subDomain, xApiKey, file, new APICallBack<BaseModelUpload>() {
    public void onSuccess(HttpContext context, BaseModelUpload response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

## <a name="liability_doctor_insurance_controller"></a>![Class: ](https://apidocs.io/img/class.png "ir.notifaano.server.controllers.LiabilityDoctorInsuranceController") LiabilityDoctorInsuranceController

### Get singleton instance

The singleton instance of the ``` LiabilityDoctorInsuranceController ``` class can be accessed from the API Client.

```java
LiabilityDoctorInsuranceController liabilityDoctorInsurance = client.getLiabilityDoctorInsurance();
```

### <a name="get_liability_doctor_insurance_async"></a>![Method: ](https://apidocs.io/img/method.png "ir.notifaano.server.controllers.LiabilityDoctorInsuranceController.getLiabilityDoctorInsuranceAsync") getLiabilityDoctorInsuranceAsync

> در یافت اطلاعات اولیه برای استعلام بیمه مسئولیت پزشکان


```java
void getLiabilityDoctorInsuranceAsync(
        final String subDomain,
        final String xApiKey,
        final APICallBack<BaseModelLiabilityDoctorInsurance> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| subDomain |  ``` Required ```  | دامنه یا زیر دامنه ی مرکز بیمه |
| xApiKey |  ``` Required ```  | کلید اختصاصی ارتباط با سرور |


#### Example Usage

```java
String subDomain = "hfz1";
String xApiKey = "d6dfd932-75d8-e911-811a-000c294ecf01";
// Invoking the API call with sample inputs
liabilityDoctorInsurance.getLiabilityDoctorInsuranceAsync(subDomain, xApiKey, new APICallBack<BaseModelLiabilityDoctorInsurance>() {
    public void onSuccess(HttpContext context, BaseModelLiabilityDoctorInsurance response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_medical_specialties_async"></a>![Method: ](https://apidocs.io/img/method.png "ir.notifaano.server.controllers.LiabilityDoctorInsuranceController.getMedicalSpecialtiesAsync") getMedicalSpecialtiesAsync

> دریافت لیست تخصص های پزشکی


```java
void getMedicalSpecialtiesAsync(
        final String id,
        final String xApiKey,
        final APICallBack<BaseModelMedicalSpecialties> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| id |  ``` Required ```  | نوع تخصص => ParamedicalExpertise => پیراپزشکی MedicalExpertise => پزشکی |
| xApiKey |  ``` Required ```  | کلید اختصاصی ارتباط با سرور |


#### Example Usage

```java
String id = "ParamedicalExpertise";
String xApiKey = "d6dfd932-75d8-e911-811a-000c294ecf01";
// Invoking the API call with sample inputs
liabilityDoctorInsurance.getMedicalSpecialtiesAsync(id, xApiKey, new APICallBack<BaseModelMedicalSpecialties>() {
    public void onSuccess(HttpContext context, BaseModelMedicalSpecialties response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

## <a name="car_body_controller"></a>![Class: ](https://apidocs.io/img/class.png "ir.notifaano.server.controllers.CarBodyController") CarBodyController

### Get singleton instance

The singleton instance of the ``` CarBodyController ``` class can be accessed from the API Client.

```java
CarBodyController carBody = client.getCarBody();
```

### <a name="get_car_brand_async"></a>![Method: ](https://apidocs.io/img/method.png "ir.notifaano.server.controllers.CarBodyController.getCarBrandAsync") getCarBrandAsync

> دریافت برند خودرو


```java
void getCarBrandAsync(
        final String xApiKey,
        final APICallBack<CarBrand> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| xApiKey |  ``` Required ```  | شناسه ی اختصاصی ارتباط با سرور |


#### Example Usage

```java
String xApiKey = "d6dfd932-75d8-e911-811a-000c294ecf01";
// Invoking the API call with sample inputs
carBody.getCarBrandAsync(xApiKey, new APICallBack<CarBrand>() {
    public void onSuccess(HttpContext context, CarBrand response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_car_brand_tips_async"></a>![Method: ](https://apidocs.io/img/method.png "ir.notifaano.server.controllers.CarBodyController.getCarBrandTipsAsync") getCarBrandTipsAsync

> دریافت لیست تیپ خودرو


```java
void getCarBrandTipsAsync(
        final int carBrandId,
        final String xApiKey,
        final APICallBack<CarBrandTips> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| carBrandId |  ``` Required ```  | شناسه ی برند خودرو |
| xApiKey |  ``` Required ```  | کلید اختصاصی ارتباط با سرور |


#### Example Usage

```java
int carBrandId = 190;
String xApiKey = "d6dfd932-75d8-e911-811a-000c294ecf01";
// Invoking the API call with sample inputs
carBody.getCarBrandTipsAsync(carBrandId, xApiKey, new APICallBack<CarBrandTips>() {
    public void onSuccess(HttpContext context, CarBrandTips response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_has_plan_async"></a>![Method: ](https://apidocs.io/img/method.png "ir.notifaano.server.controllers.CarBodyController.getHasPlanAsync") getHasPlanAsync

> آیا این نوع بیمه نامه، طرح بیمه ای دارد؟


```java
void getHasPlanAsync(
        final String subDomain,
        final int insurancePolicyType,
        final String xApiKey,
        final APICallBack<HasPlan> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| subDomain |  ``` Required ```  | دامنه یا زیر دامنه ی مرکز بیمه |
| insurancePolicyType |  ``` Required ```  | شناسه ی نوع بیمه نامه => بیمه بدنه=2 |
| xApiKey |  ``` Required ```  | کلید اختصاصی ارتباط با سرور |


#### Example Usage

```java
String subDomain = "hfz1";
int insurancePolicyType = 2;
String xApiKey = "d6dfd932-75d8-e911-811a-000c294ecf01";
// Invoking the API call with sample inputs
carBody.getHasPlanAsync(subDomain, insurancePolicyType, xApiKey, new APICallBack<HasPlan>() {
    public void onSuccess(HttpContext context, HasPlan response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

## <a name="electronic_equipment_insurance_controller"></a>![Class: ](https://apidocs.io/img/class.png "ir.notifaano.server.controllers.ElectronicEquipmentInsuranceController") ElectronicEquipmentInsuranceController

### Get singleton instance

The singleton instance of the ``` ElectronicEquipmentInsuranceController ``` class can be accessed from the API Client.

```java
ElectronicEquipmentInsuranceController electronicEquipmentInsurance = client.getElectronicEquipmentInsurance();
```

### <a name="get_electronic_equipment_insurance_async"></a>![Method: ](https://apidocs.io/img/method.png "ir.notifaano.server.controllers.ElectronicEquipmentInsuranceController.getElectronicEquipmentInsuranceAsync") getElectronicEquipmentInsuranceAsync

> دریافت اطلاعات اولیه استعلام بیمه نامه ی تجهیزات الکترونیک


```java
void getElectronicEquipmentInsuranceAsync(
        final String subDomain,
        final String xApiKey,
        final APICallBack<BaseModelElectronicEquipmentInsurance> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| subDomain |  ``` Required ```  | دامنه یا زیر دامنه ی مرکز بیمه |
| xApiKey |  ``` Required ```  | کلید اختصاصی ارتباط با سرور |


#### Example Usage

```java
String subDomain = "subDomain";
String xApiKey = "x-api-key";
// Invoking the API call with sample inputs
electronicEquipmentInsurance.getElectronicEquipmentInsuranceAsync(subDomain, xApiKey, new APICallBack<BaseModelElectronicEquipmentInsurance>() {
    public void onSuccess(HttpContext context, BaseModelElectronicEquipmentInsurance response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_device_brand_types_async"></a>![Method: ](https://apidocs.io/img/method.png "ir.notifaano.server.controllers.ElectronicEquipmentInsuranceController.getDeviceBrandTypesAsync") getDeviceBrandTypesAsync

> دریافت لیست نوع برند دستگاه


```java
void getDeviceBrandTypesAsync(
        final int deviceGroup,
        final int deviceTypeId,
        final String xApiKey,
        final APICallBack<BaseModelDeviceBrandTypes> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| deviceGroup |  ``` Required ```  | شناسه ی گروه دستگاه |
| deviceTypeId |  ``` Required ```  | شناسه ی نوع دستگاه |
| xApiKey |  ``` Required ```  | کلید اختصاصی ارتباط با سرور |


#### Example Usage

```java
int deviceGroup = 1;
int deviceTypeId = 1;
String xApiKey = "d6dfd932-75d8-e911-811a-000c294ecf01";
// Invoking the API call with sample inputs
electronicEquipmentInsurance.getDeviceBrandTypesAsync(deviceGroup, deviceTypeId, xApiKey, new APICallBack<BaseModelDeviceBrandTypes>() {
    public void onSuccess(HttpContext context, BaseModelDeviceBrandTypes response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_divice_franchisee_async"></a>![Method: ](https://apidocs.io/img/method.png "ir.notifaano.server.controllers.ElectronicEquipmentInsuranceController.getDiviceFranchiseeAsync") getDiviceFranchiseeAsync

> دریافت لیست فرانشیر استعلام بیمه نامه ی تجهیزات الکترونیک


```java
void getDiviceFranchiseeAsync(
        final int deviceModelId,
        final String xApiKey,
        final APICallBack<BaseModelDiviceFranchisee> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| deviceModelId |  ``` Required ```  | شناسه ی مدل دستگاه |
| xApiKey |  ``` Required ```  | کلید اختصاصی ارتباط با سرور |


#### Example Usage

```java
int deviceModelId = 1340;
String xApiKey = "d6dfd932-75d8-e911-811a-000c294ecf01";
// Invoking the API call with sample inputs
electronicEquipmentInsurance.getDiviceFranchiseeAsync(deviceModelId, xApiKey, new APICallBack<BaseModelDiviceFranchisee>() {
    public void onSuccess(HttpContext context, BaseModelDiviceFranchisee response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

## <a name="other_insurance_types_controller"></a>![Class: ](https://apidocs.io/img/class.png "ir.notifaano.server.controllers.OtherInsuranceTypesController") OtherInsuranceTypesController

### Get singleton instance

The singleton instance of the ``` OtherInsuranceTypesController ``` class can be accessed from the API Client.

```java
OtherInsuranceTypesController otherInsuranceTypes = client.getOtherInsuranceTypes();
```

### <a name="get_other_insurance_types_async"></a>![Method: ](https://apidocs.io/img/method.png "ir.notifaano.server.controllers.OtherInsuranceTypesController.getOtherInsuranceTypesAsync") getOtherInsuranceTypesAsync

> دریافت لیست سایر بیمه نامه ها


```java
void getOtherInsuranceTypesAsync(
        final String subDomain,
        final String xApiKey,
        final APICallBack<OtherInsuranceTypes> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| subDomain |  ``` Required ```  | دامنه یا زیر دامنه ی مرکز بیمه |
| xApiKey |  ``` Required ```  | کلید اختصاصی ارتباط با سرور |


#### Example Usage

```java
String subDomain = "hfz1";
String xApiKey = "d6dfd932-75d8-e911-811a-000c294ecf01";
// Invoking the API call with sample inputs
otherInsuranceTypes.getOtherInsuranceTypesAsync(subDomain, xApiKey, new APICallBack<OtherInsuranceTypes>() {
    public void onSuccess(HttpContext context, OtherInsuranceTypes response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_send_sms_token_async"></a>![Method: ](https://apidocs.io/img/method.png "ir.notifaano.server.controllers.OtherInsuranceTypesController.getSendSmsTokenAsync") getSendSmsTokenAsync

> ارسال توکن تایید شماره تماس، برای احراز هویت کاربر


```java
void getSendSmsTokenAsync(
        final String mobile,
        final String insuranceCentreSubDomain,
        final String xApiKey,
        final APICallBack<SendSmsToken> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| mobile |  ``` Required ```  | شماره موبایل |
| insuranceCentreSubDomain |  ``` Required ```  | دامنه یا زیردامنه ی مرکز بیمه |
| xApiKey |  ``` Required ```  | کلید اختصاصی ارتباط با سرور |


#### Example Usage

```java
String mobile = "09018318086";
String insuranceCentreSubDomain = "hfz1";
String xApiKey = "d6dfd932-75d8-e911-811a-000c294ecf01";
// Invoking the API call with sample inputs
otherInsuranceTypes.getSendSmsTokenAsync(mobile, insuranceCentreSubDomain, xApiKey, new APICallBack<SendSmsToken>() {
    public void onSuccess(HttpContext context, SendSmsToken response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_verify_sms_token_async"></a>![Method: ](https://apidocs.io/img/method.png "ir.notifaano.server.controllers.OtherInsuranceTypesController.getVerifySmsTokenAsync") getVerifySmsTokenAsync

> تایید توکن پیامک شده به کاربر، برای احراز هویت


```java
void getVerifySmsTokenAsync(
        final String mobile,
        final int token,
        final String insuranceCentreSubDomain,
        final String aliasName,
        final String resource,
        final String xApiKey,
        final APICallBack<Status200> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| mobile |  ``` Required ```  | شماره موبایل |
| token |  ``` Required ```  | توکن دریافتی کاربر از پیامک |
| insuranceCentreSubDomain |  ``` Required ```  | دامنه یا زیر دامنه ی اختصاصی مرکز بیمه |
| aliasName |  ``` Required ```  | نام و نام خانوادگی کاربر |
| resource |  ``` Required ```  | دامنه ی درخواست دهنده |
| xApiKey |  ``` Required ```  | کلید اختصاصی ارتباط با سرور |


#### Example Usage

```java
String mobile = "09018318086";
int token = 27763;
String insuranceCentreSubDomain = "hfz1";
String aliasName = "علی موسوی";
String resource = "https://hfz1.easybimeh.com";
String xApiKey = "d6dfd932-75d8-e911-811a-000c294ecf01";
// Invoking the API call with sample inputs
otherInsuranceTypes.getVerifySmsTokenAsync(mobile, token, insuranceCentreSubDomain, aliasName, resource, xApiKey, new APICallBack<Status200>() {
    public void onSuccess(HttpContext context, Status200 response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Bad Request |



[Back to List of Controllers](#list_of_controllers)

## <a name="third_party_insurance_controller"></a>![Class: ](https://apidocs.io/img/class.png "ir.notifaano.server.controllers.ThirdPartyInsuranceController") ThirdPartyInsuranceController

### Get singleton instance

The singleton instance of the ``` ThirdPartyInsuranceController ``` class can be accessed from the API Client.

```java
ThirdPartyInsuranceController thirdPartyInsurance = client.getThirdPartyInsurance();
```

### <a name="get_car_brands_async"></a>![Method: ](https://apidocs.io/img/method.png "ir.notifaano.server.controllers.ThirdPartyInsuranceController.getCarBrandsAsync") getCarBrandsAsync

> دریافت لیست برند خودرو ها


```java
void getCarBrandsAsync(
        final int carTypeGroup,
        final String xApiKey,
        final APICallBack<CarBrands> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| carTypeGroup |  ``` Required ```  | شناسه ی گروه خودرو |
| xApiKey |  ``` Required ```  | کلید اختصاصی ارتباط با سرور |


#### Example Usage

```java
int carTypeGroup = 1;
String xApiKey = "d6dfd932-75d8-e911-811a-000c294ecf01";
// Invoking the API call with sample inputs
thirdPartyInsurance.getCarBrandsAsync(carTypeGroup, xApiKey, new APICallBack<CarBrands>() {
    public void onSuccess(HttpContext context, CarBrands response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_risk_level_async"></a>![Method: ](https://apidocs.io/img/method.png "ir.notifaano.server.controllers.ThirdPartyInsuranceController.getRiskLevelAsync") getRiskLevelAsync

> دریافت لیست تخفیف های بیمه


```java
void getRiskLevelAsync(
        final int insurancePolicyType,
        final String xApiKey,
        final APICallBack<RiskLevel> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| insurancePolicyType |  ``` Required ```  | شناسه ی نوع بیمه نامه |
| xApiKey |  ``` Required ```  | کلید اختصاصی ارتباط با سرور |


#### Example Usage

```java
int insurancePolicyType = 0;
String xApiKey = "d6dfd932-75d8-e911-811a-000c294ecf01";
// Invoking the API call with sample inputs
thirdPartyInsurance.getRiskLevelAsync(insurancePolicyType, xApiKey, new APICallBack<RiskLevel>() {
    public void onSuccess(HttpContext context, RiskLevel response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_car_brand_tips_async"></a>![Method: ](https://apidocs.io/img/method.png "ir.notifaano.server.controllers.ThirdPartyInsuranceController.getCarBrandTipsAsync") getCarBrandTipsAsync

> دریافت لیست تیپ خودرو


```java
void getCarBrandTipsAsync(
        final int carBrandId,
        final String xApiKey,
        final APICallBack<CarBrandTips> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| carBrandId |  ``` Required ```  | شناسه ی برند خودرو |
| xApiKey |  ``` Required ```  | کلید اختصاصی ارتباط با سرور |


#### Example Usage

```java
int carBrandId = 190;
String xApiKey = "d6dfd932-75d8-e911-811a-000c294ecf01";
// Invoking the API call with sample inputs
thirdPartyInsurance.getCarBrandTipsAsync(carBrandId, xApiKey, new APICallBack<CarBrandTips>() {
    public void onSuccess(HttpContext context, CarBrandTips response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_car_uses_async"></a>![Method: ](https://apidocs.io/img/method.png "ir.notifaano.server.controllers.ThirdPartyInsuranceController.getCarUsesAsync") getCarUsesAsync

> دریافت لیست نوع کاربری خودرو


```java
void getCarUsesAsync(
        final int carTypeId,
        final String xApiKey,
        final APICallBack<CarUses> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| carTypeId |  ``` Required ```  | شناسه ی نوع خودرو |
| xApiKey |  ``` Required ```  | کلید اختصاصی ارتباط با سرور |


#### Example Usage

```java
int carTypeId = 103;
String xApiKey = "d6dfd932-75d8-e911-811a-000c294ecf01";
// Invoking the API call with sample inputs
thirdPartyInsurance.getCarUsesAsync(carTypeId, xApiKey, new APICallBack<CarUses>() {
    public void onSuccess(HttpContext context, CarUses response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_has_plan_async"></a>![Method: ](https://apidocs.io/img/method.png "ir.notifaano.server.controllers.ThirdPartyInsuranceController.getHasPlanAsync") getHasPlanAsync

> آیا این نوع بیمه نامه، طرح بیمه ای دارد؟


```java
void getHasPlanAsync(
        final String subDomain,
        final int insurancePolicyType,
        final String xApiKey,
        final APICallBack<HasPlan> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| subDomain |  ``` Required ```  | دامنه یا زیر دامنه ی مرکز بیمه |
| insurancePolicyType |  ``` Required ```  | شناسه ی نوع بیمه |
| xApiKey |  ``` Required ```  | کلید اختصاصی ارتباط با سرور |


#### Example Usage

```java
String subDomain = "hfz1";
int insurancePolicyType = 0;
String xApiKey = "d6dfd932-75d8-e911-811a-000c294ecf01";
// Invoking the API call with sample inputs
thirdPartyInsurance.getHasPlanAsync(subDomain, insurancePolicyType, xApiKey, new APICallBack<HasPlan>() {
    public void onSuccess(HttpContext context, HasPlan response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

## <a name="motorcycle_insurance_controller"></a>![Class: ](https://apidocs.io/img/class.png "ir.notifaano.server.controllers.MotorcycleInsuranceController") MotorcycleInsuranceController

### Get singleton instance

The singleton instance of the ``` MotorcycleInsuranceController ``` class can be accessed from the API Client.

```java
MotorcycleInsuranceController motorcycleInsurance = client.getMotorcycleInsurance();
```

### <a name="get_car_brands_async"></a>![Method: ](https://apidocs.io/img/method.png "ir.notifaano.server.controllers.MotorcycleInsuranceController.getCarBrandsAsync") getCarBrandsAsync

> دریافت لیست برند موتور سیکلت


```java
void getCarBrandsAsync(
        final int carTypeGroup,
        final String xApiKey,
        final APICallBack<CarBrands> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| carTypeGroup |  ``` Required ```  | شناسه ی گروه خودرویی، موتور سیکلت =>0 |
| xApiKey |  ``` Required ```  | کلید اختصاصی ارتباط با سرور |


#### Example Usage

```java
int carTypeGroup = 0;
String xApiKey = "d6dfd932-75d8-e911-811a-000c294ecf01";
// Invoking the API call with sample inputs
motorcycleInsurance.getCarBrandsAsync(carTypeGroup, xApiKey, new APICallBack<CarBrands>() {
    public void onSuccess(HttpContext context, CarBrands response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_car_brand_tips_async"></a>![Method: ](https://apidocs.io/img/method.png "ir.notifaano.server.controllers.MotorcycleInsuranceController.getCarBrandTipsAsync") getCarBrandTipsAsync

> دریافت لیست تیپ موتور سیکلت


```java
void getCarBrandTipsAsync(
        final int carBrandId,
        final String xApiKey,
        final APICallBack<CarBrandTips> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| carBrandId |  ``` Required ```  | شناسه ی برند موتور سیکلت |
| xApiKey |  ``` Required ```  | کلید اختصاصی ارتباط با سرور |


#### Example Usage

```java
int carBrandId = 472;
String xApiKey = "d6dfd932-75d8-e911-811a-000c294ecf01";
// Invoking the API call with sample inputs
motorcycleInsurance.getCarBrandTipsAsync(carBrandId, xApiKey, new APICallBack<CarBrandTips>() {
    public void onSuccess(HttpContext context, CarBrandTips response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_has_plan_async"></a>![Method: ](https://apidocs.io/img/method.png "ir.notifaano.server.controllers.MotorcycleInsuranceController.getHasPlanAsync") getHasPlanAsync

> آیا این نوع بیمه نامه، طرح بیمه ای دارد؟


```java
void getHasPlanAsync(
        final String subDomain,
        final int insurancePolicyType,
        final String xApiKey,
        final APICallBack<HasPlan> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| subDomain |  ``` Required ```  | دامنه یا زیر دامنه ی مرکز بیمه |
| insurancePolicyType |  ``` Required ```  | شناسه ی نوع بیمه نامه |
| xApiKey |  ``` Required ```  | کلید اختصاصی ارتباط با سرور |


#### Example Usage

```java
String subDomain = "hfz1";
int insurancePolicyType = 7;
String xApiKey = "d6dfd932-75d8-e911-811a-000c294ecf01";
// Invoking the API call with sample inputs
motorcycleInsurance.getHasPlanAsync(subDomain, insurancePolicyType, xApiKey, new APICallBack<HasPlan>() {
    public void onSuccess(HttpContext context, HasPlan response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

## <a name="fire_insurance_controller"></a>![Class: ](https://apidocs.io/img/class.png "ir.notifaano.server.controllers.FireInsuranceController") FireInsuranceController

### Get singleton instance

The singleton instance of the ``` FireInsuranceController ``` class can be accessed from the API Client.

```java
FireInsuranceController fireInsurance = client.getFireInsurance();
```

### <a name="get_fire_insurance_async"></a>![Method: ](https://apidocs.io/img/method.png "ir.notifaano.server.controllers.FireInsuranceController.getFireInsuranceAsync") getFireInsuranceAsync

> دریافت اطلاعات پایه بیمه ی آتش سوزی


```java
void getFireInsuranceAsync(
        final String subDomain,
        final int insurancePolicyId,
        final String xApiKey,
        final APICallBack<BaseModelFireInsurance> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| subDomain |  ``` Required ```  | دامنه یا زیر دامنه ی مرکز بیمه |
| insurancePolicyId |  ``` Required ```  | شناسه ی بیمه نامه |
| xApiKey |  ``` Required ```  | کلید اختصاصی ارتباط با سرور |


#### Example Usage

```java
String subDomain = "hfz1";
int insurancePolicyId = 0;
String xApiKey = "d6dfd932-75d8-e911-811a-000c294ecf01";
// Invoking the API call with sample inputs
fireInsurance.getFireInsuranceAsync(subDomain, insurancePolicyId, xApiKey, new APICallBack<BaseModelFireInsurance>() {
    public void onSuccess(HttpContext context, BaseModelFireInsurance response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

## <a name="earthquake_insurance_controller"></a>![Class: ](https://apidocs.io/img/class.png "ir.notifaano.server.controllers.EarthquakeInsuranceController") EarthquakeInsuranceController

### Get singleton instance

The singleton instance of the ``` EarthquakeInsuranceController ``` class can be accessed from the API Client.

```java
EarthquakeInsuranceController earthquakeInsurance = client.getEarthquakeInsurance();
```

### <a name="get_earthquake_async"></a>![Method: ](https://apidocs.io/img/method.png "ir.notifaano.server.controllers.EarthquakeInsuranceController.getEarthquakeAsync") getEarthquakeAsync

> دریافت اطلاعات پایه ی بیمه ی زلزله


```java
void getEarthquakeAsync(
        final String subDomain,
        final int insurancePolicyId,
        final int insurancePolicyType,
        final String xApiKey,
        final APICallBack<BaseModelEarthquake> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| subDomain |  ``` Required ```  | دامنه یا زیر دامنه ی مرکز بیمه |
| insurancePolicyId |  ``` Required ```  | شناسه ی بیمه نامه |
| insurancePolicyType |  ``` Required ```  | شناسه ی نوع بیمه نامه |
| xApiKey |  ``` Required ```  | کلید اختصاصی ارتباط با سرور |


#### Example Usage

```java
String subDomain = "hfz1";
int insurancePolicyId = 0;
int insurancePolicyType = 6;
String xApiKey = "d6dfd932-75d8-e911-811a-000c294ecf01";
// Invoking the API call with sample inputs
earthquakeInsurance.getEarthquakeAsync(subDomain, insurancePolicyId, insurancePolicyType, xApiKey, new APICallBack<BaseModelEarthquake>() {
    public void onSuccess(HttpContext context, BaseModelEarthquake response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

## <a name="travel_insurance_controller"></a>![Class: ](https://apidocs.io/img/class.png "ir.notifaano.server.controllers.TravelInsuranceController") TravelInsuranceController

### Get singleton instance

The singleton instance of the ``` TravelInsuranceController ``` class can be accessed from the API Client.

```java
TravelInsuranceController travelInsurance = client.getTravelInsurance();
```

### <a name="get_travel_insurance_async"></a>![Method: ](https://apidocs.io/img/method.png "ir.notifaano.server.controllers.TravelInsuranceController.getTravelInsuranceAsync") getTravelInsuranceAsync

> TODO: Add Description


```java
void getTravelInsuranceAsync(
        final String subDomain,
        final int insurancePolicyId,
        final String xApiKey,
        final APICallBack<BaseModelTravelInsurance> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| subDomain |  ``` Required ```  | دامنه یا زیر دامنه ی مرکز بیمه |
| insurancePolicyId |  ``` Required ```  | شناسه ی بیمه نامه |
| xApiKey |  ``` Required ```  | کلید اختصاصی ارتباط با سرور |


#### Example Usage

```java
String subDomain = "hfz1";
int insurancePolicyId = 0;
String xApiKey = "d6dfd932-75d8-e911-811a-000c294ecf01";
// Invoking the API call with sample inputs
travelInsurance.getTravelInsuranceAsync(subDomain, insurancePolicyId, xApiKey, new APICallBack<BaseModelTravelInsurance>() {
    public void onSuccess(HttpContext context, BaseModelTravelInsurance response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

## <a name="elevator_insurance_controller"></a>![Class: ](https://apidocs.io/img/class.png "ir.notifaano.server.controllers.ElevatorInsuranceController") ElevatorInsuranceController

### Get singleton instance

The singleton instance of the ``` ElevatorInsuranceController ``` class can be accessed from the API Client.

```java
ElevatorInsuranceController elevatorInsurance = client.getElevatorInsurance();
```

### <a name="get_elevator_insurance_async"></a>![Method: ](https://apidocs.io/img/method.png "ir.notifaano.server.controllers.ElevatorInsuranceController.getElevatorInsuranceAsync") getElevatorInsuranceAsync

> دریافت اطلاعات پایه ی بیمه نامه ی آسانسور


```java
void getElevatorInsuranceAsync(
        final String subDomain,
        final int insurancePolicyId,
        final String xApiKey,
        final APICallBack<BaseModelElevatorInsurance> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| subDomain |  ``` Required ```  | دامنه یا زیر دامنه ی مرکز بیمه |
| insurancePolicyId |  ``` Required ```  | شناسه ی بیمه نامه |
| xApiKey |  ``` Required ```  | کلید اختصاصی ارتباط با سرور |


#### Example Usage

```java
String subDomain = "hfz1";
int insurancePolicyId = 0;
String xApiKey = "d6dfd932-75d8-e911-811a-000c294ecf01";
// Invoking the API call with sample inputs
elevatorInsurance.getElevatorInsuranceAsync(subDomain, insurancePolicyId, xApiKey, new APICallBack<BaseModelElevatorInsurance>() {
    public void onSuccess(HttpContext context, BaseModelElevatorInsurance response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

## <a name="main_controller"></a>![Class: ](https://apidocs.io/img/class.png "ir.notifaano.server.controllers.MainController") MainController

### Get singleton instance

The singleton instance of the ``` MainController ``` class can be accessed from the API Client.

```java
MainController main = client.getMain();
```

### <a name="get_portal_landing_page_async"></a>![Method: ](https://apidocs.io/img/method.png "ir.notifaano.server.controllers.MainController.getPortalLandingPageAsync") getPortalLandingPageAsync

> در یافت اطلاعات لندینگ مراکز بیمه


```java
void getPortalLandingPageAsync(
        final String id,
        final String xApiKey,
        final APICallBack<BaseModelPortalLandingPage> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| id |  ``` Required ```  | دامنه یا زیر دامنه ی مرکز بیمه |
| xApiKey |  ``` Required ```  | کلید اختصاصی ارتباط با سرور |


#### Example Usage

```java
String id = "hfz1";
String xApiKey = "d6dfd932-75d8-e911-811a-000c294ecf01";
// Invoking the API call with sample inputs
main.getPortalLandingPageAsync(id, xApiKey, new APICallBack<BaseModelPortalLandingPage>() {
    public void onSuccess(HttpContext context, BaseModelPortalLandingPage response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_insurance_centre_policy_types_async"></a>![Method: ](https://apidocs.io/img/method.png "ir.notifaano.server.controllers.MainController.getInsuranceCentrePolicyTypesAsync") getInsuranceCentrePolicyTypesAsync

> دریافت لیست بیمه ی های ارائه شده توسط مرکز بیمه


```java
void getInsuranceCentrePolicyTypesAsync(
        final String subDomain,
        final String xApiKey,
        final APICallBack<BaseModelInsuranceCentrePolicyTypes> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| subDomain |  ``` Required ```  | دامنه یا زیر دامنه ی مرکز بیمه |
| xApiKey |  ``` Required ```  | کلید اختصاصی ارتباط با سرور |


#### Example Usage

```java
String subDomain = "hfz1";
String xApiKey = "d6dfd932-75d8-e911-811a-000c294ecf01";
// Invoking the API call with sample inputs
main.getInsuranceCentrePolicyTypesAsync(subDomain, xApiKey, new APICallBack<BaseModelInsuranceCentrePolicyTypes>() {
    public void onSuccess(HttpContext context, BaseModelInsuranceCentrePolicyTypes response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

## <a name="combo_data_controller"></a>![Class: ](https://apidocs.io/img/class.png "ir.notifaano.server.controllers.ComboDataController") ComboDataController

### Get singleton instance

The singleton instance of the ``` ComboDataController ``` class can be accessed from the API Client.

```java
ComboDataController comboData = client.getComboData();
```

### <a name="get_damage_type_async"></a>![Method: ](https://apidocs.io/img/method.png "ir.notifaano.server.controllers.ComboDataController.getDamageTypeAsync") getDamageTypeAsync

> دریافت لیست نوع خسارت


```java
void getDamageTypeAsync(
        final String xApiKey,
        final APICallBack<BaseModelDamageType> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| xApiKey |  ``` Required ```  | کلید اختصاصی ارتباط با سرور |


#### Example Usage

```java
String xApiKey = "d6dfd932-75d8-e911-811a-000c294ecf01";
// Invoking the API call with sample inputs
comboData.getDamageTypeAsync(xApiKey, new APICallBack<BaseModelDamageType>() {
    public void onSuccess(HttpContext context, BaseModelDamageType response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_insurance_types_async"></a>![Method: ](https://apidocs.io/img/method.png "ir.notifaano.server.controllers.ComboDataController.getInsuranceTypesAsync") getInsuranceTypesAsync

> دریافت لیست نوع بیمه نامه


```java
void getInsuranceTypesAsync(
        final String subDomain,
        final boolean issueInsurance,
        final String xApiKey,
        final APICallBack<InsuranceTypes> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| subDomain |  ``` Required ```  | دامنه یا زیر دامنه ی مرکز بیمه |
| issueInsurance |  ``` Required ```  | دریافت بیمه نامه های قابل صدور |
| xApiKey |  ``` Required ```  | کلید اختصاصی ارتباط با سرور |


#### Example Usage

```java
String subDomain = "hfz1";
boolean issueInsurance = false;
String xApiKey = "d6dfd932-75d8-e911-811a-000c294ecf01";
// Invoking the API call with sample inputs
comboData.getInsuranceTypesAsync(subDomain, issueInsurance, xApiKey, new APICallBack<InsuranceTypes>() {
    public void onSuccess(HttpContext context, InsuranceTypes response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_insurance_companies_async"></a>![Method: ](https://apidocs.io/img/method.png "ir.notifaano.server.controllers.ComboDataController.getInsuranceCompaniesAsync") getInsuranceCompaniesAsync

> دریافت لیست شرکت های بیمه


```java
void getInsuranceCompaniesAsync(
        final String subDomain,
        final int insuranceTypeId,
        final String xApiKey,
        final APICallBack<InsuranceCompanies> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| subDomain |  ``` Required ```  | دامنه یا زیر دامنه ی مرکز بیمه |
| insuranceTypeId |  ``` Required ```  | شناسه ی نوع بیمه نامه |
| xApiKey |  ``` Required ```  | کلید اختصاصی ارتباط با سرور |


#### Example Usage

```java
String subDomain = "hfz1";
int insuranceTypeId = 1;
String xApiKey = "d6dfd932-75d8-e911-811a-000c294ecf01";
// Invoking the API call with sample inputs
comboData.getInsuranceCompaniesAsync(subDomain, insuranceTypeId, xApiKey, new APICallBack<InsuranceCompanies>() {
    public void onSuccess(HttpContext context, InsuranceCompanies response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

## <a name="tracking_damage_controller"></a>![Class: ](https://apidocs.io/img/class.png "ir.notifaano.server.controllers.TrackingDamageController") TrackingDamageController

### Get singleton instance

The singleton instance of the ``` TrackingDamageController ``` class can be accessed from the API Client.

```java
TrackingDamageController trackingDamage = client.getTrackingDamage();
```

### <a name="get_tracking_code_async"></a>![Method: ](https://apidocs.io/img/method.png "ir.notifaano.server.controllers.TrackingDamageController.getTrackingCodeAsync") getTrackingCodeAsync

> استعلام وضعیت خسارت


```java
void getTrackingCodeAsync(
        final String mTrackingCode,
        final String xApiKey,
        final APICallBack<BaseModelTrakingCode> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| mTrackingCode |  ``` Required ```  | کد پیگیری خسارت |
| xApiKey |  ``` Required ```  | کلید اختصاصی ارتباط با سرور |


#### Example Usage

```java
String mTrackingCode = "/{TrackingCode}";
String xApiKey = "d6dfd932-75d8-e911-811a-000c294ecf01";
// Invoking the API call with sample inputs
trackingDamage.getTrackingCodeAsync(mTrackingCode, xApiKey, new APICallBack<BaseModelTrakingCode>() {
    public void onSuccess(HttpContext context, BaseModelTrakingCode response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Bad Request |



### <a name="create_tracking_damage_async"></a>![Method: ](https://apidocs.io/img/method.png "ir.notifaano.server.controllers.TrackingDamageController.createTrackingDamageAsync") createTrackingDamageAsync

> ثبت خسارت بیمه


```java
void createTrackingDamageAsync(
        final TrackingDamageRequest body,
        final String xApiKey,
        final String contentType,
        final APICallBack<TrackingDamage> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| body |  ``` Required ```  | اطلاعات خسارت |
| xApiKey |  ``` Required ```  | کلید اختصاصی ارتباط با سرور |
| contentType |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    String bodyValue = "{\r\n  \"personalityType\": 0,\r\n  \"trackingDamageStatus\": [\r\n    {\r\n      \"trackingDamageFile\": [\r\n        {\r\n          \"id\": 162747,\r\n          \"url\": \"https://media.easybimeh.com//Easybimeh/FileManager/InsuranceCentre/hfz1/637089119345134776.jpeg\",\r\n          \"title\": \"کارت شناسایی\"\r\n        }\r\n      ]\r\n    }\r\n  ],\r\n  \"description\": \"بدنه ی خودرو خسارت دیده\",\r\n  \"insuranceTypeId\": 1,\r\n  \"insuranceCompanyId\": 34,\r\n  \"insurancePolicyNumber\": \"123456\",\r\n  \"damageType\": \"مالی\",\r\n  \"name\": \"کاظم\",\r\n  \"nationalCode\": \"3080118383\",\r\n  \"mobile\": \"09018318086\",\r\n  \"insuredProfile\": \"پژو 405\",\r\n  \"subDomain\": \"hfz1\"\r\n}";
    TrackingDamageRequest body = mapper.readValue(bodyValue,new TypeReference<TrackingDamageRequest> (){});
    String xApiKey = "d6dfd932-75d8-e911-811a-000c294ecf01";
    String contentType = "application/json";
    // Invoking the API call with sample inputs
    trackingDamage.createTrackingDamageAsync(body, xApiKey, contentType, new APICallBack<TrackingDamage>() {
        public void onSuccess(HttpContext context, TrackingDamage response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


### <a name="get_status_status_collections_async"></a>![Method: ](https://apidocs.io/img/method.png "ir.notifaano.server.controllers.TrackingDamageController.getStatusStatusCollectionsAsync") getStatusStatusCollectionsAsync

> دریافت لیست وضعیت های خسارت


```java
void getStatusStatusCollectionsAsync(
        final int statusType,
        final String xApiKey,
        final APICallBack<BaseModelStatusStatusCollections> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| statusType |  ``` Required ```  | نوع وضعیت ها ی خسارت => 0 |
| xApiKey |  ``` Required ```  | کلید اختصاصی ارتباط با سرور |


#### Example Usage

```java
int statusType = 0;
String xApiKey = "d6dfd932-75d8-e911-811a-000c294ecf01";
// Invoking the API call with sample inputs
trackingDamage.getStatusStatusCollectionsAsync(statusType, xApiKey, new APICallBack<BaseModelStatusStatusCollections>() {
    public void onSuccess(HttpContext context, BaseModelStatusStatusCollections response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_status_async"></a>![Method: ](https://apidocs.io/img/method.png "ir.notifaano.server.controllers.TrackingDamageController.getStatusAsync") getStatusAsync

> دریافت اطلاعات وضعیت


```java
void getStatusAsync(
        final int entityId,
        final String xApiKey,
        final APICallBack<BaseModelStatus> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| entityId |  ``` Required ```  | شناسه ی وضعیت |
| xApiKey |  ``` Required ```  | کلید اختصاصی ارتباط با سرور |


#### Example Usage

```java
int entityId = 1129;
String xApiKey = "d6dfd932-75d8-e911-811a-000c294ecf01";
// Invoking the API call with sample inputs
trackingDamage.getStatusAsync(entityId, xApiKey, new APICallBack<BaseModelStatus>() {
    public void onSuccess(HttpContext context, BaseModelStatus response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

## <a name="footer_controller"></a>![Class: ](https://apidocs.io/img/class.png "ir.notifaano.server.controllers.FooterController") FooterController

### Get singleton instance

The singleton instance of the ``` FooterController ``` class can be accessed from the API Client.

```java
FooterController footer = client.getFooter();
```

### <a name="get_portal_landing_contact_about_async"></a>![Method: ](https://apidocs.io/img/method.png "ir.notifaano.server.controllers.FooterController.getPortalLandingContactAboutAsync") getPortalLandingContactAboutAsync

> دریافت اطلاعات درباره ی ما


```java
void getPortalLandingContactAboutAsync(
        final String xApiKey,
        final APICallBack<BaseModelPortalLandingContactAbout> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| xApiKey |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String xApiKey = "d6dfd932-75d8-e911-811a-000c294ecf01";
// Invoking the API call with sample inputs
footer.getPortalLandingContactAboutAsync(xApiKey, new APICallBack<BaseModelPortalLandingContactAbout>() {
    public void onSuccess(HttpContext context, BaseModelPortalLandingContactAbout response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_faq_insurance_centre_async"></a>![Method: ](https://apidocs.io/img/method.png "ir.notifaano.server.controllers.FooterController.getFaqInsuranceCentreAsync") getFaqInsuranceCentreAsync

> دریافت لیست سوالات متداول


```java
void getFaqInsuranceCentreAsync(
        final String xApiKey,
        final APICallBack<BaseModelFaqInsuranceCentre> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| xApiKey |  ``` Required ```  | کلید اختصاصی ارتباط با سرور |


#### Example Usage

```java
String xApiKey = "d6dfd932-75d8-e911-811a-000c294ecf01";
// Invoking the API call with sample inputs
footer.getFaqInsuranceCentreAsync(xApiKey, new APICallBack<BaseModelFaqInsuranceCentre>() {
    public void onSuccess(HttpContext context, BaseModelFaqInsuranceCentre response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_insurance_policy_tracking_async"></a>![Method: ](https://apidocs.io/img/method.png "ir.notifaano.server.controllers.FooterController.getInsurancePolicyTrackingAsync") getInsurancePolicyTrackingAsync

> پیگیری وضعیت بیمه نامه


```java
void getInsurancePolicyTrackingAsync(
        final int trackingCode,
        final long nationalCode,
        final String xApiKey,
        final APICallBack<BaseModelInsurancePolicyTracking> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| trackingCode |  ``` Required ```  | شماره ی پیگیری بیمه نامه |
| nationalCode |  ``` Required ```  | کد ملی کاربر |
| xApiKey |  ``` Required ```  | کلید اختصاصی ارتباط با سرور |


#### Example Usage

```java
int trackingCode = 213981083;
long nationalCode = 3080115309L;
String xApiKey = "d6dfd932-75d8-e911-811a-000c294ecf01";
// Invoking the API call with sample inputs
footer.getInsurancePolicyTrackingAsync(trackingCode, nationalCode, xApiKey, new APICallBack<BaseModelInsurancePolicyTracking>() {
    public void onSuccess(HttpContext context, BaseModelInsurancePolicyTracking response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 500 | Internal Server Error |



[Back to List of Controllers](#list_of_controllers)

## <a name="insurance_policy_plan_controller"></a>![Class: ](https://apidocs.io/img/class.png "ir.notifaano.server.controllers.InsurancePolicyPlanController") InsurancePolicyPlanController

### Get singleton instance

The singleton instance of the ``` InsurancePolicyPlanController ``` class can be accessed from the API Client.

```java
InsurancePolicyPlanController insurancePolicyPlan = client.getInsurancePolicyPlan();
```

### <a name="get_special_plan_async"></a>![Method: ](https://apidocs.io/img/method.png "ir.notifaano.server.controllers.InsurancePolicyPlanController.getSpecialPlanAsync") getSpecialPlanAsync

> دریافت لیست طرح های بیمه ای


```java
void getSpecialPlanAsync(
        final String subDomain,
        final String xApiKey,
        final APICallBack<BaseModelSpecialPlan> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| subDomain |  ``` Required ```  | دامنه یا زیر دامنه ی مرکز بیمه |
| xApiKey |  ``` Required ```  | کلید اختصاصی ارتباط با سرور |


#### Example Usage

```java
String subDomain = "hfz1";
String xApiKey = "d6dfd932-75d8-e911-811a-000c294ecf01";
// Invoking the API call with sample inputs
insurancePolicyPlan.getSpecialPlanAsync(subDomain, xApiKey, new APICallBack<BaseModelSpecialPlan>() {
    public void onSuccess(HttpContext context, BaseModelSpecialPlan response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)



