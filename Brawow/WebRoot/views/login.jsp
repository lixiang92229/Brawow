<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

<head>
	<meta charset="utf-8">
	<title>Boo Admin - Welcome</title>
	<meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0, minimum-scale=1.0, maximum-scale=1.0">
	<meta name="apple-mobile-web-app-capable" content="yes">
	<meta name="apple-mobile-web-app-status-bar-style" content="black">
	<meta name="description" content="">
	<meta name="author" content="">
	
	<!-- Custom styles -->
	<style type="text/css">
	.signin-content {
	  max-width: 360px;
	  margin: 0 auto 20px;
	}
	</style>
	
	<!-- Le styles -->
	<link href="../css/lib/bootstrap.css" rel="stylesheet">
	<link href="../css/lib/bootstrap-responsive.css" rel="stylesheet">
	<link href="../css/boo-extension.css" rel="stylesheet">
	<link href="../css/boo.css" rel="stylesheet">
	<link href="../css/style.css" rel="stylesheet">
	<link href="../css/boo-coloring.css" rel="stylesheet">
	<link href="../css/boo-utility.css" rel="stylesheet">
	
	<!-- Le fav and touch icons -->
	<link rel="shortcut icon" href="assets/ico/favicon.ico">
	<link rel="apple-touch-icon-precomposed" sizes="144x144" href="../ico/apple-touch-icon-144-precomposed.png">
	<link rel="apple-touch-icon-precomposed" sizes="114x114" href="../ico/apple-touch-icon-114-precomposed.png">
	<link rel="apple-touch-icon-precomposed" sizes="72x72" href="../ico/apple-touch-icon-72-precomposed.png">
	<link rel="apple-touch-icon-precomposed" href="../ico/apple-touch-icon-57-precomposed.png">
</head>

<body class="signin signin-vertical">
	<div class="page-container">
    	<div id="header-container">
	        <div id="header">
	            <div class="navbar-inverse navbar-fixed-top">
	                <div class="navbar-inner">
	                    <div class="container"> </div>
	                </div>
	            </div>
	            <!-- // navbar -->
	           
	           <div class="header-drawer" style="height:3px"> </div>
	           <!-- // breadcrumbs --> 
	       </div>
	       <!-- // drawer --> 
	   </div>
	   <!-- // header-container -->
	   
	   <div id="main-container">
	       <div id="main-content" class="main-content container">
	           <div class="signin-content">
	               <h1 class="welcome text-center" style="line-height: 0.6;">
	               	<small>中科德众<br/>智能软件监控系统</small>
	               </h1>
	               <div class="">
	                   <div class="tab-content overflow">
	               			<!-- 登录 -->
	                       <div class="tab-pane fade in active" id="login">
	                           <h3 class="no-margin-top opaci35"><i class="fontello-icon-user-4"></i> 登录</h3>
	                           <!-- 登录表单 -->
	                           <form class="form-tied margin-00" method="post" action="login" name="login_form">
	                               <fieldset>
	                                   <ul>
	                                       <li>
	                                           <input id="idLogin" class="input-block-level" type="text" name="userName" placeholder="用户名">
	                                       </li>
	                                       <li>
	                                           <input id="idPassword" class="input-block-level" type="password" name="userPw" placeholder="密码">
	                                       </li>
	                                   </ul>
	                                   <hr class="margin-xm">
	                                   <label class="checkbox pull-left">
	                                       <input id="remember" class="checkbox" type="checkbox">
	                                       	记住我
										</label>
	                                   <a href="#forgot" class="pull-right link" data-toggle="tab">忘记密码</a>
	                                   <div class="margin-xxx clearfix"></div>
	                                   <button type="submit" class="btn btn-block btn-large boo-green">登录</button>
	                               </fieldset>
	                               <hr class="margin-sm">
	                           </form>
	                           <!-- // form --> 
	                           
	                       </div>
	                       <!-- //登录 -->
	                       
	                   </div>
	               </div>
	               <!-- // Well-Black --> 
	               
	               <!-- 底部 -->
	               <div class="web-description">
	                   <h5>Copyright &copy; 2012 companypage.com</h5>
	                   <p>Backend and Frontend interface for web &amp; mobile development. <br />
	                       All rights reserved.</p>
	               </div>
	               
	           </div>
	           <!-- // sign-content -->
	           
	       </div>
	       <!-- // main-content --> 
	       
	   </div>
	   <!-- // main-container  --> 
	    
	</div>
	<!-- // page-container --> 
	
	<!-- Le javascript --> 
	<!-- Placed at the end of the document so the pages load faster --> 
	<script src="../js/lib/jquery.js"></script> 
	<script src="../js/lib/jquery-ui.js"></script>
	<script src="../js/lib/jquery.cookie.js"></script> 
	<script src="../js/lib/jquery.date.js"></script> 
	<script src="../js/lib/jquery.mousewheel.js"></script> 
	<script src="../js/lib/jquery.load-image.min.js"></script>
	<script src="../js/lib/bootstrap/bootstrap.js"></script> 
	
	<!-- Plugins Bootstrap -->
	<script src="../plugins/bootstrap-wysihtml5/lib/js/wysihtml5-0.3.0.min.js"></script> 
	<script src="../plugins/bootstrap-wysihtml5/src/bootstrap-wysihtml5.js"></script>
	<script src="../plugins/bootstrap-fuelux/all-fuelux.min.js"></script> 
	<script src="../plugins/bootstrap-datepicker/js/bootstrap-datepicker.js"></script> 
	<script src="../plugins/bootstrap-timepicker/js/bootstrap-timepicker.js"></script> 
	<script src="../plugins/bootstrap-datetimepicker/js/bootstrap-datetimepicker.js"></script>
	<script src="../plugins/bootstrap-colorpicker/js/bootstrap-colorpicker.js"></script>
	<script src="../plugins/bootstrap-daterangepicker/js/bootstrap-daterangepicker.js"></script> 
	<script src="../plugins/bootstrap-toggle-button/js/bootstrap-toggle-button.js"></script> 
	<script src="../plugins/bootstrap-fileupload/js/bootstrap-fileupload.js"></script> 
	<script src="../plugins/bootstrap-rowlink/js/bootstrap-rowlink.js"></script> 
	<script src="../plugins/bootstrap-progressbar/js/bootstrap-progressbar.js"></script> 
	<script src="../plugins/bootstrap-select/bootstrap-select.js"></script> 
	<script src="../plugins/bootstrap-multiselect/js/bootstrap-multiselect.js"></script> 
	<script src="../plugins/bootstrap-bootbox/bootbox.min.js"></script> 
	<script src="../plugins/bootstrap-modal/js/bootstrap-modalmanager.js"></script> 
	<script src="../plugins/bootstrap-modal/js/bootstrap-modal.js"></script> 
	<script src="../plugins/bootstrap-wizard/js/bootstrap-wizard.min.js"></script>
	<script src="../plugins/bootstrap-wizard-2/js/bwizard-only.min.js"></script>
	<script src="../plugins/bootstrap-image-gallery/js/bootstrap-image-gallery.min.js"></script>
	
	
	<!-- Plugins Custom - Only example --> 
	<script src="../plugins/pl-extension/google-code-prettify/prettify.js"></script>
	
	<!-- Plugins Custom - System --> 
	<script src="../plugins/pl-system/nicescroll/jquery.nicescroll.min.js"></script> 
	<script src="../plugins/pl-system/xbreadcrumbs/xbreadcrumbs.js"></script> 
	
	<!-- Plugins Custom - System info -->
	<script src="../plugins/pl-system-info/qtip2/dist/jquery.qtip.min.js"></script> 
	<script src="../plugins/pl-system-info/gritter/js/jquery.gritter.min.js"></script> 
	<script src="../plugins/pl-system-info/notyfy/jquery.notyfy.js"></script>
	
	<!-- Plugins Custom - Content -->
	<script src="../plugins/pl-content/list/js/list.min.js"></script> 
	<script src="../plugins/pl-content/list/plugins/list.paging.min.js"></script>
	<script src="../plugins/pl-content/jpages/js/jPages.js"></script> 
	
	<!-- Plugins Custom - Component -->
	<script src="../plugins/pl-component/fullcalendar/fullcalendar.min.js"></script> 
	<script src="../plugins/pl-component/rangeslider/jqallrangesliders.min.js"></script>
	
	<!-- Plugins Custom - Form -->
	<script src="../plugins/pl-form/uniform/jquery.uniform.min.js"></script> 
	<script src="../plugins/pl-form/select2/select2.min.js"></script>
	<script src="../plugins/pl-form/counter/jquery.counter.js"></script> 
	<script src="../plugins/pl-form/elastic/jquery.elastic.js"></script> 
	<script src="../plugins/pl-form/inputmask/jquery.inputmask.js"></script> 
	<script src="../plugins/pl-form/inputmask/jquery.inputmask.extensions.js"></script> 
	<script src="../plugins/pl-form/validate/js/jquery.validate.min.js"></script> 
	<script src="../plugins/pl-form/duallistbox/jquery.duallistbox.min.js"></script>
	
	<!-- Plugins Custom - Gallery --> 
	<script src="../plugins/pl-gallery/nailthumb/jquery.nailthumb.1.1.min.js"></script> 
	<script src="../plugins/pl-gallery/nailthumb/showLoading/js/jquery.showLoading.min.js"></script>
	<script src="../plugins/pl-gallery/wookmark/jquery.imagesloaded.js"></script>
	<script src="../plugins/pl-gallery/wookmark/jquery.wookmark.min.js"></script>
	
	<!-- Plugins Tables --> 
	<script src="../plugins/pl-table/datatables/media/js/jquery.dataTables.js"></script> 
	<script src="../plugins/pl-table/datatables/plugin/jquery.dataTables.plugins.js"></script> 
	<script src="../plugins/pl-table/datatables/plugin/jquery.dataTables.columnFilter.js"></script> 
	
	<!-- Plugins data visualization --> 
	<script src="../plugins/pl-visualization/sparkline/jquery.sparkline.min.js"></script> 
	<script src="../plugins/pl-visualization/easy-pie-chart/jquery.easy-pie-chart.js"></script> 
	<script src="../plugins/pl-visualization/percentageloader/percentageloader.min.js"></script>
	<script src="../plugins/pl-visualization/knob/knob.js"></script> 
	<script src="../plugins/pl-visualization/flot/jquery.flot.js"></script> 
	<script src="../plugins/pl-visualization/flot/jquery.flot.categories.js"></script> 
	<script src="../plugins/pl-visualization/flot/jquery.flot.grow.js"></script> 
	<script src="../plugins/pl-visualization/flot/jquery.flot.orderBars.js"></script> 
	<script src="../plugins/pl-visualization/flot/jquery.flot.pie.js"></script> 
	<script src="../plugins/pl-visualization/flot/jquery.flot.resize.js"></script> 
	<script src="../plugins/pl-visualization/flot/jquery.flot.selection.js"></script> 
	<script src="../plugins/pl-visualization/flot/jquery.flot.stack.js"></script> 
	<script src="../plugins/pl-visualization/flot/jquery.flot.stackpercent.js"></script> 
	<script src="../plugins/pl-visualization/flot/jquery.flot.time.js"></script> 
	
	<!-- main js --> 
	<script src="../js/core.js"></script> 
	<script src="../js/application.js"></script> 
	
	<script>
	$(document).ready(function() {
		
	});
	
	</script>
</body>
</html>