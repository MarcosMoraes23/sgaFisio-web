<%@page import="control.SupervisorController"%>
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
                <li class="active"><a href="cadastro-supervisores.jsp" class="">Supervisores</a>
                </li>
                <li><a href="cadastro-usuario.jsp" class="">Usuários</a>
                </li>
                <li><a href="#contact" class="">MAIS OQ ?</a>
                </li>
            </ul>
        </div>
        <!--/.nav-collapse -->
    </div>
</div>
<!-- /.container -->

        
        
        
        <div class="container">
  <div class="row">
      <div class="panel panel-default">
        <div class="panel-heading">
          <h4>
            Listagem de Supervisores
          </h4>
        </div>
        <table class="table table-fixed">
          <thead>
            <tr>
              <th class="col-xs-2">Código(ID)</th> <th class="col-xs-6">Nome do Supervisor</th><th class="col-xs-2">Telefone</th><th class="col-xs-2">Matrícula</th>
            </tr>
          </thead>
          <tbody>
          <%for(Supervisor i : SupervisorController.getInstance().buscarTodos()){%>
            <tr>
             
           	<td class="col-xs-2"> <%out.println(i.getId());%> </td><td class="col-xs-6"> <%out.println(i.getNome());%> </td> <td class="col-xs-6"> <%out.println(i.getTelefone());%> </td> <td class="col-xs-2"><%out.println(i.getMatricula());%></td>
             	
            </tr>
            <%}%>
          </tbody>
        </table>
      </div>
  </div>
</div>
        
        

    </body>
    
    
</html>