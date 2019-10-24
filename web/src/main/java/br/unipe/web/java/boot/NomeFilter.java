package br.unipe.web.java.boot;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/a")
public class NomeFilter implements Filter {
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("Passando pelo Filtro 2");
	
		String nome = request.getParameter("nome");		
		if(nome==null) {
			request.setAttribute("nome", "Ary");
			
		}
		chain.doFilter(request, response);
		
	}
	
	public void destroy() {
		// TODO Auto-generated method stub
		
	}


}
