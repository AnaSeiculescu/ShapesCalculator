package org.example;

import java.util.Objects;

public class Rectangle implements Shape{
	private double length;
	private double width;

	public Rectangle() {}

	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	@Override
	public double calculateSurface() {
		double surface = length * width;
		return surface;
	}

	@Override
	public double calculatePerimeter() {
		double perimeter = (length + width) * 2;
		return perimeter;
	}

	@Override
	public boolean equals(Object o) {
		if(this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Rectangle rectangle = (Rectangle) o;
		return Double.compare(length, rectangle.length) == 0 && Double.compare(width, rectangle.width) == 0;
	}

	@Override
	public int hashCode() {
		return Objects.hash(length, width);
	}
}
