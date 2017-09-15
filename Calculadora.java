import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.URL;

public class Calculadora implements ActionListener{
    
    JFrame f;
    JTextField t;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bdiv,bmul,bsub,bmais,bponto,bigual,blimp,braiz,bcos,bsen,btan;
    
    static double a=0,b=0,result=0;
    static int operator=0;
    
    Calculadora(){
        
        Image icon = Toolkit.getDefaultToolkit().getImage("icone.png");
        
        
        // Criando os botões e o textbox

        f=new JFrame("Calculadora");
        f.setIconImage(icon);
        t=new JTextField();
        b1=new JButton("1");
        b2=new JButton("2");
        b3=new JButton("3");
        b4=new JButton("4");
        b5=new JButton("5");
        b6=new JButton("6");
        b7=new JButton("7");
        b8=new JButton("8");
        b9=new JButton("9");
        b0=new JButton("0");
        bdiv=new JButton("/");
        bmul=new JButton("x");
        bsub=new JButton("-");
        bmais=new JButton("+");
        bponto=new JButton(",");
        bigual=new JButton("=");
        blimp=new JButton("Limpar");
        braiz=new JButton("√");
        bcos=new JButton("C");
        bsen=new JButton("S");
        btan=new JButton("T");
        
        // Mudando o background
        
        f.getContentPane().setBackground(new Color(255, 255, 255));
        b1.setBackground(new Color(225, 225, 225));
        b2.setBackground(new Color(225, 225, 225)); 
        b3.setBackground(new Color(225, 225, 225)); 
        b4.setBackground(new Color(225, 225, 225));
        b5.setBackground(new Color(225, 225, 225));
        b6.setBackground(new Color(225, 225, 225));
        b7.setBackground(new Color(225, 225, 225));
        b8.setBackground(new Color(225, 225, 225));
        b9.setBackground(new Color(225, 225, 225));
        b0.setBackground(new Color(225, 225, 225));
        bponto.setBackground(new Color(225, 225, 225));
        bigual.setBackground(new Color(195,195,195));
        bmul.setBackground(new Color(245, 146, 50));
        bdiv.setBackground(new Color(245, 146, 50));
        bsub.setBackground(new Color(245, 146, 50));
        bmais.setBackground(new Color(245, 146, 50));
        blimp.setBackground(new Color(245, 146, 50));
        braiz.setBackground(new Color(245, 146, 50));
        bsen.setBackground(new Color(245, 146, 50));
        bcos.setBackground(new Color(245, 146, 50));
        btan.setBackground(new Color(245, 146, 50));
        
        // Mudando a borda
        
        b1.setBorder(javax.swing.BorderFactory.createMatteBorder(1,1,1,1, new Color(243,243,243)));
        b2.setBorder(javax.swing.BorderFactory.createMatteBorder(1,1,1,1, new Color(243,243,243)));
        b3.setBorder(javax.swing.BorderFactory.createMatteBorder(1,1,1,1, new Color(243,243,243)));
        b4.setBorder(javax.swing.BorderFactory.createMatteBorder(1,1,1,1, new Color(243,243,243)));
        b5.setBorder(javax.swing.BorderFactory.createMatteBorder(1,1,1,1, new Color(243,243,243)));
        b6.setBorder(javax.swing.BorderFactory.createMatteBorder(1,1,1,1, new Color(243,243,243)));
        b7.setBorder(javax.swing.BorderFactory.createMatteBorder(1,1,1,1, new Color(243,243,243)));
        b8.setBorder(javax.swing.BorderFactory.createMatteBorder(1,1,1,1, new Color(243,243,243)));
        b9.setBorder(javax.swing.BorderFactory.createMatteBorder(1,1,1,1, new Color(243,243,243)));
        b0.setBorder(javax.swing.BorderFactory.createMatteBorder(1,1,1,1, new Color(243,243,243)));
        bmais.setBorder(javax.swing.BorderFactory.createMatteBorder(1,1,1,1, new Color(243,243,243)));
        bsub.setBorder(javax.swing.BorderFactory.createMatteBorder(1,1,1,1, new Color(243,243,243)));
        bmul.setBorder(javax.swing.BorderFactory.createMatteBorder(1,1,1,1, new Color(243,243,243)));
        bdiv.setBorder(javax.swing.BorderFactory.createMatteBorder(1,1,1,1, new Color(243,243,243)));
        bponto.setBorder(javax.swing.BorderFactory.createMatteBorder(1,1,1,1, new Color(243,243,243)));
        bigual.setBorder(javax.swing.BorderFactory.createMatteBorder(1,1,1,1, new Color(243,243,243)));
        braiz.setBorder(javax.swing.BorderFactory.createMatteBorder(1,1,1,1, new Color(243,243,243)));
        bcos.setBorder(javax.swing.BorderFactory.createMatteBorder(1,1,1,1, new Color(243,243,243)));
        bsen.setBorder(javax.swing.BorderFactory.createMatteBorder(1,1,1,1, new Color(243,243,243)));
        btan.setBorder(javax.swing.BorderFactory.createMatteBorder(1,1,1,1, new Color(243,243,243)));
        blimp.setBorder(javax.swing.BorderFactory.createMatteBorder(1,1,1,1, new Color(243,243,243)));
        
        // Editando o JTextfield
        
        t.setFont(new Font("roboto", Font.PLAIN, 30));
        t.setHorizontalAlignment(JTextField.RIGHT); // Começar a escrever no lado direito
        t.setBackground(new Color(26,34,48));
        t.setForeground(new Color(255, 255, 255));
        t.setEditable(false); // Bloquear o teclado
        
        // Fontes
        
        b1.setFont(new Font("roboto", Font.PLAIN, 20));
        b2.setFont(new Font("roboto", Font.PLAIN, 20));
        b3.setFont(new Font("roboto", Font.PLAIN, 20));
        b4.setFont(new Font("roboto", Font.PLAIN, 20));
        b5.setFont(new Font("roboto", Font.PLAIN, 20));
        b6.setFont(new Font("roboto", Font.PLAIN, 20));
        b7.setFont(new Font("roboto", Font.PLAIN, 20));
        b8.setFont(new Font("roboto", Font.PLAIN, 20));
        b9.setFont(new Font("roboto", Font.PLAIN, 20));
        b0.setFont(new Font("roboto", Font.PLAIN, 20));
        bmais.setFont(new Font("roboto", Font.PLAIN, 20));
        bsub.setFont(new Font("roboto", Font.PLAIN, 20));
        bmul.setFont(new Font("roboto", Font.PLAIN, 20));
        bdiv.setFont(new Font("roboto", Font.PLAIN, 20));
        bponto.setFont(new Font("roboto", Font.PLAIN, 20));
        bigual.setFont(new Font("roboto", Font.PLAIN, 20));
        braiz.setFont(new Font("roboto", Font.PLAIN, 20));
        bsen.setFont(new Font("roboto", Font.PLAIN, 20));
        bcos.setFont(new Font("roboto", Font.PLAIN, 20));
        btan.setFont(new Font("roboto", Font.PLAIN, 20));
        blimp.setFont(new Font("roboto", Font.PLAIN, 20));
        
        // Personalizando o texto dos botões
        
        bigual.setFont(new Font("Comic Sans MS", Font.PLAIN, 30));
        bigual.setForeground(new Color(255, 255, 255));
        
        // Mudando a borda dos botões

        blimp.setForeground(new Color(255, 255, 255));
        bdiv.setForeground(new Color(255, 255, 255));
        braiz.setForeground(new Color(255, 255, 255));
        bmul.setForeground(new Color(255, 255, 255));
        bsen.setForeground(new Color(255, 255, 255));
        bcos.setForeground(new Color(255, 255, 255));
        btan.setForeground(new Color(255, 255, 255));
        bsub.setForeground(new Color(255, 255, 255));
        bmais.setForeground(new Color(255, 255, 255));
        
        // setBounds(x, y, largura, altura);
        
        t.setBounds(0,1,351,100);
        b7.setBounds(0,100,70,70);
        b8.setBounds(70,100,70,70);
        b9.setBounds(140,100,70,70);
        bdiv.setBounds(210,100,70,70);
        braiz.setBounds(280,100,70,70);
        
        b4.setBounds(0,170,70,70);
        b5.setBounds(70,170,70,70);
        b6.setBounds(140,170,70,70);
        bmul.setBounds(210,170,70,70);
        bsen.setBounds(280,170,70,70);
        
        b1.setBounds(0,240,70,70);
        b2.setBounds(70,240,70,70);
        b3.setBounds(140,240,70,70);
        bsub.setBounds(210,240,70,70);
        bcos.setBounds(280,240,70,70);
        
        bponto.setBounds(140,310,70,70);
        b0.setBounds(0,310,140,70);
        bigual.setBounds(0,380,210,70); 
        bmais.setBounds(210,310,70,70);
        blimp.setBounds(210,380,140,70);
        btan.setBounds(280,310,70,70);
        
        //Adicionando os botões no frame
        
        f.add(t);
        f.add(b7);
        f.add(b8);
        f.add(b9);
        f.add(bdiv);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(bmul);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(bsub);
        f.add(bponto);
        f.add(b0);
        f.add(bigual);
        f.add(bmais);
        f.add(blimp);
        f.add(braiz);
        f.add(bcos);
        f.add(bsen);
        f.add(btan);
        
        // Layout

        f.setLayout(null);
        f.setVisible(true);
        f.setSize(357,480); // Tamanho da calculadora
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setResizable(false);
        f.setLocationRelativeTo(null);
        
        // Dando vida aos botões
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b0.addActionListener(this);
        bmais.addActionListener(this);
        bdiv.addActionListener(this);
        bmul.addActionListener(this);
        bsub.addActionListener(this);
        bponto.addActionListener(this);
        bigual.addActionListener(this);
        blimp.addActionListener(this);
        braiz.addActionListener(this);
        bcos.addActionListener(this);
        btan.addActionListener(this);
        bsen.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){ 

        // Adicionando os botões na caixa de texto

        if(e.getSource()==b1)
            t.setText(t.getText().concat("1"));
        
        if(e.getSource()==b2)
            t.setText(t.getText().concat("2"));
        
        if(e.getSource()==b3)
            t.setText(t.getText().concat("3"));

        if(e.getSource()==b4)
            t.setText(t.getText().concat("4"));

        if(e.getSource()==b5)
            t.setText(t.getText().concat("5"));

        if(e.getSource()==b6)
            t.setText(t.getText().concat("6"));

        if(e.getSource()==b7)
            t.setText(t.getText().concat("7"));

        if(e.getSource()==b8)
            t.setText(t.getText().concat("8"));

        if(e.getSource()==b9)
            t.setText(t.getText().concat("9"));

        if(e.getSource()==b0)
            t.setText(t.getText().concat("0"));

        if(e.getSource()==bponto)
            t.setText(t.getText().concat(","));

        // Selecionando a função matemática

        if(e.getSource()==braiz){

            double n=Double.parseDouble(t.getText());
            t.setText(""+Math.sqrt(n));
        }

        if(e.getSource()==bcos){

            double c=Double.parseDouble(t.getText());
            t.setText(""+Math.cos(c));
        }   

        if(e.getSource()==bsen){

            double s=Double.parseDouble(t.getText());
            t.setText(""+Math.sin(s));
        } 

        if(e.getSource()==btan){

            double g=Double.parseDouble(t.getText());
            t.setText(""+Math.tan(g));
        } 

        if(e.getSource()==bmais){

            a=Double.parseDouble(t.getText());
            operator=1;
            t.setText("");
        } 

        if(e.getSource()==bsub){

            a=Double.parseDouble(t.getText());
            operator=2;
            t.setText("");
        }

        if(e.getSource()==bmul){

            a=Double.parseDouble(t.getText());
            operator=3;
            t.setText("");
        }

        if(e.getSource()==bdiv){

        a=Double.parseDouble(t.getText());
        operator=4;
        t.setText("");
        }

        if(e.getSource()==bigual){
            b=Double.parseDouble(t.getText());
       
    // Fazendo as contas Case = Operator

    switch(operator){

        case 1: result=a+b;
        break;

        case 2: result=a-b;
        break;

        case 3: result=a*b;
        break;

        case 4: result=a/b;
        break;

    }

    t.setText(""+result);
}

// Botão de limpar

if(e.getSource()==blimp)
    t.setText("");
}

public static void main(String args[]){

    new Calculadora();
    }
}