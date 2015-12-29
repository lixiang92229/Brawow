$(document).ready(function(){
	$("#submit").click(function(){
		alert("00");
				if($("#username").val()==""||$("#username").val()=="请输入用户名"){
					alert("用户名不能为空！");
					return;
				}else if($("#userpw").val()==""||$("#userpw").val()=="请输入密码"){
					alert("密码不能为空！");
					return;
				}else {	
					alert($("#username").val()+"  ,  "+$("#userpw").val());
					var para={
							userName:$("#username").val(),
							userPw:$("#userpw").val()
						  };
							
							var sUrl = "loginAjax.action";
							$.ajax({type:"POST",
									dataType:"json",
									data:para,
									url:sUrl,
									success:callbackSuccess,
									error:callbackError},"json");
				
				}
	});
			
	function callbackSuccess(data){
		var msg = data.msg;
		if(msg=="success") {
			document.location.href = "loginDemo.action";
		}
			alert("成功");	
	}
		
	function callbackError(XMLHttpRequest, textStatus, thrownError){
		alert("失败");
	}
});