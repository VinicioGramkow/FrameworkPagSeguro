package Classes;

public class Endereco {
	
	private String rua;
	private String numero;
	private String complemento;
	private String bairro;
	private String cidade;
	private String estado;

	private String cep;
	
	public String getRua() {
		return rua;
	}
	/**
	 * 
	 * @param rua informa o nome da rua do endere�o de envio do produto,
	 * livre, com limite de 80 caracteres.
	 */
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getNumero() {
		return numero;
	}
	/**
	 * 
	 * @param numero informa o n�mero do endere�o de envio do produto, 
	 * livre, com limite de 20 caracteres. 
	 */
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getComplemento() {
		return complemento;
	}
	/**
	 * 
	 * @param complemento informa o complemento (bloco, apartamento, etc) do endere�o de envio do produto,
	 * livre, com limite de 40 caracteres.
	 */
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getBairro() {
		return bairro;
	}
	/**
	 * 
	 * @param bairro informa o bairro deo endere�o de envio do produto, 
	 * livre, com limite de 60 caracteres.
	 */
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	/**
	 * 
	 * @param cidade informa a cidade do endere�o de envio do produto,
	 * livre, deve ser um nome v�lido de cidade do Brasil, 
	 * com no m�nimo 2 e no m�ximo 60 caracteres.
	 */
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	/**
	 * 
	 * @param estado informa o estado do endere�o de envio do produto,
	 * duas letras, representando a sigla do estado brasileiro correspondente.
	 */
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getCep() {
		return cep;
	}
	/**
	 * 
	 * @param cep informa o CEP do endere�o de envio do produto,
	 * um n�mero de 8 d�gitos.
	 */
	public void setCep(String cep) {
		this.cep = cep;
	}
	@Override
	public String toString() {
		return "Endereco [rua=" + rua + ", numero=" + numero + ", complemento=" + complemento + ", bairro=" + bairro
				+ ", cidade=" + cidade + ", estado=" + estado + ", cep=" + cep + "]";
	}

}
