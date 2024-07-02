package DDT;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LearningDataProvider {
	@DataProvider
	public String[][] testData(){
		String[][] dat=new String[2][4];
		dat[0][0]="Ankit";
		dat[0][1]="N";
		dat[0][2]="A+";
		dat[0][3]="ak@gmail.com";
		
		dat[1][0]="sritam";
		dat[1][1]="d";
		dat[1][2]="O-";
		dat[1][3]="nk@gmsil.com";
			return dat;
		
	}
	@Test(dataProvider = "testData")
	public void demo(String fname,String lname,String blood,String email) {
	
		System.out.println(fname);
		System.out.println(lname);
		System.out.println(blood);
		System.out.println(email);
	}

}
