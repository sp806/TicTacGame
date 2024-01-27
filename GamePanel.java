/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoegame3;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Deepak
 */
public class GamePanel implements ActionListener
{
    JFrame jf;
    JButton jb1, jb2, jb3, jb4, jb5, jb6, jb7, jb8, jb9;
    
    int count=0;
    String xo_value="", title_str="";
    boolean win=false;
    Color color1;
    
    String player1, player2;
    String player_who_wins;
    
    boolean player1_turn=true;
    int total_series;
    int series_count=1;
    
    int player1_win_count=0, player2_win_count=0;
    
    GamePanel(String player1, String player2, int total_series)
    {
        this.player1=player1;
        this.player2=player2;
        this.total_series=total_series;
    }
    
    void openGamePanel()
    {
        jf=new JFrame();
        jf.setTitle(player1+" (X) turns");
        jf.setSize(500,500);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLayout(new GridLayout(3, 3));
        
        jb1=new JButton();
        jb1.addActionListener(this);
        jf.add(jb1);
        
        jb2=new JButton();
        jb2.addActionListener(this);
        jf.add(jb2);
        
        jb3=new JButton();
        jb3.addActionListener(this);
        jf.add(jb3);
        
        jb4=new JButton();
        jb4.addActionListener(this);
        jf.add(jb4);
        
        jb5=new JButton();
        jb5.addActionListener(this);
        jf.add(jb5);
        
        jb6=new JButton();
        jb6.addActionListener(this);
        jf.add(jb6);
        
        jb7=new JButton();
        jb7.addActionListener(this);
        jf.add(jb7);
        
        jb8=new JButton();
        jb8.addActionListener(this);
        jf.add(jb8);
        
        jb9=new JButton();
        jb9.addActionListener(this);
        jf.add(jb9);
        
        jf.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        count=count+1;
        if(player1_turn==true)
        {
            color1=Color.yellow;
            xo_value="X";
            
            title_str="0";
            jf.setTitle(player2+" ("+title_str+") turns");
            
            player1_turn=false;
        }
        else
        {
            xo_value="0";
            color1=Color.red;
            title_str="X";
            jf.setTitle(player1+" ("+title_str+") turns");
            
            player1_turn=true;
        }
        
        if(e.getSource()==jb1)
        {
            jb1.setBackground(color1);
            jb1.setFont(new Font("Arial", 1, 50));
            jb1.setText(xo_value);
            jb1.setEnabled(false);
        }
        if(e.getSource()==jb2)
        {
            jb2.setBackground(color1);
            jb2.setFont(new Font("Arial", 1, 50));
            jb2.setText(xo_value);
            jb2.setEnabled(false);
        }
        if(e.getSource()==jb3)
        {
            jb3.setBackground(color1);
            jb3.setFont(new Font("Arial", 1, 50));
            jb3.setText(xo_value);
            jb3.setEnabled(false);
        }
        if(e.getSource()==jb4)
        {
            jb4.setBackground(color1);
            jb4.setFont(new Font("Arial", 1, 50));
            jb4.setText(xo_value);
            jb4.setEnabled(false);
        }
        if(e.getSource()==jb5)
        {
            jb5.setBackground(color1);
            jb5.setFont(new Font("Arial", 1, 50));
            jb5.setText(xo_value);
            jb5.setEnabled(false);
        }
        if(e.getSource()==jb6)
        {
            jb6.setBackground(color1);
            jb6.setFont(new Font("Arial", 1, 50));
            jb6.setText(xo_value);
            jb6.setEnabled(false);
        }
        if(e.getSource()==jb7)
        {
            jb7.setBackground(color1);
            jb7.setFont(new Font("Arial", 1, 50));
            jb7.setText(xo_value);
            jb7.setEnabled(false);
        }
        if(e.getSource()==jb8)
        {
            jb8.setBackground(color1);
            jb8.setFont(new Font("Arial", 1, 50));
            jb8.setText(xo_value);
            jb8.setEnabled(false);
        }
        if(e.getSource()==jb9)
        {
            jb9.setBackground(color1);
            jb9.setFont(new Font("Arial", 1, 50));
            jb9.setText(xo_value);
            jb9.setEnabled(false);
        }
        winningPossibilities();
        whoWins();
    }
    
    void winningPossibilities()
    {
        //horizontal winning possibilities
        if(jb1.getText()==jb2.getText() && jb2.getText()==jb3.getText() && jb3.getText() != "")
        {
            win=true;
        }
        else if(jb4.getText()==jb5.getText() && jb5.getText()==jb6.getText() && jb6.getText() != "")
        {
            win=true;
        }
        else if(jb7.getText()==jb8.getText() && jb8.getText()==jb9.getText() && jb9.getText() != "")
        {
            win=true;
        }
        //vertical winning possibilities
        else if(jb1.getText()==jb4.getText() && jb4.getText()==jb7.getText() && jb7.getText() != "")
        {
            win=true;
        }
        else if(jb2.getText()==jb5.getText() && jb5.getText()==jb8.getText() && jb8.getText() != "")
        {
            win=true;
        }
        else if(jb3.getText()==jb6.getText() && jb6.getText()==jb9.getText() && jb9.getText() != "")
        {
            win=true;
        }
        //diagonal winning possibilities
        else if(jb1.getText()==jb5.getText() && jb5.getText()==jb9.getText() && jb9.getText() != "")
        {
            win=true;
        }
        else if(jb3.getText()==jb5.getText() && jb5.getText()==jb7.getText() && jb7.getText() != "")
        {
            win=true;
        }
        //game draw
        else
        {
            win=false;
        }
    }
    void whoWins()
    {
        if(win==true)
        {
            series_count=series_count+1;
            
            if(xo_value.equals("X"))
            {
                player_who_wins=player1;
                player1_win_count=player1_win_count+1;
            }
            else 
            {
                player_who_wins=player2;
                player2_win_count=player2_win_count+1;
            }
            
            String win_title=player_who_wins+" ("+xo_value+")"+" wins";
            jf.setTitle(win_title);
            JOptionPane.showMessageDialog(jf, win_title);
            restartGame();
        }
        else if(win==false && count==9)
        {
            series_count=series_count+1;
            JOptionPane.showMessageDialog(jf, "Match Draw");
            restartGame();
        }
    }
    void restartGame()
    {
        if(total_series>=series_count)
        {
            int i=JOptionPane.showConfirmDialog(jf, "Do you want to restart the game ?");
            if(i==0)
            {
                jb1.setText("");
                jb2.setText("");
                jb3.setText("");
                jb4.setText("");
                jb5.setText("");
                jb6.setText("");
                jb7.setText("");
                jb8.setText("");
                jb9.setText("");

                jb1.setBackground(null);
                jb2.setBackground(null);
                jb3.setBackground(null);
                jb4.setBackground(null);
                jb5.setBackground(null);
                jb6.setBackground(null);
                jb7.setBackground(null);
                jb8.setBackground(null);
                jb9.setBackground(null);

                btnSetEnabling(true);
                count=0;
                win=false;

                if(player_who_wins.equals(player1))
                {
                    player1_turn=true;
                }
                else
                {
                    player1_turn=false;
                }

                jf.setTitle(player_who_wins+" ("+xo_value+") turns");

            }
            else if(i==1)
            {
                System.exit(0);
            }
            else
            {
                btnSetEnabling(false);
            }
        }
        else
        {
            JOptionPane.showMessageDialog(jf, "Series Completed...!!");
            if(player1_win_count>player2_win_count)
            {
                //JOptionPane.showMessageDialog(jf, player1+" win the series");
                new WhoWinSeries(player1+" win the series");
                jf.setVisible(false);
            }
            else if(player2_win_count>player1_win_count)
            {
                //JOptionPane.showMessageDialog(jf, player2+" win the series");
                new WhoWinSeries(player2+" win the series");
                jf.setVisible(false);
            }
            else
            {
                //JOptionPane.showMessageDialog(jf, "Series Draw");
                new WhoWinSeries("Series Draw");
                jf.setVisible(false);
            }
        }
    }
    void btnSetEnabling(boolean b)
    {
        jb1.setEnabled(b);
        jb2.setEnabled(b);
        jb3.setEnabled(b);
        jb4.setEnabled(b);
        jb5.setEnabled(b);
        jb6.setEnabled(b);
        jb7.setEnabled(b);
        jb8.setEnabled(b);
        jb9.setEnabled(b);
    }
}
