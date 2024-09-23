
// Parent, Superclass
class  Keyboard
{
    // Encapsulation - Binding variable into a method. None can access the data directly outside the class.
    private int keys;
    private String color;

    // Constructor method - Used to initialize
    public Keyboard() {
        keys = 100;
        color = "Black";
    }

    public void pressed() {
        System.out.println("Signal sent " + this.keys);
    }

    // Getter & Setter methods - Help to access private variables outside the class.
    public int getKeys() {
        return keys;
    }

    public void setKeys(int keys) {
        this.keys = keys;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void throwIt() {
        System.out.println("Got it " +this.color);
    }
}

// INHERITANCE 
// Child class, subclass
class AdvancedKeyboard extends Keyboard {

    public void hitNum() {
        System.out.println("Sent Advanced Keyboard");
    }
}

public class Demo {
    public static void main(String[] args) 
    {
        System.out.println("Starting Demo ");

        Keyboard keyboard = new Keyboard();
        keyboard.pressed();
        keyboard.throwIt();

        keyboard.setKeys(80);
        keyboard.setColor("Red");

        System.out.println();
        System.out.println("Keys: " +keyboard.getKeys());
        System.out.println("Color: " +keyboard.getColor());

        System.out.println();
        AdvancedKeyboard advKeyboard = new AdvancedKeyboard();
        advKeyboard.hitNum();

    }
    
}

