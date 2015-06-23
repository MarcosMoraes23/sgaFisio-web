package util;

import dao.UsuarioDAO;
import enumerated.TipoUsuarioEnum;
import model.Usuario;

public class testes {

	public static void main(String[] args) 
	{
		Usuario u = new Usuario();
		u.setUsuario("CEBOLAS");
		u.setSenha("JACUZZI");
		u.setTipo(TipoUsuarioEnum.secretaria);
		
		UsuarioDAO.getInstance().persistir(u);
	}

}
