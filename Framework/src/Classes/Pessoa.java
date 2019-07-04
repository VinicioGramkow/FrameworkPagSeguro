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
	 * @param name especifica o nome completo do comprador que está realizando o pagamento, 
	 * no mínimo duas sequências de caracteres, com o limite total de 50 caracteres.
	 */
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	/**
	 * 
	 * @param email especifica o email do comprador que está realizando o pagamento,
	 * um e-mail válido, com no máximo 60 caracteres.
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCodigoArea() {
		return codigoArea;
	}
	/**
	 * 
	 * @param codigoArea especifica o código de área (DDD) do comprado que está realizando o pagamento,
	 * um número de 2 dígitos correspondente a um DDD válido.
	 */
	public void setCodigoArea(String codigoArea) {
		this.codigoArea = codigoArea;
	}
	public String getTelefone() {
		return telefone;
	}
	/**
	 * 
	 * @param telefone especifica o número do telefone do comprador que está realizando o pagamento, 
	 * um número de 7 a 9 dígitos.
	 */
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getDocumento() {
		return documento;
	}
	/**
	 * 
	 * @param documento especifica o CPF do comprador que está realizando o pagamento, 
	 * um número de 11 dígitos.
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