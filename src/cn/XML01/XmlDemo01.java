package cn.XML01;

import java.io.File;

import org.dom4j.Document;
import org.dom4j.io.SAXReader;

/**
 * ʹ��dom4j���߶�ȡһ��xml�ļ�
 * 
 * @author zhaozm
 *
 */
public class XmlDemo01 {

	public static void main(String[] args) throws Exception {
		// ����xml����������
		SAXReader sa = new SAXReader();
		Document doc = sa.read(new File("./src/test.xml"));
		System.out.println(doc);
	}

}
