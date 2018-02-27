package info.francoisandre.testcategory;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import info.francoisandre.testcategory.category.Unit;

@Category(Unit.class)
public class TestUnit {

	@Test
	public void test1() {
		System.out.println("Ceci est le test unit 1");
	}

	@Test
	public void test2() {
		System.out.println("Ceci est le test unit 2");
	}

}
