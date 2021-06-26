package Encapsulation;

import java.util.Scanner;

/**
 * @author LYHstart
 * @create 2021-06-25 21:14
 */
public class test02
{
    public static void main(String[] args)
    {
        TriangleTest t = new TriangleTest();
        t.test();
        t.test_1();
    }
}

class Person
{
    private int age;

        public Person()
        {

        }
        public Person(int age1)
        {
            age = age1;
        }

    public void setAge(int age)
    {
        if(age>130 || age<0)
            System.out.println("Age ERROR!");
        else
        {
            this.age = age;
        }
    }
}

class Triangle
{
    private int base;
    private int height;

    public Triangle()
    {
        this.base = 1;
        this.height = 1;
    }
    public Triangle(int base,int height)
    {
        this.base = base;
        this.height = height;
    }

    public int getbase()
    {
        return this.base;
    }
    public int getheight()
    {
        return this.height;
    }
    public double area()
    {
        return 0.5*this.base*this.height;
    }
}

class TriangleTest
{
    public void test()
    {
        Triangle t1 = new Triangle();
        double t1_area = t1.area();
        System.out.println("t1_area:"+t1_area);
    }

    public void test_1()
    {
        int base,height;
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入底边长度:");
        base = scan.nextInt();
        System.out.println("请输入高的值:");
        height = scan.nextInt();
        Triangle t2 = new Triangle(base,height);
        System.out.println("t2_area:"+t2.area());
    }

}
