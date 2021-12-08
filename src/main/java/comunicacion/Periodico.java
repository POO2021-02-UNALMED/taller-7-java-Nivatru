package comunicacion;

public class Periodico extends Escrito{

	private String fecha;
	private String primicia;
	private String interpretacion;
	
	public Periodico(String origen, String titulo, String autor, int paginas, String fecha, String primicia, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.fecha = fecha;
		this.primicia = primicia;
		this.interpretacion = interpretacion;
	}

	public String getFecha() {
		return fecha;
	}

	public String getPrimicia() {
		return primicia;
	}

	public String getInterpretacion() {
		return interpretacion;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public void setPrimicia(String primicia) {
		this.primicia = primicia;
	}

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	
	public String interpretacion() {
		return this.interpretacion;
	}
	
	public String toString() {
		String str = String.format("%origen\n%titulo\n%autor\n%paginas\n%fecha\n%primicia", getOrigen(), getTitulo(), getAutor(), getPaginas(), this.fecha, this.primicia);
		return str;
	}
	
	public int palabrasTotales(int paginas) {
		return paginas*10;
	}
}