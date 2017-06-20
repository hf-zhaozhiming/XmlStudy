package cn.XML01;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

/**
 * ʹ��dom4j���߶�ȡxml�ļ������洢��list�б�֮���ӡ
 * @author zhaozm
 *
 */
public class Demo05 {
public static void main(String[] args) throws Exception{
	SAXReader reader = new SAXReader();
	Document doc =reader.read(new File("./src/test.xml"));
	List<Student> list =new ArrayList<Student>();
	List<Element> stuList = doc.getRootElement().elements("student");
	for(Element e:stuList)
	{
		Student s=new Student();
		s.setId(e.attributeValue("id"));
		s.setName(e.elementText("name"));
		s.setAge(Integer.parseInt(e.elementText("age")));
		list.add(s);
	}
	for(Student s:list)
	{
		System.out.println(s.toString());
	}
}
}
