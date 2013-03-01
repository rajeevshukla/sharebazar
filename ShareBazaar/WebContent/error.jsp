<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'error.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<script type="text/javascript">
    function setImage(file) {
        if(document.all)
            document.getElementById('prevImage').src = file.value;
        else
            document.getElementById('prevImage').src = file.files.item(0).getAsDataURL();
        if(document.getElementById('prevImage').src.length > 0) 
            document.getElementById('prevImage').style.display = 'block';
    }
</script>

</head>
<body>
	<div>
		`
		<div>
			<img id="prevImage" style="display: none;" width="91" height="91" />
		</div>
		<div>
			<div>
				<input type="file" id="" name="myImage" onchange="setImage(this);" />
			</div>
		</div>
		<div>
			<input type="submit" name="" value="submit" />
		</div>
	</div>
</body>
</html>
