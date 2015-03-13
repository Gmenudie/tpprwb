package	models;	
import	java.util.*;	
import	javax.persistence.*;	
import	play.db.ebean.*;	
import	play.data.format.*;	
import	play.data.validation.*;	


public	class	Admin	extends	Model	{	
	public static final String LOGIN = "admin";
	public static final String PASSWORD = "admin";
	
	public String login;
	public String password;
	
	public String validate(){
		if(login.equals(LOGIN) && password.equals(PASSWORD)){
			return null;
		}
		else{
			return "Error";
		}
	}

}	