

interface Computer
{
    int price = 200000;
    void compiler();
    default void config()
    {

    }
}
interface Portable
{
    void move();
}

class Desktop implements Computer
{
    public void compiler()
    {
        System.out.println("Compiling Faster Software");
    }
}
class Laptop implements Computer, Portable
{
    public void compiler()
    {
        System.out.println("Compiling");
    }
}

class Dev
{
    public  void code(Computer lap)
    {
        System.out.println("Coding..");
        lap.compiler();
    }
}

public class Demo {

    public static void main(String[] args) {
        
        // Laptop lap = new Laptop();

        Computer lap = new Laptop();
        Computer desk1 = new Desktop();
        Computer desk2 = new Computer();

        Dev dev1 = new Dev();
        dev1.code(desk1);
    }
}
