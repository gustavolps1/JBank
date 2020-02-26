package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.LoginBean;
import dao.LoginDao;

@WebServlet("/LoginClienteServlet")
public class LoginClienteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private LoginDao loginDao = new LoginDao();

	public LoginClienteServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			LoginBean loginBean = new LoginBean();
			loginBean.setCpf(request.getParameter("cpf"));
			loginBean.setSenha(request.getParameter("senha"));

			if (loginDao.select(loginBean)) {
				RequestDispatcher dispatcher = request.getRequestDispatcher("acessoLiberado.jsp");
				dispatcher.forward(request, response);

			} else {
				RequestDispatcher dispatcher = request.getRequestDispatcher("acessoNegado.jsp");
				dispatcher.forward(request, response);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
