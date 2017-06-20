package cn.XML01;

import org.dom4j.Document;
import org.dom4j.io.SAXReader;

/**
 * 使用dom4j工具读取标签内文本的值
 * @author zhaozm
 *
 */
public class Demo04 {
public static void main(String[] args) throws Exception{
	SAXReader reader = new SAXReader();
	Document doc=reader.read("./src/test.xml");
	//通过找到对应的标签对象，来调用获取文本方法
	String txtValue= doc.getRootElement().element("student").element("name").getText();
	System.out.println("name ="+txtValue);
	System.out.println("----------------");
	
	//调用要查看标签的父标签的方法来查看文本内容
	
	txtValue=doc.getRootElement().element("student").elementText("name");
	System.out.println("name ="+txtValue);
	System.out.println("----------------");
	
}
}
