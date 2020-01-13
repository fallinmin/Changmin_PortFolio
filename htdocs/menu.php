
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <meta name="description" content="Slide Down Box Menu with jQuery and CSS3" />
        <meta name="keywords" content="jquery, css3, sliding, box, menu, cube, navigation, portfolio, thumbnails"/>
		<link rel="shortcut icon" href="../favicon.ico" type="image/x-icon"/>
        <link rel="stylesheet" href="css/style.css" type="text/css" media="screen"/>
        <style>
@import url(//fonts.googleapis.com/earlyaccess/nanumgothic.css);
			body{
				background:#333 url(bg.jpg) repeat top left;
font-family: 'Nanum Gothic', sans-serif;
                background-repeat: no-repeat;
                background-position: center;
                background-attachment: fixed;
			}
			span.reference{
				position:absolute;
				left:10px;
				bottom:10px;
				font-size:12px;
			}
			span.reference a{
				color:#aaa;
				text-transform:uppercase;
				text-decoration:none;
				text-shadow:1px 1px 1px #ABF200;
				margin-right:30px;
			}
			span.reference a:hover{
				color:#ddd;
			}
			ul.sdt_menu{
				margin-top:50px;
                margin : auto;
			}
		
		</style>
    </head>
     <center><logo><img src="logo.png"/></logo></center>
    <body>

		<div class="content">
		            
			<ul id="sdt_menu" class="sdt_menu">
				<li>
					<a href="#">
						<img src="images/me1.jpg" alt=""/>
						<span class="sdt_active"></span>
						<span class="sdt_wrap">
							<span class="sdt_link">한재웅 연구소</span>
							<span class="sdt_descr">농민의 꿈과 희망 연구</span>
						</span>
					</a>
				</li>
				<li>
					<a href="#">
						<img src="images/me2.jpg" alt=""/>
						<span class="sdt_active"></span>
						<span class="sdt_wrap">
							<span class="sdt_link">꿈꾸는 농부들</span>
							<span class="sdt_descr">쌍별 귀뚜라미 사업</span>
						</span>
					</a>
					<div class="sdt_box">
							<a href="#">Websites</a>
							<a href="#">Illustrations</a>
							<a href="#">Photography</a>
					</div>
				</li>
				<li>
					<a href="#">
						<img src="images/me3.jpg" alt=""/>
						<span class="sdt_active"></span>
						<span class="sdt_wrap">
							<span class="sdt_link">일자리 창출</span>
							<span class="sdt_descr">도시농업 6차산업</span>
						</span>
					</a>
				</li>
				<li>
					<a href="#">
						<img src="images/me4.jpg" alt=""/>
						<span class="sdt_active"></span>
						<span class="sdt_wrap">
							<span class="sdt_link">도시농업협력</span>
							<span class="sdt_descr">아쿠아포닉스 수직재배기</span>
						</span>
					</a>
				</li>
				<li>
					<a href="#">
						<img src="images/me5.jpg" alt=""/>
						<span class="sdt_active"></span>
						<span class="sdt_wrap">
							<span class="sdt_link">농업의 미래</span>
							<span class="sdt_descr">미래로 가는 농업</span>
						</span>
					</a>
				</li>
				<li>
					<a href="#">
						<img src="images/me6.jpg" alt=""/>
						<span class="sdt_active"></span>
						<span class="sdt_wrap">
							<span class="sdt_link">농업의 가치</span>
							<span class="sdt_descr">함께하는 농업의 가치 </span>
						</span>
					</a>
					<div class="sdt_box">
						<a href="#">Job Board Website</a>
						<a href="#">Shopping Cart</a>
						<a href="#">Interactive Maps</a>
					</div>
				</li>
			</ul>
		</div>
    

        <!-- The JavaScript -->
        <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.4.2/jquery.min.js"></script>
		<script type="text/javascript" src="jquery.easing.1.3.js"></script>
        <script type="text/javascript">
            $(function() {
				/**
				* for each menu element, on mouseenter, 
				* we enlarge the image, and show both sdt_active span and 
				* sdt_wrap span. If the element has a sub menu (sdt_box),
				* then we slide it - if the element is the last one in the menu
				* we slide it to the left, otherwise to the right
				*/
                $('#sdt_menu > li').bind('mouseenter',function(){
					var $elem = $(this);
					$elem.find('img')
						 .stop(true)
						 .animate({
							'width':'170px',
							'height':'70px',
							'left':'0px'
						 },400,'easeOutBack')
						 .andSelf()
						 .find('.sdt_wrap')
					     .stop(true)
						 .animate({'top':'140px'},200,'easeOutBack')
						 .andSelf()
						 .find('.sdt_active')
					     .stop(true)
						 .animate({'height':'130px'},300,function(){
						var $sub_menu = $elem.find('.sdt_box');
						if($sub_menu.length){
							var left = '170px';
							if($elem.parent().children().length == $elem.index()+1)
								left = '-170px';
							$sub_menu.show().animate({'left':left},200);
						}	
					});
				}).bind('mouseleave',function(){
					var $elem = $(this);
					var $sub_menu = $elem.find('.sdt_box');
					if($sub_menu.length)
						$sub_menu.hide().css('left','0px');
					
					$elem.find('.sdt_active')
						 .stop(true)
						 .animate({'height':'0px'},300)
						 .andSelf().find('img')
						 .stop(true)
						 .animate({
							'width':'0px',
							'height':'0px',
							'left':'85px'},400)
						 .andSelf()
						 .find('.sdt_wrap')
						 .stop(true)
						 .animate({'top':'25px'},500);
				});
            });
        </script>
    </body>
</html>