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
<div class="container" style="align-self: auto"onmouseup="onpageshow">
    <div class="row">
        <div class="col-md-4 col-md-offset-4">
            <div class="">
                <div class="">
                    <h3 class="text-center">Cadastre-se no SGAFisio</h3>

                </div>
                <div class="panel-body">
                    <fieldset>
                        <div class="form-group has-error">
                            <input class="form-control input-lg" placeholder="Nome de Usuário" name="nomeUsuario"
                                   type="text">
                        </div>
                        <div class="form-group has-success">
                            <input class="form-control input-lg" placeholder="Senha" name=""
                                   value="" type="password">
                        </div>
                        <div class="form-group has-success">
                            <input class="form-control input-lg" placeholder="Confirme a senha" name="confirmeSenha"
                                   value="" type="password">
                        </div>
                        <div class="form-group">
                            <select class="form-control input-lg">
                                <option selecterd="" class="">Tipo de Usuário</option>
                                <option>Supervisor(a)</option>
                                <option>Secretária(a)</option>
                                <option>Estagiário(a)</option>
                                <option>Administrador</option>
                            </select>
                        </div>
                        <input class="btn btn-lg btn-primary btn-block" value="Confirmar" type="submit">
                    </fieldset>
                </div>
            </div>
        </div>
    </div>
</div>

</body>
</html>