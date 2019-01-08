import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class calculador implements operaciones {

	@Override
	public int sumar(int a, int b) {
		int resultado = a + b;
		return resultado;
	}

	@Override
	public int restar(int a, int b) {
		
		calculador test = mock(calculador.class);
		when(test.sumar(5, -3)).thenReturn(2);
		
		int bn = -b;
		int resultado = sumar(a,bn);
		return resultado;
	}

	@Override
	public int multiplicar(int a, int b) {
		
		calculador test = mock(calculador.class);
		when(test.sumar(0, 2)).thenReturn(2);
		when(test.sumar(2, 2)).thenReturn(4);
		when(test.sumar(4, 2)).thenReturn(6);
		
		int resultado = 0;
		for (int i = 0; i < b; i++) {
			resultado = sumar(resultado,a);
		}
		return resultado;
	}

	@Override
	public int dividir(int a, int b) {
		
		calculador test = mock(calculador.class);
		when(test.restar(4, 2)).thenReturn(2);
		when(test.restar(2, 2)).thenReturn(0);
		when(test.restar(4, 1)).thenReturn(3);
		
		int resultado = 0;
	    while (a > 0) {
	        resultado++;
	        a = restar(a,b);								
	        } 
		return resultado;
	}



}
