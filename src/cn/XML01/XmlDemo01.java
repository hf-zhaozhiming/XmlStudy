package cn.XML01;

import java.io.File;

import org.dom4j.Document;
import org.dom4j.io.SAXReader;

/**
 * 使用dom4j工具读取一个xml文件
 * 
 * @author zhaozm
 *
 */
public class XmlDemo01 {

	public static void main(String[] args) throws Exception {
		// 创建xml解析器对象
		SAXReader sa = new SAXReader();
		Document doc = sa.read(new File("./src/test.xml"));
		System.out.println(doc);
	}

}
