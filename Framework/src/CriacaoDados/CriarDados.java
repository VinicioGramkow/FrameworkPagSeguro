package CriacaoDados;

import java.util.List;

import Classes.Endereco;
import Classes.Itens;
import Classes.Pessoa;

public class CriarDados {
	
	/**
	 * 
	 * @param item lista de do objeto itens j� criada anteriormente.
	 * @param pessoa objeto pessoa (comprador) j� criado anteriormente.
	 * @param endereco objeto endere�o j� craido anteriormente.
	 * @param reference define um c�digo para fazer refer�ncia ao pagamento.
	 * @param shippingType informa o tipo de frete a ser usado para o envio do produto, 
	 * um n�mero inteiro entre 1 e 3, 1 encomenda normal(PAC), 2 SEDEX, 3 yipo de frete n�o especificado.
	 * @param shippingCost informa o valor total de frete do pedido, decimal com duas casa separadas por ponto, 
	 * maior que 0.00 ou igual a 9999999.00.
	 * @param extraAmount informa um valor extra que deve ser adionado ou subtra�do ao valor total do pagamento,
	 * decimal (positivo ou negativo) com duas casas ecimais separadas por ponto, 
	 * maior ou igual a -9999999.00  e menor ou igual a 9999999.00,
	 * quando negativo este valor n�o pode ser maior ou igual � soma dos valores do produto.
	 * @return dados a ser enviado no m�todo checkout com o objetivo de criar uma venda a ser finalizada pelo usu�rio no site do PagSeguro.
	 */
	public String checkout( List<Itens> item, Pessoa pessoa, Endereco endereco, String reference, int shippingType, String shippingCost, String extraAmount) {
		CriarDadosCheckout checkout = new CriarDadosCheckout();
		return checkout.criar(item, pessoa, endereco, reference, shippingType, shippingCost);
	}
	
	/**
	 * 
	 * @param code c�digo da transa��o a ser cancelada.
	 * @return dados a ser enviados no m�todo checkout com o objetivo de cancelar transa��o.
	 */
	public String cancelarTransacao(String code) {
		CriarDadosCancelarTransacao cancels = new CriarDadosCancelarTransacao();
		return cancels.criar(code);
	}
	
	/**
	 * 
	 * @param code c�digo da transa��o a ser estornada.
	 * @param value valor parcial ou total da transa��o a ser estornado.
	 * @return dados a ser enviados ao m�todo checkout com o objetivo de estornar um valor parcial ou total da transa��o.
	 */
	public String estornar(String code, String value) {
		CriarDadosEstorno refound = new CriarDadosEstorno();
		return refound.criar(code, value);
	}

}
