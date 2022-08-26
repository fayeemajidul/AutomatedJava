import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public interface ISaveable{
    //Interfaces j have method Signatures.
    List <String> write();

    //It is completely appropriate to start with the void statement.
    void read(List <String> savedValues);
}