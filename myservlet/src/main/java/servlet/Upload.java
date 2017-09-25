package servlet;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 * Servlet implementation class TestServlet
 */
@WebServlet("/upload.do")
@MultipartConfig(fileSizeThreshold = 5_242_880,//5MB
maxFileSize = 20_971_520L,//20MB
maxRequestSize = 41_942_040L)//40MB
public class Upload extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Upload() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.setContentType("text/html;charset=utf-8");
//		String name = request.getParameter("name");
//		String age = request.getParameter("age");
//		System.out.println("–’√˚: "+name+"    ƒÍ¡‰: "+age);
//		request.setAttribute("name", name);
//		request.setAttribute("age", age);
//		request.getRequestDispatcher("NewFile.jsp").forward(request, response);
		Part filePart = request.getPart("file1");
		InputStream inputStream = filePart.getInputStream();
		OutputStream outputStream = new FileOutputStream("C:\\Users\\V God\\a\\"+filePart.getSubmittedFileName());
		
		int read;
		final byte[] bytes = new byte[1024];
		
		while((read = inputStream.read(bytes)) != -1) {
			outputStream.write(bytes,0,read);
			
		}
		
		System.out.println(filePart.getSubmittedFileName());
		outputStream.flush();
		outputStream.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
