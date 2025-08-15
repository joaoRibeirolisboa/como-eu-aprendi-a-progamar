package bancodedados;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Element;
import java.io.File;

public class Ler_XML {
	public static void main(String[] args) {
		try {
			File arquivo = new File("usuarios.xml");
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document doc = builder.parse(arquivo);
			doc.getDocumentElement().normalize();

			NodeList lista = doc.getElementsByTagName("usuario");

			for (int i = 0; i < lista.getLength(); i++) {
				Element usuario = (Element) lista.item(i);
				String nome = usuario.getElementsByTagName("nome").item(0).getTextContent();
				String email = usuario.getElementsByTagName("email").item(0).getTextContent();
				System.out.println("Nome: " + nome + ", Email: " + email);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
