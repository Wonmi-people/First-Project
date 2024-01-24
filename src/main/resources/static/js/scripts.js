/*!
* Start Bootstrap - One Page Wonder v6.0.6 (https://startbootstrap.com/theme/one-page-wonder)
* Copyright 2013-2023 Start Bootstrap
* Licensed under MIT (https://github.com/StartBootstrap/startbootstrap-one-page-wonder/blob/master/LICENSE)
*/
// This file is intentionally blank
// Use this file to add JavaScript to your project

// JSON API call
const jsonAPI = async(url, method, data) => {
    try {
        const response = await fetch(url, {
            method : method,
            headers : {"Content-Type" : "application/json"},
            body : JSON.stringify(data)
        })
        console.log(JSON.stringify(response))
        return await response.json();
    } catch (e) {
        console.log(` 오류 : ${e}`);
        return e;
    }
}

// Form API call
const formAPI = async(url, method, data) => {
    try {
        const response = await fetch(url, {
            method : method,
            headers : {"Content-Type" : "application/json"},
            body : new FormData(document.getElementById(data))
        })
        console.log(JSON.stringify(response));
        return await response.json();
    } catch (e) {
        console.log(` 오류 : ${e}`);
        return e;
    }
}

// empty check
const isEmpty = (str) => {
    return (str == '' || str == undefined || str == null || str == 'null' );
}

// Sign-in
const signIn = () => {
    const id = document.getElementById('member_id').value;
    const password = document.getElementById('member_password').value;

    if(isEmpty(id)){
        alert("ID를 입력하세요.");
        return false;
    }

    if(isEmpty(password)){
        alert("Password를 입력하세요.");
        return false;
    }

    const data = {
        "member_id" : id,
        "member_password" : password
    }

    const signIn = jsonAPI("/signin", "POST", data);
    if(signIn.result === "OK"){
        location.href ='';
    } else {
        alert("");
    }
}