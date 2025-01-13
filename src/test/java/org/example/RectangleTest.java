package org.example;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RectangleTest {

	Rectangle myRectangle1 = new Rectangle();
	Rectangle myRectangle2 = new Rectangle(7, 2);

	@Test
	public void testCalculateSurfaceNoInput() {

		double actualresult = myRectangle1.calculateSurface();
		double expectedresult = 0;

		assertEquals(expectedresult, actualresult, 0.000);
	}

	@Test
	public void testCalculateSurface() {

		double actualresult = myRectangle2.calculateSurface();
		double expectedresult = 14;

		assertEquals(expectedresult, actualresult, 0.000);
	}

	@Test
	public void testCalculatePerimeter() {

		double actualresult = myRectangle2.calculatePerimeter();
		double expectedresult = 18;

		assertEquals(expectedresult, actualresult, 0.000);
	}
}