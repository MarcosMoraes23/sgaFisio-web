package util;


import java.util.Date;

import control.SupervisorController;
import model.Supervisor;


public class testes {

	public static void main(String[] args) 
	{
		
		

		
		Supervisor s = new Supervisor();
		s.setNome("JOSELITO");
		s.setMatricula("9q383222");
		s.setTelefone("23423498");
		s.setCpf("29349234");
		s.setRg("934829348");
		s.setDataNascimento(new Date(19921003));
		s.setEstado("MG");
		s.setCidade("Juiz de Fora");
		s.setBairro("CENTRO");
		s.setRua("AVENIDA");
		s.setNumero(123);
		s.setComplemento("complemento");

		System.out.println(SupervisorController.getInstance().persistir(s));
		
	}

}
