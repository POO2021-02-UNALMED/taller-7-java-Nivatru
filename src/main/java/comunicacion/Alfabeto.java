package comunicacion;

public class Alfabeto extends Pictograma{

	private String[] letras;
	private String interpretacion;
	
	public Alfabeto(String origen, String[] letras, String interpretacion) {
		super(origen);
		this.letras = letras;
		this.interpretacion = interpretacion;
	}

	public String[] getLetras() {
		return letras;
	}

	public String getInterpretacion() {
		return interpretacion;
	}

	public void setLetras(String[] letras) {
		this.letras = letras;
	}

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	
	
	public String interpretacion() {
		return this.interpretacion;
	}
	
	public String toString() {
		String str = "";
		for (int i = 0; i < letras.length - 1; i++) {
			str += letras[i] + ", ";
		}
		str += letras[letras.length - 1];
		return str;
	}
	
	public int cantidadLetras() {
		return this.letras.length;
	}
}
