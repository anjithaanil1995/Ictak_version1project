package pages;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class SampleLogin {
	public WebDriver driver;
	
	public SampleLogin(WebDriver driver) {
		this.driver=driver;
	}
	public void btnclk() {
		WebElement button =driver.findElement(By.xpath("//button[@class='btn2']"));
		button.click();
	}
	public void getUsername(String user) {
		WebElement userbox=driver.findElement(By.xpath("//input[@name='email']"));
		userbox.sendKeys(user);
	}
	public void getPasswd(String pass) {
		WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys(pass);
	}
	public void btnclklog()
	{
		WebElement logbutton=driver.findElement(By.xpath("//button[@type='submit']"));
		logbutton.click();	
	}
	public String errorMessage()
	 {
		WebElement errormsg = driver.findElement(By.xpath("//p[@class='MuiTypography-root MuiTypography-body2 css-1tmw1eq']"));
		String error=errormsg.getText();
		return error;
	 }
	public void blankusername() {
		WebElement emailField = driver.findElement(By.name("email"));
		String validationMessage = (String)((JavascriptExecutor) driver)
		    .executeScript("return arguments[0].validationMessage;", emailField);
		System.out.println("Validation Message(blank email): " + validationMessage);

	}
	public void blankpassword() {
		WebElement passwordField = driver.findElement(By.name("password"));
		String validationMessage = (String)((JavascriptExecutor) driver)
		        .executeScript("return arguments[0].validationMessage;", passwordField);

		    System.out.println("Validation Message (blank password): " + validationMessage);
	}
	public void blankemailpassword() {
		 WebElement emailField = driver.findElement(By.name("email"));
		    WebElement passwordField = driver.findElement(By.name("password"));
		    String validationMessage = (String)((JavascriptExecutor) driver)
		            .executeScript("return arguments[0].validationMessage;", emailField);

		        System.out.println("Validation Message (blank email and password): " + validationMessage);
	}
	
	public void addProj() {
		WebElement addpj=driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorPrimary MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorPrimary css-1hw9j7s']"));
		addpj.click();
	}
	public void pjtopic(String top) {
		WebElement topic=driver.findElement(By.xpath("//input[@name='topic']"));
		topic.sendKeys(top);
	}
	public void pjduration(String duration) {
		WebElement dur=driver.findElement(By.xpath("//input[@name='duration']"));
		dur.sendKeys(duration);
	}
	public void butadd() {
		WebElement add=driver.findElement(By.xpath("//button[text()='Add']"));
		add.click();
	}
	public void blankfieldDurtopic() {
		try {
	        Alert alert = driver.switchTo().alert();
	        String alertText = alert.getText();
	        System.out.println("Alert Message: " + alertText);
	        alert.accept();
	    } catch (NoAlertPresentException e) {
	        System.out.println("No alert is present.");
	    }
	}
	public void invalidFormats(){
		try {
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            System.out.println("Alert Message: " + alertText);

            // Check the message
            Assert.assertEquals(alertText.trim(), "Please enter a valid topic", "Unexpected alert message.");
            alert.accept();  // Dismiss the alert
        } catch (NoAlertPresentException e) {
            // Fail test if alert is not present
            Assert.fail("Alert not displayed for invalid credentials(Invalid topic or duration/Invalid topic and duration)");
        }
    }
	public void editmodifybutton() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement editbut=driver.findElement(By.xpath("//button[.//*[name()='svg' and @data-testid='EditIcon']]"));
		WebElement editButton = wait.until(ExpectedConditions.elementToBeClickable(editbut));
		editbut.click();
	}
		
	public void updatebutton() throws Exception {
		// 1. Click on the Update button
		WebElement updateBtn = driver.findElement(By.xpath("//button[normalize-space()='Update']"));
		updateBtn.click();

				// 2. Wait for a few seconds to see if anything changes
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Or use WebDriverWait for better practice

				// 3. Check if project topic was updated
		String updatedTopic = driver.findElement(By.xpath("//table//tr[last()]/td[1]")).getText(); // adjust xpath as per actual column

				// 4. Validate update
		if (!updatedTopic.equals("NewTopicName")) {
			System.out.println("Update failed. Project topic still shows: " + updatedTopic);
			Assert.fail("Project topic was not updated after clicking the 'Update' button.");
			} 
		else {
				    System.out.println("Project updated successfully.");
			}		
				
			}
	
		
	public void clearfields() {
		WebElement topicField = driver.findElement(By.xpath("//input[@name='topic']"));  
		WebElement durationField = driver.findElement(By.xpath("//input[@name='duration']"));

		// Clear existing content
		topicField.clear();
		durationField.clear();	
	}
	
	public void okbutton() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement okButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='OK']")));
		okButton.click();

	}
	public void logout() {
		WebElement logoutbutt=driver.findElement(By.xpath("//div[@class='MuiButtonBase-root MuiListItemButton-root MuiListItemButton-gutters MuiListItemButton-root MuiListItemButton-gutters css-16e9raa']"));
		logoutbutt.click();
	}
	public String errorcode() {
		WebElement err=driver.findElement(By.xpath("//span[@class='error-code']"));
		String code=err.getText();
		return code;
	}
	public void mentorloc() {
		WebElement ment=driver.findElement(By.xpath("//span[text()='Mentors']"));
		ment.click();
	}
	public void addmentor() {
		WebElement addmen=driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorPrimary MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorPrimary css-1hw9j7s']"));
		addmen.click();
	}
	public void mentname(String name) {
		WebElement mname=driver.findElement(By.xpath("//input[@name='name']"));
		mname.sendKeys(name);
	}
	public void mentemail(String email) {
		WebElement memail=driver.findElement(By.xpath("//label[text()='Email']/following-sibling::div/input"));
		memail.sendKeys(email);
	}
	public void mentphone(String phone) {
		WebElement mphone=driver.findElement(By.xpath("//input[@name='phone']"));
		mphone.sendKeys(phone);
	}
	public void mentpassword(String pass) {
		WebElement mpasswd=driver.findElement(By.xpath("//input[@name='password']"));
		mpasswd.sendKeys(pass);
	}
	public void projtop() {
		WebElement ptop=driver.findElement(By.xpath("//input[@class='MuiInputBase-input MuiInput-input MuiInputBase-inputAdornedEnd MuiAutocomplete-input MuiAutocomplete-inputFocused css-mnn31']"));
		ptop.click();
	}
	public void mentadd() {
		WebElement madd=driver.findElement(By.xpath("(//button[normalize-space()='Cancel']/following-sibling::button)[1]"));
		madd.click();
	}
	public void pjtdropdown() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement englishOption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[normalize-space()='English']")));
		englishOption.click();
	}
	public void MentorAdd_Failure() {
		try {
		    // Wait for the alert to appear
		    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		    Alert alert = wait.until(ExpectedConditions.alertIsPresent());

		    // Get alert text (optional)
		    String alertText = alert.getText();
		    System.out.println("Alert text: " + alertText);

		    // Accept the alert
		    alert.accept();

		    // Optional: Add assertion
		    Assert.assertEquals(alertText, "Invalid project topics");

		} catch (NoAlertPresentException e) {
		    System.out.println("No alert was present.");
		}
	}
	public void logbuttonclk()
	{
		WebElement logbtn=driver.findElement(By.xpath("//button[@class='btn2']"));
		logbtn.click();
	}
	public void setEmail(String mailid)
	{
		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys(mailid);
		
	}
	public void setPassword(String pass)
	{
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys(pass);
	}
	public void buttonClick()
	{
		WebElement button=driver.findElement(By.xpath("//button[@type='submit']"));
		button.click();
	}
	public String adminDashboard()
	{
		WebElement admindash=driver.findElement(By.xpath("//div[text()='Admin Dashboard']"));
		String getText=admindash.getText();
		return getText;
	}
	public void blankDuration()  {
		WebElement durationField = driver.findElement(By.name("duration"));
	    String validationMessage = (String)((JavascriptExecutor) driver)
	            .executeScript("return arguments[0].validationMessage;", durationField);

	    System.out.println("Validation Message (blank duration): " + validationMessage);
	   
	}
	public void blankTopic()  {
		WebElement topic=driver.findElement(By.xpath("//input[@name='topic']"));
	    String validationMessage = (String)((JavascriptExecutor) driver)
	            .executeScript("return arguments[0].validationMessage;", topic);

	    System.out.println("Validation Message (blank topic): " + validationMessage);
	   
	}
	public void blankDurtopic()  {
		WebElement topic=driver.findElement(By.xpath("//input[@name='topic']"));
		WebElement durationField = driver.findElement(By.name("duration"));
	    String validationMessage = (String)((JavascriptExecutor) driver)
	            .executeScript("return arguments[0].validationMessage;", durationField);

	    System.out.println("Validation Message (blank topic and blank duration): " + validationMessage);
	   
	}
	public String mentorDashboard()
	{
		WebElement mentordash=driver.findElement(By.xpath("[//div[text()='Dashboard']"));
		String getText=mentordash.getText();
		return getText;
	}
	public void clickrefmaterial()
	{
		WebElement ref_material=driver.findElement(By.xpath("//span[text()='Reference Materials']"));
		ref_material.click();
		
	}
	public void addrefmaterial()
	{
		WebElement refmaterialbtn=driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorPrimary MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorPrimary css-1ob9j0a']"));
		refmaterialbtn.click();
	}
	public void addtopic(String topics)
	{
		WebElement topic=driver.findElement(By.xpath("//input[@name='topic']"));
		topic.sendKeys(topics);
	}
	public void enter_refmaterial(String reference)
	{
		WebElement addrefmaterial=driver.findElement(By.id("referenceMaterial"));
		addrefmaterial.sendKeys(reference);
	}
	public void add_date(String date)
	{
		WebElement dates=driver.findElement(By.id("postedDate"));
		dates.sendKeys(date);
	}
	public void add_url(String url)
	{
		WebElement urls=driver.findElement(By.id("url"));
		urls.sendKeys(url);
	}
	public void add_status(String stat)
	{
		WebElement status=driver.findElement(By.id("status"));
		status.sendKeys(stat);
	}
	public void submitbtn()
	{
		WebElement subbtn=driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorPrimary MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorPrimary css-125w45g']"));
		subbtn.click();
	}
	public void cancelbtn()
	{
		WebElement canbtn=driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedSecondary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorSecondary MuiButton-root MuiButton-contained MuiButton-containedSecondary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorSecondary css-1b51foz']"));
		canbtn.click();
	}


	public void blanktopicurl()
	{
		WebElement topic=driver.findElement(By.xpath("//input[@name='topic']"));
		WebElement urls=driver.findElement(By.id("url"));
		 String validationMessage = (String)((JavascriptExecutor) driver)
		            .executeScript("return arguments[0].validationMessage;", topic);

		        System.out.println("Validation Message (blank topic and url): " + validationMessage);
	}
	public void alertmessage()
	{
		try {
		    // Wait for the alert to appear
		    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		    Alert alert = wait.until(ExpectedConditions.alertIsPresent());

		    // Get alert text (optional)
		    String alertText = alert.getText();
		    System.out.println("Alert text: " + alertText);

		    // Accept the alert
		    alert.accept();

		    // Optional: Add assertion
		    Assert.assertEquals(alertText, "New Material added Successfully");

		} catch (NoAlertPresentException e) {
		    System.out.println("No alert was present.");
		}	
	}
	public void viewbtn()
	{
		WebElement viewbutton=driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeSmall MuiButton-containedSizeSmall MuiButton-colorPrimary MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeSmall MuiButton-containedSizeSmall MuiButton-colorPrimary view-button css-iq9zr2"
				+ "']"));
		viewbutton.click();
	}
	public void logoutbtn()
	{
		WebElement logout=driver.findElement(By.xpath("//span[text()='Logout']"));
		logout.click();
		
	}	
	public void mentorclick()
	{
		WebElement Mentor=driver.findElement(By.xpath("//span[text()='Mentors']"));
		Mentor.click();
	}
	public void addMentorbtn()
	{
		WebElement mentorbtn=driver.findElement(By.xpath("//button[text()='+ Add Mentor']"));
		mentorbtn.click();
	}

}
