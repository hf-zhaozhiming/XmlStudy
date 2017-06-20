package cn.XML02;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

/**
 * 写出一个doc对象到xml文件中
 * @author zhaozm
 *
 */
public class Demo01 {
public static void main(String[] args) throws Exception {
	Document doc= new SAXReader().read(new File("./src/test.xml"));
	
	OutputStream outStream=new FileOutputStream("./src/copy.xml");
	XMLWriter writer=new XMLWriter(outStream);
	writer.write(doc);
	writer.close();
}
}
