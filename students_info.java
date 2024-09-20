import java.util.Scanner;
public class students_info {

    public static void main(String[] args) {
    
    Scanner info = new Scanner(System.in);
    Attributes a = new Attributes();
    
        System.out.print("Input your First Name: ");
        a.firstName = info.nextLine();
        
        System.out.print("Input your Last Name: ");
        a.lastName = info.nextLine();
        
        System.out.print("Input your Course: ");
        a.course = info.nextLine();
        
        System.out.print("Input your Section: ");
        a.section = info.nextLine();
        
        System.out.print("Input your Year: ");
        a.year = info.nextInt();
        
        System.out.print("Input your midtermGrade: ");
        a.midtermGrade = info.nextInt();
        
        System.out.print("Input your finalGrade: ");
        a.finalGrade = info.nextInt();
        
        System.out.println("\n---- Student Information----");
        a.IntroduceSelf();
        a.evaluateGrade();
        
    }
    
}
