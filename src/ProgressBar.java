
public class ProgressBar {

	public String solve (double percentage, int x, int y) {
		double degrees = 360 * percentage/100;
		int radius = 50;
		double slope = Math.abs((double)(radius-y)/(double)(radius-x));
		double sector = Math.toDegrees(Math.atan(slope));
		double distance = Math.sqrt(Math.pow((x-50),2)+Math.pow((y-50),2));
		if (y == radius) {
			if((x-radius) < 0) { sector = 90; }
			else if((x-radius) > 0){ sector = 270; }
			else {sector = 0;}
		}
		System.out.println(distance);
		System.out.println(slope);
		System.out.println(sector);
		System.out.println(degrees);
		if (distance < 50 && sector < degrees) {
			//compare distance from point to center, if less than 50 than it's within the proximity
			//of circle, if degree of point to center line is lesser than degree, than its within angle.
			return "Red";
		}
		else {
			return "Blue";
		}
		
		
	}
	
}
