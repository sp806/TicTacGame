/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoegame3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Deepak
 */
public class UserPanel implements ActionListener
{
    JFrame jf;
    JLabel jl1, jl2, jl3;
    JTextField jt1, jt2;
    JButton jb;
    JComboBox cb;
    
    UserPanel()
    {
        jf=new JFrame("TicTacToe Game by Deepak");
        jf.setSize(600,500);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLayout(null);
        
        jl1=new JLabel("Enter Player One:(X) ");
        jl1.setBounds(50, 50, 120, 30);
        jf.add(jl1);
        
        jt1=new JTextField();
        jt1.setBounds(200, 50, 250, 40);
        jf.add(jt1);
        
        jl2=new JLabel("Enter Player Two:(0) ");
        jl2.setBounds(50, 150, 120, 30);
        jf.add(jl2);
        
        jt2=new JTextField();
        jt2.setBounds(200, 140, 250, 40);
        jf.add(jt2);
        
        jl3=new JLabel("Select Series");
        jl3.setBounds(50, 250, 120, 30);
        jf.add(jl3);
        
        String[] series={"3", "5", "7", "9"};
        cb=new JComboBox(series);
        cb.setBounds(200, 250, 250, 40);
        jf.add(cb);
        
        
        jb=new JButton("Start Game");
        jb.setBounds(200, 350, 150, 50);
        jb.addActionListener(this);
        jf.add(jb);
        
        jf.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==jb)
        {
            String player1=jt1.getText();
            String player2=jt2.getText();
            
            String series=(String)cb.getSelectedItem();
            
            GamePanel gp=new GamePanel(player1, player2, Integer.parseInt(series));
            gp.openGamePanel();
            jf.setVisible(false);
        }
    }
}
