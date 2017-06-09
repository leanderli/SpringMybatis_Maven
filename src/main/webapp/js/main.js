/**
 * Created by Administrator on 2017/6/6.
 */
var xmlHttpRequest;
function createXmlHttpRequest() {
    if (window.XMLHttpRequest) {
        xmlHttpRequest = new XMLHttpRequest();
    } else if (window.ActiveXObject) {
        xmlHttpRequest = new ActiveXObject("Microsoft.XMLHTTP");
    } else {
        alert('Your browser is too old to not support XMLHTTPREQUEST！');
    }
}

function usersReg() {
    if (xmlHttpRequest == null) {
        createXmlHttpRequest();
    }
    var uName = document.getElementById('usersName').value;
    var uPwd = document.getElementById('usersPwd').value;
    var uTel = document.getElementById('usersTel').value;
    var uEmail = document.getElementById('usersEmail').value;
    var uAddress = document.getElementById('usersAddress').value;
    var url = 'users_reg?usersname=' + uName
        + '&userspwd=' + uPwd
        + '&userstel=' + uTel
        + '&usersemail=' + uEmail
        + '&usersaddress=' + uAddress;
    xmlHttpRequest.open('post', url, true);
    xmlHttpRequest.onreadystatechange = callBackFunc;
    xmlHttpRequest.send(null);
}

function callBackFunc() {
    if (xmlHttpRequest.readyState == 4) {
        if (xmlHttpRequest.status == 200) {
            alert(xmlHttpRequest.responseText);
        }
    }
}