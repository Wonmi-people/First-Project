<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <!-- Header -->
    <%@include file="../inc/header.jsp" %>
    <!-- Header End -->
s
</head>
<body>
    <div class="wrap">
        <!-- Main -->
        <div class="back">
            <div class="div-center">
                <div class="content">
                    <h3>Member Sign In</h3>
                    <hr />
                    <form name="memberSignInForm" id="adminLoginForm" method="post" onsubmit="return false;">
                        <div class="form-group">
                            <label for="member_id">ID</label>
                            <input type="text" name="member_id" id="member_id" placeholder="Manager ID" value="user">
                        </div>
                        <div class="form-group">
                            <label for="member_password">Password</label>
                            <input type="password" name="member_password" id="member_password" placeholder="Manager Password" value="userpw">
                        </div>
                        <hr />
                        <div class="text-center">
                            <button type="button" class="btn btn-primary" onclick="location.href='/member/signup'">Sign-Up</button>
                            <button type="button" class="btn btn-primary" onclick="signIn();">Sign-In</button>
                            <button type="button" class="btn btn-primary" onclick="location.href='/'">Cancel</button>
                        </div>
                    </form>
                </div>
                </span>
            </div>
        </div>
    </div>
</body>
</html>