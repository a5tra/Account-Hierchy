package Account_System;

/**
 * Created by sabbi on 5/19/2016.
 */
public class BankAccount extends Account
{
    private  String bName;
    private double balance;

    BankAccount(String nam,double bal,int acn,String hname,String tp)
    {
        super(acn,hname,tp);
        bName=nam;
        balance=bal;
    }

    @Override
    public void view() {
        super.view();
        System.out.println(bName);
        System.out.println(balance);
    }
    public void setBalance(double amount){balance=amount;}
    public double getBalance(){return balance;}
}
class SavingsAccount extends BankAccount
{
    private double depositAmount;
    private double withdrawalAmount ;
    private int passbookNo;
    private double lowLimit;
    private double fee;
    private  double interest;
    public void deposit(double amount)
    {
        setBalance(getBalance()+amount);
    }
    public void withdraw(double amount,double fee,double interest)
    {
        if(getBalance()<lowLimit)
        {
            setBalance(getBalance()-fee);
        }
        setBalance(getBalance()-amount-(interest*amount)/100);
    }
    public SavingsAccount(double depo,double withdraw,double fe,double intr,double ll,int pasbokno,String bnam,double bal,int acn,String hname,String tp)
    {
        super(bnam,bal,acn,hname,tp);
        depositAmount=depo;
        setBalance(depositAmount);
        withdrawalAmount=withdraw;
        passbookNo=pasbokno;
        fee=fe;
        interest=intr;
        lowLimit=ll;
    }

    @Override
    public void view() {
        super.view();
        System.out.println(depositAmount);
        System.out.println(withdrawalAmount);
        System.out.println(passbookNo);
        System.out.println(fee);
        System.out.println(interest);
        System.out.println(lowLimit);
    }
}
class BasicAccount extends BankAccount
{
    private double checkAmount;
    private int checkCount;
    private  int checkNo;
    private double fee;

    public BasicAccount(double chkAmnt,int chkcnt,int chkn,double fe,String nam,double bal,int acn,String hname,String tp)
    {
        super(nam,bal,acn,hname,tp);

        checkAmount=chkAmnt;
        setBalance(checkAmount);
        checkCount=chkcnt;
        checkNo=chkn;
        fee=fe;
    }

    public void writeCheck(double amount)
    {
        setBalance(getBalance()-amount);
        checkCount--;
        if(checkCount<=0)
        {
            setBalance(getBalance()-fee);
            System.out.println("you are accused of using check accross limit,your fee is "+fee);
        }
    }

    @Override
    public void view() {
        super.view();
        System.out.println(checkAmount);
        System.out.println(checkCount);
        System.out.println(checkCount);
        System.out.println(checkNo);
        System.out.println(fee);
    }
}
class DepositAccount extends BankAccount
{
    private double depositAmount;
    private int countCheck;
    private double serviceFee;
    private int interest;
    private double minBalance;

    public DepositAccount(double dpstamnt,int cntchck,double svrcfe,int inter,double minbal,String nam,double bal,int acn,String hname,String tp)
    {
        super(nam,bal,acn,hname,tp);
        depositAmount=dpstamnt;
        setBalance(depositAmount);
        countCheck=cntchck;
        serviceFee=svrcfe;
        interest=inter;
        minBalance=minbal;
    }

    public void writeCheck(double amount)
    {
        setBalance(getBalance()-amount);
        countCheck--;
        if(getBalance()>minBalance)
        {
            setBalance(getBalance()-(interest*getBalance())/100);
            System.out.println("current balance is "+getBalance());
        }
        else
        {
            setBalance(getBalance()-serviceFee);
            System.out.println("current balance is "+getBalance());
        }
    }

    @Override
    public void view() {
        super.view();
        //System.out.println(depositAmount);
        System.out.println(countCheck);
        System.out.println(serviceFee);
        System.out.println(interest);
        System.out.println(minBalance);
    }
}
