import java.util.Scanner;

public class ProgressBar {
    private final int RADIUS=50;
    
    public static void main(String[] args){
   	 ProgressBar c = new ProgressBar();
   	 Scanner s = new Scanner(System.in);
   	 while(true){
   		 System.out.print("Enter a percentage: ");
   		 String pInput = s.nextLine();
   		 System.out.print("Enter an x coordinate: ");
   		 String xInput = s.nextLine();
   		 System.out.print("Enter a y coordinate: ");
   		 String yInput = s.nextLine();
   		 try{
   			 double x = Double.parseDouble(xInput);
   			 double y = Double.parseDouble(yInput);
   			 double p = Double.parseDouble(pInput);
   			 c.pointInsideCircle(p,x,y);
   		 } catch(Exception e){
   			 System.out.println("You entered an invalid number!");
   		 }
   	 }
    }
    
    /**
     * This function will print "RED" if 
     */
    public void pointInsideCircle(double p, double x, double y){


   	 double radiusP = Math.sqrt(Math.pow((RADIUS-x),2) + Math.pow((RADIUS-y),2));
   	 double relativeX = RADIUS - x;
   	 double relativeY = RADIUS - y;
   	 
   	 double degreesP = Math.atan(relativeY/relativeX)*180/Math.PI;
   	 double degrees = p*3.60;    
    
   	 // Check if the point lies within the percentage
   	 if (x==RADIUS && y>RADIUS) // find if the point lies on an axis
   		 degreesP=0;
   	 else if (x>RADIUS && y==RADIUS)
   		 degreesP=90;
   	 else if (x==RADIUS && y<RADIUS)
   		 degreesP=180;
   	 else if (x<RADIUS && y==RADIUS)
   		 degreesP=270;
   	 else if (x>RADIUS && y>RADIUS) // find if the point lies within a quadrant
   		 degreesP=90-degreesP;
   	 else if(x>RADIUS && y<RADIUS)
   		 degreesP=-degreesP+90;
   	 else if(x<RADIUS && y<RADIUS)
   		 degreesP=90-degreesP+180;
   	 else if(x<RADIUS && y>RADIUS)
   		 degreesP=-degreesP+270;
   		 
   	 // Check where the point lies on the screen.
   	 if (x<0 || x>100 || y<0 || y>100) // if point is out of bounds or negative
   		 System.out.println("Error: This point is out of bounds or negative.");
   	 else if (radiusP > RADIUS) // if radius is outside of the circle
   		 System.out.println("BLUE");
   	 else if (x==RADIUS && y==RADIUS && p>0) // if point is at the origin
   		 System.out.println("RED");
   	 else if (degreesP<=degrees) // if the point lies within the percentage
   		 System.out.println("RED");
   	 else // else it's BLUE
   		 System.out.println("BLUE");
   	 
   	 System.out.println();
    }
}
