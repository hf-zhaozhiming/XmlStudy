package cn.XML02;

import java.io.FileOutputStream;
import java.io.OutputStream;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

/*
 * ʵ�ֶ�xml�ļ��Ĵ�������ɾ��ǩ����ɾ�����ԵȲ���
 * �����ӱ�ǩ  ����  �޸� ɾ�� ����ֵ  ���� �����ı�
 */
public class Demo03 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Document doc = DocumentHelper.createDocument();
		// ���Ӹ��ڵ�
		Element rootElem = doc.addElement("Student_List");
		Element stuElem = rootElem.addElement("Student");
		// ����������Ϣ�������ӱ�ǩ
		stuElem.addAttribute("id", "001");
		Element nameElem = stuElem.addElement("name");
		nameElem.addText("����");

		stuElem = rootElem.addElement("Student");
		// ����������Ϣ�������ӱ�ǩ
		stuElem.addAttribute("id", "002");
		nameElem = stuElem.addElement("name");
		nameElem.addText("����");

		stuElem = rootElem.addElement("Student");
		// ����������Ϣ�������ӱ�ǩ
		stuElem.addAttribute("id", "003");
		nameElem = stuElem.addElement("name");
		nameElem.addText("����");

		// ɾ����ǩ �޸����� �޸��ı�
		// ɾ����ǩ
		stuElem = rootElem.element("Student");
		stuElem.detach();
		// stuElem.getParent().remove(stuElem); ɾ���ڵ�
		// �޸�����
		// stuElem = rootElem.element("Student");
		// stuElem.addAttribute("id", "001");
		Attribute attribute = rootElem.element("Student").attribute("id");
		attribute.setValue("00001");
		// �޸��ı�
		stuElem.element("name").setText("������");

		// ɾ������� ���� ɾ�� name�ı�
		stuElem = (Element) rootElem.elements("Student").get(1);
		attribute = (Attribute) stuElem.attribute("id");
		stuElem.remove((Attribute) attribute);

		// attribute.detach(); ɾ������

		stuElem.element("name").setText("");

		OutputStream out = new FileOutputStream("./src/copy.xml");
		OutputFormat format = OutputFormat.createPrettyPrint();

		XMLWriter writer = new XMLWriter(out, format);
		writer.write(doc);
		writer.close();
	}

}
