package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Product;
/**
 * Servlet implementation class jstldemo
 */
@WebServlet("/jstldemo")
public class jstldemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public jstldemo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	response.getWriter().append("Served at: ").append(request.getContextPath());
		int []a = {1,2,3,4,6,2,1,6};
		request.setAttribute("arr", a);
		
		List<Product> Plist = new ArrayList<Product>();
		
		Product p1 = new Product();
		p1.setId(1);p1.setName("Sản Phẩm 1");p1.setPrice(12000);
		Product p2 = new Product();
		p2.setId(2);p2.setName("Sản Phẩm 2");p2.setPrice(11000);
		Product p3 = new Product();
		p3.setId(3);p3.setName("Sản Phẩm 3");p3.setPrice(16000);
		Product p4 = new Product();
		p4.setId(4);p4.setName("Sản Phẩm 4");p4.setPrice(14000);
		Product p5 = new Product();
		p5.setId(5);p5.setName("Sản Phẩm 5");p5.setPrice(26000);
		Product p6 = new Product();
		p6.setId(6);p6.setName("Sản Phẩm 6");p6.setPrice(44000);
		
		Plist.add(p1);
		Plist.add(p2);
		Plist.add(p3);
		Plist.add(p4);
		Plist.add(p5);
		Plist.add(p6);
		
		request.setAttribute("Plist", Plist);
		RequestDispatcher rd = request.getRequestDispatcher("TrangChu.jsp");
		rd.forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
