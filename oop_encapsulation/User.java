package oop_encapsulation;

public class User {

	public static void main(String[] args) {

		BroswerClass br = new BroswerClass();
		br.setUsername("Sachin");
		br.setPassword("abc@123");
		System.out.println(br.getUsername());
		System.out.println(br.getPassword());
		
		System.out.println("Password Updated");
		
		br.setPassword("xyz@987");
		System.out.println(br.getUsername());
		System.out.println(br.getPassword());
		
		System.out.println("#################################");
		
		LaunchBrowser lb =new LaunchBrowser();
		lb.LoginPage();
	}

}
