
package jogodeboliche;

import java.util.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

public class GUI extends JFrame {
    
    Container cp = new Container();
    
    int Rodada = 1;
    int Jogadores;
    
    Boliche teste1 = new Boliche();
    
    Random random = new Random();
    
    JPanel PnIn = new JPanel();
    JPanel left = new JPanel();
    JPanel PnPt = new JPanel();
    JPanel PnBt = new JPanel();
    
    JTextField tfJogadores = new JTextField(15);
    
    JLabel lb1 = new JLabel("Jogador1 Pontuação:");
    JLabel lb2 = new JLabel("Jogador2 Pontuação:");
    JLabel lb3 = new JLabel("Jogador3 Pontuação:");
    JLabel lb4 = new JLabel("Jogador4 Pontuação:");
    JLabel lbRodada = new JLabel("Rodada1");
    
    JButton btComecar = new JButton("Começar");
    JButton btJogar = new JButton("Jogar");

    JButton bt1 = new JButton("Jogar");
    JButton bt2 = new JButton("Jogar");
    JButton bt3 = new JButton("Jogar");
    JButton bt4 = new JButton("Jogar");
    

    public GUI(){
        
        cp = getContentPane();
        
        setTitle("Jogo de Boliche");
        setSize(800,200);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        cp.setLayout(new BorderLayout());
        
        Jogadores = Integer.valueOf(JOptionPane.showInputDialog(null,"Numero de Jogadores?"));
        
        PnPt.setLayout(new GridLayout(Jogadores,1));
        
        if(Jogadores == 1){
            PnPt.add(lb1);
        }
        if(Jogadores == 2){
            PnPt.add(lb1);
            PnPt.add(lb2);
        }
        if(Jogadores == 3){
            PnPt.add(lb1);
            PnPt.add(lb2);
            PnPt.add(lb3);
        }
        if(Jogadores == 4){
            PnPt.add(lb1);
            PnPt.add(lb2);
            PnPt.add(lb3);
            PnPt.add(lb4);
        }
        
        left.setLayout(new FlowLayout(FlowLayout.LEFT));
        left.add(PnPt);
        
        PnBt.setLayout(new FlowLayout(FlowLayout.CENTER));
        
        PnBt.add(lbRodada);
        PnBt.add(btJogar);
         
        cp.add(left, BorderLayout.NORTH);
        cp.add(PnBt, BorderLayout.SOUTH);
         
         btJogar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent b) {
                
                Rodada++;
                lbRodada.setText("Rodada" + Rodada);
                
                if(Rodada == 21){
                    PnBt.remove(btJogar);
                    lbRodada.setText("FIM DE JOGO!");
                }
               
                
                  }
        });
         
       setVisible(true);  
    }
}


