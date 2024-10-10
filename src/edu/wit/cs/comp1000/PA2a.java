package edu.wit.cs.comp1000;
import java.util.Scanner;

/*
 * This program takes a user input of five integers and calculates
 * the sum and average of the numbers and just the positive and
 * negative ones.
 * By: Charles Cevasco
 */
public class PA2a {

	public static void main(String[] args) {
		int num1, num2, num3, num4, num5, numPos = 0, numNeg = 0, posSum = 0, negSum = 0, sum;
		double posAvg, negAvg, avg;
		
		Scanner input = new Scanner(System.in);
		System.out.printf("Enter five whole numbers: ");
		num1 = input.nextInt();
		num2 = input.nextInt();
		num3 = input.nextInt();
		num4 = input.nextInt();
		num5 = input.nextInt();
		if (num1 > 0) {
			numPos ++;
			posSum += num1;
		}
		else{
			numNeg ++;
			negSum += num1;
		}
		if (num2 > 0) {
			numPos ++;
			posSum += num2;
		}
		else{
			numNeg ++;
			negSum += num2;
		}
		if (num3 > 0) {
			numPos ++;
			posSum += num3;
		}
		else{
			numNeg ++;
			negSum += num3;
		}
		if (num4 > 0) {
			numPos ++;
			posSum += num4;
		}
		else{
			numNeg ++;
			negSum += num4;
		}
		if (num5 > 0) {
			numPos ++;
			posSum += num5;
		}
		else{
			numNeg ++;
			negSum += num5;
		}
		sum = num1 + num2 + num3 + num4 + num5;
		avg = sum/5.0;
		if (numPos == 0) {
			posAvg = 0.00;
		}
		else {
			posAvg = (posSum*1.0)/numPos;
		}
		if (numNeg == 0) {
			negAvg = 0.00;
		}
		else {
			negAvg = (negSum*1.0)/numNeg;
		}
		
		if (numPos == 1) {
			System.out.printf("The sum of the 1 positive number: %d%n", posSum);
		}
		else {
			System.out.printf("The sum of the %d positive numbers: %d%n", numPos, posSum);
		}
		if (numNeg == 1) {
			System.out.printf("The sum of the 1 non-positive number: %d%n", negSum);
		}
		else {
			System.out.printf("The sum of the %d non-positive numbers: %d%n", numNeg, negSum);
		}
		System.out.printf("The sum of the 5 numbers: %d%n", sum);
		if (numPos == 1) {
			System.out.printf("The average of the 1 positive number: %.2f%n", posAvg);
		}
		else {
			System.out.printf("The average of the %d positive numbers: %.2f%n", numPos, posAvg);
		}
		if (numNeg == 1) {
			System.out.printf("The average of the 1 non-positive number: %.2f%n", negAvg);
		}
		else {
			System.out.printf("The average of the %d non-positive numbers: %.2f%n", numNeg, negAvg);
		}
		System.out.printf("The average of the 5 numbers: %.2f%n", avg);
		
		input.close();
	}

}
