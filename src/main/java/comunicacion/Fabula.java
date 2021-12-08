package comunicacion;

public class Fabula extends Escrito{
	
	private String ensenanza;
	private String interpretacion;
	
	public Fabula(String origen, String titulo, String autor, int paginas, String ensenanza, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.ensenanza = ensenanza;
		this.interpretacion = interpretacion;
	}

	public String getEnsenanza() {
		return ensenanza;
	}

	public String getInterpretacion() {
		return interpretacion;
	}

	public void setEnsenanza(String ensenanza) {
		this.ensenanza = ensenanza;
	}

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	
	public String interpretacion() {
		return this.interpretacion;
	}
	
	public String toString() {
		String str = String.format("%origen\n%titulo\n%autor\n%paginas\n%ensenanza", getOrigen(), getTitulo(), getAutor(), getPaginas(), this.ensenanza);
		return str;
	}
	
	public int palabrasTotales(int paginas) {
		return paginas*1;
	}
}
