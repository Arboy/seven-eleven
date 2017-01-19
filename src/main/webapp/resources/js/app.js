/*
/!**
 * Created by JPMPC-B209 on 11/24/2016.
 *!/
var n = 5;
var x = 7;
var sum = n+x;
document.getElementById("result").innerHTML = "The result is " + (n+x);

var mySubmitBtn = document.getElementById("submit-Btn");
mySubmitBtn.onclick = function(event) {
    event.preventDefault();
    mySubmitBtn.style.display = "none";
};

$("").fadeOut();
var aud = document.getElementById("myAudio");

function changeText(str) {
    var audio = document.getElementById("audPlayPause");
    var audioStop = document.getElementById("audstop");
    if(str == "playAndPause"){
        if(audio.value=='Play'){
            audio.value="Pause";
            aud.play();
        }else{
            audio.value="Play";
            aud.pause();
        }
    }
    if(str == "Stop"){
        aud.currentTime = 0;
        aud.pause();
        audio.value="Play";
    }

}
function stop() {
    var clickStop = document.getElementById("audPlayPause");
    vid.currentTime=0;
    vid.pause();
    clickStop.value="Play";

}


var vid = document.getElementById("myVideo");

function changeName() {
    var video = document.getElementById("vidPlayPause");

    if(video.value=='Play')
    {
        video.value="Pause";
        vid.play();
    }else{
        video.value="Play";
        vid.pause();
    }

}
function stop() {
    var clickStop=document.getElementById("vidPlayPause");
    vid.currentTime=0;
    vid.pause();
    clickStop.value="Play";
    
}
function fullscreen() {
    vid.webkitRequestFullscreen();

}


$("#btn").click(function() {
    divIsion();

    setInterval(function () {
        divIsion();
    },1000);
});

    function divIsion() {

        var $colorList = Array ("yellow","light blue", "red", "green");

        var $divClick =$("div");

        for(var i = 0; i <= $divClick.length; i++) {
            var $shuffle = Math.floor(Math.random()*4);
            var $divRun = Math.floor(Math.random()*$divClick.length);

            $divClick[$divRun].style.backgroundColor=$colorList[$shuffle];

        }

    }

/!*<--------------------------------------------------------------------------------------------->*!/

/!*
$("#demo-btn").click(function () {


$.ajax({
    method:"GET",
    url:"ajax_info.json",
    dataType:"json",
    error:function (a,b,c) { //input peremetres a. error 404 b. display will show ERROR c. the display will show NOT FOUND
        console.log(b)
    },
    success:function(data) {
        /!*$("#demo").html(response);*!/
        //console.log(c)

        /!*for (var x = 0; x < data.employees.length; x++) {
         $("#demo-div").append("<br>" + data.employees[x].firstName + " " + data.employees[x].lastName + "</br>");
         }*!/

        $.each(data.employees, function (i, field) {
            $("#demo-div").append("<br>" + i +". "+ field.firstName + " " + field.lastName + "</br>");
           alert(i);
        });

    }
});
});
*!/
/!*$(".action a").click(function (e) {
    e.preventDefault();
})*!/

/!*$("#demo-btn").click(function(){
    $.ajax({

        method:'GET',
        url:'js/facebook.json',
        dataType:'json',
        error:function(){
            alert('error');
        },
        success:function(data){*!/
           /!* result = "";
            $.each(response.data,function(a,field){
                result += "<div class='boxResult'><div class=\"boxResIn\"><span class='label'>ID:</span>"
                    +field.id+"<br/><span class='label'>FROM:</span> "+ field.from.name+ field.id+
                    "<br/><span class='label'>MESSAGE</span>: "+field.message+
                    "<br/><span class='label'>ACTIONS:</span> "+
                    " "+ field.actions[0].name+
                    " "+ field.actions[1].link+
                    "<br/><span class='label'>TYPE:</span> "+field.type+
                    "<br/><span class='label'>CREATED TIME:</span> "+ field.created_time+
                    "<br/><span class='label'>UPDATED TIME:</span> "+field.updated_time


                    +"</div></div><br/>";
            });
            $('#demo-div').html(result);*!/
           /!* $.ajax({
                method: 'GET',
                url   : 'js/facebook.json',
                dataType: "json",
                error: function(a,b,c){
                    console.log(a);
                },
                success: function(data){
                    /!* $.each(data.employees, function(i,emp){
                     $("#result").append("<div>"+emp.firstName+", "+emp.lastName+"</div>");
                     });*!/

                    /!* for(var i = 0; i < data.employees.length; i++) {
                     //console.log(data.status[i].username);
                     $("#result").append("<div>"+data.employees[i].firstName+", "+data.employees[i].lastName+"</div>");
                     }*!/

                    $.each(data.data, function(i,field){
                        $("#demo-div").append("<div id="+field.id+" class=\"fb-feeds\">"+
                            "<div class=\"from\">"+field.from.name+"<span class='f-right medium-text'><a data-id="+field.id+" id='removeDiv' href='#' title='Remove this'>X</a></span></div>"+
                            "<div class=\"message\">"+field.message+"</div>"+
                            "<div class=\"actions\">"+
                            "<ul>"+
                            "<li><a href="+field.actions[1].link+">"+field.actions[1].name+"</a></li>"+
                            "<li>|</li>"+
                            "<li><a href="+field.actions[0].link+">"+field.actions[0].name+"</a></li>"+
                            "</ul>"+
                            "<div>"+
                            "</div>");
                    });
                }

        });


    $(document).on("click","#removeDiv",function(event){
        event.preventDefault();

        var unique_id = $(this).attr("data-id");

        $("#"+unique_id).fadeOut();*!/
   //    });


/!*$(document).on("click","#submit-Btn", function(event){
    event.preventDefault();
/!*if(typeof(Storage) !== "undefined") {
            if (sessionStorage.clickcount) {
                sessionStorage.clickcount = Number(sessionStorage.clickcount)+1;
            } else {
                sessionStorage.clickcount = 1;
            }
            document.getElementById("submit-Btn").innerHTML = "You have clicked the button " + sessionStorage.clickcount + " time(s) in this session.";
        } else {
            document.getElementById("submit-Btn").innerHTML = "Sorry, your browser does not support web storage...";
        }*!/

    //var get = $(this).attr("d");

    localStorage.setItem("name", $("#firstName").val());
    localStorage.setItem("email", $("#email").val());
    localStorage.setItem("mobile number", $("#mobileNumber").val());*!/

    //$("#submit-Btn").hide();
});

    /!*$(document).ready(function () {
        if(typeof localStorage.getItem("name") == null || (localStorage.getItem("email")) == null || (localStorage.getItem("mobile number")))
        {
            $("#submit-Btn").show(); }
        else {
                $("#submit-Btn").hide();*!/
        }




    });





*/
