package Account_System;

public class Main {

    public static void main(String[] args)
    {
        DepositAccount da1=new DepositAccount(2000,3,40,4,100,"Bangladesh Bank",10,1101,"reus","Bank");

        da1.view();
        da1.writeCheck(200);

        StudentAccount st1=new StudentAccount("BUET","passed",101,"messi","student");
        st1.view();
    }
}
