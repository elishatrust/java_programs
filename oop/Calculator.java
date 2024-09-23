public class Calculator{
    public static void main(String[] args){
        int number1 = 10;
        int number2 = 15;

        Demo cal = new Demo(); 

        System.out.println("Addition: " + cal.add(number1, number2));
    }
}

class Demo{
    int a;
    public int add(int n1, int n2)
    {
        return n1 + n2 ;
    }
}