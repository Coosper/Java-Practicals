import javax.swing.*;



int reply = JOptionPane.showConfirmDialog(
null,"Did you watch Game of Thrones?","TV Question!", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE
);

if (reply == JOptionPane.YES_OPTION) {
  JOptionPane.showMessageDialog(null,"I wish it was still on...");
} else if (reply == JOptionPane.NO_OPTION) {
  JOptionPane.showMessageDialog(null,"You should definitely start watching it");
}
