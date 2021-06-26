package JAVA2;

/**
 * @author LYHstart
 * @create 2021-06-26 16:45
 */
public class PersonTest
{
    public static void main(String[] args)
    {
        Person p1 = new Person();
        p1.setName("张三");
        System.out.println("name:"+p1.getName());
    }
}

class Person
{
    private String name;
    private int age;

    public void setName(String name)
    {
        this.name = name;
        this.Hello();
    }
    public String getName()
    {
        return name;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    public int getAge()
    {
        return this.age;
    }
    public void Hello()
    {
        System.out.println("Hello world!");
    }

}