package FW_Practics;



public class TopClassLoginPage {
	
	public class UsernameTxt extends Element
	{
		public UsernameTxt()
		{
			System.out.println("constractor");
		}
	}	
	public UsernameTxt usernameTxt = new UsernameTxt();
	
	
	public static void main(String[] args) {
		TopClassLoginPage t=new TopClassLoginPage();
		t.usernameTxt.click();
		t.usernameTxt.typeValue("hellow");
		
		
	}

}
