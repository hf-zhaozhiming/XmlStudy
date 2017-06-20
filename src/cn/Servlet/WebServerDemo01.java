package cn.Servlet;

import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * ʹ��serversocketʵ�ַ������˵ȴ��ͻ������ӣ��ͻ������Ӻ���ͻ��˷��Ͳ���html�ļ���
 */
public class WebServerDemo01 {
	public static void main(String[] args) throws Exception {
		ServerSocket ss = new ServerSocket(9999);
		while (true) {
			Socket accept = ss.accept();
			// ��ȡ����ͨ�ŵ�д������
			OutputStream outputStream = accept.getOutputStream();
			// ��ȡ����html�ļ�����ȡ�����ļ��ֽ���
			FileInputStream fis = new FileInputStream(new File("./src/serverHtml.html"));
			// ʵ�ֱ߶���д
			byte[] bys = new byte[1024];
			int len = 0;
			while ((len = fis.read(bys)) != -1) {
				outputStream.write(bys, 0, len);
				outputStream.flush();
			}
			outputStream.close();
			fis.close();
		}
	}
}
