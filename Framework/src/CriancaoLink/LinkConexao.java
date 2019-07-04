package CriancaoLink;

public class LinkConexao {
	
	private String dominio;
	private String endPoint;
	
	public LinkConexao dominio(String dominio) {
		this.dominio = dominio;
		return this;
	}
	
	public LinkConexao endPoint(String endPoint) {
		this.endPoint = endPoint;
		return this;
	}

	public String getDominio() {
		return dominio;
	}

	public void setDominio(String dominio) {
		this.dominio = dominio;
	}

	public String getEndPoint() {
		return endPoint;
	}

	public void setEndPoint(String endPoint) {
		this.endPoint = endPoint;
	}

	@Override
	public String toString() {
		return "https://ws." + dominio + ".uol.com.br/v2/" +  endPoint;
	}

}
