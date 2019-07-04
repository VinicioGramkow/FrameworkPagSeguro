package CriacaoDados;

public class CriarDadosEstorno {
	
	public String criar(String code, String value) {
		return "&transactioCode=" + code + "&refundValue=" + value;
	}

}
