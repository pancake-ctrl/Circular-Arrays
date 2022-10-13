import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridLayout;
import java.awt.BorderLayout;




public class App  {

   
        int queue[];
        JLabel label;
        JTextField textField;
    
        public void App(){
            
            // JButton button = new JButton("Press to get queue number");
            JPanel panel = new JPanel();
            JFrame frame = new JFrame();
           
            // button.addActionListener(this);
 
            
            
            panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
            panel.setLayout(new GridLayout(0,1));
            // panel.add(label);
            // panel.add(textField);
            // panel.add(button);


             
            frame.add(panel, BorderLayout.CENTER);
            // frame.add(button);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setTitle("Outr GUI");
            // frame.setSize(800,400);
            // frame.setLocationRelativeTo(null);
            frame.pack();
            frame.setVisible(true);
    
            
    
        
        }
       
    //     @Override
    //    public void actionPerformed(ActionEvent e) {
    //        System.out.println("Hi");
           
    //    }
    
        
    public static void main(String[] args) {
  
        new App();

    }

}
