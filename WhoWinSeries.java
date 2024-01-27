/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoegame3;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Deepak
 */
public class WhoWinSeries
{
    WhoWinSeries(String message)
    {
        JFrame jf=new JFrame();
        jf.setSize(600,400);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLayout(null);
        
        JLabel jl=new JLabel(message);
        jl.setBounds(100, 100, 600, 50);
        jl.setFont(new Font("Arial", 1, 30));
        jl.setForeground(Color.red);
        jf.add(jl);
        
        jf.setVisible(true);
    }
}
