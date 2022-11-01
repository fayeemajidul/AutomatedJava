import java.io.IOException;
import java.util.ArrayList;

public class GrabDataFromAnyExcelSheet {
    DataDrivenExample dataDrivenExample = new DataDrivenExample();
    public void grabDataAgain() throws IOException {
        ArrayList<String> Ashley = dataDrivenExample.grabData("Last","Qiu");
        System.out.println(Ashley);
    }
    public static void main(String[] args) throws IOException {
        GrabDataFromAnyExcelSheet nonStaticMember = new GrabDataFromAnyExcelSheet();
        nonStaticMember.grabDataAgain();
    }
}
