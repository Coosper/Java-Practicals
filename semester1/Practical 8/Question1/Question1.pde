float num1;
float num2;

void draw() {
  num1 = random(0,100);
  num2 = random(0,100);
  add(num1, num2);
  noLoop();
}

void add(float num1In, float num2In)
{
  float total;
  total = num1 + num2;
  text(total, width/2, height/2);
}
