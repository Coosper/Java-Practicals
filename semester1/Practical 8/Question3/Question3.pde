float num;

void draw() {
  num = random(0,100);
  square(num);
  noLoop();
}

void square(float numIn) {
  float area;
  area = num * num;
  text(area, width/2, height/2);
}
