void setup() 
{
size(500,500);
fill(0);
}

float x = 0;

void draw()
{

if(x < 500)
{
background(200);
rect(x,250,50,50);
x= x + 9;
}
else if(x >= 400)

{
  x = 0;
}

}
