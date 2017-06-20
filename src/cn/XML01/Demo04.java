package cn.XML01;

import org.dom4j.Document;
import org.dom4j.io.SAXReader;

/**
 * ʹ��dom4j���߶�ȡ��ǩ���ı���ֵ
 * @author zhaozm
 *
 */
public class Demo04 {
public static void main(String[] args) throws Exception{
	SAXReader reader = new SAXReader();
	Document doc=reader.read("./src/test.xml");
	//ͨ���ҵ���Ӧ�ı�ǩ���������û�ȡ�ı�����
	String txtValue= doc.getRootElement().element("student").element("name").getText();
	System.out.println("name ="+txtValue);
	System.out.println("----------------");
	
	//����Ҫ�鿴��ǩ�ĸ���ǩ�ķ������鿴�ı�����
	
	txtValue=doc.getRootElement().element("student").elementText("name");
	System.out.println("name ="+txtValue);
	System.out.println("----------------");
	
}
}
