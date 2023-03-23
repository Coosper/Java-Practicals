void setup() {
  size(500,100);
}
  
  float age1;


void draw() {
  age1 = random(0,50);
  age(age1);
  noLoop();
}

void age(float age1In) {
  if(age1 >= 19)
  {
    text("You are " + age1 + " years old and old enough to drink", 10, height/2);
  }
  else {
    text("You are " + age1 + " years old and too young to drink.", 10, height/2);
  }
}
