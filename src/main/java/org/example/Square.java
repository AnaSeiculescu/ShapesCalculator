package org.example;

import java.util.Objects;

public class Square implements Shape{
	private double side;

	public Square(double side) {
		this.side = side;
	}

	@Override
	public double calculateSurface() {
		double surface = side * side;
		return surface;
	}

	@Override
	public double calculatePerimeter() {
		double perimeter = side * 4;
		return perimeter;
	}

	@Override
	public boolean equals(Object o) {
		if(this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Square square = (Square) o;
		return Double.compare(side, square.side) == 0;
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(side);
	}
}
