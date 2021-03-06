
$(document).ready(function () {
  var allClasses;
  var allStudents;

  var ordenation = new Promise(function(resolve, reject){
    resolve(getStudent());
  });
  ordenation.then(getClass());
});

function getClass(){
  $.ajax({
    type: "POST",
    url: "/getClass",
    async:false,
    success: function (data) {
        var info = JSON.parse(JSON.stringify(data));
        allClasses = info;        
    }
  });
  createTables(allClasses, allStudents);
}

function getStudent(){
    $.ajax({
      type: "POST",
      url: "/getStudent",
      async: false,
      success: function (data) {
        var info = JSON.parse(JSON.stringify(data));
        allStudents = info;
      }
  });
}

function createTables(allClasses, allStudents){  
  var classSelect = document.getElementById("classSelect");
  var classList = document.getElementById("classInformation");
  var studentList = document.getElementById("studentInformation");
  var btnSubmit = $("#btnSubmitStudent");

  allClasses.length === 0 ? btnSubmit.prop('disabled', true) : btnSubmit.prop('disabled', false);
  
  allClasses.forEach(element => {
    var count = 0;

    for (let i = 0; i < allStudents.length; i++) {
      if(allStudents[i].className === element.id) count++;
    }
    if(count <= 4) classSelect.innerHTML += '<option value="'+element.id+'">'+element.name+'</option>';

    classList.innerHTML += '<tr>'+
                                '<td>'+element.name+'</td>'+
                                '<td>'+element.teacher+'</td>'+
                                '<td>'+count+'</td>'+
                              '</tr>';
  })

  allStudents.forEach(element => {
    for (let i = 0; i < allClasses.length; i++) {
      if(element.className === allClasses[i].id){
        studentList.innerHTML += '<tr>'+
                                '<td>'+allClasses[i].name+'</td>'+
                                '<td>'+element.student+'</td>'+
                              '</tr>';
      }
    }      
  });
}