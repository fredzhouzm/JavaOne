<#import "spring.ftl" as spring/>
<html>
<head>
    <title></title>
    <meta http-equiv="Content-Type" content="text/html; charset=gb2312">
    <style type="text/css">
        div#containerDiv {width:1200px;margin:0 auto;}
        div#topDiv {background-color:#99bbbb;height:200px;}
        div#middleDiv {background-color:#00ccff;height:650px;position: relative;}
        div#footerDiv {background-color:#99bbbb;height:70px;text-align:center;}
        div#loginDiv {margin:0 auto;width:200px;height: 150px;position: absolute;left: 500px;top: 150px}
    </style>
</head>
<body>
<div id="containerDiv">
    <div id="topDiv"></div>
    <div id="middleDiv">
        <div id="loginDiv">
            <@spring.message 'login_head'/>
        </div>
    </div>
    <div id="footerDiv"></div>
</div>
</body>
</html>