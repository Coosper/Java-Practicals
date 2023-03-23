float num;

void draw() {
  num = random(0,100);
  square1(num);
  cube(num);
  noLoop();
}

void square1(float numIn) {
  float SquareArea;
  SquareArea = num * num;
  text(SquareArea, width/2, height/2);
}

void cube(float num) {
  float CubeArea;
  CubeArea = 6*(num*num);
  text(CubeArea, 10, 20);
}
