package IRetry;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class IRetry_interface implements IRetryAnalyzer{

	int i;
	int a=3;
	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		
		if(i<a) {
			i++;
			return true;
			
			
		}
		return false;
	}

}
