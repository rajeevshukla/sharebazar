<!DOCTYPE html>
<html  lang="en">
<%@include file="../common/common.jsp" %>
 
 <head>
 
 
 <title>Contact Form</title>
   <script type="text/javascript">
     
      function submitContactDetails(){
       var name=$("#name").val();
       var emailId=$("#email").val();
       var message=$("#message").val();
       
        $.post("../common/submitContactDetails.action",{name : name,emailId :emailId,message : message },function(data){
 
          
          $("#formResult").empty().html("<p style='color : green'>Your message has been submitted successfully. We will reach you soon !!</p>");
      
 

        });
      }
    
   
   </script>
 
 </head>

<body>
	<jsp:include page="../common/commonHeader.jsp"></jsp:include>

	<div class="body2">
		<div class="main">
			<!-- content -->
			<section id="content">
			<div class="marg_top wrapper">
				<article class="col1">
				<div class="box1_out">
					<div class="box1">
						<h2>Our Contacts : </h2>
						<div class="wrapper">
							<article class="col2">
							<p>
								<strong>Country: India<br> City:Delhi<br>Telephone:01204646464<br>
												Email:projects@nielit.in</strong>
							</p>
							</article>
							<article class="col3">
							<p>
								<a
											href="mailto:">contactus@sharebazar.com</a>
							</p>
							</article>
						</div>
					<!-- 	<a href="#" class="button"><span><span>headquarters</span></span></a> -->
					</div>
				</div>
				<div class="box1_bot">
					<div class="box1_bot_left">
						<div class="box1_bot_right"></div>
					</div>
				</div>
				</article>
				<article class="col2 pad_left1">
				<div class="box1_out">
					<div class="box1">
						<h2>Miscellaneous Info</h2>
						<p>"Emerge as the premier Indian stock exchange with 
                            best-in-class global practice in technology, products
                            innovation and customer service."
                           <strong><samp>CSR-</samp></strong>Corporate Social Responsibility (CSR) in BSE is aligned with 
                            its tradition of creating wealth in the community with a three
                             pronged focus on Education, Health and the Environment. Besides
                             funding charitable causes for the elderly and the physically 
                             challenged, BSE has been supporting the rehabilitation and 
                             restoration efforts in earthquake-hit communities of Gujarat.
                             BSE has been awarded the Golden Peacock Global - CSR Award 
                             for its initiatives in Corporate Social Responsibility (CSR) 
                             by the World Council of Corporate Governance.  </p>
					</div>
				</div>
				<div class="box1_bot">
					<div class="box1_bot_left">
						<div class="box1_bot_right"></div>
					</div>
				</div>
				</article>
			</div>
			<div class="wrapper marg_top2">
				<div id="formResult" class="pad">
					<h2>Contact Form</h2>
					<form id="ContactForm" action="">
						<div class="wrapper pad_bot1">
							<div class="wrapper">
								<div class="bg">
									<input type="text" class="input" id="name" />
								</div>
								Your Name:<br />
							</div>
							<div class="wrapper">
								<div class="bg">
									<input type="text" class="input" id="email" />
								</div>
								Your E-mail:<br />
							</div>
							<div class="wrapper">
								<div class="bg">
									<div class="textarea">
										<textarea name="textarea" cols="1" rows="1" id="message"></textarea>
									</div>
								</div>
								Your Message:<br />
							</div>
							<div class="wrapper">
							   
							     <input type="button" value="Submit"   onclick="submitContactDetails();">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							     <input type="button" value="Reset"  onclick="">
							</div>
						</div>
					</form>
				</div>
			</div>
			</section>
			<!-- / content -->
		</div>
	</div>




	<jsp:include page="../common/commonFooter.jsp"></jsp:include>


</body>
</html>
