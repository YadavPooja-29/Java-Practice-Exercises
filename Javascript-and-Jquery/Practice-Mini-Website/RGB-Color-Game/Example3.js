var colours = randomColours(6);
 
// quesrSelector takes a CSS variable hence the full stop
var squares = document.querySelectorAll(".square");
var colourPicked = pickColour();
var winningColour = document.querySelector("#winningColour");
var message = document.querySelector("#message");
var h1 = document.querySelector("h1");
 
 
var numOfSquares = 6
var colors = []; 
var pickedColor;
var squares = document.querySelectorAll(".square");
var colorDisplay = document.getElementById("colorDisplay");
var messageDisplay = document.querySelector("#message");
var h1 = document.querySelector("h1");
var resetButton = document.querySelector("#reset");
var modeButtons = document.querySelectorAll(".mode");

init();

function init(){
  // mode buttons event listeners
  setupModeButtons();
  setupSquares();
 // this generates out colors for us
   reset(); 
}


function setupSquares(){
  for(var i = 0; i < squares.length; i++){
  // add click listeners to squares
  squares[i].addEventListener("click", function(){
    // grab color of clicked color
    var clickedColor = this.style.background;
  // compare with picked color
    if(clickedColor === pickedColor){
      messageDisplay.textContent = "Correct!";
    // change the text content of the button 
      resetButton.textContent = "Play Again?"
      changeColor(clickedColor);
      h1.style.background = clickedColor;
  // apply the change color function here for when 
  // the correct square is picked to change all 
  // other squares to the color of the correct square
    }else{
      this.style.background = "#232323";
      messageDisplay.textContent = "Try Again";
    }
  });  
 }
}

function setupModeButtons(){
 for (var i = 0; i < modeButtons.length; i++) {
  modeButtons[i].addEventListener("click", function(){
  // this takes care of removing the select class
  // for both the easy and hard mode
  modeButtons[0].classList.remove("selected");
  modeButtons[1].classList.remove("selected");
  // this is used to target and add
  // the selected class to the element that is clicked
  this.classList.add("selected");

  this.textContent === "Easy" ? numOfSquares = 3: numOfSquares = 6;
  
  reset();

   });
  }
}

function reset(){
  // generate new colors
  colors = generateRandomColor(numOfSquares);
  // pick a new random color
  pickedColor = pickColor();
  // change color display to match picked color
  colorDisplay.textContent = pickedColor;
  // change color of squares
  for(var i = 0; i < squares.length; i++){
    if (colors[i]){ 
      squares[i].style.display = "block";
      squares[i].style.background = colors[i];
    }else{
      squares[i].style.display = "none";
    };
    
  }
  // change the color of the h1 back to default black greyish color
  h1.style.background = "steelblue";
  resetButton.textContent = "New Color";
  messageDisplay.textContent = "";
}

resetButton.addEventListener("click", function(){
  // call the reset function created to reset the
  // game when we click the reset button
  reset();
});


// write a seperate function to change the background color
// of all the squares to the color of the correct square
function changeColor(color){
// loop through the squares to change each one
  for(var i = 0; i < squares.length; i++){
  squares[i].style.background = color;
  }
}

function pickColor(){
  var random = Math.floor(Math.random() * colors.length);
  return colors[random];
}

function generateRandomColor(num){
  // make an array
  var arr = [];
  // repeat num times
  for(var i = 0; i < num; i++){
  // push the random colors to the array
  // call the random function here
  arr.push(randomColor());
  }
  return arr;
}

// create a function that randomises the colors to
// be pushed to the random array
function randomColor(){
  // pick a "red" color between 0 -255
  var red = Math.floor(Math.random() * 256);
  // pick a "green" color between 0-255
  var green = Math.floor(Math.random() * 256);
  // pick a "blue" color between 0 -255
  var blue = Math.floor(Math.random() * 256);
  // then return a string with  each variable
  return "rgb(" + red + ", " + green + ", " + blue + ")";
}
