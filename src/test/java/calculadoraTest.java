

import static org.junit.Assert.*;


import org.junit.Test;
import static org.mockito.Mockito.*;

public class calculadoraTest {

	
	@Test
	public void sumar() {
		calculador c = new calculador();
		
	    try {
	    	int resultadoReal = c.sumar(2, 3);
		    int resultadoEsperado = 5;
	    	assertEquals(resultadoEsperado, resultadoReal);
	    } catch (Exception e) {
	    	fail("Excepcion");
	    }
	}
	
	@Test
	public void dividir() {
		calculador c = new calculador();
		
	    try {
	    	int resultadoReal = c.dividir(4, 2);
		    int resultadoEsperado = 2;
	    	assertEquals(resultadoEsperado, resultadoReal);
	    } catch (Exception e) {
	    	fail("Excepcion");
	    }
	}
	
	@Test
	public void restar() {
		calculador c = new calculador();
		
	    try {
	    	int resultadoReal = c.restar(5, 3);
		    int resultadoEsperado = 2;
	    	assertEquals(resultadoEsperado, resultadoReal);
	    } catch (Exception e) {
	    	fail("Excepcion");
	    }
	}
	
	@Test
	public void multiplicacion() {
		calculador c = new calculador();
	    try {
	    	int resultadoReal = c.multiplicar(2, 3);
		    int resultadoEsperado = 6;
	    	assertEquals(resultadoEsperado, resultadoReal);
	    } catch (Exception e) {
	    	fail("Excepcion");
	    }
	}

}
