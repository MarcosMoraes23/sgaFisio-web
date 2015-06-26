<<<<<<< HEAD
<%@page import="control.UsuarioController"%>
<%@page import="model.Usuario"%>
<%@page import="enumerated.TipoUsuarioEnum"%>
=======
<%@page import="com.sun.corba.se.spi.orbutil.fsm.Input"%>
<%@page import="enumerated.TipoUsuarioEnum"%>
<%@page import="model.Usuario"%>
>>>>>>> origin/master
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>
    <link href="bootstrap/css/bootstrap.css" rel="stylesheet" media="screen">
    <link href="bootstrap/css/bootstrap-theme.css" rel="stylesheet" media="screen">
    <meta content="text/css" charset="UTF-8">

    <title>Cadastro Usuário</title>

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
                <li><a href="cadastro-supervisor.jsp" class="">Supervisores</a>
                </li>
                <li><a href="cadastro-usuario.jsp" class="">Usuários</a>
                </li>
                <li><a href="cadastro-paciente.jsp" class="">Pacientes</a>
                </li>
            </ul>
        </div>
        <!--/.nav-collapse -->
    </div>
</div>

<!-- /.container -->
<div class="container">
    <div class="text-center">
        <div class="container" style="align-self: auto"onmouseup="onpageshow">
            <div class="row">
                <div class="col-md-4 col-md-offset-4">
                    <div class="">
                        <div class="">
                            <h3 class="text-center">Cadastre-se no SGAFisio</h3>

<<<<<<< HEAD
                        </div>
                  <form  method="post" accept-charset="utf-8">
                        <div class="panel-body">
                            <fieldset>
                                <div class="form-group has-error">
                                    <input class="form-control input-lg" placeholder="Nome de Usuário" name="nomeUsuario"
                                           type="text">
                                </div>
                                <div class="form-group has-success">
                                    <input class="form-control input-lg" placeholder="Senha" name="senha"
                                           value="" type="password">
                                </div>
                                <div class="form-group has-success">
                                    <input class="form-control input-lg" placeholder="Confirme a senha" name="confirmeSenha"
                                           value="" type="password">
                                </div>
                                <div class="form-group">
                                    <select name="tipo" class="form-control input-lg">
                                        <%
											out.println("<option>"+TipoUsuarioEnum.administrador+ "</option>");
											out.println("<option>"+TipoUsuarioEnum.secretaria + "</option>");
 											out.println("<option>"+TipoUsuarioEnum.estagiario + "</option>");
 											out.println("<option>"+TipoUsuarioEnum.supervisor + "</option>"); 
 										%>
                                    </select>
                                </div>
                                <input class="btn btn-lg btn-primary btn-block" value="Confirmar" type="submit" name="gravar">
                                <%  
									if (!"".equals(request.getParameter("gravar")) && (request.getParameter("gravar") !=null))
									{
										Usuario u = new Usuario();
										
										u.setUsuario(request.getParameter("nomeUsuario"));
										u.setSenha(request.getParameter("senha"));
										u.setTipo(TipoUsuarioEnum.valueOf(request.getParameter("tipo")));
										
									if(request.getParameter("senha").equals(request.getParameter("confirmeSenha")))
									{
										if(UsuarioController.getInstance().persistir(u) !=null)
											out.println("<script>alert('Cadastro efetuado com Sucesso')</script>");
									}
									else
										out.println("<script>alert('Erro ao cadastrar')</script>");							
									}
                                	
									%>
                                
                                
                            </fieldset>
                        </div>
                      </form>
                    </div>
=======
                </div>
                <div class="panel-body">
               		<fieldset>
                        <div class="form-group has-error">
                            <input class="form-control input-lg" placeholder="Nome de Usuário" name="nomeUsuario"
                                   type="text">
                        </div>
                        <div class="form-group has-success">
                            <input class="form-control input-lg" placeholder="Senha" name="senhaUsuario"
                                   value="" type="password">
                        </div>
                        <div class="form-group has-success">
                            <input class="form-control input-lg" placeholder="Confirme a senha" name="confirmeSenha"
                                   value="" type="password">
                        </div>
                        <div class="form-group">
                            <select class="form-control input-lg" name = "tipoUsuario"t>
                                <%
                                	out.println("<option>"+TipoUsuarioEnum.supervisor + "</option>");
                                	out.println("<option>"+TipoUsuarioEnum.secretaria + "</option>");
                                	out.println("<option>"+TipoUsuarioEnum.estagiario + "</option>");
                                	out.println("<option>"+TipoUsuarioEnum.administrador + "</option>");                             
                                %>
                            </select>
                        </div>
                        <input class="btn btn-lg btn-primary btn-block" value="Confirmar" type="submit">
                        
                        <%
                        	Usuario u = new Usuario();
                        	
                        	u.setUsuario(request.getParameter("nomeUsuario"));
                        	u.setSenha(request.getParameter("senhaUsuario"));
                        	u.setTipo(TipoUsuarioEnum.secretaria);
                        
                        %>
                    </fieldset>
>>>>>>> origin/master
                </div>
            </div>
        </div>



    </div>
</body>
</html>

