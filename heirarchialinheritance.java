/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

import java.util.Scanner;

/**
 *
 * @author 91936
 */
public class heirarchialinheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        student st=new student();
        st.read();
        st.display();
        staff s=new staff("SSS","19cse0001","CSE");
        System.out.println(s);
        // TODO code application logic here
    }
    
}
class book
{
    String bookname="JAVA complete reference";
    int bkcode=8783;
}
class student extends book
{
    String name;
    String rollno;
    String dept;
    

void read()
{
Scanner obj=new Scanner(System.in);
name=obj.next();
rollno=obj.next();
dept=obj.next();
}
void display()
{
    System.out.println("\n Bookname:"+bookname+"\nBookcode:"+bkcode);
     System.out.println("\n studentname:"+name+"\nRollno:"+rollno+"\nDepartment:"+dept);
    
}
}
class staff extends book
{
    String name;
    String staffid;
    String dept;
    staff(String n,String sid,String d)
    {
        name=n;
        staffid=sid;
        dept=d;
        
    }
    public String toString()
    {
        return("\n Bookname:"+bookname+"\nBookcode:"+bkcode+"\n staffname:"+name+"\n Staffid:"+staffid+"\n department:"+dept);
    }
}
