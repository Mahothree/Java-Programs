package Selenium_Practice;

public class eg {
	public class TestCase1 
	{

		  to  Everyone
		  public class TestCase1 
		  {

		  	@Test
		  	public void login_to_facebook_using_valid_credentails()
		  	{
		  	WebDriver driver = new ChromeDriver();
		  	driver.manage().window().maximize();
		  	driver.get("https://www.facebook.com/");
		  	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  	Facebook_Login_Page fb = new Facebook_Login_Page(driver);
		  	fb.un();
		  	fb.pwd();
		  	fb.login();
		  	
		  	}
		  	
		  	
		  	
		  }

		  Mounika B 10:35 PM
		  public class Facebook_Login_Page 
		  {
		  //step 1: locate each element using @FindBy
		  	WebDriver driver;
		  	@FindBy(id="email")  
		  	WebElement username;
		  	
		  	@FindBy(name="pass")  
		  	WebElement password;
		  	
		  	@FindBy(xpath="//button[@name='login']")  
		  	WebElement loginbutton;
		  	//step 2: creating seperate methods for each compoenent
		  	
		  	public void un()
		  	{
		  		username.sendKeys("mounika@gmail.com");
		  	}
		  	public void pwd()
		  	{
		  		password.sendKeys("mounikaismypassword");
		  	}
		  	public void login()
		  	{
		  		loginbutton.click();
		  	}

		  //Step 3: 	initilize each element using Pagefactory class insdie the constructor
		  	
		  	
		  	public Facebook_Login_Page(WebDriver driver)
		  	{
		  		PageFactory.initElements(driver,this);
		  	}
		  	
		  	
		  }
		
		
		
	}
}
