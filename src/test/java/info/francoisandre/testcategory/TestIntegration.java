package info.francoisandre.testcategory;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import info.francoisandre.testcategory.category.Integration;

@Category(Integration.class)
public class TestIntegration {

	@Test
	public void test1() {
		System.out.println("Ceci est le test integration 1");
	}

	@Test
	public void test2() {
		System.out.println("Ceci est le test integration 2");
	}

}
