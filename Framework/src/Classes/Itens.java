package Classes;

public class Itens {
	
	private String id;
	private String descricao;
	private String quantidade;
	private String preco;
	private String peso;
	
	public String getId() {
		return id;
	}
	/**
	 * 
	 * @param id identifica os itens sendo pagos, livre com limite de 100 caracteres.
	 */
	public void setId(String id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	/**
	 * 
	 * @param descricao descreve os itens sendo pagos, livre com limite 100 caracteres.
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getQuantidade() {
		return quantidade;
	}
	/**
	 * 
	 * @param quantidade descreve a quantidade de cada item sendo pago, 
	 * um número inteiro maior ou igual a 1 e menor ou igual a 999.
	 */
	public void setQuantidade(String quantidade) {
		this.quantidade = quantidade;
	}
	public String getPreco() {
		return preco;
	}
	/**
	 * 
	 * @param preco descreve o preço unitário de cada item sendo vendido, 
	 *  decimal com duas casas decimais separados por ponto,
	 *  maior que 0.00 e menor ou igual a 9999999.00.
	 */
	public void setPreco(String preco) {
		this.preco = preco;
	}
	public String getPeso() {
		return peso;
	}
	/**
	 * 
	 * @param peso descreve o peso(em gramas) de cada item sendo pago,
	 *  um número inteiro correspondendo ao peso em gramas do item, 
	 *  a soma dos pesos de todos os produtos não pode ultrapassar 30000 gramas (30 kg).
	 */
	public void setPeso(String peso) {
		this.peso = peso;
	}
	@Override
	public String toString() {
		return "Itens [id=" + id + ", descricao=" + descricao + ", quantidade=" + quantidade + ", preco=" + preco
				+ ", peso=" + peso + "]";
	}	

}
