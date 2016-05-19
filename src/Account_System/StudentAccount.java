package Account_System;

/**
 * Created by sabbi on 5/19/2016.
 */
public class StudentAccount extends Account
{
    private String institute;
    private String status;

    StudentAccount(String ins,String sts,int acn,String nam,String tp)
    {
        super(acn,nam,tp);
        institute=ins;
        status=sts;
    }

    @Override
    public void view() {
        super.view();
        System.out.println(institute);
        System.out.println(status);
    }
}
