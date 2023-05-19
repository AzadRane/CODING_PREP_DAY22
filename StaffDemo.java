import java.io.*;

abstract class Staff 
{
    String name,address;

    abstract void accept()throws Exception;

    abstract void display();

}


class FullTimeStaff extends Staff
{
    String dept;
    double sal;

    public void accept()throws Exception 
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the name of staff :");
        name=br.readLine();

        System.out.println("Enter the address");
        address=br.readLine();

        System.out.println("Enther the department ");
        dept=br.readLine();

        System.out.println("Enter the salary of FulltimeStaff");
        sal=Double.parseDouble(br.readLine());
    }

    public void display()
    {
        System.out.println("******Details of Full time staff");
        System.out.println("NAME :"+name);
        System.out.println("DEPT :"+dept);
        System.out.println("SAL :"+sal);
        System.out.println("ADD :"+address);
        System.out.println("*************");
    }
}


class PartTimeStaff extends Staff
{
    int no_of_hrs,rate_per_hour;

    public void accept()throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the name of staff :");
        name=br.readLine();

        System.out.println("Enter the address");
        address=br.readLine();

        System.out.println("Enter no of hours");
        no_of_hrs=Integer.parseInt(br.readLine());
    }

    public void display()
    {
        System.out.println("***Details of Part Time Staff");
        System.out.println("NAME :"+name);
        System.out.println("ADD :"+address);
        System.out.println("NO. OF HRS :"+no_of_hrs);
        System.out.println("RATE :"+rate_per_hour);
        System.out.println("****");
    }
}




public class StaffDemo
{
    public static void main(String args[])throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter How Many objects to create ?");
        int n = Integer.parseInt(br.readLine());

        System.out.println("Enter your Choice\n 1- FullTime Staff\n 2- PartTimeStaff");
        int choice = Integer.parseInt(br.readLine());

        switch(choice)
        {
            case 1:
                    FullTimeStaff f[] = new FullTimeStaff[n];

                    for(int i=0;i<n;i++)
                    {
                        f[i] = new FullTimeStaff();
                        f[i].accept();
                    }

                    for(int i=0;i<n;i++)
                    {
                        f[i].display();
                    }

                    break;
            case 2:
            
                    PartTimeStaff p[] = new PartTimeStaff[n];

                    for(int i=0;i<n;i++)
                    {
                        p[i]=new PartTimeStaff();
                        p[i].accept();
                    }

                    for(int i=0;i<n;i++)
                    {
                        p[i].display();
                    }
 
                    break;
        }
    }
}