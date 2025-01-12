package org.example;

import java.util.HashSet;
import java.util.Set;

public class MultipleShapesCalcul {
	private Set<Shape> shapes;

	public MultipleShapesCalcul() {
		this.shapes = new HashSet<>();
	}

	public void addShape(Shape shape) {
		shapes.add(shape);
//		if (!shapes.add(shape)) {
//			System.out.println("This shape is already added.");
//		} else {
//			System.out.println("Shape added successfully.");
//		}
	}

	public double calculateTotalSurface() {
		double totalSurface = 0;

		for (Shape shape : shapes) {
			totalSurface += shape.calculateSurface();
		}

		return totalSurface;
	}

	public double calculateTotalPerimeter() {
		double totalPerimeter = 0;

		for (Shape shape : shapes) {
			totalPerimeter += shape.calculatePerimeter();
		}

		return totalPerimeter;
	}

}
