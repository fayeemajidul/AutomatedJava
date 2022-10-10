package GlobalProperties;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.io.FileUtils;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;

public class userData {

    public static List<HashMap<String, String>> getJsonData() throws IOException {
        File file = new File("/Users/fayeemmooktadeer/Desktop/LearningJava/seleniumWeeks/selenium/FrameWorks/Cucumber/FlightUtility/src/test/java/GlobalProperties/UserData.json");
        String jsonFile = FileUtils.readFileToString(file, StandardCharsets.UTF_8);

        //String to HashMap jackson DataBind: [Jackson library reads hashmap]
        ObjectMapper jsonFileMapper = new ObjectMapper();
        return jsonFileMapper.readValue(jsonFile, new TypeReference<List<HashMap<String, String>>>() {
        });
    }
    @DataProvider (name = "map")
    public Object[][] provideData() throws IOException {
        HashMap<String, String> credentials = new HashMap<>();
        //For every entry:
        credentials.put("USER", "fayeemf@gmail.com");
        credentials.put("PASS", "Kuta123");

        credentials.put("USER2", "johndoe@gmail.com");
        credentials.put("PASS2", "YouCantSeeItThatWay");

        return new Object[][]{{credentials}};
    }
    @Test(dataProvider = "map")
    public void getData(HashMap<String, String> credentials){
        System.out.println(credentials.get("USER"));
    }
}
