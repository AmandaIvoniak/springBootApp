
$(document).ready(function () {
  var allClasses;
  var allStudents;
  getClass();
  getStudentTable();
  openClass();
  $("#student").keyup(function(){
    var nameValidate = $("#student").val();
    if(nameValidate.length>=3) verifyName(nameValidate)
  });
});

function verifyName(nameValidate){
  var situation = false;
  var btnSubmit = $("#btnSubmitStudent");

  allStudents.forEach(element => {
    if(element.student === nameValidate) situation = true;
  });
  situation === true ? btnSubmit.prop('disabled', true) : btnSubmit.prop('disabled', false);
}

function getClass(){
  var classList = document.getElementById("classInformation");
  $.ajax({
    type: "POST",
    url: "/getClass",
    success: function (data) {
        var info = JSON.parse(JSON.stringify(data));
        allClasses = info;
        for (let i = 0; i < info.length; i++) {
           classList.innerHTML += '<tr>'+
                                      '<td>'+info[i].name+'</td>'+
                                      '<td>'+info[i].teacher+'</td>'+
                                      '<td>'+info[i].id+'</td>'+
                                    '</tr>';
        }
    }
  });  
}

function getStudentTable(){
  var studentList = document.getElementById("studentInformation");
    $.ajax({
      type: "POST",
      url: "/getStudent",
      success: function (data) {
          var info = JSON.parse(JSON.stringify(data));
          allStudents = info;
          for (let i = 0; i < info.length; i++) {
             studentList.innerHTML += '<tr>'+
                                        '<td>'+info[i].className+'</td>'+
                                        '<td>'+info[i].student+'</td>'+
                                      '</tr>';
          }
      }
  });
}

function openClass(){
  $.ajax({
    type: "POST",
    url: "/getClassOpen",
    success: function (data) {
        var info = JSON.parse(JSON.stringify(data));  
        console.log(info)
        var classSelect = document.getElementById("classSelect");
        for (let i = 0; i < info.length; i++) {
          classSelect.innerHTML += '<option value="'+info[i].id+'">'+info[i].className+'</option>';
        }
    }
  }); 

  //IMPLEMENTAR OUTRO AJAX PARA PUXAR O NOME OU PUXAR DE UM JS QUE JA TROUXE
}



