void setup()
{
  size(500,500);
  background(150);
}

float diameter = 100;
float subtraction = 10;

void draw()
{
  if(mousePressed==true&&mouseButton==LEFT)
  {
    if(diameter>50)
  {
  diameter=diameter-subtraction;
  }
  }
  ellipse(mouseX,mouseY,diameter,diameter);
}
