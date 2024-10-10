package edu.wit.cs.comp1000;
import java.util.Scanner;

/*
 * This program finds the roots of a quadratic equation.
 * The user will input numbers a, b, and c, from the 
 * equation in the form of Ax^2+bx+c.
 * By: Charles Cevasco
 */
public class PA2b {

	public static void main(String[] args) {
		double a, b, c, d, e, f;
		Scanner input = new Scanner(System.in);
		System.out.printf("Enter a b c: ");
		a = input.nextDouble();
		b = input.nextDouble();
		c = input.nextDouble();
		d = (b*b)-(4*a*c);
		if (d < 0) {
			System.out.printf("Roots: imaginary%n");
		}
		else if (d == 0) {
			e = (b*-1)/(2*a);
			System.out.printf("Root: %.2f%n", e);
		}
		else {
			e = ((-1*b) + Math.sqrt(d))/(2*a);
			f = ((-1*b) - Math.sqrt(d))/(2*a);
			if (e < f) {
				System.out.printf("Roots: %.2f, %.2f%n", e, f);
			}
			else {
				System.out.printf("Roots: %.2f, %.2f%n", f, e);
			}
		input.close();
		}
	}

}
