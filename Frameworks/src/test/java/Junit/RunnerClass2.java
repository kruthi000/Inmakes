package Junit;

import java.util.List;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class RunnerClass2 {
@Test
public void yc()
{
	Result rc = JUnitCore.runClasses(Suit1.class,Junit_1.class);
	rc.getRunCount();
	System.out.println("runtime : " + rc.getRunTime());
	System.out.println("faliurecount : " + rc.getFailureCount());
	System.out.println("ignorecount : " + rc.getIgnoreCount());
	List<Failure> f = rc.getFailures();
	for (Failure fail : f) {
		 
	System.out.println(fail);
	
	}
}
}
