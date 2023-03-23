void setup()
{
  size(500,500);
}

void draw()
{
background(169);
stroke(255);
fill(255);
ellipse(mouseX, mouseY, mouseY, mouseY);
stroke(0);
fill(0);
ellipse(mouseY, mouseX, mouseX, mouseX);
}
