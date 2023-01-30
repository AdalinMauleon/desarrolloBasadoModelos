import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingObserverExample{
    JFrame frame;

    /**
     * @param args
     */
    public static void main(String[] args){
        SwingObserverExample example = new SwingObserverExample();
        example.go();

    }
    public void go(){
        
        JButton button = new JButton("Should I do It ?");
        
        button.addActionListener(new AngelListener());
        button.addActionListener(new DevilListener());
        frame.getContentPane().add(BorderLayout.CENTER, button);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(BorderLayout.CENTER, button);
        
        frame.setSize(300,300);
        frame.setVisible(true);
        
    }

    class AngelListener implements ActionListener{
        public void actionPerformed(ActionEvent event){
            System.out.println("Dont´t do it, you might regret it!");
            }
     }

     class DevilListener implements ActionListener{
        public void actionPerformed(ActionEvent event){
            System.out.println("Come on, do it!");
            }
     }
}
