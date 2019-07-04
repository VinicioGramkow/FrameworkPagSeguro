package Classes;

public class Pessoa {

	private String name;
	private String email;
	private String codigoArea;
	private String telefone;
	private String documento;
	
	public String getName() {
		return name;
	}
	/**
	 * 
	 * @param name especifica o nome completo do comprador que est� realizando o pagamento, 
	 * no m�nimo duas sequ�ncias de caracteres, com o limite total de 50 caracteres.
	 */
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	/**
	 * 
	 * @param email especifica o email do comprador que est� realizando o pagamento,
	 * um e-mail v�lido, com no m�ximo 60 caracteres.
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCodigoArea() {
		return codigoArea;
	}
	/**
	 * 
	 * @param codigoArea especifica o c�digo de �rea (DDD) do comprado que est� realizando o pagamento,
	 * um n�mero de 2 d�gitos correspondente a um DDD v�lido.
	 */
	public void setCodigoArea(String codigoArea) {
		this.codigoArea = codigoArea;
	}
	public String getTelefone() {
		return telefone;
	}
	/**
	 * 
	 * @param telefone especifica o n�mero do telefone do comprador que est� realizando o pagamento, 
	 * um n�mero de 7 a 9 d�gitos.
	 */
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getDocumento() {
		return documento;
	}
	/**
	 * 
	 * @param documento especifica o CPF do comprador que est� realizando o pagamento, 
	 * um n�mero de 11 d�gitos.
	 */
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	@Override
	public String toString() {
		return "Pessoa [name=" + name + ", email=" + email + ", codigoArea=" + codigoArea + ", telefone=" + telefone
				+ ", documento=" + documento + "]";
	}
	
}