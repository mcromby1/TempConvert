package tempconvert;

import javax.swing.UIManager;
import tempconvertGUI.TempConvertMainGUI;

/**
 *
 * @author Matthew
 */
public class TempConvert {

    public static void main(String args[]) {
       
        try {
            javax.swing.UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TempConvertMainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TempConvertMainGUI().setVisible(true);
            }
        });
    }

}
