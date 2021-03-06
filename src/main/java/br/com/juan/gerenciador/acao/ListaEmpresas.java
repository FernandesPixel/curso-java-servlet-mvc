package br.com.juan.gerenciador.acao;
import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.juan.gerenciador.modelo.Banco;
import br.com.juan.gerenciador.modelo.Empresa;

public class ListaEmpresas implements Acao{
	public String executa(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		Banco banco = new Banco();
		List<Empresa> lista = banco.getEmpresas();
			
		request.setAttribute("empresas",lista);
		for(Empresa empresa:lista) {
			System.out.print(empresa.getNome());	
		}
		return "forward:listaEmpresas.jsp";
		
	}
}
