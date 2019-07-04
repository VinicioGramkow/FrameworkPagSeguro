package CriacaoDados;

import java.util.List;

import Classes.Endereco;
import Classes.Itens;
import Classes.Pessoa;

public class CriarDadosCheckout{

	public String criar(List<Itens> item, Pessoa pes, Endereco end, String reference, int shippingType, String shippingCost) {
		String URL = "";		
		
		URL = "currency=BRL";
		for(int i = 0; i < item.size(); i++) {
			URL = URL + "&itemId" + (i + 1) + "=" + item.get(i).getId() 
					  + "&itemDescription" + (i + 1) + "=" + item.get(i).getDescricao() 
					  + "&itemAmount" + (i + 1) + "=" + item.get(i).getPreco() 
					  + "&itemQuantity" + (i + 1) + "=" + item.get(i).getQuantidade() 
					  + "&itemWeight" + (i + 1) + "=" + item.get(i).getPeso();
		}
		
		URL = URL + "&reference=" + reference 
				  + "&senderName=" + pes.getName() 
				  + "&senderAreaCode=" + pes.getCodigoArea() 
				  + "&senderPhone=" + pes.getTelefone()
				  + "&senderEmail=" + pes.getEmail() 
				  + "&senderCPF=" + pes.getDocumento()
				  + "&shippingType=" + shippingType 
				  + "&shippingCost=" + shippingCost
				  + "&shippingAddressRequired=true"
				  + "&shippingAddressStreet=" + end.getRua()
				  + "&shippingAddressNumber=" + end.getNumero() 
				  + "&shippingAddressComplement=" + end.getComplemento() 
				  + "&shippingAddressDistrict=" + end.getBairro() 
				  + "&shippingAddressPostalCode=" + end.getCep() 
				  + "&shippingAddressCity=" + end.getCidade() 
				  + "&shippingAddressState=" + end.getEstado() 
				  + "&shippingAddressCountry=BRA";
		
		return URL;
	}

}
