package composition;

public class Student{

    private String name;
    private int age;
    private Address myAddress;

    public Student(String streetAddress, int zipCode, String state, String phone, String name, int age) {
        myAddress = new Address(streetAddress, zipCode, state, phone);
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //address related methods:

    public String getState(){
        return myAddress.getState();
    }

    public void setState(String state){
        myAddress.setState(state);
    }

    public int getZipCode(){
        return myAddress.getZipCode();
    }

    public void setZipCode(int zipCode){
        myAddress.setZipCode(zipCode);
    }

    public String getStreetAddress(){
        return myAddress.getStreetAddress();
    }

    public void setStreetAddress(String streetAddress){
        myAddress.setStreetAddress(streetAddress);
    }

    public String getPhone(){
        return myAddress.getPhone();
    }

    public void setPhone(String phoneNumber){
        myAddress.setPhone(phoneNumber);
    }
}
