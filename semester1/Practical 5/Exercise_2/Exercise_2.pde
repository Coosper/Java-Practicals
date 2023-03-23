size(1100,1100);
background(150);

int c = 0;

while(c<=width)
{
  line(c,0,c,width);
  line(0,c,width,c);
  c = c+width/10;
}
 
  
