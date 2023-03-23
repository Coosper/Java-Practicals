size(500,500);
background(150);

int c=0;

do
{
  line(c,0,c,width);
  line(0,c,width,c);
  c=c+width/8;
} while(c<=width);
  
  
