package Sources;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer {
    //Result holds method that is being tested, every test is stored into result test
    int count = 0;
    int MaxTry = 1;
    @Override
    public boolean retry(ITestResult result) {
        if(count < MaxTry){
            count++;
            return true;
        }
        return false;
    }
}


/*
* @Test({Groups = "sick_tired"}, retryAnalyzer = Retry.class)
* */
