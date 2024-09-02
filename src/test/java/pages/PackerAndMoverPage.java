package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PackerAndMoverPage {

    // Initialize the WebDriver
    WebDriver driver;

    // PageFactory elements
    @FindBy(xpath = "//img[@alt='hamburger']")
    WebElement menu;
    
   @FindBy(xpath = "//div[@id='main-menu']/div[2]/a[4]")
   WebElement packerandmover;

    @FindBy(xpath = "//div[contains(@class,'overflow-hidden faded')]") // Replace with the actual locator
    WebElement mode;
    
    @FindBy(xpath="(//button[contains(@class,'block text-pleasing-black')])[2]")
    WebElement dropdownlist;


    @FindBy(xpath= "(//input[@placeholder='Shifting From'])[2]") // Replace with the actual locator
    WebElement localityshiftingfrom;

    @FindBy(xpath= "(//input[@placeholder='Shifting To'])[2]") // Replace with the actual locator
    WebElement localityshiftingto;
    

    @FindBy(xpath= "(//button[@type='button']//div)[3]") // Replace with the actual locator
    WebElement checkpricebutton;

    @FindBy(xpath= "//div[text()='Furniture']") // Replace with the actual locator
    WebElement furnitureOption;

    @FindBy(xpath= "(//input[@placeholder='Search Source City'])[2]") // Replace with the actual locator
    WebElement sourceCityInput;

    @FindBy(xpath= "(//input[@placeholder='Search Destination City'])[2]") // Replace with the actual locator
    WebElement destinationCityInput;

    @FindBy(xpath= "(//input[@placeholder='Shifting Date'])[2]") // Replace with the actual locator
    WebElement shiftingDateInput;

    @FindBy(xpath= "//div[text()='Added Items ']") // Replace with the actual locator
    WebElement addItemButton;

    @FindBy(xpath= "//div[text()='Continue']") // Replace with the actual locator
    WebElement continueButton;

    @FindBy(xpath= "//input[@class='form-control ']") // Replace with the actual locator
    WebElement pickupLocalityInput;

    @FindBy(xpath = "(//input[@class='form-control '])[2]") // Replace with the actual locator
    WebElement destinationLocalityInput;

    @FindBy(xpath = "//div[text()='Update Location']") // Replace with the actual locator
    WebElement updateLocationButton;

    @FindBy(xpath= "//div[text()='Car']") // Replace with the actual locator
    WebElement vehicleOption;

    @FindBy(xpath= "(//div[text()='Schedule'])[2]") // Replace with the actual locator
    WebElement scheduleButton;

    @FindBy(id = "//div[text()='Confirm']") // Replace with the actual locator
    WebElement confirmButton;

    @FindBy(id = "errormessage") // Replace with the actual locator
    WebElement errorMessage;
    
    
    // Constructor
    public PackerAndMoverPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Actions
    public void selectmenu() {
        menu.click();
    }
    
    public void selectpackerandmover() {
    	packerandmover.click();
    }

    public void selectCity() {
        mode.click();
    }

    public void selectlocality1() {
        dropdownlist.click();
    }
    
    public void selectlocality2(String locality) {
    	localityshiftingfrom.sendKeys(locality);
    }
    
    public void selectlocality(String locality) {
    	localityshiftingto.sendKeys(locality);
    }

    public void clickCheckPrice() {
        checkpricebutton.click();
    }

    public void selectFurnitureOption() {
        furnitureOption.click();
    }

    public void enterSourceCity(String sourceCity) {
        sourceCityInput.sendKeys(sourceCity);
    }

    public void enterDestinationCity(String destinationCity) {
        destinationCityInput.sendKeys(destinationCity);
    }

    public void selectShiftingDate(String date) {
        shiftingDateInput.sendKeys(date);
    }

    public void addItemToInventory() {
        addItemButton.click();
    }

    public void clickContinue() {
        continueButton.click();
    }

    public void enterPickupLocality(String pickupLocality) {
        pickupLocalityInput.sendKeys(pickupLocality);
    }

    public void enterDestinationLocality(String destinationLocality) {
        destinationLocalityInput.sendKeys(destinationLocality);
    }

    public void clickUpdateLocation() {
        updateLocationButton.click();
    }

    public void selectVehicleForRelocation() {
        vehicleOption.click();
    }

    public void clickSchedule() {
        scheduleButton.click();
    }

    public void clickConfirm() {
        confirmButton.click();
    }

    public String getErrorMessage() {
        return errorMessage.getText();
    }
}
