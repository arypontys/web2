package br.unipe.web.java.boot;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
// esse filtro serve para antes de passar no void doGet la na classe 
//HelloFujiokaServelet ele passa por esse filtro e seta o nome Rodrigo Fujioka la
@WebFilter("/f")
public class SegurancaFilter implements Filter {

	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("Passando pelo Filtro 1");
	
		String nome = request.getParameter("nome");		
		if(nome==null) {
			request.setAttribute("nome", "eu");
			//esse eu aqui, vai ser setado ja que o codigo em void doGet la na 
			//classe HelloFujiokaServelet est� cagado e nao iria rodar.
		}
		chain.doFilter(request, response);
		
	}
	
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

  

}