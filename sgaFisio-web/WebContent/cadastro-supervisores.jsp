<%@ page language="java" contentType="text/html; charset=UTF-8"pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

	<head>
		<link href="bootstrap/css/bootstrap.css" rel="stylesheet" media="screen">
		<link href="bootstrap/css/bootstrap-theme.css" rel="stylesheet" media="screen">
		<meta content="text/css" charset="UTF-8">
		
		
			<title>Cadastro de Supervisores</title>
	</head>

	<body>

    <legend>SGA Fisio</legend>

    <div align="center" class="principal">
            <!--Campo: Nome -->
            <label>
                <div align="left">
                    <h2 style="color: aliceblue">Dados Pessoais</h2><br>
                   <font color="#f0f8ff">Nome:  </font><input align="left" name="Nome" type="text" id="Nome" placeholder="Nome do supervisor" size="50px" maxlength="256">
                    <br><br>
                </div>
            </label>

            <!--Campo: Data de Nascimento -->
             <label>
                 <div align="left">
                    <font color="#f0f8ff"/>Data de Nascimento: &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp;<font color="#f0f8ff">Matrícula: </font><br>
                     <input align="left" name="data-nascimento" type="text" id="data" placeholder="0000/00/00" size="20px" maxlength="10"/>&nbsp;&nbsp;&nbsp;&nbsp; <input align="left" name="matricula" type="text" id="matricula" size="30px" maxlength="30">
                    <br><br>
                  </div>
              </label>

            <!--Campo: Cpf -->
            <label>
                <div align="left">
                    <font color="#f0f8ff"/>CPF: <input align="left" name="cpf" type="text" id="cpf" placeholder="***.***.***-**" size="20px" maxlength="20">&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;<font color="#f0f8ff"/>RG: <input align="left" name="rg" type="text" id="rg" size="20px" maxlength="20">
                    <br><br>
                </div>
            </label>


            <!--Campo: Estado-->
            <label>
                <div align="left">
                    <font color="#f0f8ff"/>UF: <input align="left" name="uf" type="text" id="uf" size="20px" maxlength="20">&nbsp;&nbsp;&nbsp;<font color="#f0f8ff"/>Cidade: <input align="left" name="cidade" type="text" id="cidade" size="20px" maxlength="20">
                    <br><br>
                </div>
            </label>
        </div>


    </body>
    
    
</html>