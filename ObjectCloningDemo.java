// import java.io.*;

class A implements Cloneable
{
    int i ;
    double d;
    int a[];

    A()
    {
        i=10;
        d=6.2;
        a= new int[2];
        a[0]=11;
        a[1]=22;
    }

    void display()
    {
        System.out.println(i);
        System.out.println(d);
        System.out.println(a);
        System.out.println(a[0]);
        System.out.println(a[1]);
    }

    public A clone() throws CloneNotSupportedException
    {
        A t = (A) super.clone();

        t.a= new int[a.length];
        t.a[0]=a[0];
        t.a[1]=a[1];

        return t;
    }
}

public class ObjectCloningDemo {
    public static void main(String args[])throws CloneNotSupportedException
    {
        A ob1 = new A();

        A ob2 = ob1.clone();

        System.out.println("Origname object");
        ob1.display();

        System.out.println("Orignals display");
        ob2.display();

    }
}
