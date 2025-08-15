package bancodedados;


	import javax.xml.parsers.DocumentBuilderFactory;
	import javax.xml.parsers.DocumentBuilder;
	import javax.xml.transform.Transformer;
	import javax.xml.transform.TransformerFactory;
	import javax.xml.transform.OutputKeys;
	import javax.xml.transform.dom.DOMSource;
	import javax.xml.transform.stream.StreamResult;
	import org.w3c.dom.Document;
	import org.w3c.dom.Element;
	import java.io.File;

	public class Criar_XML {
	    public static void main(String[] args) {
	        try {
	         
	            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
	            DocumentBuilder builder = factory.newDocumentBuilder();
	            Document doc = builder.newDocument();

	           
	            Element raiz = doc.createElement("usuarios");
	            doc.appendChild(raiz);

	          
	            Element usuario1 = doc.createElement("usuario");
	            Element nome1 = doc.createElement("nome");
	            nome1.appendChild(doc.createTextNode("Maria"));
	            Element email1 = doc.createElement("email");
	            email1.appendChild(doc.createTextNode("maria@example.com"));
	            usuario1.appendChild(nome1);
	            usuario1.appendChild(email1);

	         
	            Element usuario2 = doc.createElement("usuario");
	            Element nome2 = doc.createElement("nome");
	            nome2.appendChild(doc.createTextNode("João"));
	            Element email2 = doc.createElement("email");
	            email2.appendChild(doc.createTextNode("joao@example.com"));
	            usuario2.appendChild(nome2);
	            usuario2.appendChild(email2);

	          
	            raiz.appendChild(usuario1);
	            raiz.appendChild(usuario2);

	            
	            TransformerFactory transformerFactory = TransformerFactory.newInstance();
	            Transformer transformer = transformerFactory.newTransformer();
	            transformer.setOutputProperty(OutputKeys.INDENT, "yes");

	            DOMSource source = new DOMSource(doc);
	            StreamResult result = new StreamResult(new File("usuarios.xml"));

	            transformer.transform(source, result);

	            System.out.println("XML criado com sucesso!");

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	}

}
