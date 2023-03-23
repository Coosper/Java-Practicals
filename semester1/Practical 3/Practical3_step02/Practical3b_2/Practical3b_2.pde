void setup() 
{
size(500,500);
fill(0);
}

float x = 0;

void draw()
{
background(200);
rect(x,250,50,50);
x= x + 9;
}
