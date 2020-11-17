package practice;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class GetContentAsXML {

	private void callApi() throws MalformedURLException, IOException {
		URLConnection con = new URL("http://schemas.opengis.net/wfs/1.1.0/wfs.xsd").openConnection();
		con.getContent();

	}
	
	private void test() {
		DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();

	    try {
	        DocumentBuilder builder = builderFactory.newDocumentBuilder();
	        org.w3c.dom.Document doc = builder.parse("/home/codefelix/IdeaProjects/Gradle/src/main/resources/static/Employees.xml");
	        NodeList namelist = (NodeList) doc.getElementById("1");

	        for (int i = 0; i < namelist.getLength(); i++) {
	            Node p = namelist.item(i);

	            if (p.getNodeType() == Node.ELEMENT_NODE) {
	                Element person = (Element) p;
	                NodeList id = person.getElementsByTagName("Employee");
	                NodeList nodeList = person.getChildNodes();
//	                List<EmployeeDto> employeeDtoList=new ArrayList();

	                for (int j = 0; j < nodeList.getLength(); j++) {
	                    Node n = nodeList.item(j);

	                    if (n.getNodeType() == Node.ELEMENT_NODE) {
	                        Element naame = (Element) n;
	                        System.out.println("Employee" + id + ":" + naame.getTagName() + "=" +naame.getTextContent());
	                    }
	                }
	            }
	        }
	    } catch (ParserConfigurationException e) {
	        e.printStackTrace();
	    } catch (SAXException e) {
	        e.printStackTrace();
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}

	public static void main(String ar[]) {

	}
}

