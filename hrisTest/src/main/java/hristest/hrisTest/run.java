package hristest.hrisTest;

import java.util.Date;

public class run {

	public static void main(String[] args) throws InterruptedException {
	main run=new main();
	run.OpenHRIS();
	run.login();
	run.URL();
	run.timesheet(""+(new Date().getDate()));
	run.logout();
	
	}

}
