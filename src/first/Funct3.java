package first;
	import static java.lang.Math.*;

	public class Funct3 {

		double H,y,n;
		
		public double calc_H (double y, double n)
		{
			this.H=(y*y-0.8*y+sqrt(y))/(23.1*n*n+cos(n));
			return H;
		}
	}
