package test01;

/**
 * @author LYHstart
 * @create 2021-06-19 18:56
 */

public class PersonTest
{
    public static void main(String[] args)
    {
        reLoad r1 = new reLoad();
        r1.name = "Tom";
        int x = r1.max(1,2);
        System.out.println("int_max:"+x);
        double y = r1.max(1.1,2.2,3.30);
        System.out.println("double_max:"+y);

        Varargs v1 = new Varargs();
        v1.show("Hello world!");
        v1.show();
        v1.show("he","ll","o"," world");
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
