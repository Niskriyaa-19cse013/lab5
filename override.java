/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author 91936
 */
public class override {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       BankA obj=new BankA();
       System.out.println("BankA balance:"+obj.getBalance());
       BankB obj1=new BankB();
       System.out.println("BankB balance:"+obj1.getBalance());
       BankC obj2=new BankC();
       System.out.println("BankC balance:"+obj2.getBalance());
        // TODO code application logic here
    }
    
}
class Bank
{
    int getBalance()
    {
        return 0;
    }
}
class BankA extends Bank
{
    @Override
    int getBalance()
    {
        return 1000;
        
    }
}
class BankB extends Bank
{
    @Override
    int getBalance()
    {
        return 1500;
    }
}
class BankC extends Bank
{
    @Override
    int getBalance()
    {
        return 2000;
    }
}

