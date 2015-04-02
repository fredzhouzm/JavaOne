<#import "spring.ftl" as spring/>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title></title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <style type="text/css">
        div#registerDiv {position: absolute;left: 50%;top: 50%;margin:-300px 0 0 -160px;height: 600px;width: 320px;}
    </style>
    <link rel="stylesheet" href="../css/style.css" type="text/css">
    <link rel="stylesheet" href="../css/bootstrap.min.css" type="text/css">
    <script type="text/javascript" src="../JavaScript/jquery-2.1.3.min.js"></script>
    <script type="text/javascript" src="../JavaScript/bootstrap.min.js"></script>
</head>
<body>
<div id="registerDiv">
    <form class="form-horizontal" action="registerCheck.htm" method="post">
        <div class="form-group">
            <label for="registerID" class="col-sm-3 control-label">账号</label>
            <div class="col-sm-8">
                <input type="text" class="form-control" id="registerID" placeholder="用户账号" required autofocus>
            </div>
        </div>
        <div class="form-group">
            <label for="registerPWD" class="col-sm-3 control-label">密码</label>
            <div class="col-sm-8">
                <input type="password" class="form-control" id="registerPWD" placeholder="用户密码" required>
            </div>
        </div>
        <div class="form-group">
            <label for="registerName" class="col-sm-3 control-label">昵称</label>
            <div class="col-sm-8">
                <input type="text" class="form-control" id="registerName" placeholder="用户昵称" required>
            </div>
        </div>
        <div class="form-group">
            <label for="registerName" class="col-sm-3 control-label">性别</label>
            <div class="col-sm-8">
                <label class="radio-inline">
                    <input type="radio" name="registerGender" id="gender1" value="1"> 男
                </label>
                <label class="radio-inline">
                    <input type="radio" name="registerGender" id="gender2" value="2"> 女
                </label>
            </div>
        </div>
        <div class="form-group">
            <label for="registerBirthdate" class="col-sm-3 control-label">出生日期</label>
            <div class="col-sm-8">
                <input type="text" class="form_datetime" id="registerBirthdate" value="YYYY-MM-DD" readonly>
                <script type="text/javascript">$(".registerBirthdate").datetimepicker({format: 'yyyy-mm-dd'});</script>
            </div>
        </div>
        <div class="form-group">
            <label for="registerEmail" class="col-sm-3 control-label">E-mail</label>
            <div class="col-sm-8">
                <input type="email" class="form-control" id="registerEmail" placeholder="E-mail" required>
            </div>
        </div>
        <button id="login" type="submit" class="btn btn-lg btn-primary btn-block">注册</button>
    </form>
</div>
</body>
</html>