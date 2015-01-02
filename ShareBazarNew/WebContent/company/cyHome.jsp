<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@include file="../common/common.jsp"%>
<title>Company Home</title>

<style type="text/css">
.body2 {
	min-height: 400px;
}
</style>

</head>

<body>
	<jsp:include page="../company/companyHeader.jsp"></jsp:include>

	<div class="body2">
		<div class="main">
			<div class="marg_top wrapper">
			
							<center>

					<iframe src="http://edulifeline.com/includes/stocks_widget/"
						height="322px" width="250px" frameborder="0" scrolling="0"></iframe>

				</center>
			
			
			
			</div>
		</div>
	</div>
	<jsp:include page="../company/companyFooter.jsp"></jsp:include>
</body>
</html>
