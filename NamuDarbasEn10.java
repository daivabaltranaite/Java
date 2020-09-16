import java.util.Scanner;
public class NamuDarbasEn10 {
	  public static void main(String []args){
		  Scanner reader = new Scanner(System.in);
		  
	      int radius;
	      System.out.print("Type the radius: ");
	        radius = reader.nextInt();
	     
	      
	      double circumference = (double) 2 * Math.PI * radius;
	      
	      System.out.println();
	      System.out.println("Circumference of the circle: " + circumference);
	      
	      
	      
	      reader.close();
	     }
}
