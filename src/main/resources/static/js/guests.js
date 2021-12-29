var input = document.getElementById("lastNameInput");

input.addEventListener("keyup", function(event) {
  if (event.keyCode === 13) {
    event.preventDefault();
    reloadPageForDateSelection();
  }
});

function getRequestParam(p){
    return (window.location.search.match(new RegExp('[?&]' + p + '=([^&]+)')) || [, null])[1];
};

function reloadPageForDateSelection(){
    var lastName = document.getElementById('lastNameInput').value;
    var redirectLink = window.location.protocol + "//" + window.location.host + window.location.pathname + '?lastName=' + lastName;
    console.log('Redirecting to: ' + redirectLink);
    window.location.href = redirectLink;
};

$(document).ready(function(){
    setPicker();
    setInitialDate();

});