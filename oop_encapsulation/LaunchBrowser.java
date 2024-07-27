package oop_encapsulation;

public class LaunchBrowser {
	
	public void LoginPage() {
		System.out.println("Login to Page");
		InternetAccess();
		BrowserUpdate();
		PageReadiness();
		Releasenote();
	}

	private void InternetAccess() {
		System.out.println("InternetAccess");
	}

	private void BrowserUpdate() {
		System.out.println("BrowserUpdate");
	}

	
	private void PageReadiness() {
		System.out.println("PageReadiness");
	}


	private void Releasenote() {
		System.out.println("Releasenote");
	}

}
