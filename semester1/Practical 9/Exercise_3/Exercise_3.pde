import javax.swing.*;

int num1;
int num2;
int num3;
int num4;
int num5;

num1 = Integer.parseInt(JOptionPane.showInputDialog(
"Please enter the first number:\n\n ", JOptionPane.QUESTION_MESSAGE));

num2 = Integer.parseInt(JOptionPane.showInputDialog(
"Please enter the second number:\n\n ", JOptionPane.QUESTION_MESSAGE));

num3 = Integer.parseInt(JOptionPane.showInputDialog(
"Please enter the third number:\n\n ", JOptionPane.QUESTION_MESSAGE));

num4 = Integer.parseInt(JOptionPane.showInputDialog(
"Please enter the fourth number:\n\n ", JOptionPane.QUESTION_MESSAGE));

num5 = Integer.parseInt(JOptionPane.showInputDialog(
"Please enter the fifth number:\n\n ", JOptionPane.QUESTION_MESSAGE));

JOptionPane.showMessageDialog(null,
"The first number was " + num1);

JOptionPane.showMessageDialog(null,
"The second number was " + num2);

JOptionPane.showMessageDialog(null,
"The third number was " + num3);

JOptionPane.showMessageDialog(null,
"The fourth number was " + num4);

JOptionPane.showMessageDialog(null,
"The fifth number was " + num5);
