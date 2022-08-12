class Interface2 implements Itelephone{
    //We need to implement the methods:
    private String myNumber; private boolean isRinging;
    public Interface2(String myNumber){
        this.myNumber = myNumber;
    }
    /** INTERFACES:
     * ////////////////////////////////////////////////////////////////////////////////////////////////////////
     * //////////////////////////////// THEY JUST ACT AS TEMPLATES FOR METHODS////////////////////////////////
     * //////////////////////////////////////////////////////////////////////////////////////////////////////
     */
    @Override
    public void powerOn(){
        System.out.println("Powering the cellphone On");
    }

    @Override
    public void dial(String myNumber){
        System.out.println("Dialing " + myNumber);
    }

    @Override
    public void answer(){
        if(isRinging){
            System.out.println("Answering the Phone");
        }else{
            System.out.println("Can not pick up the phone leave a voicemail");
        }
    }

    @Override
    public boolean callPhone(int phoneNumber){
        if(isRinging){
            System.out.println("You have called" + phoneNumber);
            return true;
        }else{
            System.out.println("Can not pick up the phone");
            return false;
        }
    }

    @Override
    public boolean isRinging(){
        if(isRinging){
            return true;
        }else{
            return false;
        }
    }
}

public class interfacePrac{
    //Instance Field:
    public interfacePrac(){}
    public static void main(String[] args) {
        System.out.println("Learning Interfaces");
        // What are trade fairs ? How do I learn more about them ?
    }
}