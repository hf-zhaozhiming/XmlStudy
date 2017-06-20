package cn.XML02;

import java.io.File;

import org.dom4j.Document;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

/**
 * д��һ��doc����xml�ļ���; ʹ��������������и�ʽ����;
 * 
 * @author zhaozm
 *
 */
public class Demo2 {
	public static void main(String[] args) throws Exception {
		Document doc = new SAXReader().read(new File("./src/test.xml"));

		/*
		 * OutputStream outStream = new FileOutputStream("./src/copy.xml");
		 * OutputFormat format=OutputFormat.createCompactFormat(); XMLWriter
		 * writer=new XMLWriter(outStream,format); writer.write(doc);
		 * writer.close();
		 */
		// ���������ʽ
		// OutputFormat format = OutputFormat.createCompactFormat();
		OutputFormat format = OutputFormat.createPrettyPrint();
		// �����������
		// format.setEncoding("utf-8");
		XMLWriter writer = new XMLWriter(System.out, format);
		writer.write(doc);
		writer.close();
	}
}
