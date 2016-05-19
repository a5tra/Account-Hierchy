package Account_System;

/**
 * Created by sabbi on 5/19/2016.
 */
public class Account
{
    private int accountNo;
    private String holderName;
    private String holderType;

    Account(int acn,String HName,String hTp)
    {
        accountNo=acn;
        holderName=HName;
        holderType=hTp;
    }

    public void view()
    {
        System.out.println(accountNo);
        System.out.println(holderName);
        System.out.println(holderType);
    }
}
