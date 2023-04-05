package pages;

import org.openqa.selenium.WebDriver;

public class BaseTest {
	WebDriver dr;
public void OpenBrowser(String browser) {

	if(browser.equals("Chrome")){
		System.out.println("open chorme browser");}
		else if(browser.equals("Fairefox")){
			System.out.println("open FaireFox");}
			else if(browser.equals("Safari")) {
				System.out.println("open Safari");
				}
}

public HomePage gotoUrl() throws InterruptedException {
	dr.get(null);
	dr.manage().window();
	 dr.wait(20);
	return new HomePage();
}

public void eachcharcount() {
	int eachcharcount=1; 
	int hightcount=1;
	String s="hello";
	char[]c=s.toCharArray();
	char x=c[0];
	for(int i=0;i<c.length;i++) {
		for(int j=i+1;j<c.length;j++) {
			if(c[i]==c[j]) {
				eachcharcount ++;
			}
			if (eachcharcount>hightcount) {
				hightcount=eachcharcount;
				x=c[i];		
				eachcharcount=1;	
			}System.out.println(x+"is occured"+"highest"+"times");
		}
	
		
	}
	
}
}
