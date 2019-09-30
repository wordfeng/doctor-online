const signUpButton = document.getElementById('signUp');
const signInButton = document.getElementById('signIn');
const container = document.getElementById('container');

// signUpButton = document.getElementById('signUp');
// signInButton = document.getElementById('signIn');
// container = document.getElementById('container');
//
// signInButton.addEventListener(type = "click", function (ev) {
//     container.classList.add("right-panel-active");
// });
// signInButton.addEventListener(type = "click", function (ev) {
//     container.classList.remove("right-panel-active");
// });

signUpButton.addEventListener('click', () => {
	container.classList.add("right-panel-active");
});

signInButton.addEventListener('click', () => {
	container.classList.remove("right-panel-active");
});


// document.getElementById('verificationCode').onclick = createVerificationCode();
// cvs.addEventListener('click', createVerificationCode(), false);
verifyCode = createVerificationCode();

//给html调用的获取验证码  为了返回验证码后期验证
function getVerifyCode() {
    verifyCode = createVerificationCode();
    // alert(verifyCode);
}


// $("#login_form").serialize();
// $("#login_btn").click(function () {
//
//     if (($("#certifyCode").val()).toUpperCase() == verifyCode) {
//
//     }else {
//         alert("验证码错误");
//         return false;
//     }
//     $.ajax({
//         // url: window.location.host + "/login",
//         // url:"http://localhost:8080/login?username="+$("#username").val()+"&password="+$("#password").val(),
//         url:"http://localhost:8080/html/login.html?username=贾名&password=feng",
//         type: "POST",
//         success: function (res) {
//             alert("===");
//             if (res.code == 100) {
//             window.location.href = 'http://localhost:8080/emp.jsp';
//             }
//         },
//         error:function () {
//             alert("登录失败");
//         }
//     });
//
// });


//获取验证码
function createVerificationCode() {
    code = "";
    var codeLength = 4;//验证码的长度
    var canvas = document.getElementById('verificationCode');//获取画布
    //所有候选组成验证码的字符
    var selectChar = new Array(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z');

    for (var i = 0; i < codeLength; i++) {
        var charIndex = Math.floor(Math.random() * 36);
        code += selectChar[charIndex];
    }
    if (canvas) {
        var ctx = canvas.getContext('2d');
        ctx.fillStyle = '#FFFFFF';
        ctx.fillRect(0, 0, 70, 27);
        ctx.font = "20px arial";
        ctx.strokeText(code, 5, 20);//画布上添加验证码
        return code;
    }
}
