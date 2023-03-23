float mark;
mark = random(0,100);

if ((mark >= 90) && (mark <= 100))
{
  println("Grade A");
}
else if((mark >= 75) && (mark <= 89))
{
  println("Grade B");
}
else if((mark >= 55) && (mark <= 74))
{
  println("Grade C");
}
else if((mark >= 40) && (mark <= 54))
{
  println("Grade D");
}
else {
  println("Grade E");
}
