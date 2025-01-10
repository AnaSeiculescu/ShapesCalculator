package org.example;

import java.util.Objects;
import java.util.PrimitiveIterator;

public class Circle implements Shape{
	private double radius;
	public final double PI = 3.14;

	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public double calculateSurface() {
		double surface = PI * radius * radius;
		return surface;
	}

	@Override
	public double calculatePerimeter() {
		double perimeter = PI * radius * 2;
		return perimeter;
	}

	@Override
	public boolean equals(Object o) {
		if(this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Circle circle = (Circle) o;
		return Double.compare(radius, circle.radius) == 0;
	}

	@Override
	public int hashCode() {
		return Objects.hash(radius, PI);
	}
}
