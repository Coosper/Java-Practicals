void setup()
{
  size(400,400);
  background(0);
  textAlign(CENTER);
  textSize(24);
  fill(255);
  text("The mouse has done nothing", width/2, height/2);
}

void draw()
{
}

void mouseMoved()
{
  background(150,10,70);
  text("Mouse was moved!",width/2, height/2);
}

void mouseDragged() {
  background(10,70,100);
  text("The mouse was dragged!", width/2, height/2);
}

void mouseReleased() {
  background(100,0,100);
  text("The mouse was released!", width/2, height/2);
}

void mousePressed() {
  background(100,100,0);
  text("The mouse was pressed", width/2, height/2);
  if(mouseButton == LEFT) { 
    text("and it was the left button", width/2, height/2 + 40);
  }
  else if (mouseButton == RIGHT) {
    text("and it was the right button", width/2, height/2 + 40);
  }
}
  
