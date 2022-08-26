public class Person{
    private String firstName; private String lastName; private int age;

    //Mutator Methods: Setters:
    public void setFirstName (String firstName){
        this.firstName = firstName;
    }
    public void setLastName (String lastName){
        this.lastName = lastName;
    }
    public void setAge(int age){
        if(age < 0 || age > 100){
            this.age = 0;
        }else{
            this.age = age;
        }
    }
    public boolean isTeen(){
        if(this.age > 12 && this.age < 20){
            return true;
        }
        return false;
    }    

    //Accessor Methods: Getters:
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public int getAge(){
        return age;
    }
    public String getFirstandLast(){
        if(firstName.isEmpty() && lastName.isEmpty()){
            return "";
        }else if(lastName.isEmpty()){
            return firstName;
        }else if(firstName.isEmpty()){
            return lastName;
        }else{
            return ("First name: " + firstName  + " Last name: " + lastName);
        }
    }

}