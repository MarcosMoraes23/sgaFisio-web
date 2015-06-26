<%@page import="model.Paciente"%>
<%@page import="control.PacienteController"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>
    <link href="bootstrap/css/bootstrap.css" rel="stylesheet" media="screen">
    <link href="bootstrap/css/bootstrap-theme.css" rel="stylesheet" media="screen">
    <meta charset="UTF-8" content="text/css">


    <title>Listagem</title>
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


<br><br>

<hr>
<div class="container" ng-app="">
    <div ng-controller="initApp">
        <div class="row">
            <div class="col-md-3">
                <div class="input-group input-group-lg add-on">
                    <input class="form-control search-query" ng-model="query" ng-change="search()" placeholder="Search" type="text" name="pesquisa">
                    <div class="input-group-btn">
                        <button class="btn btn-default" type="submit" name="pesquisar"><%String texto = request.getParameter("pesquisar");%><i class="glyphicon glyphicon-search"></i></button>
                    </div>
                </div>
            </div>
            <div class="col-md-6">
                <h4 class="text-center">Listagem de Pacientes</h4>
            </div>
            <div class="col-md-3">
                <select class="form-control input-lg pull-right" ng-model="itemsPerPage" ng-change="perPage()" ng-options="('show '+size+' per page') for size in pageSizes"></select>
            </div>
        </div>

        <table class="table table-striped table-hover">
            <tbody><tr>
                <th class="id"><a ng-click="sort_by('id')">Id <i class="fa fa-sort"></i></a></th>
                <th class="name"><a ng-click="sort_by('name')">Nome <i class="fa fa-sort"></i></a></th>
                <th class="description" title="non-sortable">Telefone</th>
                <th class="field3"><a ng-click="sort_by('field3')"> Valor Pago<i class="fa fa-sort"></i></a></th>
                <th class="field4"><a ng-click="sort_by('field4')">Responsável<i class="fa fa-sort"></i></a></th>
                <th></th>
            </tr>
            </tbody>
            <tfoot>
            <tr><td colspan="9">
                <div class="text-center">
                    <ul class="pagination">
                        <li ng-class="{disabled: currentPage == 0}">
                            <a href="javascript:;" ng-click="prevPage()">Anterior</a>
                        </li>
                        <li ng-repeat="n in range(pagedItems.length)" ng-class="{active: n == currentPage}" ng-click="setPage()">
                            <a href="javascript:;" ng-bind="n + 1">1</a>
                        </li>
                        <li ng-class="{disabled: currentPage == pagedItems.length - 1}">
                            <a href="javascript:;" ng-click="nextPage()">Próximo</a>
                        </li>
                    </ul>
                </div>
            </td>
            </tr></tfoot>
            <tbody>
            <%for(Paciente i : PacienteController.getInstance().buscarTodos()){%>
	            <tr ng-repeat="item in pagedItems[currentPage] | orderBy:sortingOrder:reverse">
	                <td><%out.println(i.getId());%></td>
	                <td><%out.println(i.getNome());%></td>
	                <td><%out.println(i.getTelefone());%></td>
	                <td><%out.println(i.getValorPago());%></td>
	                <td><%out.println(i.getResponsavel());%></td>
	                <td><a href="#" ng-click="deleteItem($index)">Excluir</a></td>
	            </tr>
	            <% }%>
            </tbody>
        </table>
    </div>
</div>






</body>
</html>