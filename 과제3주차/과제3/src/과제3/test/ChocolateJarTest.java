package 과제3.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import 과제3.ChocolateJar;

class ChocolateJarTest {
	@Test
	void testChocolateJar() {
		ChocolateJar jar = new ChocolateJar();
		assertEquals(13, jar.getChocolate());
		assertEquals(1, jar.getChilli());
	}

	@Test
	void testChocolateJarInt() {
		ChocolateJar jar = new ChocolateJar(16);
		assertEquals(16, jar.getChocolate());
		assertEquals(1, jar.getChilli());
	}

	@Test
	void testGetItem() {
		ChocolateJar jar = new ChocolateJar();
		assertEquals(14, jar.getItem());
	}

	@Test
	void testTakeItem() {
		ChocolateJar jar = new ChocolateJar();
		assertEquals(14,jar.getItem());
		jar.takeItem(2);
		assertEquals(12, jar.getItem());
		jar.takeItem(3);
		assertEquals(9, jar.getItem());
	}

	@Test
	void testStatus() {
		ChocolateJar jar = new ChocolateJar();
		assertEquals("[ ■ □ □ □ □ □ □ □ □ □ □ □ □ □ ]", jar.status());
		jar.takeItem(3);
		assertEquals("[ ■ □ □ □ □ □ □ □ □ □ □ ]", jar.status());
	}
	@Test
	void testIsEmpty() {
		ChocolateJar jar = new ChocolateJar();
		jar.takeItem(3);
		jar.takeItem(3);
		jar.takeItem(3);
		jar.takeItem(3);
		jar.takeItem(2);
		assertTrue(jar.isEmpty());
	}

	@Test
	void testGetChocolate() {
		ChocolateJar jar = new ChocolateJar();
		assertEquals(13, jar.getChocolate());
	}

	@Test
	void testGetChilli() {
		ChocolateJar jar = new ChocolateJar();
		assertEquals(1, jar.getChilli());
	}

}
