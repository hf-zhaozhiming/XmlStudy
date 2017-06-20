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
 * 实现对xml文件的创建，增删标签，增删改属性等操作
 * 增加子标签  增加  修改 删除 属性值  增加 更新文本
 */
public class Demo03 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Document doc = DocumentHelper.createDocument();
		// 增加根节点
		Element rootElem = doc.addElement("Student_List");
		Element stuElem = rootElem.addElement("Student");
		// 增加属性信息，增加子标签
		stuElem.addAttribute("id", "001");
		Element nameElem = stuElem.addElement("name");
		nameElem.addText("张三");

		stuElem = rootElem.addElement("Student");
		// 增加属性信息，增加子标签
		stuElem.addAttribute("id", "002");
		nameElem = stuElem.addElement("name");
		nameElem.addText("李四");

		stuElem = rootElem.addElement("Student");
		// 增加属性信息，增加子标签
		stuElem.addAttribute("id", "003");
		nameElem = stuElem.addElement("name");
		nameElem.addText("王五");

		// 删除标签 修改属性 修改文本
		// 删除标签
		stuElem = rootElem.element("Student");
		stuElem.detach();
		// stuElem.getParent().remove(stuElem); 删除节点
		// 修改属性
		// stuElem = rootElem.element("Student");
		// stuElem.addAttribute("id", "001");
		Attribute attribute = rootElem.element("Student").attribute("id");
		attribute.setValue("00001");
		// 修改文本
		stuElem.element("name").setText("新张三");

		// 删除王五的 属性 删除 name文本
		stuElem = (Element) rootElem.elements("Student").get(1);
		attribute = (Attribute) stuElem.attribute("id");
		stuElem.remove((Attribute) attribute);

		// attribute.detach(); 删除属性

		stuElem.element("name").setText("");

		OutputStream out = new FileOutputStream("./src/copy.xml");
		OutputFormat format = OutputFormat.createPrettyPrint();

		XMLWriter writer = new XMLWriter(out, format);
		writer.write(doc);
		writer.close();
	}

}
