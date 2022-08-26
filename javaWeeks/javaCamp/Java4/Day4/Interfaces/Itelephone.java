public interface Itelephone{
    //In interface there should be method signatures:  [ Its a promise that I will be using these methods in my class ]:

    void powerOn();
    void dial(int phoneNumber);
    void answer();
    boolean callPhone(int phoneNumber);
    boolean isRinging();
    
}