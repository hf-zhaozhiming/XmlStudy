package cn.XML01;

import java.io.File;
import java.util.Iterator;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

/**
 * ʹ��dom4j��ȡxml�ļ��ı�ǩ
 * 
 * @author zhaozm
 *
 */
public class XmlDemo02 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		SAXReader reader = new SAXReader();
		Document doc = reader.read(new File("./src/test.xml"));
		Element rootElem = doc.getRootElement();
		System.out.println(rootElem.getName());
		List<Element> list = rootElem.elements("student");
		Iterator<Element> iter = list.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}

		for (Element elem : list) {
			System.out.println(elem);
		}

	}

}
