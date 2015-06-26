<%@page import="util.DateTimeUtil"%>
<%@page import="util.Data"%>
<%@page import="control.SupervisorController"%>
<%@page import="java.util.Date"%>
<%@page import="model.Supervisor"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

	<head>
		<link href="bootstrap/css/bootstrap.css" rel="stylesheet" media="screen">
		<link href="bootstrap/css/bootstrap-theme.css" rel="stylesheet" media="screen">
		<meta content="text/css">
		
		
			<title>Cadastro de Supervisores</title>
	</head>


	<body>

<div class="navbar navbar-inverse navbar-fixed-top">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse"> <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>

            </button> <a class="navbar-brand" href="#">SGA-Fisio</a>

        </div>
        <div class="collapse navbar-collapse">
            <ul class="nav navbar-nav">
                <li ><a href="cadastro-supervisor.jsp" class="">Supervisores</a>
                </li>
                <li><a href="cadastro-usuario.jsp" class="">Usuários</a>
                </li>
                <li><a href="cadastro-paciente.jsp" class="">Pacientes</a>
                </li>
            </ul>
        </div>
    </div>
</div>
<form  method="post" accept-charset="utf-8">
<div class="container">
    <div class="text-center">
    
        <div align="center" class="principal">
            <!--Campo: Nome -->
            <label>
                <div align="left">
                    <h2>Cadastro de Supervisores</h2><br>
                    Nome:<input align="left" name="nome" type="text" id="idNome" placeholder="" size="50px" maxlength="256">
                    <br><br>
                </div>
            </label>

            <!--Campo: Data de Nascimento -->
            <label>
                <div align="left">
                    Data de Nascimento: &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Matrícula:<br>
                    <input align="left" name="dataNascimento" type="text" id="idDataNascimento" placeholder="0000/00/00" size="20px" maxlength="10"/>&nbsp;&nbsp;&nbsp;&nbsp; <input align="left" name="matricula" type="text" id="idMatricula" size="30px" maxlength="30">
                    <br><br>
                </div>
            </label>

            <!--Campo: Cpf -->
            <label>
                <div align="left">
                    CPF: <input align="left" name="cpf" type="text" id="idCpf" placeholder="***.***.***-**" size="20px" maxlength="20">&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;RG: <input align="left" name="rg" type="text" id="idRg" size="20px" maxlength="20">
                    <br><br>
                </div>
            </label>

            <!--Campo: Estado-->
            <label>
                <div align="left">
                    UF: <input align="left" name="uf" type="text" id="idUf" size="20px" maxlength="20">&nbsp;&nbsp;&nbsp;Cidade: <input align="left" name="cidade" type="text" id="idCidade" size="20px" maxlength="20">
                    <br><br>
                </div>
            </label>
            
 		 <!--Campo: Bairro-->
            <label>
                <div align="left">
                   Bairro: <input align="left" name="bairro" type="text" id="idBairro" size="20px" maxlength="20">&nbsp;&nbsp;&nbsp;CEP: <input align="left" name="cep" type="text" id="idCep" size="20px" maxlength="20">
                    <br><br>
                </div>
            </label>
            
            
          <!--Campo: Rua-->
            <label>
                <div align="left">
                    Rua: <input align="left" name="rua" type="text" id=idRua" size="20px" maxlength="20">&nbsp;&nbsp;&nbsp;Número <input align="left" name="numero" type="text" id="idNumero" size="20px" maxlength="20">
                    <br><br>
                </div>
            </label>
            
             <!--Campo: Complemento-->
            <label>
                <div align="left">
                    Complemento: <input align="left" name="complemento" type="text" id="idComplemento" size="20px" maxlength="20">
                    <br><br>
                </div>
            </label> 
            <br><br><br><br><br><br><br>  
            <input name="gravar" type="submit" class="btn btn-success btn-cons" value="Confirmar"> <a href="listagem-supervisores.jsp" target="blank"> <button type="submit" class="btn btn-warning btn-cons">Pesquisar</button></a>
           
           <%if (!"".equals(request.getParameter("gravar")) && (request.getParameter("gravar") !=null))
			{
				Supervisor s = new Supervisor();
				
				Supervisor supervisor = new Supervisor();
		        
		        supervisor.setNome(request.getParameter("nome"));
		        supervisor.setCpf(request.getParameter("cpf"));
		        supervisor.setRg(request.getParameter("rg"));
		        supervisor.setMatricula(request.getParameter("matricula"));
		        /*supervisor.setDataNascimento(DateTimeUtil.getInstance().parseDate(request.getParameter(("dataNascimento"))));*/
		        supervisor.setTelefone(request.getParameter("telefone"));
		        supervisor.setEstado(request.getParameter("uf"));
		        supervisor.setCidade(request.getParameter("cidade"));
		        supervisor.setBairro(request.getParameter("bairro"));
		        supervisor.setRua(request.getParameter("rua"));
		        supervisor.setCep(request.getParameter("cep"));
		        supervisor.setNumero(Integer.parseInt(request.getParameter("numero")));
		        supervisor.setComplemento(request.getParameter("complemento"));
		        
				if(SupervisorController.getInstance().persistir(supervisor) !=null)
				{
					out.println("<script>alert('Cadastro efetuado com Sucesso')</script>");
				}
				else
				{
					out.println("<script>alert('Erro ao cadastrar')</script>");							
				}
				
			}%>

		
           
        </div>
         
    	</div>
	</div>
</form>
    </body>
    
    
</html>