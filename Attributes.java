public class Attributes {

    String firstName;
    String lastName;
    int year;
    String course;
    String section;
    double midtermGrade;
    double finalGrade;
    
    void IntroduceSelf(){
        String Fullname = firstName + " " + lastName;
        
        System.out.println("Student full name: " + Fullname);
        System.out.println("Course: " + course);
        System.out.println("Year: " + year);
        System.out.println("Section: " + section);
    }
    
    void evaluateGrade(){
        
        double averagegrade = ((midtermGrade + finalGrade)/200) * 100;
        
        if (averagegrade > 100){
            System.out.println("Your Average is: " + averagegrade + " - Invalid Grade");
        }
        
        else if (averagegrade >= 98){
            System.out.println("Your Average is: " + averagegrade + " - With Highest Honors");
        }
        else if (averagegrade >= 95){
            System.out.println ("Your Average is: " + averagegrade + " - With High HOnors");
            
        }
        
        else if (averagegrade  >= 90){
            System.out.println("Your Average is: " + averagegrade + " - With Honors");
        }
        
        else if (averagegrade  >= 75){
            System.out.println("Your Average is: " + averagegrade + " - Passed");
        }
        
        else if (averagegrade  <= 75){
            System.out.println("Your Average is: " + averagegrade + " - Failed");
            
        }
    }  
    
        
    
    
    
    
        
}
