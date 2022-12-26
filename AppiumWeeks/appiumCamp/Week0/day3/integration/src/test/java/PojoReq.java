public class PojoReq {
    //For Every Key, in JSON you create one Variable.
    
    private String message;
    private String greet;

    public String getMessage() {
        return message;
    }

    //POJO -
    public String getGreet() {
        return greet;
    }

    public void setGreet(String greet) {
        this.greet = greet;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
}
class Serialize{
    public void serialize(){
         PojoReq message = new PojoReq();
         message.setGreet("Value");
         message.setMessage("Value1");
    }
public void deserialize(){

        PojoReq message2 = new PojoReq();
        message2.getGreet();
        message2.getMessage();
    }
}
