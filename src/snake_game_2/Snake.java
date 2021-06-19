package snake_game_2;

/**
 * Create by Anushka Agarwal on 19/01/2021
 */

import java.awt.EventQueue;
import javax.swing.JFrame;

// class to create the snake game frame

public class Snake extends JFrame {

	private static final long serialVersionUID = 1L;

	public Snake() {
        
        initUI();
    }
    
    private void initUI() {
        
        add(new Board());
        
        setResizable(false);
        pack();
        
        setTitle("Snake");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) {
        
        EventQueue.invokeLater(() -> {
            JFrame ex = new Snake();
            ex.setVisible(true);
        });
    }
}
