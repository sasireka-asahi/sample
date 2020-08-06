package stepdefn;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pojoclass extends Baseclass{

	public Pojoclass() {
		PageFactory.initElements(driver, this);
	}
	
	//enter email id
	@FindBy(xpath="//*[@id='email_create']")
	private WebElement email;

	public WebElement getEmail() {
		return email;
	}

	public void setEmail(WebElement email) {
		this.email = email;
	}
	
	
	//click on create button
	@FindBy(xpath="//*[@id='SubmitCreate']/span")
	private WebElement createbtn;

	public WebElement getCreatebtn() {
		return createbtn;
	}

	public void setCreatebtn(WebElement createbtn) {
		this.createbtn = createbtn;
	}
	
	//Select title 
	
		@FindBy(xpath="//*[@id='account-creation_form']/div[1]/div[1]/div[1]/label")
		private WebElement selecttitle;
		
		
		public WebElement getSelecttitle() {
			return selecttitle;
		}

		public void setSelecttitle(WebElement selecttitle) {
			this.selecttitle = selecttitle;
		}
	
		//Enter firtname
		@FindBy(xpath="//*[@id='customer_firstname']")
		private WebElement firstname;

		public WebElement getFirstname() {
			return firstname;
		}

		public void setFirstname(WebElement firstname) {
			this.firstname = firstname;
		}
		
		//Enter Lastname
		@FindBy(xpath="//*[@id='customer_lastname']")
				private WebElement lastname;

		public WebElement getLastname() {
			return lastname;
		}

		public void setLastname(WebElement lastname) {
			this.lastname = lastname;
		}
		
		//Enter Password
		@FindBy(xpath="//*[@id='passwd']")
		private WebElement password;

		public WebElement getPassword() {
			return password;
		}

		public void setPassword(WebElement password) {
			this.password = password;
		}
		
		//Enter address
		@FindBy(xpath="//*[@id='address1']")
		private WebElement address;

		public WebElement getAddress() {
			return address;
		}

		public void setAddress(WebElement address) {
			this.address = address;
		}

		//get phone no
		@FindBy(xpath="//*[@id='phone_mobile']")
		private WebElement phoneno;

		public WebElement getPhoneno() {
			return phoneno;
		}

		public void setPhoneno(WebElement phoneno) {
			this.phoneno = phoneno;
		}
		
		//enter city
		@FindBy(xpath="//*[@id='city']")
		private WebElement city;

		public WebElement getCity() {
			return city;
		}

		public void setCity(WebElement city) {
			this.city = city;
		}
		
		//enter zipcode
		@FindBy(xpath="//*[@id='postcode']")
		private WebElement zipcode;

		public WebElement getZipcode() {
			return zipcode;
		}

		public void setZipcode(WebElement zipcode) {
			this.zipcode = zipcode;
		}
		
		//select state
		@FindBy(xpath="//*[@id='id_state']")
		
		private WebElement state;

		public WebElement getState() {
			return state;
		}

		public void setState(WebElement state) {
			this.state = state;
		}
		
		//enter country
		@FindBy(xpath="//*[@id='id_country']")
		private WebElement country;

		public WebElement getCountry() {
			return country;
		}

		public void setCountry(WebElement country) {
			this.country = country;
		}
		
		//Click on  register link
		@FindBy(xpath="//*[@id='submitAccount']/span")
		private WebElement rlink;

		public void setRlink(WebElement rlink) {
			this.rlink = rlink;
		}

		public WebElement getRlink() {
			// TODO Auto-generated method stub
			return null;
		}
		
		
}



