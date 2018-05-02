<%@ page contentType="text/html;charset=UTF-8"%>

<div class="main_menu col-sm-12 text-center" style="height: 80px;">
      <ul class="col-sm-12">
         <li class="col-sm-2 col-sm-offset-2 col-xs-12" style="padding: 0;"><a href="#">직원정보 등록</a></li>
         <li class="col-sm-2 col-xs-12" style="padding: 0;"><a href="#">직원정보 수정</a></li>
    
    <h2>삭제</h2>  
      <form method="post" action="${initParam.rootPath }/delete.do">
		<div class="form-group">
			<label class="col-sm-2 control-label" for="employeeNo" style="height: 34px; text-align: center; line-height: 34px;">employeeNo</label>
			<div class="col-sm-10">
				<input type="number" class="form-control" name="employeeNo" id="employeeNo">
			</div>
		</div>
	  </form>
	
         <li class="col-sm-2 col-xs-12" style="padding: 0;"><a href="#">직원정보 조회</a></li>
      
      <form method="post" action="${initParam.rootPath }/read_employeeNo.do">

		<div class="form-group">
			<label class="col-sm-2 control-label" for="employeeNo" style="height: 34px; text-align: center; line-height: 34px;">employeeNo</label>
			<div class="col-sm-10">
				<input type="number" class="form-control" name="employeeNo" id="employeeNo">
			</div>
		</div>
	</form>
      </ul>
   </div>
