package studio6;

import edu.princeton.cs.introcs.StdDraw;

public class RecursiveMethods {

	/**
	 * Computes the geometric sum for the first n terms in the series
	 * 
	 * @param n the number of terms to include in the sum
	 * @return the sum of the first n terms of the geometric series (1/2 + 1/4 + 1/8
	 *         ...)
	 */
	public static double geometricSum(int n) {
		double sum = 0.0;
		int power=n;
		if (n==0)
			{
			return 0;
			}
		else 
			{
			sum = geometricSum(n-1) + Math.pow(0.5, power);
			}
		
			return sum;
		
	}

	/**
	 * This method uses recursion to compute the greatest common divisor
	 * for the two input values
	 * 
	 * @param p first operand
	 * @param q second operand
	 * @return greatest common divisor of p and q
	 */
	public static int gcd(int p, int q) {
		if (q==0)
		{
			return p;
		}
		else
		{
			return gcd(q,p%q);
		}
		
	}

	

	/**
	 * This method uses recursion to create a reverse of the given array
	 * 
	 * @param array the array to create a reverse of, not to be mutated
	 * @return an array with the same data as the input but it reverse order
	 */
	public static int[] toReversed(int[] array) {
		return helperMethod(array, 0);
			
	}
	private static int[] helperMethod(int[] array, int index) {
		int lastIndex=array.length-1;
		int mirrorIndex=lastIndex - index;
		if (mirrorIndex==index)
		{
			return array;
		}
		else
		{
		int temp=array[index];
		array[index] = array[mirrorIndex];
		array[mirrorIndex] = temp;
		return helperMethod(array, index+1);
		}
	}

	/**
	 * @param xCenter                       x-coordinate of the center of the circle
	 *                                      at the current depth
	 * @param yCenter                       y-coordinate of the center of the circle
	 *                                      at the current depth
	 * @param radius                        radius of the circle at the current
	 *                                      depth
	 * @param radiusMinimumDrawingThreshold radius above which drawing should occur
	 */
	public static void circlesUponCircles(double xCenter, double yCenter, double radius,
			double radiusMinimumDrawingThreshold) {
		
		// FIXME
	}

}
