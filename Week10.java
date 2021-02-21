import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.applet.*;
import java.lang.String;
import java.util.Scanner;
public class Week10 extends Frame implements ActionListener
{
Dialog d;
TextField t1,t2,t3;
Button comp;
public Week10()
{
setLayout(new FlowLayout());
setSize(500,500);
t1=new TextField(10);
t2=new TextField(10);
t3=new TextField(10);
comp=new Button("Compute ");
add(new Label("Enter a: "));
add(t1);
add(new Label("Enter b: "));
add(t2);
add(new Label("Result : "));
add(t3);
add(comp);
comp.addActionListener(this);
setVisible(true);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==comp)
{
try
{
t3.setText(Integer.toString((Integer.parseInt(t1.getText().trim()))/(Integer.parseInt(t2.getText().trim()))));
}
catch(ArithmeticException aex)
{
Dia d1=new Dia("Arithmetic Exception");
d1.setVisible(true);
}
catch(NumberFormatException nfe)
{
Dia d2=new Dia("Number Format Exception ");
d2.setVisible(true);
}
}
}
public static void main(String ar[])
{
new Week10();
}
}
class Dia extends Dialog implements ActionListener
{
Button cancel;
Dia(String str)
{
super(new Frame(),str,true);
cancel=new Button("Cancel");
setLayout(new FlowLayout());
setSize(300,200);
add(new Label("Press the Button"));
add(cancel);
cancel.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
{
setVisible(true);
}
public void paint(Graphics g)
{
g.drawString("Exception Occured ",10,70);
}
}
