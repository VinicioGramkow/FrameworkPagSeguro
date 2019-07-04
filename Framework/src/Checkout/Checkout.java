package Checkout;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import CriancaoLink.CriarLink;

public class Checkout {

	/**
	 * 
	 * @param email email do vendedor cadastrado no pagseguro.
	 * @param token token do vendedor gerado no pagseguro.
	 * @param dominio escolha pagseguro para trabalhar no ambiente real e sandbox.pagseguro para trabalhar no ambiente de testes.
	 * @param endPoint escolha checkout para criar uma venda, cancelar para cancelar uma venda, estornar para deveolver o dinheiro ao cliente.
	 * @param dados dados retornados de um dos m�todos de escolher dados.
	 * @return um arquivo xml corresponde ao endpoint, para maiores informa��es consulte documenta��o do pagseguro dispon�vel em: https://dev.pagseguro.uol.com.br/v3.0/reference#checkout-pagseguro
	 */
	public String conectar(String email, String token, String dominio, String endPoint, String dados) {
		CriarLink link = new CriarLink();
		try {
			String url = link.Link(dominio, endPoint) + "?email=" + email + "&token=" + token;
			URL obj = new URL(url);
			
			HttpURLConnection con = (HttpURLConnection) obj.openConnection();

			con.setReadTimeout(15000);
			con.setConnectTimeout(15000);
			con.setDoOutput(true);
			con.setDoInput(true);
			con.setRequestMethod("POST");
			
			DataOutputStream wr = new DataOutputStream(con.getOutputStream());
			wr.write(dados.getBytes());
			wr.flush();
			wr.close();
			
			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream(), "ISO-8859-1"));
			String inputLine;
			StringBuffer response = new StringBuffer();
			
			while((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}
			in.close();
			
			return response.toString();
		} catch (Exception e) {
			e.printStackTrace();		
			return null;
		}
	}

}
