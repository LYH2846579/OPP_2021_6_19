package test01;

/**
 * @author LYHstart
 * @create 2021-06-19 18:56
 */
//很显然这是一行测试代码
public class PersonTest
{
    public static void main(String[] args)
    {
        //创建Person类的对象
        Person p1 = new Person();
        //scanner scan = new Scanner(System.in);

        //调用对象的结构：属性与方法
        p1.name = "Tom";

        Person p2 = p1;                     //P1与P2指向同一块内存地址
        System.out.println(p2.name);       //Tom

        Person p3 = new Person();
        System.out.println(p3.name);       //Null
        p3 = p1;                            //C++中的赋值语句无!!!
        p3.name = "Jerry";
        System.out.println(p1.name);       //Jerry
        System.out.println(p3.name);       //Jerry
    }
}

class Person
{
    //属性
    String name;
    int age;
    boolean isMale;
    //方法
    public void eat()
    {
        System.out.println("人可以吃饭");
    }
    public void sleep()
    {
        System.out.println("人可以睡觉");
        //eat();
    }
    public void talk(String language)
    {
        System.out.println("人可以说话，使用:"+language);
    }
}