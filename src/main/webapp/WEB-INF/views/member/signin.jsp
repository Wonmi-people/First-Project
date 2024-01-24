<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <!-- Header -->
    <%@include file="../inc/header.jsp" %>
    <!-- Header End -->

</head>
<body>
<div class="wrap">
    <!-- Top -->
    <%@include file="../inc/top.jsp" %>
    <!-- Top End -->

    <!-- Main -->
    <div>
        <div>
            <div class="content">
                <h3>Member Sign In</h3>
                <hr />
                <form name="memberSignInForm" id="adminLoginForm" method="post" onsubmit="return false;">
                    <div class="form-group">
                        <label>ID</label>
                        <input type="text" name="member_id" id="member_id" placeholder="Manager ID" value="user">
                    </div>
                    <div class="form-group">
                        <label>Password</label>
                        <input type="password" name="member_password" id="member_password" placeholder="Manager Password" value="userpw">
                    </div>
<%--                    <div class="text-center">--%>
<%--                        <button type="button" class="btn btn-primary" onclick="javascript:signIn();">Sign-In</button>--%>
<%--                    </div>--%>

                    <hr />
                    <!--<button type="button" class="btn btn-link">Signup</button>-->
                </form>
            </div>
            </span>
        </div>
    <!-- Main End -->

    <!-- Footer -->
    <%@include file="../inc/footer.jsp" %>
    <!-- Footer End -->

</div>
</body>
</html>