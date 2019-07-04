package CriancaoLink;

public class CriarLink {
	
	public String Link(String dominio, String endPoint) {
		LinkConexao con = new LinkConexao();
		return con.dominio(dominio).endPoint(endPoint).toString();
	}

}
