package Blogz;

import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;

public class User extends Entity{
	private String username, password;
	protected static List<User> userList = new ArrayList();
	
	public User(String username, String password){
		super();
		this.username = username;
		
		if(isValidUsername(username) != true){
			throw new IllegalArgumentException();
		}
		
		this.password = hashPassword(password);
		
		if(isValidPassword(password) != true){
			throw new IllegalArgumentException();
		}
		User.userList.add(this);
	}
	
	public static boolean isValidUsername(String username){
		Pattern p = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]{4,11}");
		Matcher m = p.matcher(username);
		return m.matches();
	}
	
	private static String hashPassword(String password){
		return password;
	}
	
	private static boolean isValidPassword(String password){
		return true;
	}
	
	public static String roster(){
		String u = "";
		for(int i = 0; i < User.userList.size(); i++){
			u+=User.userList.get(i).getUsername() + "\n";
		}
		return u;
	}
	public static List<User> getUserList(){
		return userList;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	public static void main(String[] args){
		User u = new User("Shane", "reshi");
		User u2 = new User("Robert", "");
		System.out.println(User.getUserList());
		System.out.println(User.roster());
		System.out.println(u.getUid());
		System.out.println(u2.getUid());
	}
}
