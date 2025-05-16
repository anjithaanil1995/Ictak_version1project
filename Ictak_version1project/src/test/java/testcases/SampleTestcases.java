package testcases;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import bases.SampleBase;
import pages.SampleLogin;

public class SampleTestcases extends SampleBase {
	
	SampleLogin lobj;
	
	@BeforeClass
	public void objinit() {
		
		lobj=new SampleLogin(driver);
	}
		@Test
		public void TC_1_1_1() {
			lobj.btnclk();
			
		}
		@Test
		public void TC_2_1_1() {
			driver.get("https://ictak-internship-portal-client.vercel.app/");
			lobj.btnclk();
			lobj.getUsername("ictak@example.com");
			lobj.getPasswd("0000");
			lobj.btnclklog();
			
		}
		@Test
		public void TC_2_1_2() {
			driver.get("https://ictak-internship-portal-client.vercel.app/");
			lobj.btnclk();
			lobj.getUsername("ictak@example.com");
			lobj.getPasswd("1111");
			lobj.btnclklog();
			String errmsg=lobj.errorMessage();
			assertEquals(errmsg, Constants.Expected_Message);		
		}
		@Test
		public void TC_2_1_3() {
			driver.get("https://ictak-internship-portal-client.vercel.app/");
			lobj.btnclk();
			lobj.getUsername("icexample.com");
			lobj.getPasswd("0000");
			lobj.btnclklog();
			String errmsg=lobj.errorMessage();
			assertEquals(errmsg, Constants.Expected_Message);
		}
		@Test
		public void TC_2_1_4() {
			driver.get("https://ictak-internship-portal-client.vercel.app/");
			lobj.btnclk();
			lobj.blankusername();
			lobj.getPasswd("0000");
			lobj.btnclklog();
			
		}
		@Test
		public void TC_2_1_5(){
			driver.get("https://ictak-internship-portal-client.vercel.app/");
			lobj.btnclk();
			lobj.getUsername("ictak@example.com");
			lobj.blankpassword();
			lobj.btnclklog();
			
		}
		@Test
		public void TC_2_1_6() {
			driver.get("https://ictak-internship-portal-client.vercel.app/");
			lobj.btnclk();
			lobj.blankemailpassword();
			lobj.btnclklog();
		}
		@Test
		public void TC_3_1_1() {
			driver.get("https://ictak-internship-portal-client.vercel.app/");
			lobj.btnclk();
			lobj.getUsername("ictak@example.com");
			lobj.getPasswd("0000");
			lobj.btnclklog();
			lobj.addProj();
			lobj.pjtopic("Software Testing");
			lobj.pjduration("6");
			lobj.butadd();

		}
		@Test
		public void TC_3_1_2() {
			driver.get("https://ictak-internship-portal-client.vercel.app/");
			lobj.btnclk();
			lobj.getUsername("ictak@example.com");
			lobj.getPasswd("0000");
			lobj.btnclklog();
			lobj.addProj();
			lobj.pjtopic("Software Testing");
			lobj.pjduration("6 months");
			lobj.butadd();
		}
		@Test
		public void TC_3_1_3() {
			driver.get("https://ictak-internship-portal-client.vercel.app/");
			lobj.btnclk();
			lobj.getUsername("ictak@example.com");
			lobj.getPasswd("0000");
			lobj.btnclklog();
			lobj.addProj();
			lobj.pjtopic("Software Testing");
			lobj.butadd();
			lobj.blankfieldDurtopic();	
		}
		@Test
		public void TC_3_1_4() {
			driver.get("https://ictak-internship-portal-client.vercel.app/");
			lobj.btnclk();
			lobj.getUsername("ictak@example.com");
			lobj.getPasswd("0000");
			lobj.btnclklog();
			lobj.addProj();
			lobj.pjduration("6 months");
			lobj.butadd();
			lobj.blankfieldDurtopic();
			
		}
		@Test
		public void TC_3_1_5() {
			driver.get("https://ictak-internship-portal-client.vercel.app/");
			lobj.btnclk();
			lobj.getUsername("ictak@example.com");
			lobj.getPasswd("0000");
			lobj.btnclklog();
			lobj.addProj();
			lobj.butadd();
			lobj.blankfieldDurtopic();
		}
		@Test
		public void TC_3_1_6() {
			driver.get("https://ictak-internship-portal-client.vercel.app/");
			lobj.btnclk();
			lobj.getUsername("ictak@example.com");
			lobj.getPasswd("0000");
			lobj.btnclklog();
			lobj.addProj();
			lobj.pjtopic("@#$%%%&**(");
			lobj.pjduration("#####+-**///");
			lobj.butadd();
			lobj.invalidFormats();
		}
		@Test
		public void TC_3_1_7() {
			driver.get("https://ictak-internship-portal-client.vercel.app/");
			lobj.btnclk();
			lobj.getUsername("ictak@example.com");
			lobj.getPasswd("0000");
			lobj.btnclklog();
			lobj.addProj();
			lobj.pjtopic("@#$%%%&**( ");
			lobj.pjduration("8888");
			lobj.butadd();
			lobj.invalidFormats();
		}
		@Test
		public void TC_3_1_8() {
			driver.get("https://ictak-internship-portal-client.vercel.app/");
			lobj.btnclk();
			lobj.getUsername("ictak@example.com");
			lobj.getPasswd("0000");
			lobj.btnclklog();
			lobj.addProj();
			lobj.pjtopic("&**(((+*-/*/*/");
			lobj.pjduration("+*-*/**-++");
			lobj.butadd();
			lobj.invalidFormats();
			
		}
		@Test
		public void TC_3_1_9() {
			driver.get("https://ictak-internship-portal-client.vercel.app/");
			lobj.btnclk();
			lobj.getUsername("ictak@example.com");
			lobj.getPasswd("0000");
			lobj.btnclklog();
			lobj.addProj();
			lobj.pjtopic("Software Tester");
			lobj.pjduration("Months");
			lobj.butadd();
			lobj.invalidFormats();
		}
	    @Test
		public void TC_3_2_1() throws Exception {
			driver.get("https://ictak-internship-portal-client.vercel.app/");
			lobj.btnclk();
			lobj.getUsername("ictak@example.com");
			lobj.getPasswd("0000");
			lobj.btnclklog();
			lobj.addProj();
			lobj.pjtopic("Software Tester");
			lobj.pjduration("6 Months");
			lobj.butadd();
			lobj.editmodifybutton();
			lobj.clearfields();
			lobj.pjtopic("Software Engineer");
			lobj.pjduration("6");
			lobj.updatebutton();		
		}
	    @Test
	    public void TC_3_2_2() throws Exception {
			driver.get("https://ictak-internship-portal-client.vercel.app/");
			lobj.btnclk();
			lobj.getUsername("ictak@example.com");
			lobj.getPasswd("0000");
			lobj.btnclklog();
			lobj.addProj();
			lobj.pjtopic("Software Tester");
			lobj.pjduration("6 Months");
			lobj.butadd();
			lobj.editmodifybutton();
			lobj.clearfields();
			lobj.pjtopic("Software Tester");
			lobj.pjduration("8");
			lobj.updatebutton();				
		}
	    @Test
	    public void TC_3_2_3() throws Exception {
			driver.get("https://ictak-internship-portal-client.vercel.app/");
			lobj.btnclk();
			lobj.getUsername("ictak@example.com");
			lobj.getPasswd("0000");
			lobj.btnclklog();
			lobj.addProj();
			lobj.pjtopic("Software Tester");
			lobj.pjduration("6 Months");
			lobj.butadd();
			lobj.editmodifybutton();
			lobj.clearfields();
			lobj.pjtopic("Python");
			lobj.pjduration("4");
			lobj.updatebutton();	
			
		}
	      
	       @Test
	       	public void TC_3_4_1() {
	    	driver.get("https://ictak-internship-portal-client.vercel.app/");
	    	lobj.logbuttonclk();
	    	lobj.setEmail("ictak@example.com");
	    	lobj.setPassword("0000");
	    	lobj.buttonClick();
	    	String act_result=lobj.adminDashboard();
	    	Assert.assertEquals(act_result,Constants.Expected_Home);
	    	}
	       @Test
	       public void TC_3_4_2() {
	    	driver.get("https://ictak-internship-portal-client.vercel.app/");
	    	lobj.logbuttonclk();
	    	lobj.setEmail("ictak@example.com");
	    	lobj.setPassword("0000");
	    	lobj.buttonClick();
	    	lobj.mentorclick();
	    		}
	    	@Test
	    	public void TC_3_4_3() {
	    	driver.get("https://ictak-internship-portal-client.vercel.app/");
	    	lobj.logbuttonclk();
	    	lobj.setEmail("ictak@example.com");
	    	lobj.setPassword("0000");
	    	lobj.buttonClick();
	    	lobj.mentorclick();
	    	lobj.addMentorbtn();
	    }

	       @Test
	       public void TC_3_4_4() {
	    	driver.get("https://ictak-internship-portal-client.vercel.app/");
	   		lobj.btnclk();
	   		lobj.getUsername("ictak@example.com");
	   		lobj.getPasswd("0000");
	   		lobj.btnclklog();  
	   		lobj.mentorloc();
	   		lobj.addmentor();
	   		lobj.mentname("Rajesh Kumar");
	   		lobj.mentemail("rajeshk@ictak.in");
	   		lobj.mentphone("9876543210");
	   		lobj.mentpassword("Rajesh@123");
	   		lobj.projtop(); 		
	       }
	       @Test
	       public void TC_3_4_5() {
	    	   driver.get("https://ictak-internship-portal-client.vercel.app/");
	      		lobj.btnclk();
	      		lobj.getUsername("ictak@example.com");
	      		lobj.getPasswd("0000");
	      		lobj.btnclklog();  
	      		lobj.mentorloc();
	      		lobj.addmentor();
	      		lobj.mentname("Rajesh Kumar");
	      		lobj.mentemail("rajeshk@ictak.in");
	      		lobj.mentphone("9876543210");
	      		lobj.mentpassword("Rajesh@123");
	      		lobj.projtop(); 
	      		lobj.pjtdropdown();
	      		lobj.mentadd();     		
	       }
	       @Test
	       public void TC_3_4_6() {
	    	   driver.get("https://ictak-internship-portal-client.vercel.app/");
	     		lobj.btnclk();
	     		lobj.getUsername("ictak@example.com");
	     		lobj.getPasswd("0000");
	     		lobj.btnclklog();  
	     		lobj.mentorloc();
	     		lobj.addmentor();
	     		lobj.mentname("Rajesh Kumar");
	     		lobj.mentemail("rajeshk@ictak.in");
	     		lobj.mentphone("9876543210");
	     		lobj.mentpassword("Rajesh@123");
	     		lobj.projtop(); 
	     		lobj.pjtdropdown();
	     		lobj.mentadd(); 
	     		lobj.MentorAdd_Failure();
	       }
	       @Test
	       public void TC_4_1_1() {
	   		driver.get("https://ictak-internship-portal-client.vercel.app/");
	   		lobj.btnclk();
	   		lobj.getUsername("ictak@example.com");
	   		lobj.getPasswd("0000");
	   		lobj.btnclklog();
	   		lobj.logout();
	   		driver.get("https://ictak-internship-portal-client.vercel.app/admin");
	   		String error=lobj.errorcode();
	   		assertEquals(error, Constants.Expected_msg); 		
	   	}	
	       @Test
	       public void TC_5_1_1() {
	       driver.get("https://ictak-internship-portal-client.vercel.app/"); 
	       lobj.logbuttonclk();
	       lobj.setEmail("anandhu@example.com");
	       lobj.setPassword("Mentor@1234");
	       lobj.buttonClick();
	       }
	       @Test
	       public void TC_5_1_2()
	       {
	       	driver.get("https://ictak-internship-portal-client.vercel.app/");
	       	lobj.logbuttonclk();
	       	lobj.setEmail("anandhu@example.com");
	       	lobj.setPassword("12301");
	       	lobj.buttonClick();
	       	String errmsg=lobj.errorMessage();
	       	Assert.assertEquals(errmsg, Constants.Expected_Message);
	       }
	       @Test
	       public void TC_5_1_3()
	       {
	       	driver.get("https://ictak-internship-portal-client.vercel.app/");
	       	lobj.logbuttonclk();
	       	lobj.setEmail("anand@example.com");
	       	lobj.setPassword("Mentor@1234");
	       	lobj.buttonClick();
	       	String errmsg=lobj.errorMessage();
	       	Assert.assertEquals(errmsg, Constants.Expected_Message);
	       }
	       @Test
	       public void TC_5_1_4()
	       {
	       	driver.get("https://ictak-internship-portal-client.vercel.app/");
	       	lobj.logbuttonclk();
	       	lobj.blankusername();
	       	lobj.setPassword("Mentor@1234");
	       	lobj.buttonClick();
	       }
	       @Test
	       public void TC_5_1_5()
	       {
	       	driver.get("https://ictak-internship-portal-client.vercel.app/");
	       	lobj.logbuttonclk();
	       	lobj.setEmail("anandhu@example.com");
	       	lobj.blankpassword();
	       	lobj.buttonClick();      	
	       }
	       @Test
	       public void TC_5_1_6()
	       {
	       	driver.get("https://ictak-internship-portal-client.vercel.app/");
	       	lobj.logbuttonclk();
	       	lobj.blankemailpassword();
	       	lobj.buttonClick();     	
	       }
	       @Test
	       public void TC_5_2_1()
	       {
	       	driver.get("https://ictak-internship-portal-client.vercel.app/");
	       	lobj.logbuttonclk();
	       	lobj.setEmail("anandhu@example.com");
	       	lobj.setPassword("Mentor@1234");
	       	lobj.buttonClick();
	       }
	       @Test
	       public void TC_5_3_1()
	       {
	       	driver.get("https://ictak-internship-portal-client.vercel.app/");
	       	lobj.logbuttonclk();
	       	lobj.setEmail("anandhu@example.com");
	       	lobj.setPassword("Mentor@1234");
	       	lobj.buttonClick();
	       	lobj.clickrefmaterial();
	       	}
	       @Test
	       public void TC_5_4_1()
	       {
	       	driver.get("https://ictak-internship-portal-client.vercel.app/");
	       	lobj.logbuttonclk();
	       	lobj.setEmail("anandhu@example.com");
	       	lobj.setPassword("Mentor@1234");
	       	lobj.buttonClick();
	       	lobj.clickrefmaterial();
	       	lobj.addrefmaterial();
	       	lobj.addtopic("HTML Basics");
	       	lobj.enter_refmaterial("Tutorials Point");
	       	lobj.add_date("20/08/2024");
	       	lobj.add_url("https://example.com ");
	       	lobj.add_status("completed");
	       	lobj.submitbtn();
	       	lobj. alertmessage();
	       	}
	       @Test
	       public void TC_5_5_1()
	       {
	       	driver.get("https://ictak-internship-portal-client.vercel.app/");
	       	lobj.logbuttonclk();
	       	lobj.setEmail("anandhu@example.com");
	       	lobj.setPassword("Mentor@1234");
	       	lobj.buttonClick();
	       	lobj.clickrefmaterial();
	       	lobj.addrefmaterial();
	       	lobj.blanktopicurl();
	       	lobj.enter_refmaterial("Tutorials Point");
	       	lobj.add_date("20/08/2024");
	       	lobj.add_status("completed");
	       	lobj.submitbtn();
	       	}
	       @Test
	       public void TC_5_6_1()
	       {
	       	driver.get("https://ictak-internship-portal-client.vercel.app/");
	       	lobj.logbuttonclk();
	       	lobj.setEmail("anandhu@example.com");
	       	lobj.setPassword("Mentor@1234");
	       	lobj.buttonClick();
	       	lobj.clickrefmaterial();
	       	lobj.addrefmaterial();
	       	lobj.addtopic("JAVA");
	       	lobj.enter_refmaterial("Tutorials Point");
	       	lobj.add_date("16/08/2024");
	       	lobj.add_url("htt://example_com ");
	       	lobj.add_status("completed");
	       	lobj.submitbtn();
	       	lobj. alertmessage();
	       	}
	       @Test
	       public void TC_5_7_1()
	       {
	       	driver.get("https://ictak-internship-portal-client.vercel.app/");
	       	lobj.logbuttonclk();
	       	lobj.setEmail("anandhu@example.com");
	       	lobj.setPassword("Mentor@1234");
	       	lobj.buttonClick();
	       	lobj.viewbtn();
	       	}
	       @Test
	       public void TC_5_8_1()
	       {
	       	driver.get("https://ictak-internship-portal-client.vercel.app/");
	       	lobj.logbuttonclk();
	       	lobj.setEmail("anandhu@example.com");
	       	lobj.setPassword("Mentor@1234");
	       	lobj.buttonClick();
	       	lobj.logoutbtn();
	       	}
	       
	       @AfterTest
	   	public void handleTestResult() {
	   		if(driver!=null) {
	   			driver.close();
	   		}
	       }
}


