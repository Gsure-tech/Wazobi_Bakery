public class Manager extends Staff implements ManagerInterface{
    public Manager(String firstName, String surName, int contactNumber, String address, String emailAddress, String date) {
        super(firstName, surName, contactNumber, address, emailAddress, date);
    }

    @Override
    public void reviewAttendance() {
        System.out.println("Your Attendance for the Month is Perfect");
    }

    @Override
    public void assignTask() {
        System.out.println("Your task is been assigned");

    }

    @Override
    public void issueQuery() {
        System.out.println("Reply to this Query ASAP");
    }
}
