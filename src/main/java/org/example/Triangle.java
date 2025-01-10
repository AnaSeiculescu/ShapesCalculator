package org.example;

import java.util.Objects;

public class Triangle implements Shape{
	private double sideA;
	private double sideB;
	private double sideC;

	public Triangle(double sideA, double sideB, double sideC) {
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
	}

	@Override
	public double calculateSurface() {

		// for calculating the surface using only the length of the sides, we use Heron's formula
		// first we need the semi perimeter named semiP

		double semiP = (sideA + sideB + sideC) / 2;
		double surface = Math.sqrt(semiP * (semiP - sideA) * (semiP - sideB) * (semiP - sideC));
		return surface;
	}

	@Override
	public double calculatePerimeter() {
		double perimeter = sideA + sideB + sideC;
		return perimeter;
	}

	@Override
	public boolean equals(Object o) {
		if(this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Triangle triangle = (Triangle) o;
		return Double.compare(sideA, triangle.sideA) == 0 && Double.compare(sideB, triangle.sideB) == 0 && Double.compare(sideC, triangle.sideC) == 0;
	}

	@Override
	public int hashCode() {
		return Objects.hash(sideA, sideB, sideC);
	}
}
