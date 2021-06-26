package test01;

/**
 * @author LYHstart
 * @create 2021-06-20 20:31
 */
public class Test
{
    public static void main(String[] args)
    {
        address a = new address();
        a.int_add();
        a.array_add();
        a.Tese_add();
    }
}

//不同类型地址值分析
class address
{
    void int_add()
    {
        int a;
        System.out.println("int:"+hashCode());
    }
    void array_add()
    {
        int[] array = new int[10];
        System.out.println("int[]:"+array.hashCode());
    }
    void Tese_add()
    {
        Tese t = new Tese();
        System.out.println("Tese:"+t.hashCode());
    }
}

class Tese
{
    public String name;
}