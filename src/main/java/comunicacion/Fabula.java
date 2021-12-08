package comunicacion;

public class Fabula extends Escrito{
	
	private String enseñanza;
	private String interpretacion;
	
	public Fabula(String origen, String titulo, String autor, int paginas, String enseñanza, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.enseñanza = enseñanza;
		this.interpretacion = interpretacion;
	}

	public String getEnseñanza() {
		return enseñanza;
	}

	public String getInterpretacion() {
		return interpretacion;
	}

	public void setEnseñanza(String enseñanza) {
		this.enseñanza = enseñanza;
	}

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	
	public String interpretacion() {
		return this.interpretacion;
	}
	
	public String toString() {
		String str = String.format("%origen\n%titulo\n%autor\n%paginas\n%enseñanza", getOrigen(), getTitulo(), getAutor(), getPaginas(), this.enseñanza);
		return str;
	}
	
	public int palabrasTotales(int paginas) {
		return paginas*1;
	}
}
