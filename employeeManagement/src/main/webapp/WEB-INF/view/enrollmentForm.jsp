<%@ page contentType="text/html;charset=UTF-8"%>

<script type="text/javascript" src="${initParam.rootPath }/resource/jquery/jquery-3.2.1.min.js"></script>


<div class="container text-center" style="margin-top:15%;">
	<h1>회원가입</h1>
	<form action="/join_member.do" id="submitForm" method="post">
		<div class="form-group">
			<label for="employeeNo">직원번호</label>
			<input type="text" name="employeeNo" id="employeeNo" required="required" class="form-control">
			<br/>
			<button type="button" id="duplicatedCheckBtn" class="btn-primary">직원번호 중복체크</button>
		</div>
		<!-- <div class="form-group">
			<label for="password">비밀번호</label> 
			<input type="password" name="password" required="required" class="form-control">
		</div> -->
		<div class="form-group">
			<label for="name">이름</label> 
			<input type="text" name="employeeName" id="employeeName" required="required" class="form-control">
		</div>
		<div class="form-group">
			<label for="phoneNumber">전화번호</label> 
			<input type="text" name="employeePhoneNum" id="employeePhoneNum" required="required" class="form-control">
		</div>
		<div class="form-group">
			<label for="phoneNumber">직급</label> 
			<input type="text" name="employeePosition" id="employeePosition" required="required" class="form-control">
		</div>
		<div class="form-group">
			<label for="email">이메일주소</label> 
			<input type="text" name="employeeEmail" id="employeeEmail" class="form-control" required="required">
		</div>
		<button id="joinBtn" type="button" class="btn-primary">등록</button>
	</form>
</div>