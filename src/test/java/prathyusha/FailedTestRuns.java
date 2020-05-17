package prathyusha;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;

public class FailedTestRuns {

	
		TestNG runner = new TestNG();
		List <String> list = new ArrayList<String>();
		list.add("C:\\Users\\Sunku\\Desktop\\My learning\\javapgms\\MySel\\testng.xml");
		runner.setTestSuites(list);
		runner.run();
}
