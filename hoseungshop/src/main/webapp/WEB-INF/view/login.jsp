<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zxx">
	<jsp:include page="./common/header.jsp"></jsp:include>
	<body>
		<!-- 로그인 페이지 -->
		<form name="" action="" method="">
			<div style="
			    display: flex;
			    justify-content: center;
			    align-items: center;
			    margin-top: 200px;
			    margin-bottom: 200px;
			">
				<div style="width: 270px;">
						<input type="text" name="" id="" placeholder="아이디" style="
						    width: 98%;
						    height: 34px;
						    font-size: 11px;
						    line-height: 28px;
						    padding: 2px 2px 2px 3px;
						    border: 1px solid #d9d9d9;
						    border-radius: 0px;
						    margin-bottom: 3px;
						    color: #8F8F91;
						">
						<input type="password" name="" id="" placeholder="비밀번호" style="
						    width: 98%;
						    height: 34px;
						    font-size: 11px;
						    line-height: 28px;
						    padding: 2px 2px 2px 3px;
						    border: 1px solid #d9d9d9;
						    border-radius: 0px;
						    color: #8F8F91;
						">
				</div>
				<a href="#none" onclick="alert('로그인')" class="rkd" style="
				    margin: 0px 0px 0px 1px;
				    background: #565656;
				    border: 1px solid #d4d8d9;
				    color: #fff;
				    letter-spacing: 0px;
				    padding: 27px 40px;
				    text-align: right;
				    font-size: 11px;
				    border-radius: 0px;
				    font-weight: normal;
				">로그인</a>
			</div>
		</form>

		<jsp:include page="./common/instagram.jsp"></jsp:include>
	    <jsp:include page="./common/footer.jsp"></jsp:include>
	</body>
</html>
