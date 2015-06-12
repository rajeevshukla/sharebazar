<!DOCTYPE html>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="java.util.Calendar"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="poll.ConnectionPoll"%>
<html lang="en">
<head>
    
    <meta charset="utf-8">
    <title>Student View</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="Charisma, a fully featured, responsive, HTML5, Bootstrap admin template.">
    <meta name="author" content="Muhammad Usman">

    <!-- The styles -->
    <link id="bs-css" href="css/bootstrap-cerulean.min.css" rel="stylesheet">

    <link href="css/charisma-app.css" rel="stylesheet">
    <link href='bower_components/fullcalendar/dist/fullcalendar.css' rel='stylesheet'>
    <link href='bower_components/fullcalendar/dist/fullcalendar.print.css' rel='stylesheet' media='print'>
    <link href='bower_components/chosen/chosen.min.css' rel='stylesheet'>
    <link href='bower_components/colorbox/example3/colorbox.css' rel='stylesheet'>
    <link href='bower_components/responsive-tables/responsive-tables.css' rel='stylesheet'>
    <link href='bower_components/bootstrap-tour/build/css/bootstrap-tour.min.css' rel='stylesheet'>
    <link href='css/jquery.noty.css' rel='stylesheet'>
    <link href='css/noty_theme_default.css' rel='stylesheet'>
    <link href='css/elfinder.min.css' rel='stylesheet'>
    <link href='css/elfinder.theme.css' rel='stylesheet'>
    <link href='css/jquery.iphone.toggle.css' rel='stylesheet'>
    <link href='css/uploadify.css' rel='stylesheet'>
    <link href='css/animate.min.css' rel='stylesheet'>

    <!-- jQuery -->
    <script src="bower_components/jquery/jquery.min.js"></script>

    <!-- The HTML5 shim, for IE6-8 support of HTML5 elements -->
    <!--[if lt IE 9]>
    <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->

    <!-- The fav icon -->
    <link rel="shortcut icon" href="img/favicon.ico">

</head>

<body>
    <!-- topbar starts -->
    <div class="navbar navbar-default" role="navigation">

        <div class="navbar-inner">
            <button type="button" class="navbar-toggle pull-left animated flip">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="index.html"> <img alt="Charisma Logo" src="img/logo20.png" class="hidden-xs"/>
                <span style="width: 300px;">Vision Institute</span></a>

            <!-- user dropdown starts -->
            <div class="btn-group pull-right">
               
                    <i class="glyphicon glyphicon-user"></i><span class="hidden-sm hidden-xs"> <a href="logout.jsp"style="color: white;">Logout</a></span>
                    <span class="caret"></span>
                
                
            </div>
            <!-- user dropdown ends -->

            <!-- theme selector starts -->
            <div class="btn-group pull-right theme-container animated tada">
                <button class="btn btn-default dropdown-toggle" data-toggle="dropdown">
                    <i class="glyphicon glyphicon-tint"></i><span
                        class="hidden-sm hidden-xs"> Change Theme / Skin</span>
                    <span class="caret"></span>
                </button>
                <ul class="dropdown-menu" id="themes">
                    <li><a data-value="classic" href="#"><i class="whitespace"></i> Classic</a></li>
                    <li><a data-value="cerulean" href="#"><i class="whitespace"></i> Cerulean</a></li>
                    <li><a data-value="cyborg" href="#"><i class="whitespace"></i> Cyborg</a></li>
                    <li><a data-value="simplex" href="#"><i class="whitespace"></i> Simplex</a></li>
                    <li><a data-value="darkly" href="#"><i class="whitespace"></i> Darkly</a></li>
                    <li><a data-value="lumen" href="#"><i class="whitespace"></i> Lumen</a></li>
                    <li><a data-value="slate" href="#"><i class="whitespace"></i> Slate</a></li>
                    <li><a data-value="spacelab" href="#"><i class="whitespace"></i> Spacelab</a></li>
                    <li><a data-value="united" href="#"><i class="whitespace"></i> United</a></li>
                </ul>
            </div>
            <!-- theme selector ends -->

            

        </div>
    </div>
    <!-- topbar ends -->
<div class="ch-container">
    <div class="row">
        
        <!-- left menu starts -->
        <div class="col-sm-2 col-lg-2">
            <div class="sidebar-nav">
                <div class="nav-canvas">
                    <div class="nav-sm nav nav-stacked">

                    </div>
                    <ul class="nav nav-pills nav-stacked main-menu">
                        <li class="nav-header">Main</li>
                        <li><a class="ajax-link" href="dashboard.jsp"><i class="glyphicon glyphicon-home"></i><span> Dashboard</span></a>
                        </li>
                        
                       
                         <li class="accordion">
                            <a href="#"><i class="glyphicon glyphicon-plus"></i><span>Students</span></a>
                            <ul class="nav nav-pills nav-stacked">
                                <li><a href="student_reg.jsp">Registration</a></li>
                                <li><a href="student_details.jsp">Details</a></li>
                            </ul>
                        </li>
                        <li class="accordion">
                            <a href="#"><i class="glyphicon glyphicon-plus"></i><span>Teachers</span></a>
                            <ul class="nav nav-pills nav-stacked">
                                <li><a href="teacher_reg.jsp">Registration</a></li>
                                <li><a href="teacher_details.jsp">Details</a></li>
                            </ul>
                        </li>
                        
                        <li><a href="expenses.jsp"><i class="glyphicon glyphicon-lock"></i><span>Expenses</span></a>
                        </li>
                    </ul>
                     </div>
            </div>
        </div>
       

       

        <div id="content" class="col-lg-10 col-sm-10">
            <!-- content starts -->
                <div>
        <ul class="breadcrumb">
            <li>
                <a href="#">Home</a>
            </li>
            <li>
                <a href="#">Student Details</a>
            </li>
            <li>
                <a href="currentdeposit.jsp">View Current Month's Deposit </a>
            </li>
        </ul>
    </div>
<%
Calendar cal=Calendar.getInstance();
Date d=new Date(cal.getTimeInMillis());
SimpleDateFormat sf=new SimpleDateFormat("MMMM");
String m_name=sf.format(d).toString().toLowerCase();
int year = cal.get(Calendar.YEAR); 
int month=cal.get(Calendar.MONTH)+1;
String dd="01"+"/"+month+"/"+year;
String dd1="31"+"/"+month+"/"+year;
%>
    <div class="row">
    <div class="box col-md-12">
    <div class="box-inner">
    <div class="box-header well" data-original-title="">
        <h2><i class="glyphicon glyphicon-user"></i> Datatable + Students + Current Month :<%=m_name %> </h2>

        <div class="box-icon">
            <a href="#" class="btn btn-setting btn-round btn-default"><i class="glyphicon glyphicon-cog"></i></a>
            <a href="#" class="btn btn-minimize btn-round btn-default"><i
                    class="glyphicon glyphicon-chevron-up"></i></a>
            <a href="#" class="btn btn-close btn-round btn-default"><i class="glyphicon glyphicon-remove"></i></a>
        </div>
    </div>
    <div class="box-content">
    <table class="table table-striped table-bordered bootstrap-datatable datatable responsive">
    <thead>
    <tr>
        <th>Name</th>
        <th>Phone</th>
        <th>Category</th>
        <th>Fees</th>
        <th>Paid Fees</th>
        <th>Remaining Fees</th>
        <th>Date</th>
    </tr>
    </thead>
    <tbody>
 <%
	ConnectionPoll cp = new ConnectionPoll();
	cp.connect();
	
	Statement st = cp.con.createStatement();
	double t = 0; double amount = 0; double rem = 0; String date = null;
	ResultSet rs = st.executeQuery("select * from student where date between '"+dd+"' and '"+dd1+"'");
	while(rs.next())
	{
		t = rs.getDouble("pfee");
		rem = rs.getDouble("remaining_fee");
		date = rs.getString("date");
		if(t!=0)
		{
		%>
		<tr>
			<td><%= rs.getString("name") %></td>
			<td><%= rs.getString("phone") %></td>
			<td><%= rs.getString("cate") %></td>
			<td><%= rs.getDouble("fee") %></td>
			<td><%=t %></td>
			<td><%=rem %></td>
			<td><%= date %></td>
		</tr>
	<% 
	}}
 		Statement st1 = cp.con.createStatement();
 		double f = 0;
 		ResultSet rs1 = st1.executeQuery("select * from deposit where date between '"+dd+"' and '"+dd1+"'");
 		while(rs1.next())
 		{
 			amount = rs1.getDouble("amount");
 			int s_id = rs1.getInt("s_id");
 			date=rs1.getString("date");
 			Statement st0 = cp.con.createStatement();
 			ResultSet rs0=st0.executeQuery("select * from student where id='"+s_id+"'");
 			while(rs0.next())
 			{
 				f = rs0.getDouble("fee");
 			}
 			if(amount!= 0)
 			{
 			%>
 			<tr>
 				<td><%= rs1.getString("name") %></td>
 				<td class="center"><%= rs1.getString("phone") %></td>
 				<td class="center"><%= rs1.getString("cate") %></td>
 				<td class="center"><%= f %></td>
 				<td class="center"><%= amount %></td>
 				<td class="center"><%= rem %></td>
 				<td class="center"><%= date %></td>
 			</tr>
 	<% 	
 		}}
 %>
 
    </tbody>
    </table>
    </div>
    </div>
    </div>
    <!--/span-->

    </div><!--/row-->

    

    

    

    

    <!-- content ends -->
    </div><!--/#content.col-md-0-->
</div><!--/fluid-row-->

    <!-- Ad, you can remove it -->
    

    <hr>

    


</div><!--/.fluid-container-->

<!-- external javascript -->

<script src="bower_components/bootstrap/dist/js/bootstrap.min.js"></script>

<!-- library for cookie management -->
<script src="js/jquery.cookie.js"></script>
<!-- calender plugin -->
<script src='bower_components/moment/min/moment.min.js'></script>
<script src='bower_components/fullcalendar/dist/fullcalendar.min.js'></script>
<!-- data table plugin -->
<script src='js/jquery.dataTables.min.js'></script>

<!-- select or dropdown enhancer -->
<script src="bower_components/chosen/chosen.jquery.min.js"></script>
<!-- plugin for gallery image view -->
<script src="bower_components/colorbox/jquery.colorbox-min.js"></script>
<!-- notification plugin -->
<script src="js/jquery.noty.js"></script>
<!-- library for making tables responsive -->
<script src="bower_components/responsive-tables/responsive-tables.js"></script>
<!-- tour plugin -->
<script src="bower_components/bootstrap-tour/build/js/bootstrap-tour.min.js"></script>
<!-- star rating plugin -->
<script src="js/jquery.raty.min.js"></script>
<!-- for iOS style toggle switch -->
<script src="js/jquery.iphone.toggle.js"></script>
<!-- autogrowing textarea plugin -->
<script src="js/jquery.autogrow-textarea.js"></script>
<!-- multiple file upload plugin -->
<script src="js/jquery.uploadify-3.1.min.js"></script>
<!-- history.js for cross-browser state change on ajax -->
<script src="js/jquery.history.js"></script>
<!-- application script for Charisma demo -->
<script src="js/charisma.js"></script>


</body>
</html>
