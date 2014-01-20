<style>

nav ul ul {
	display: none;
	clear: both;
}


	nav ul li:hover > ul {
		display: block;
	}
	
	/* nav ul li {
	float: left;
} */
	nav ul li:hover {
		background: #4b545f;
		background: linear-gradient(top, #4f5964 0%, #5f6975 40%);
		background: -moz-linear-gradient(top, #4f5964 0%, #5f6975 40%);
		background: -webkit-linear-gradient(top, #4f5964 0%,#5f6975 40%);
	}
		nav ul li:hover a {
			color: #fff;
		}
	
	nav ul li a {
		display: block; 
		color: #757575; text-decoration: none;
	}
	
	nav ul ul {
	background: #ffff; border-radius: 0px; padding: 0;
	position: absolute; top: 100%;
}
	nav ul ul li {
		float: none; 
		border-top: 1px solid #6b727c;
		border-bottom: 1px solid #575f6a;
		position: relative;
	}
		nav ul ul li a {
			
			color: #fff;
		}	
			nav ul ul li a:hover {
				background: #fffff;
			}
	
	nav ul ul ul {
	position: absolute; left: 100%; top:0;
}

</style>

<body id="page5">
	<!-- <div class="body3"></div> -->
	<div class="body1">
		<div class="main">
			<!-- header -->
			<header>
				<div id="logo_box">
					<h1 style="font-size: 30px; line-height: 40px; padding-left: 47px">
						<a href="../customer/crHome.jsp" id="logo">ShareBazar.com <span>Clients
								Choose Us!</span></a>
					</h1>
				</div>
				<nav>
					<ul id="menu">
						<li><a href="../customer/crHome.jsp">Home</a></li>
						<li><a href="#">Manage Share</a>
							<ul>
								<li><a href="buyShareGet.action">Buy Share</a></li>
								<li><a href="sellShareGet.action">Sell Share</a></li>
								<li><a href="../common/about.jsp">View Share</a></li>
							</ul></li>
						<li><a href="#">Manage Transaction</a>
								
								<ul>
								 <li><a href="getFund.action">Manage funds</a></li>
								<li><a href="transactionHistory.action">Transaction History</a></li>
								</ul>
								</li>
						<li id="menu_active"><a href="#">Contact	company</a>
						  <ul>
						   <li><a href="companyDetailGet.action">View comapny details</a> </li>
						    <li><a  href="contactwithcompanyGet.action">Contact companies</a></li>
						  </ul>
						</li>
						<li class="bg_none"><a href="commentGet.action">Comment</a></li>
					</ul>
				</nav>
				<div class="wrapper">
					<div class="text1">Your Business Needs Fresh Ideas?</div>
					<div class="text2">We work for your Profit</div>
					<ul id="icons">
						<li><a href="#"><img src="../images/icon1.jpg" alt=""></a></li>
						<li><a href="#"><img src="../images/icon2.jpg" alt=""></a></li>
						<li><a href="#"><img src="../images/icon3.jpg" alt=""></a></li>
					</ul>
				</div>
				<div class="ic">More Website Templates at TemplateMonster.com!</div>
			</header>
			<!-- / header -->
		</div>
	</div>