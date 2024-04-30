package ar.edu.unju.fi.ejercicio2.constantes;

public class Mes {
	
	public enum mes{
		ENERO, FEBRERO, MARZO, ABRIL, MAYO, JUNIO, JULIO, AGOSTO, SEPTIEMBRE, OCTUBRE, NOVIEMBRE,DICIEMBRE;
	}
	private int Mes;
	public int getMes() {
		return Mes;
	}
	public void setMes(int mes) {
		this.Mes = mes;
	}
	
}