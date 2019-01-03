package getPrima;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConductorTest {

	@Test
	public void test1() {
		Conductor c = new Conductor("CASADO", 17, "F");
		assertEquals("", -1, c.getPrima());
	}
	
	@Test
	public void test2() {
		Conductor c = new Conductor("CASADO", 30, "F");
		assertEquals("", 200, c.getPrima());
	}
	
	@Test
	public void test3() {
		Conductor c = new Conductor("CASADO", 20, "F");
		assertEquals("", 400, c.getPrima());
	}
	
	@Test
	public void test4() {
		Conductor c = new Conductor("SOLTERO", 30, "F");
		assertEquals("", 300, c.getPrima());
	}
	
	@Test
	public void test5() {
		Conductor c = new Conductor("SOLTERO", 70, "M");
		assertEquals("", 400, c.getPrima());
	}
	
	@Test
	public void test6() {
		Conductor c = new Conductor("SOLTERO", 70, "F");
		assertEquals("", 400, c.getPrima());
	}
	
	@Test
	public void test7() {
		Conductor c = new Conductor("SOLTERO", 20, "M");
		assertEquals("", 600, c.getPrima());
	}
	
	@Test
	public void test8() {
		Conductor c = new Conductor("CASADO", 70, "F");
		assertEquals("", 300, c.getPrima());
	}
}
