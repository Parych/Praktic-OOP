package first;

import static java.lang.Math.*;


import java.util.Date;

public class FirstFunct {

	double y;
	double z;

	public double calc_Y(double x, double b, double a) {
		this.y = pow(sin(((x * x) + a) * ((x * x) + a)), 3) - sqrt(x / b);
		return y;
	}

	public double calc_Z(double x, double b, double a) {
		this.z = (x * x) / a + pow(cos(x + b), 3);
		return z;
	}
}
