import java.util.Scanner;

public class Student {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("\n-------------------------------");
        System.out.println("\tStudent Details");
        System.out.println("-------------------------------");
        
        System.out.print("Enter the name of the student: ");
        String name = scanner.nextLine();

        System.out.print("Enter the age of the student: ");
        int age = scanner.nextInt();
        
        scanner.nextLine();

        System.out.print("Enter the gender of the student (M/F): ");
        char genderChar = scanner.next().charAt(0);
        
        String gender;
        switch(genderChar){
            case 'M':
                gender = "Male";
                break;
            case 'F':
                gender = "Female";
                break;
            default:
                gender = "Other";
        }

        System.out.println("\n-------------------------------");
        System.out.println("\tDetails Entered");
        System.out.println("-------------------------------");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);

        scanner.close();
    }
}
