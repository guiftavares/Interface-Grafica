package graphic_interface;

public class Planet {
	
	// Atributos da Classe
	
	private String nome;
	private double rotacao;
	private double translacao;
	private String distancia_sol;
	private double tamanho;
	
	public Planet (String Nome, double rotacao, double translacao, String distancia_sol, double tamanho) {
		nome = Nome;
		this.rotacao = rotacao;
		this.translacao = translacao;
		this.distancia_sol = distancia_sol;
		this.tamanho = tamanho;
	}
	
	//Método de acesso do tipo setter
	
	public void setNome (String nm) {
		nome = nm;
	}
		public void setRotacao (double rt) {
		rotacao = rt;
	}
	public void setTranslacao (double ts) {
		translacao = ts;
	}
	public void setDistancia_sol (String ds) {
		distancia_sol = ds;
	}
	public void setTamanho (double tm) {
		tamanho = tm;
	}

	
	//Método de acesso do tipo getter
	
	public String getNome() {
		return nome;
	}
	public double getRotacao() {
		return rotacao;
	}
	public double getTranslacao() {
		return translacao;
	}
	public String getDistancia_sol() {
		return distancia_sol;
	}
	public double getTamanho() {
		return tamanho;
	}
	
	//Métodos da Classe
	
	public void caracterizar() {
		System.out.println("O planeta " + this.getNome() + " tem rotação de " + this.getRotacao() + " e translação de " + this.getTranslacao() + "!\n "
				+ ". Está a " + this.getDistancia_sol() + " km do Sol e possui " + this.getTamanho() + " km de tamanho.");
	}
}
