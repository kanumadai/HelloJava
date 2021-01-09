package com.kunuma.filedownload;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kunuma.filter.MyServletRequest;
import com.kunuma.utils.DownloadUtils;

/**
 * Servlet implementation class DownloadServlet
 */
@WebServlet("/DownloadServlet")
public class DownloadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//1. get parameter
//		String fileName = new String( request.getParameter("filename").getBytes("ISO-8859-1"),"UTF-8");
		String fileName = request.getParameter("filename");

		System.out.println("DS:"+fileName);
		String file;
		int idx = fileName.lastIndexOf("\\");
		if(idx != -1) {
			//filename contains the path
			file = fileName;
			fileName = fileName.substring(idx+1);
		}
		else {
			//no path ,download from the floder: /download
			String path = getServletContext().getRealPath("/download");
		 	file = path+"/"+fileName;
		}
		
		
		//2. set the 2 headers and 1 stream
		//a. set Content-Type
		String type = getServletContext().getMimeType(fileName);	
		//diffirent browser's filename is to be right to show.
		String agent = request.getHeader("User-Agent");
		if(agent.contains("FireFox")) {
			//FireFox
			fileName = DownloadUtils.base64EncodeFileName(fileName);
		}
		else {
			//IE and others
			fileName = URLEncoder.encode(fileName, "UTF-8");
		}
		
		response.setContentType(type);
		//b. set Content-Disposition
		response.setHeader("Content-Disposition", "attachment;filename="+fileName);
		//c. set the stream
		//input stream
		InputStream is = new FileInputStream(file);
		OutputStream os = response.getOutputStream();
		// input stream and output stream are connected
		int len = 0;
		byte[] b = new byte[1024];
		while ((len = is.read(b)) != -1) {
			os.write(b, 0, len);
		}
		is.close();		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
