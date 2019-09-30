<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>员工列表</title>

    <!-- 定位资源
<%--    ${APP_PATH}/资源路径--%>
    -->
    <!-- jQuery -->
    <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"
            integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa"
            crossorigin="anonymous"></script>
    <!-- 最新版本的 Bootstrap 核心 CSS 文件 -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css"
          integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js"
            integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa"
            crossorigin="anonymous"></script>
</head>
<body>
<div class="container">
    <!-- 标题 -->
    <div class="row">
        <div class="col-md-12">
            <h2>员工信息</h2>
        </div>
    </div>
    <%--=按钮--%>
    <div class="row">
        <div class="col-md-4 col-md-offset-8">
            <button type="button" class="btn btn-primary">新增</button>
            <button type="button" class="btn btn-danger">删除</button>
        </div>
    </div>
    <%-- 显示数据表 --%>
    <div class="row">
        <div class="col-md-12">
            <%--                table-hover--%>
            <table class="table  table-striped table-hover table-bordered ">
                <tr>
                    <th>id</th>
                    <th>姓名</th>
                    <th>性别</th>
                    <th>email</th>
                    <th>部门</th>
                    <th>操作</th>
                </tr>
                <c:forEach items="${pageInfo.list}" var="emp">
                    <tr>
                        <th>${emp.empId}</th>
                        <th>${emp.empName}</th>
                        <th>${emp.gender}</th>
                        <th>${emp.email}</th>
                        <th>${emp.department.deptName}</th>
                        <th>
                            <button type="button" class="btn btn-primary btn-sm">
                                <span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>编辑
                            </button>
                            <button type="button" class="btn btn-danger btn-sm">
                                <span class="glyphicon glyphicon-trash" aria-hidden="true"></span>删除
                            </button>
                        </th>
                    </tr>
                </c:forEach>
            </table>

        </div>
    </div>

    <%-- 显示分页信息 --%>
    <div class="row">
        <div class="col-md-6">
            当前第${pageInfo.pageNum}页，共${pageInfo.pages}页，共${pageInfo.total}条数据
        </div>
        <div class="col-md-6">
            <nav aria-label="...">
                <nav aria-label="Page navigation">
                    <ul class="pagination">
                        <li>
                            <a href="${APP_PATH}/emp?pn=${pageInfo.navigateFirstPage}" aria-label="Previous">
                                <span aria-hidden="true">&laquo;</span>
                            </a>
                        </li>
                        <%--                        <li><a href="javascript:void(0)">首页</a></li>--%>
                        <c:forEach items="${pageInfo.navigatepageNums }" var="curPageNum">
                            <c:if test="${curPageNum == pageInfo.pageNum}">
                                <li class="active"><a href="#"><span>${curPageNum}<span class="sr-only">(current)</span></span></a></li>
                            </c:if>

                            <c:if test="${curPageNum != pageInfo.pageNum}">
                                <li c><a href="${APP_PATH}/emp?pn=${curPageNum}"><span>${curPageNum}<span class="sr-only">(current)</span></span></a></li>
                            </c:if>
                        </c:forEach>

                        <li>
                            <a href="${APP_PATH}/emp?pn=${pageInfo.navigateLastPage}" aria-label="Next">
                                <span aria-hidden="true">&raquo;</span>
                            </a>
                        </li>
                    </ul>
                </nav>
            </nav>
        </div>

    </div>


</div>
</body>
</html>
