import javax.swing.JFrame;
public class frame {
    
public class frame extends JFrame{
    frame(){ 
        OurPanel panelg = new OurPanel();
        this.add(panelg); 
        this.setTitle("Francisco's Snake Game!!");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        this.setResizable(false); 
        this.pack();
        this.setLocationRelativeTo(null); 
        this.setVisible(true); 
    }
    
}
    
}
