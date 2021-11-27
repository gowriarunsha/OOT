/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gowri Arunsha
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Calc implements ActionListener{
    JFrame f;
    JButton add,sub,mul,div;
    JTextField tnum1,tnum2;
    JLabel res,fres,l1,l2;
    Calc()
    {
        f=new JFrame();
        f.setVisible(true);
        f.setSize(500,500);
        f.setLayout(new GridLayout(5,2));
        
        add=new JButton("Add");
        sub=new JButton("Subtract");
        mul=new JButton("Multiply");
        div=new JButton("Divide");
        
        
        
        tnum1=new JTextField();
        tnum2=new JTextField();
        
        l1=new JLabel("Number 1");
        l2=new JLabel("Number 2:");
        res=new JLabel("Result:");
        fres=new JLabel("");
        fres.setBackground(Color.BLUE);
        fres.setForeground(Color.GRAY);
        
        f.add(l1);
        f.add(tnum1);
        f.add(l2);
        f.add(tnum2);
        f.add(add);
        f.add(sub);
        f.add(mul);
        f.add(div);
        
        f.add(res);
        f.add(fres);
        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);
        
    }
    public void actionPerformed(ActionEvent e)
    {
        int num1=Integer.parseInt(tnum1.getText());
        int num2=Integer.parseInt(tnum2.getText());
        
        int res=0;
        if(e.getSource()==add)
        {
            res=num1+num2;
        }
        else if(e.getSource()==sub)
        {
            res=num1-num2;
        }
        else if(e.getSource()==mul)
        {
            res=num1*num2;
        }
        else if(e.getSource()==div)
        {
            res=num1/num2;
        }
        fres.setText(Integer.toString(res));
    }
}


public class CalculatorSwing{
    public static void main(String args[])
    {
        new Calc();
    }
}
