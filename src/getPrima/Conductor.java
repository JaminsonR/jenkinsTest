package getPrima;

import getPrima.Conductor.estados;
import getPrima.Conductor.sexos;

public class Conductor {
	public int edad;
	public enum estados {
	    CASADO,SOLTERO,DIVORCIADO,VIUDO 
	}
	public Conductor(String estado, int edad, String sexo){
		try {
			this.setEdad(edad);
		} catch ( IllegalArgumentException e ) {
		    System.err.println( "La edad debe ser un numero entero" );
		}
		
		try {
			sexos sex = sexos.valueOf( sexo );
			this.setSexo(sex);
		} catch ( IllegalArgumentException e ) {
		    System.err.println( "El sexo ingresado no es valido, debe ser M o F" );
		}
		
		
		try {
			 estados state = estados.valueOf( estado );
			this.setEstadoCivil(state);
		} catch ( IllegalArgumentException e ) {
		    System.err.println( "El estado civil ingresado no es valido, debe ser CASADO, SOLTERO..." );
		}
		
		
	}
	
	
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public sexos getSexo() {
		return sexo;
	}
	public void setSexo(sexos sexo) {
		this.sexo = sexo;
	}
	public estados getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(estados estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	public enum sexos {
	    M,F 
	}
	
	private sexos sexo;
	private estados estadoCivil;
	public int getPrima() {
		int respuesta = 200;
		if (this.edad > 17 && this.edad < 81){
			if(this.edad < 29) {
				respuesta += 200;
				if(this.sexo == sexos.M) {
					respuesta += 100;
				}
			}
			if(this.estadoCivil == estados.SOLTERO) {
				respuesta += 100;
			}
			if(this.edad > 60) {
				respuesta += 100;
			}
		}else
			respuesta = -1;
		
		return (respuesta);
	}
}
