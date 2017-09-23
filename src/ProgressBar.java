
public class ProgressBar {

	public void solve (int percentage, int x, int y) {
		int degrees = (percentage/100)*360;
		int radius = 50;
		double slope = ((y-radius)/(x-radius));
		double sector = Math.atan((0-slope)/(1+(0*slope)));
		double distance = Math.sqrt(Math.pow((x-50),2)+Math.pow((y-50),2));
		System.out.println(distance);
		System.out.println(slope);
		System.out.println(sector);
		if (distance < 50 && sector < degrees) {
			//compare distance from point to center, if less than 50 than it's within the proximity
			//of circle, if degree of point to center line is lesser than degree, than its within angle.
			System.out.println("Red");
		}
		else {
			System.out.println("Blue");
		}
		
		
	}
	
	public static void main(String[] args) {
		ProgressBar p = new ProgressBar();
		p.solve(25, 0, 0);
	}
}
