import java.util.Scanner;

public class ComputeGrade{

public static void main(String[] args){
  
  Scanner input = new Scanner(System.in);
    
    System.out.println("Studen's name: ");
    
    String name = input.next();
    
    System.out.println("Enter grade for test 1: ");
    
    double grade1 = input.nextDouble();
    
   
    System.out.println("Enter grade for test 2: ");
    
    double grade2 = input.nextDouble();
    
   
    System.out.println("Enter grade for test 3: ");
    
    double grade3 = input.nextDouble(); 
    
    double average = (grade1 + grade2 + grade3)  / 3;
   
    String finalGrade = name + " 's final grade is  " + getLetterGrade(average);
    
 
System.out.println(finalGrade);

}
    public static char getLetterGrade(double average){
        
           if(average >= 90){
        return 'A';
    }
    else if(average < 90 && average >= 80){
        return 'B';
    }
    else if(average < 80 && average >= 70){
       return 'C';
   }
else if(average < 70 && average >= 65){
      return 'D';
  }
      return 'F';
    }
}