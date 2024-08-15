import javax.swing.*;

public class App {

    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable(){
        @Override
        public void run() {
            //instantiate a rockpaperscissors gui obj
            RockPaperScissorsGUI rockPaperScissorsGUI = new RockPaperScissorsGUI();

            // display the GUI
            rockPaperScissorsGUI.setVisible(true);
             }
        });
    }
}
