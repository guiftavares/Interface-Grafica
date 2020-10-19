package lugar;

public class Lugar {
	
	//Atributos da Classe
	
	private String pais;
	private String clima;
	private String objetivo;
	private String hotel;
	private String data;
	
	public Lugar (String pais, String clima, String objetivo, String hotel, String data) {
	this.pais = pais;
	this.clima = clima;
	this.objetivo = objetivo;
	this.hotel = hotel;
	this.data = data;
	}
	
	//Acesso tipo setter
	
	public void setPais (String p) {
		pais = p;
	}
	public void setClima (String cl) {
		clima = cl;
	}
	public void setObjetivo (String obj) {
		objetivo = obj;
	}
	public void setHotel (String ht) {
		hotel = ht;
	}
	public void setData (String dt) {
		data = dt;
	}
	
	//Acesso tipo getter
	
	public String getPais() {
		return pais;
	}
	public String getClima() {
		return clima;
	}
	public String getObjetivo() {
		return objetivo;
	}
	public String getHotel() {
		return hotel;
	}
	public String getData() {
		return data;
	}
	
	//Método da Classe
	public void reservar() {
		System.out.println("Você irá viajar para " + this.getPais() + " a " + this.getObjetivo() + " em " + this.getData() + 
				 " e ficará hospedado no " + this.getHotel() + ". Prepare-se para um clima " + this.getClima() + ".");
	}

	}
