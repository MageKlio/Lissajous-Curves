import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame { //this is where the program starts

    /*    --------------------------------------------
          |      "PROGRAM" DEVELOPED BY "Klio" :3    |
          |       University of Trieste Student      |
          |               (First Year)               |
          --------------------------------------------

          First version of the program
     */

    public MyFrame(){
        initUI();
    }

    public void initUI(){
        ContentGlass mainContent = new ContentGlass();

        setContentPane(mainContent);

        //setting window parametres
        setTitle("Lissajous Curves");
        pack();
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String args[]) {
        System.setProperty("sun.java2d.opengl", "True");

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e){
            e.printStackTrace();
        }
        
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                MyFrame myFrame = new MyFrame();
                myFrame.setVisible(true);
            }
        });
    }


}
