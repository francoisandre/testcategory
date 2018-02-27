package info.francoisandre.testcategory;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import info.francoisandre.testcategory.category.InterfaceUtilisateur;

@Category(InterfaceUtilisateur.class)
public class TestInterfaceUtilisateur {

	@Test
	public void test1() {
		System.out.println("Ceci est le test interface utilisateur 1");
	}

	@Test
	public void test2() {
		System.out.println("Ceci est le test interface utilisateur 2");
	}

}
