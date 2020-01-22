package practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class FindingDuplicateInArray {
// 	static ExtentTest test;

// 	static ExtentReports report;

	public static void main(String[] args) {
//		findingDuplicateUsingHash();
		findingDuplicateNormal();
		
	}
	
	public static void findingDuplicateNormal()
	{
// 		report = new ExtentReports(System.getProperty("C:\\Users\\Ramya\\Desktop\\Exercise\\report\\ExtentReportResults.html"));
// 		test = report.startTest("ExtentDemo");

		int arr[]= {1,2,3,4,4,5,6,5,7,4,3};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println(arr[j]);
					test.log(LogStatus.PASS, "Navigated to the specified URL");

				}
			}
		}
// 		endTest();
	}
	
	public static void findingDuplicateUsingHash()
	{
		ArrayList<String> list = new ArrayList<String>();

		// Form a list of numbers from 0-9.
		for (int i = 0; i < 10; i++) {
			list.add(String.valueOf(i));
		}

		// Insert a new set of numbers from 0-5.
		for (int i = 0; i < 5; i++) {
			list.add(String.valueOf(i));
		}

		System.out.println("Input list : " + list);
		System.out.println("\nFiltered duplicates : " + processList(list));
	}

	public static Set<String> processList(List<String> listContainingDuplicates) {

		final Set<String> resultSet = new HashSet<String>();
		final Set<String> tempSet = new HashSet<String>();

		for (String yourInt : listContainingDuplicates) {
			if (!tempSet.add(yourInt)) {
				resultSet.add(yourInt);
			}
		}
		return resultSet;
	}
	public static void endTest()

	{

// 	report.endTest(test);
	
// 	report.flush();
	
	}

}	
