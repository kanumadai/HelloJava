package com.kunuma.fileupload;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;


import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

/**
 * Servlet implementation class UploadServlet
 */
@WebServlet("/UploadServlet")
public class UploadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			// create file factory
			DiskFileItemFactory diskFileItemFactory = new DiskFileItemFactory();
			// create explain class
			ServletFileUpload fileUpload = new ServletFileUpload(diskFileItemFactory);
			// get file item
			List<FileItem> list;

			list = fileUpload.parseRequest(request);
			// get the file info
			for (FileItem fileItem : list) {
				if (fileItem.isFormField()) {
					String name = fileItem.getFieldName();
					String value = fileItem.getString("UTF-8");
					System.out.print(name + "   " + value);
				} else {
					// file upload part
					// get file name
					String fileName = fileItem.getName();
					System.out.print(fileName);
					int idx = fileName.lastIndexOf("\\");
					if(idx != -1) {
						//filename contains the path
						fileName = fileName.substring(idx+1);
					}
					// get file data
					InputStream is = fileItem.getInputStream();
					// get the dist path where the file will be saved in.
					String realPath = getServletContext().getRealPath("/upload");

					System.out.print(realPath);
					// create a file output stream
					OutputStream os = new FileOutputStream(realPath + "/" + fileName);
					// input stream and output stream are connected
					int len = 0;
					byte[] b = new byte[1024];
					while ((len = is.read(b)) != -1) {
						os.write(b, 0, len);
					}
					is.close();
					os.close();
				}
			}
		} catch (FileUploadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
