float radius;

void draw() {
  radius = 15;
  area();
  noLoop();
}

void area(float radiusIn) {
float result = 3.1416 * radius*2;
text(result,width/2,height/2);
}
  
