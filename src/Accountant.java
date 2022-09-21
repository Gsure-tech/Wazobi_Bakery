public class Accountant extends Staff implements AccountantInterface{
    public Accountant(String firstName, String surName, int contactNumber, String address, String emailAddress, String date) {
        super(firstName, surName, contactNumber, address, emailAddress, date);
    }

    @Override
    public void paySalary() {
        System.out.println("You just paid Salary");
    }

    @Override
    public void audit() {
        System.out.println("Auditing is coming soon");
    }
//    private int paySalary;
//    private String audit;
//    public void getPaySalary(){
//        System.out.println("You just paid Salary");
//    }
//    public int setPaySalary(){
//       return paySalary;
//    }
//     public void getAudit(){
//         System.out.println("You are Auditing");
//     }
}
