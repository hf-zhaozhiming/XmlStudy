package cn.Servlet;

import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * 使用serversocket实现服务器端等待客户端连接，客户端连接后给客户端发送测试html文件。
 */
public class WebServerDemo01 {
	public static void main(String[] args) throws Exception {
		ServerSocket ss = new ServerSocket(9999);
		while (true) {
			Socket accept = ss.accept();
			// 获取数据通信的写数据流
			OutputStream outputStream = accept.getOutputStream();
			// 读取本地html文件，获取输入文件字节流
			FileInputStream fis = new FileInputStream(new File("./src/serverHtml.html"));
			// 实现边读边写
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
