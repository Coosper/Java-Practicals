void setup()
{
  size(500,400);
  background(0);
}

void draw()
{
  if (mousePressed == true)
  {
    if (mouseButton == LEFT)
    {
      stroke(255);
      fill(255,0,0);
      ellipse(mouseX,mouseY,50,50);
    }
    
    else if (mouseButton == RIGHT)
    {
      stroke(255);
      fill(0,0,255);
      rect(mouseX,mouseY,50,50);
    }
    else
    {
      fill(0);
  }
}
}
      
  


  
