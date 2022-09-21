public class Staff extends Person implements StaffInterface{
    public Staff(String firstName, String surName, int contactNumber, String address, String emailAddress, String date) {
        super(firstName, surName, contactNumber, address, emailAddress, date);
    }

    @Override
    public void takeLeave() {
        System.out.println( this.getFirstName() + " have taken Leave");
    }

    @Override
    public void signAttendance() {
        System.out.println("Your just signed Attendance");

    }

    @Override
    public void resign() {
        System.out.println("You have resigned");
    }
}
