void setup()
{
  size(500,400);
  background(0);
}

void draw()
{
  if(mousePressed) //Makes the program know what to do when the mouse is pressed.
  {
    ellipse(mouseX, mouseY, 100, 100);
  }
  
  stroke(255);
  fill(255,0,0);
}
