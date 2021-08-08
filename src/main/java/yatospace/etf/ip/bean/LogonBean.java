package yatospace.etf.ip.bean;

import java.io.Serializable;

/**
 * Bean of the logon informations state. 
 * @author MV
 * @version 1.0
 */
public class LogonBean implements Serializable{
	private static final long serialVersionUID = 618204883154918258L;
	private String username = "";
	
	public String getUsername() {
		return username;
	}
	
	public void resetUsername() {
		username = ""; 
	}
	
	public void setUsername(String username) {
		if(username==null) username = ""; 
		this.username = username;
	}
	
	public boolean isLogged() {
		return username!=null && username.trim().length()!=0;
	}
	
	public String usernameHTML() {
		return username.replaceAll("&", "&amp;")
				       .replaceAll("<", "&lt;")
				       .replaceAll(">", "&gt;")
				       .replaceAll("\"", "&quot;")
				       .replaceAll("\"", "&apos;");
	}
}
