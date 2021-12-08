package comunicacion;

public class Fabula extends Escrito{
	
	private String ense�anza;
	private String interpretacion;
	
	public Fabula(String origen, String titulo, String autor, int paginas, String ense�anza, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.ense�anza = ense�anza;
		this.interpretacion = interpretacion;
	}

	public String getEnse�anza() {
		return ense�anza;
	}

	public String getInterpretacion() {
		return interpretacion;
	}

	public void setEnse�anza(String ense�anza) {
		this.ense�anza = ense�anza;
	}

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	
	public String interpretacion() {
		return this.interpretacion;
	}
	
	public String toString() {
		String str = String.format("%origen\n%titulo\n%autor\n%paginas\n%ense�anza", getOrigen(), getTitulo(), getAutor(), getPaginas(), this.ense�anza);
		return str;
	}
	
	public int palabrasTotales(int paginas) {
		return paginas*1;
	}
}
