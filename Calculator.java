

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Calculator implements ActionListener {
    Panel p,p2;
    JTextField t1,t2;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17;
    Frame f;
    char op;
    String s="";
    long a,one,two,cc=0;
    Calculator(){
        p=new Panel();
        t1=new JTextField();
        t2=new JTextField();
        b1=new Button("0");
        b2=new Button("1");
        b3=new Button("2");
        b4=new Button("3");
        b5=new Button("4");
        b6=new Button("5");
        b7=new Button("6");
        b8=new Button("7");
        b9=new Button("8");
        b10=new Button("9");
        b11=new Button("+");
        b12=new Button("-");
        b13=new Button("x");
        b14=new Button("/");
        b15=new Button("%");
        b16=new Button("=");
        b17=new Button("C");
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);
        b13.addActionListener(this);
        b14.addActionListener(this);
        b15.addActionListener(this);
        b16.addActionListener(this);
        b17.addActionListener(this);
        p.setLayout(new GridLayout(4,4,5,5));
        p.add(b8);
        p.add(b9);
        p.add(b10);
        p.add(b14);
        p.add(b5);
        p.add(b6);
        p.add(b7);
        p.add(b13);
        p.add(b2);
        p.add(b3);
        p.add(b4);
        p.add(b12);
        p.add(b16);
        p.add(b17);
        p.add(b1);
        p.add(b16);
        p.add(b11);
        f=new Frame("Calculator");
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        p2=new Panel(new GridLayout(2,0));
        t1.setFont(new Font("arial",Font.PLAIN,20));
        t2.setFont(new Font("arial",Font.BOLD,35));
        t2.setText("0");
        t1.setHorizontalAlignment(SwingConstants.RIGHT);
        t2.setHorizontalAlignment(SwingConstants.RIGHT);
        t1.setBorder(null);
        t2.setBorder(null);
        p2.add(t1);
        p2.add(t2);
        p.setVisible(true);
        p2.setVisible(true);
        f.add(p, BorderLayout.CENTER);
        f.add(p2,BorderLayout.NORTH);
        f.pack();
        f.setSize(400,400);
        f.setResizable(false);
        f.setVisible(true);
    }
    public static void main(String[]args){
        new Calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
     if (e.getSource()==b1||e.getSource()==b2||e.getSource()==b3||e.getSource()==b4||e.getSource()==b5||e.getSource()==b6||e.getSource()==b7||e.getSource()==b8||e.getSource()==b9||e.getSource()==b10){
         s +=((Button)e.getSource()).getLabel();
         t2.setText(s);
         if (cc>0){
             cc=0;
             one=0;two=0;}
     }
     if (e.getSource()==b11||e.getSource()==b12||e.getSource()==b13||e.getSource()==b14){
         op=((Button)e.getSource()).getLabel().charAt(0);
         t1.setText(t2.getText().toString()+op);
         s="";
     }
     if (e.getSource()==b17){
         t1.setText("");
         t2.setText("");
         cc=0;
         one=0;two=0;
         s="";
         t2.setText("0");
     }
     if (e.getSource()==b16) {
         if ((!t1.getText().toString().isEmpty() && !t2.getText().toString().isEmpty())||(t1.getText().toString().isEmpty() && !t2.getText().toString().isEmpty())) {
             s="";
             if (cc==0 && !t1.getText().isEmpty()){
             String ss = t1.getText().toString();
              a = ss.indexOf(op);
             one = Integer.parseInt(ss.substring(0, (int)a));
             two = Integer.parseInt(t2.getText().toString());
             cc++;
             s="";
             }
             /*if (cc>=1){
                 cc++;
             }*/
             if (op == '+') {
                 long c=one+two;
                 t2.setText(String.valueOf(c));
                 one=c;
                 t1.setText("");
                 cc++;
             }
             if (op == '-' ) {
                 long c=one-two;
                 t2.setText(String.valueOf(c));
                 one=c;
                 t1.setText("");
                 cc++;
             }
             if (op == 'x') {
                 long c=one*two;
                 t2.setText(String.valueOf(c));
                 one=c;
                 t1.setText("");
                 cc++;
             }
             try{
             if (op == '/') {
                 long c=one/two;
                 t2.setText(String.valueOf(c));
                 one=c;
                 t1.setText("");
                 cc++;
             }}
             catch (ArithmeticException w){
                 t1.setText("");
                 t2.setText("Result is Undefined");
             }
         }
     }
    }
}