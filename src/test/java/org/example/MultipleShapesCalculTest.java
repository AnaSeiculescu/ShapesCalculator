package org.example;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MultipleShapesCalculTest {

	MultipleShapesCalcul mySetOfShapesTest = new MultipleShapesCalcul();

	Shape square1 = new Square(7);
	Shape rectangle1 = new Rectangle(9, 6);
	Shape square2 = new Square(8);

	@Test
	public void testCalculateTotalSurfaceNoShapesInSet() {

		double actualresult = mySetOfShapesTest.calculateTotalSurface();
		double expectedresult = 0;

		assertEquals(expectedresult, actualresult, 0.000);
	}

	@Test
	public void testCalculateTotalSurfaceWithShapes() {
		mySetOfShapesTest.addShape(square1);
		mySetOfShapesTest.addShape(rectangle1);
		mySetOfShapesTest.addShape(square2);

		double actualresult = mySetOfShapesTest.calculateTotalSurface();
		double expectedresult = 167;

		assertEquals(expectedresult, actualresult, 0.000);
	}
}