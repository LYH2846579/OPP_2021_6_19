package Encapsulation;

/**
 * @author LYHstart
 * @create 2021-06-23 21:23
 */
public class test01
{
    public static void main(String[] args)
    {
        Animal dog = new Animal();
        dog.eat();
        dog.sleep();
        dog.setlegs(4);
        dog.showlegs();

    }
}

class Animal
{
    //属性
    String name;
    int age;
    private int legs;           //将类属性私有化的同时必须提供公有方法接口!

    //方法

    public void setlegs(int legs)
    {
        this.legs = legs;
    }
    public void showlegs()
    {
        System.out.println("legs:"+this.legs);
    }

    public void eat()
    {
        System.out.println("动物进食");
    }
    public void sleep()
    {
        System.out.println("动物睡觉");
    }
}