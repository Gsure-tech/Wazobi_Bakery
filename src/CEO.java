public class CEO extends Staff implements CEOInterface {
    public CEO(String firstName, String surName, int contactNumber, String address, String emailAddress, String date) {
        super(firstName, surName, contactNumber, address, emailAddress, date);
    }


    @Override
    public void hire() {
        System.out.println("You are Hired");
    }

    @Override
    public void fire() {
        System.out.println("You are Fired");
    }

    @Override
    public void increaseSalary() {
        System.out.println("Your salary is increased");
    }


}

