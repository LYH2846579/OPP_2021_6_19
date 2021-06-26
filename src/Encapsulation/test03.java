package Encapsulation;

/**
 * @author LYHstart
 * @create 2021-06-26 16:19
 */
public class test03
{
    public static void main(String[] args)
    {
        //画内存图分析！
        Person1 p1 = new Person1("张三");
        System.out.println(p1.age);
        System.out.println(p1.info);
    }
}

class Person1
{
    int age;
    String info;

    public double getWeight()
    {
        return weight;
    }

    public void setWeight(double weight)
    {
        this.weight = weight;
    }

    double weight;

    Person1(String s1)
    {
        Person1 p2 = new Person1();
        System.out.println("Default Person1");
        System.out.println(p2.age);
        this.info = s1;
    }
    Person1(int age)
    {
        this();
    }

    private Person1()
    {
        System.out.println("private Person1");
        this.age = 18;
    }


    public static void main(String[] args) {

    }

}