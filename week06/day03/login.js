'use strict'

function switchShowHide() {

  var toShow = document.getElementById("password");
  var eyeImage = document.getElementById("image");
  if (toShow.type === "password") {
      toShow.type = "text";
      eyeImage.src = "eye2.png";
  } else {
      toShow.type = "password";
      eyeImage.src = "eye.png";
  }
}