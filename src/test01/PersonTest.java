package test01;

/**
 * @author LYHstart
 * @create 2021-06-19 18:56
 */

public class PersonTest
{
    public static void main(String[] args)
    {
        Circle c = new Circle();
        PassObject po = new PassObject();
        po.printAreas(c,5);

        //方法重载与三目运算符
//        reLoad r1 = new reLoad();
//        r1.name = "Tom";
//        int x = r1.max(1,2);
//        System.out.println("int_max:"+x);
//        double y = r1.max(1.1,2.2,3.30);
//        System.out.println("double_max:"+y);
//
        //JAVA可变个数形参
//        Varargs v1 = new Varargs();
//        v1.show("Hello world!");
//        v1.show();
//        v1.show("he","ll","o"," world");
//        int[] array = new int[10];
//        System.out.println(array);
//        char[] array2 = new char[10];
//        System.out.println(array2);
    }
}

//方法重载与三目运算符
class reLoad
{
    public String name;

    public int max(int x,int y)
    {
        return x>y?x:y;
    }
    public double max(double x,double y,double z)
    {
        double max = x>y?x:y;
        return max>z?max:z;
    }
}

//JAVA可变个数形参
class Varargs
{
    public String name;

    public void show(String s1)
    {
        System.out.println("show(String s1)");
    }
    public void show(String ... s2)
    {
        System.out.println("show(String ... s2)");
    }
    //public void show(int xString ... s1)      //不支持复合

}

class Circle
{
    double radius;

    public double findArea()
    {
        return radius*radius*Math.PI;
    }
}

class PassObject
{

    public void printAreas(Circle c,int time)
    {
        System.out.println("Radius"+"\tArea");
        for(int i=1;i<=time;i++)
        {
            c.radius = i;
            System.out.println(c.radius+"\t\t"+c.findArea());
        }
    }
}