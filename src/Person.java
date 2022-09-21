public class Person {
    private String firstName;
    private String surName;
    private int contactNumber;
    private String address;
    private String emailAddress;
    private String date;
public Person (String firstName,String surName, int contactNumber,
               String address, String emailAddress, String date){
    this.firstName=firstName;
    this.surName = surName;
    this.contactNumber = contactNumber;
    this.address=address;
    this.emailAddress=emailAddress;
    this.date=date;

}



    public String getFirstName(){
    return firstName;
}
    public String getSurName(){
        return surName;
    }
    public int getContactNumber(){
        return contactNumber;
    }
    public String getAddress(){
        return address;
    }
    public String getEmailAddress(){
        return emailAddress;
    }
    public String getDate(){
        return date;
    }
    public void setFirstName(String firstName){
    this.firstName = firstName;
    }
    public void setSurName(String surName){
        this.surName = surName;
    }
    public void setContactNumber(int contactNumber){
        this.contactNumber = contactNumber;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public void setEmailAddress(String emailAddress){
        this.emailAddress = emailAddress;
    }
    public void setDate(String date){
        this.date = date;
    }
}
