/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package JFrame;

/**
 *
 * @author cabalhaoma_sd2082
 */
import javax.swing.*;
import java.awt.event.*;

public class MyLogin {
    private JFrame f = new JFrame ("Login");
    private JButton bok = new JButton ("OK");
    
    public MyLogin(){
        f.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        f.getContentPane().add(bok);
        
       bok.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				f.dispose();
				new SecondFrame();
			}
		});
		f.setSize(300,300);
		f.setVisible(true);
                bok.setSize(100,100);
                bok.setVisible(true);
	}
    public static void main(String[] args){
        new MyLogin();
    
    }
}
    

