package cn.XML02;

import java.io.File;

import org.dom4j.Document;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

/**
 * 写出一个doc对象到xml文件中; 使用输出美化器进行格式美化;
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
		// 设置输出样式
		// OutputFormat format = OutputFormat.createCompactFormat();
		OutputFormat format = OutputFormat.createPrettyPrint();
		// 设置输出编码
		// format.setEncoding("utf-8");
		XMLWriter writer = new XMLWriter(System.out, format);
		writer.write(doc);
		writer.close();
	}
}
