<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>--%>

<%--ajax 请求接收--%>
<html>
<head>
    <title>员工管理</title>

    <!-- 定位资源
<%--    ${APP_PATH}/资源路径--%>
    -->
    <!-- jQuery -->
    <script
            src="https://code.jquery.com/jquery-3.4.1.min.js"
            integrity="sha256-CSXorXvZcTkaix6Yvo6HppcZGetbYMGWSFlBw8HfCJo="
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

<!-- 添加信息模态 -->
<div class="modal fade" tabindex="-1" role="dialog" id="add_emps_model">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span>
                </button>
                <h4 class="modal-title">添加员工信息</h4>
            </div>
            <div class="modal-body">
                <form class="form-horizontal" method="post">
                    <div class="form-group">
                        <label class="col-sm-2 control-label">姓名:</label>
                        <div class="col-sm-8">
                            <input type="text" name="empName" class="form-control" id="emp_name" placeholder="姓名">
                            <span class="help-block" id="check_name"></span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-2 control-label">性别:</label>
                        <div class="col-sm-8">
                            <label class="radio-inline">
                                <input type="radio" name="gender" id="gender_male" value="男" checked>男
                            </label>
                            <label class="radio-inline">
                                <input type="radio" name="gender" id="gender_female" value="女">女
                            </label>
                        </div>
                    </div>

                    <div class="form-group">
                        <label for="emp_email" class="col-sm-2 control-label">Email:</label>
                        <div class="col-sm-8">
                            <input type="email" class="form-control" name="email" id="emp_email" placeholder="邮箱">
                            <span class="help-block" id="check_email"></span>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-sm-2 control-label">部门:</label>
                        <div class="col-sm-4">
                            <!-- 部门提交id -->
                            <select class="form-control" name="dId" id="select_dept_name"></select>
                        </div>
                    </div>

                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                <button type="button" class="btn btn-primary" id="add_new_emp_btn">添加</button>
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal-dialog -->
</div><!-- /.modal -->


<!-- 修改员工信息模态
emp_update_model   update_emp_name  update_gender_male  gender_female
update_emp_email  update_select_dept_name  update_emp_btn-->
<div class="modal fade" tabindex="-1" role="dialog" id="emp_update_model">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span>
                </button>
                <h4 class="modal-title">修改员工信息</h4>
            </div>
            <div class="modal-body">
                <form class="form-horizontal" method="post">
                    <div class="form-group">
                        <label class="col-sm-2 control-label">姓名:</label>
                        <div class="col-sm-8">
                            <p class="form-control-static" name="empName" id="update_emp_name">examp@email.com</p>

                            <%--                            <input type="text" name="empName" class="form-control" id="update_emp_name" placeholder="姓名">--%>
                            <%--                            <span class="help-block"></span>--%>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-2 control-label">性别:</label>
                        <div class="col-sm-8">
                            <label class="radio-inline">
                                <input type="radio" name="gender" id="update_gender_male" value="男">男
                            </label>
                            <label class="radio-inline">
                                <input type="radio" name="gender" id="update_gender_female" value="女">女
                            </label>
                        </div>
                    </div>

                    <div class="form-group">
                        <label for="emp_email" class="col-sm-2 control-label">Email:</label>
                        <div class="col-sm-8">
                            <input type="email" class="form-control" name="email" id="update_emp_email"
                                   placeholder="邮箱">
                            <span class="help-block"></span>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-sm-2 control-label">部门:</label>
                        <div class="col-sm-4">
                            <!-- 部门提交id -->
                            <select class="form-control" name="dId" id="update_select_dept_name"></select>
                        </div>
                    </div>

                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                <button type="button" class="btn btn-primary" id="update_emp_btn">保存</button>
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal-dialog -->
</div><!-- /.modal -->


<div class="container">
    <!-- 标题 -->
    <div class="row">
        <div class="col-md-12">
            <h2>员工管理</h2>
        </div>
    </div>
    <%--=按钮--%>
    <%--    <div class="row">--%>
    <%--        <div class="col-md-4 col-md-offset-8">--%>
    <%--            <button type="button" class="btn btn-primary">新增</button>--%>
    <%--            <button type="button" class="btn btn-danger">删除</button>--%>
    <%--        </div>--%>
    <%--    </div>--%>
    <%-- 显示数据表 --%>
    <div class="row panel panel-default">
        <%-- 表头+按钮 --%>
        <div class="panel-heading col-md-12"><span style="font-size: larger">员工信息</span>
            <span class="col-md-offset-8"></span>
            <button type="button" class="btn btn-primary" id="add_emps_model_btn" data-toggle="modal"
                    data-target="#add_emps_btn">新增
            </button>
            <button type="button" class="btn btn-danger">删除</button>
        </div>
        <%--
                </div>

                <%--        <div class="col-md-12">--%>
        <%--                table-hover--%>
        <table class="table  table-striped table-hover table-bordered " id="emps_table">
            <thead>
            <tr>
                <th>id</th>
                <th>姓名</th>
                <th>性别</th>
                <th>email</th>
                <th>部门</th>
                <th>操作</th>
            </tr>
            </thead>
            <tbody>

            </tbody>

        </table>

        <%--        </div>--%>
    </div>

    <%-- 显示分页信息 --%>
    <div class="row">
        <div class="col-md-6" id="page_info_area">
            <%--            当前第 页，共 页，共 条数据--%>
        </div>

        <div class="col-md-6" id="page_nav_area">
            <!-- 页码   上页下页 -->
        </div>

        <!-- 跳转页数 -->
        <%--        <div class="col-lg-6">--%>
        <%--            <div class="input-group" id="jump_page">--%>
        <%--                  <span class="input-group-btn">--%>
        <%--                    <button class="btn btn-default" type="button">Go!</button>--%>
        <%--                  </span>--%>
        <%--                <input type="text" class="form-control" style="width: 10%" placeholder="1">--%>
        <%--            </div><!-- /input-group -->--%>
        <%--        </div><!-- /.col-lg-6 -->--%>

    </div>


</div>

<script type="text/javascript">

    var currentPageNum;
    //页面加载完成后，直接发送ajax请求，拿到分页数据
    $(function () {
        to_page(1);
    });

    function to_page(pageNum) {
        $.ajax({
            url: "${APP_PATH}/emps",
            data: "pageNum=" + pageNum,
            // type: "GET",
            success: function (result) {
                // console.log(result);
                //解析显示员工数据
                build_emps_table(result);
                //解析显示分页信息
                build_page_info(result);
                //分页条
                build_page_nav(result);
            }
        });
    }

    function build_emps_table(result) {
        $("#emps_table tbody").empty();
        var emps = result.extend.pageInfo.list;

        $.each(emps, function (index, item) {
            var empIdTd = $("<td></td>").append(item.empId);
            var empNameTd = $("<td></td>").append(item.empName);
            var genderTd = $("<td></td>").append(item.gender);
            var emailTd = $("<td></td>").append(item.email);
            var deptNameTd = $("<td></td>").append(item.department.deptName);
            /** <button type="button" class="btn btn-primary btn-sm">
             <span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>编辑
             </button> */
            var editBtn = $("<button></button>").addClass("btn btn-primary btn-sm edit_btn")
                .append($("<span></span>").addClass("glyphicon glyphicon-pencil").append("编辑"));

            editBtn.attr("edit-emp-id", item.empId);
            var delBtn = $("<button></button>").addClass("btn btn-danger btn-sm delete_btn")
                .append($("<span></span>").addClass("glyphicon glyphicon-trash").append("删除"));
            var delAndEdit = $("<td></td>").append(editBtn).append(" ")
                .append(delBtn);
            delBtn.attr("delete-emp-id", item.empId);
            delBtn.attr("delete-emp-name", item.empName);
            //append执行完毕返回原来的元素

            $("<tr></tr>").append(empIdTd)
                .append(empNameTd)
                .append(genderTd)
                .append(emailTd)
                .append(deptNameTd)
                .append(delAndEdit)
                .appendTo("#emps_table tbody");
        });
    }

    function build_page_info(result) {
        $("#page_info_area").empty();
        $("#page_info_area").append("当前第" + result.extend.pageInfo.pageNum
            + "页，共" + result.extend.pageInfo.pages + "页，" + result.extend.pageInfo.total + "条数据"
        );
        currentPageNum = result.extend.pageInfo.pageNum;
        // 当前第 页，共 页，共 条数据
    }

    function build_page_nav(result) {
        var pre = $("<li></li>").append($("<a></a>").append("&laquo;"));
        var next = $("<li></li>").append($("<a></a>").append("&raquo;"));
        //page_nav_area
        $("#page_nav_area").empty();
        var ul = $("<ul></ul>").addClass("pagination");

        // <div class="input-group" id="jump_page">
        //       <span class="input-group-btn">
        //            <button class="btn btn-default" type="button">Go!</button>
        //       </span>
        //           <input type="text" class="form-control" style="width: 10%" placeholder="1">
        //   </div><!-- /input-group --
        //   var jump = $("<div></div>").addClass("input-group")
        //       .append("<span></span>").addClass("input-group-btn")
        //       .append("<button></button>").addClass("btn btn-default").append("跳转")
        //       .append("<input/>").addClass("form-control");

        //构建元素
        if (result.extend.pageInfo.hasPreviousPage == false) {
            pre.addClass("disabled");
        } else {
            pre.click(function () {
                to_page(result.extend.pageInfo.pageNum - 1);
            });
        }

        var nextPageLi = $("<li></li>").append($("<a></a>").append("&raquo;"));
        // var lastPageLi = $("<li></li>").append($("<a></a>").append("末页").attr("href","#"));
        if (result.extend.pageInfo.hasNextPage == false) {
            nextPageLi.addClass("disabled");
        } else {
            nextPageLi.click(function () {
                to_page(result.extend.pageInfo.pageNum + 1);
            });
        }

        //添加前一页的提示
        ul.append(pre);
        //遍历给ul中添加页码提示
        $.each(result.extend.pageInfo.navigatepageNums, function (index, item) {

            var numLi = $("<li></li>").append($("<a></a>").append(item));
            if (result.extend.pageInfo.pageNum == item) {
                numLi.addClass("active");
            }
            numLi.click(function () {
                to_page(item);
            });
            ul.append(numLi);//numLi
        });
        //添加后一页y的提示
        ul.append(nextPageLi);
        //把ul添加到nav元素中


        var navEle = $("<nav></nav>").append(ul);
        navEle.appendTo("#page_nav_area");
    }

    function reset_form(ele) {
        //dom的reset方法 清空表单数据
        $(ele)[0].reset();
        // 清空表单样式
        $(ele).find("*").removeClass("has-error has-success");
        $(ele).find(".help-block").text("");
    }

    //新增按钮绑定
    $("#add_emps_model_btn").click(function () {
        reset_form("#add_emps_model form");


        //ajax查询部门信息显示在下拉列表中
        getDepts("#add_emps_model select");
        //弹出模态框
        $('#add_emps_model').modal({
            keyboard: true,
            //防止点击背景消失
            backdrop: "static"
        });
    });

    function getDepts(ele) {
        //ele = 模态id + select
        $.ajax({
            url: "${APP_PATH}/depts",
            // data: "pageNum=" + 1,
            type: "GET",
            success: function (result) {
                // console.log(result);
                //select_dept_name
                // $("#add_emps_model select");
                $.each(result.extend.depts, function () {
                    var optionDept = $("<option></option>").append(this.deptName).attr("value", this.deptId);
                    optionDept.appendTo(ele);

                })
            }
        });

    }


    //校验员工表单
    function validata_add_form() {
        //拿到校验数据  reg正则匹配
        // emp_name  gender_male  gender_female select_dept_name
        var empName = $("#emp_name").val();
        var regName = /(^[a-zA-Z0-9_-]{3,16}$)|(^[\u2E80-\u9FFF]{2,6}$)/;


        var regEmail = /^([a-z0-9_\.-]+)@([\da-z\.-]+)\.([a-z\.]{2,6})$/;
        var email = $("#emp_email").val();


        if (!checkAddEmp(regName, empName, "#emp_name", "姓名 由3-19英文字母或者2-6位中文组成")) {
            return false;
        }
        if (!checkAddEmp(regEmail, email, "#emp_email", "邮箱格式不正确")) {
            $("#emp_email").attr("ajax-email", "error");
            return false;
        } else {
            $("#emp_email").attr("ajax-email", "success");
        }

        return true;
    }

    function checkAddEmp(reg, test, elementId, text) {
        $(elementId).parent().removeClass("has-error has-success");
        if (!reg.test(test)) {
            $(elementId).parent().addClass("has-error");
            $(elementId).next("span").text(text);
            return false;
        } else {
            $(elementId).empty();
            $(elementId).parent().addClass("has-success");
            $(elementId).next("span").text("");
        }
        return true;
    }

    //检查email是否可用
    $("#emp_email").change(function () {
        var email = this.value;
        $.ajax({
            url: "${APP_PATH}/checkEmail",
            data: "email=" + email,
            type: "POST",
            success: function (result) {
                $("#emp_email").parent().removeClass("has-error has-success");
                if (result.code == 100) {
                    $("#emp_email").empty();
                    $("#emp_email").parent().addClass("has-success");
                    // $("#emp_email").attr("ajax-email", "success");

                    $("#emp_email").next("span").text("邮箱未被使用。");
                } else {
                    $("#emp_email").parent().addClass("has-error");
                    // $("#emp_email").attr("ajax-email", "error");
                    $("#emp_email").next("span").text("邮箱已被使用。");
                }

            }

        });

    });

    $("#emp_name").change(function () {
        var empName = $("#emp_name").val();
        var regName = /(^[a-zA-Z0-9_-]{3,16}$)|(^[\u2E80-\u9FFF]{2,6}$)/;

        checkAddEmp(regName, empName, "#emp_name", "姓名 由3-19英文字母或者2-6位中文组成");
    });

    //提交新员工按钮
    $("#add_new_emp_btn").click(function () {


        if (!validata_add_form()) {
            return false;
        }

        if ($("#emp_email").attr("ajax-email") == "error") {
            return false;
        }


        // alert($("#add_emps_model form").serialize());
        $.ajax({
            url: "${APP_PATH}/emp",
            type: "POST",
            data: $("#add_emps_model form").serialize(),
            success: function (result) {
                if (result.code == 100) {
                    $('#add_emps_model').modal('hide');
                    to_page(999);
                } else {
                    $("#emp_email").parent().addClass("has-error");
                    $("#emp_email").next("span").text("邮箱已被使用。");
                }
            },
            error: function () {
                alert("请检查数据");
            }
        });

    });


    //编辑信息  使用jQuery的on函数绑定document全局的editbtn
    $(document).on("click", ".edit_btn", function () {
        // alert("fuck");
        //emp_update_model   update_emp_name  update_gender_male  gender_female
        //update_emp_email  update_select_dept_name  update_emp_btn


        //给保存按钮添加员工id值
        $("#update_emp_btn").attr("edit-emp-id", $(this).attr("edit-emp-id"));
        $("#emp_update_model").modal({
            backdrop: "static"
        });

        getEmpInfo($(this).attr("edit-emp-id"));

        getDepts("#emp_update_model select");
    });

    //单个删除按钮
    $(document).on("click", ".delete_btn", function () {
        // .delete-emp-id
        //     alert(123);
        //     $("#update_emp_btn").attr("delete-emp-id", $(this).attr("delete-emp-id"));

        var empId = $(this).attr("delete-emp-id");
        var empName = $(this).attr("delete-emp-name");
        if(confirm("确认删除["+empId+"]号员工["+empName+"]吗？")){
            $.ajax({
                url: "${APP_PATH}/emp/" + empId,
                type: "DELETE",
                success:function () {
                    alert("删除成功");
                    to_page(currentPageNum);
                }
            });

        }

    });

    function getEmpInfo(id) {
        $.ajax({
            url: "${APP_PATH}/emp/" + id,
            type: "GET",
            success: function (result) {
                console.log(result);
                var empInfo = result.extend.empInfo;
                $("#update_emp_name").text(empInfo.empName);
                $("#update_emp_email").val(empInfo.email);
                $("#emp_update_model input[name=gender]").val([empInfo.gender]);
                $("#emp_update_model select").val([empInfo.dId]);
                // if(checkEmail("#update_emp_email").code==200){
                //     alert("PLPLPLP");
                // }
            }
        });

    }


    //检查email是否可用
    $("#update_emp_btn").click(function () {
        $.ajax({
            url: "${APP_PATH}/checkEmail",
            data: "email=" + $("#update_emp_email").val(),
            type: "POST",
            success: function (result) {
                // alert($("#update_emp_btn").attr("edit-emp-id"));
                // alert($("#update_emp_email").val());
                $("#update_emp_email").parent().removeClass("has-error has-success");
                if (result.code == 100) {
                    $("#update_emp_email").empty();
                    $("#update_emp_email").parent().addClass("has-success");
                    // $("#emp_email").attr("ajax-email", "success");
                    $("#update_emp_email").next("span").text("邮箱可用。");
                } else {
                    $("#update_emp_email").parent().addClass("has-error");
                    // $("#emp_email").attr("ajax-email", "error");
                    $("#update_emp_email").next("span").text(result.extend.email_fail);
                }
                //提交数据
                if (result.code == 100) {
                    $.ajax({
                        url: "${APP_PATH}/emp/" + $("#update_emp_btn").attr("edit-emp-id"),
                        type: "PUT",//POST
                        data: $("#emp_update_model form").serialize()/*+"&_method=PUT"*/,
                        success: function (result) {
                            // alert($("#update_emp_btn").attr("edit-emp-id"));
                            // alert(result.msg);
                            $('#emp_update_model').modal('hide');
                            to_page(currentPageNum);
                        }
                    });

                }
            }
            ,
            error: function (result) {
                $("#update_emp_email").parent().addClass("has-error");
                // $("#emp_email").attr("ajax-email", "error");
                $("#update_emp_email").next("span").text(result.extend.email_fail);
            }
        });

    });


</script>
</body>
</html>
