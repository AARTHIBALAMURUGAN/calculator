import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


public class calc extends Frame implements ActionListener {
    TextField txt;
    Button but1, but2, but3, but4, but5, but6, but7, but8, but9, but10, but11, but12, but13, but14, but15, but16;
   
    calc(){
        txt=new TextField("");
        txt.setBounds(50,50,220,30);

        but1=new Button("7");
        but1.setBounds(50,90,40,40);
        but1.addActionListener(this);

        but2=new Button("8");
        but2.setBounds(110,90,40,40);
        but2.addActionListener(this);

        but3=new Button("9");
        but3.setBounds(170,90,40,40);
        but3.addActionListener(this);

        but4=new Button("+");
        but4.setBounds(230,90,40,40);
        but4.addActionListener(this);

        but5=new Button("4");
        but5.setBounds(50,140,40,40);
        but5.addActionListener(this);

        but6=new Button("5");
        but6.setBounds(110,140,40,40);
        but6.addActionListener(this);

        but7=new Button("6");
        but7.setBounds(170,140,40,40);
        but7.addActionListener(this);

        but8=new Button("-");
        but8.setBounds(230,140,40,40);
        but8.addActionListener(this);

        but9=new Button("1");
        but9.setBounds(50,190,40,40);
        but9.addActionListener(this);

        but10=new Button("2");
        but10.setBounds(110,190,40,40);
        but10.addActionListener(this);

        but11=new Button("3");
        but11.setBounds(170,190,40,40);
        but11.addActionListener(this);

        but12=new Button("*");
        but12.setBounds(230,190,40,40);
        but12.addActionListener(this);

        but13=new Button("0");
        but13.setBounds(50,240,40,40);
        but13.addActionListener(this);

        but14=new Button("=");
        but14.setBounds(110,240,40,40);
        but14.addActionListener(this);

        but15=new Button("c");
        but15.setBounds(170,240,40,40);
        but15.addActionListener(this);

        but16=new Button("/");
        but16.setBounds(230,240,40,40);
        but16.addActionListener(this);

        add(txt);
        add(but1);
        add(but2);
        add(but3);
        add(but4);
        add(but5);
        add(but6);
        add(but7);
        add(but8);
        add(but9);
        add(but10);
        add(but11);
        add(but12);
        add(but13);
        add(but14);
        add(but15);
        add(but16);
       
       
       
       
       
       
        setLayout(null);
        setVisible(true);
        setSize(500,500);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
           
    }


    public void actionPerformed(ActionEvent e){
        if(e.getSource() == but13){
            String experssion =txt.getText();
            experssion += "0";
            txt.setText(experssion);

        }

        if(e.getSource() == but9){
            String experssion =txt.getText();
            experssion += "1";
            txt.setText(experssion);
        }

        if(e.getSource() == but10){
            String experssion =txt.getText();
            experssion += "2";
            txt.setText(experssion);
        }

        if(e.getSource() == but11){
            String experssion =txt.getText();
            experssion += "3";
            txt.setText(experssion);
        }

        if(e.getSource() == but5){
            String experssion =txt.getText();
            experssion += "4";
            txt.setText(experssion);
        }

        if(e.getSource() == but6){
            String experssion =txt.getText();
            experssion += "5";
            txt.setText(experssion);
        }

        if(e.getSource() == but7){
            String experssion =txt.getText();
            experssion += "6";
            txt.setText(experssion);
        }

        if(e.getSource() == but1){
            String experssion =txt.getText();
            experssion += "7";
            txt.setText(experssion);
        }
        if(e.getSource() == but2){
            String experssion =txt.getText();
            experssion += "8";
            txt.setText(experssion);
        }
        if(e.getSource() == but3){
            String experssion =txt.getText();
            experssion += "9";
            txt.setText(experssion);
        }

        if(e.getSource() == but15){
            txt.setText("0");
        }

        if(e.getSource() == but14){
            int a,b,i;
            char op = '+';
            String expression = txt.getText();
            String tempA="",tempB="";
            for( i=0;i<expression.length();i++){
                if(Character.isDigit(expression.charAt(i))){
                    tempA += expression.charAt(i);

                }
                else{
                    op=expression.charAt(i);
                    break;
                }


            }

            tempB = expression.substring(i+1);
            a = Integer.parseInt(tempA);
            b = Integer.parseInt(tempB);

            int result=0;

            switch(op){
                case'+':
                result =a+b;
                break;

                case'-':
                result =a-b;
                break;

                case'*':
                result =a*b;
                break;

                case'/':
                result =a/b;
                break;
            }
            txt.setText(String.valueOf(result));

        }

        if(e.getSource() == but4){
            String experssion =txt.getText();
            experssion += "+";
            txt.setText(experssion);
        }
        if(e.getSource() == but8){
            String experssion =txt.getText();
            experssion += "-";
            txt.setText(experssion);
        }
        if(e.getSource() == but12){
            String experssion =txt.getText();
            experssion += "*";
            txt.setText(experssion);
        }
        if(e.getSource() == but16){
            String experssion =txt.getText();
            experssion += "/";
            txt.setText(experssion);
        }
































    
    }
    
    public static void main(String[] args){
        new calc();
    }

    }
    





