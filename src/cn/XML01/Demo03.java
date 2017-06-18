package cn.XML01;

import java.io.File;
import java.util.List;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

/**
 * ��ȡxml�ļ��������
 * 
 * @author zhaozm
 *
 */
public class Demo03 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		SAXReader reader = new SAXReader();
		Document doc = reader.read(new File("./src/test.xml"));
		Element stuElem = doc.getRootElement().element("student");

		// ָ��������������ȡ����ֵ
		String value = stuElem.attributeValue("id");
		System.out.println("id= " + value);
		System.out.println("------------------");

		// ��ȡ�����ӱ�ǩ�ڵ�id����
		stuElem = (Element) doc.getRootElement().elements("student").get(1);
		System.out.println("id= " + stuElem.attributeValue("id"));
		System.out.println("------------------");

		// ͨ����������ȡ���Զ���
		stuElem = doc.getRootElement().element("student");
		Attribute attr = stuElem.attribute("id");
		System.out.println(attr.getName() + "= " + attr.getValue());
		System.out.println("------------------");

		// ��ȡ��ǩ���������Զ���
		stuElem = doc.getRootElement().element("student");
		List<Attribute> attrList = stuElem.attributes();
		for (Attribute a : attrList) {
			System.out.println(a.getName() + "= " + a.getValue());
		}
		System.out.println("------------------");

	}

}
