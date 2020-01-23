package Base;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Temp {

	
	
	
	
	@Test
	public void mini() {
		System.out.println("gid practisefor ours");
	}
	
	
	
	@BeforeSuite 
	public void msg() {
		System.out.println("before suite first execution ");
	}
	@AfterSuite	
	public void  huge () {
		System.out.println("after suite execute last one execution");
	}
		
		
		
	}

