
package Codigos;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.text.ParseException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.text.View;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

public class GUI extends JFrame implements Observer{
    
    Container cp = new Container();
    
    int Rodada = 1;
    int Jogadores = 0;
    int pts1 = 0;
    int pts2 = 0;
    int pts3 = 0;
    int pts4 = 0;
    
    JPanel PnImg = new JPanel();
    JPanel PnAux = new JPanel();
    JPanel PnJgds= new JPanel();
    JPanel PnPts = new JPanel();
    JPanel PnJogar = new JPanel();
    
    JTextField tfJogadores = new JTextField(15);
    
    Random random1 = new Random();
    Random random2 = new Random();
    Random random3 = new Random();
    Random random4 = new Random();
    
    JLabel img = new JLabel();
    JLabel lb1 = new JLabel("Jogador1 Pontuação: 0");
    JLabel lb2 = new JLabel("Jogador2 Pontuação: 0");
    JLabel lb3 = new JLabel("Jogador3 Pontuação: 0");
    JLabel lb4 = new JLabel("Jogador4 Pontuação: 0");
    JLabel lbRodada = new JLabel("Rodada1");
    
    JButton btComecar = new JButton("Começar");
    JButton btJogar = new JButton("Jogar");

    Boliche Jogador1 = new Boliche();
    Boliche Jogador2 = new Boliche();
    Boliche Jogador3 = new Boliche();
    Boliche Jogador4 = new Boliche();
    
    
    URL Som;
    InputStream InputStrike;
    AudioStream AudioStrike;
    
    URL Som2;
    InputStream InputWin;
    AudioStream AudioWin;
    
    public GUI()throws IOException{
        
        cp = getContentPane();
        
        setBackground(Color.WHITE);
        setTitle("Jogo de Boliche");
        setSize(600,450);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        cp.setLayout(new BorderLayout());
        
        PnImg.setLayout(new GridLayout(1,1));
        
        ImageIcon icone = new javax.swing.ImageIcon(getClass().getResource("/Imagens/BOLICHE.png"));
        Image imagemAux;
        imagemAux = icone.getImage();
        icone.setImage(imagemAux.getScaledInstance(600, 385, Image.SCALE_SMOOTH));
        
        img.setIcon(icone);
        
        PnImg.add(img);
        
        PnJgds.setLayout(new FlowLayout(FlowLayout.LEFT));
        
        PnJgds.add(new JLabel("Numero de Jogadores:"));
        PnJgds.add(tfJogadores);
        PnJgds.add(btComecar);
        PnJgds.add(new JLabel("(Entre 1 e 4 Jogadores)"));
        PnJgds.setBackground(Color.WHITE);
        
        PnJogar.setLayout(new FlowLayout(FlowLayout.CENTER));
        PnJogar.setBackground(Color.WHITE);
        
        PnJogar.add(lbRodada);
        PnJogar.add(btJogar);
        
        Som = getClass().getResource("/Sons/BowlingPinsFalling.wav");
        
        InputStrike = Som.openStream();
        AudioStrike = new AudioStream(InputStrike);
        
        Som2 = getClass().getResource("/Sons/ArcadeWin.wav");
        
        InputWin = Som2.openStream();
        AudioWin = new AudioStream(InputWin);
        
        Jogador1.setId(1);
        Jogador2.setId(2);
        Jogador3.setId(3);
        Jogador4.setId(4);
        
        cp.add(PnImg, BorderLayout.NORTH);
        cp.add(PnJgds, BorderLayout.SOUTH);
        
         btComecar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent a) {
                
                int aux = Integer.valueOf(tfJogadores.getText());
                
                if(aux >= 0 && aux <= 4){
                
                    ImageIcon icone = new javax.swing.ImageIcon(getClass().getResource("/Imagens/BOLICHE.png"));
                    Image imagemAux;
                    imagemAux = icone.getImage();
                    icone.setImage(imagemAux.getScaledInstance(600, 150, Image.SCALE_SMOOTH));
                    img.setIcon(icone);
                    PnImg.add(img);
                    
                    Jogadores = Integer.valueOf(tfJogadores.getText());
                    PnPts.setLayout(new GridLayout(Jogadores,1));
                    PnPts.setBackground(Color.WHITE);

                    if(Jogadores == 1){
                        PnPts.add(lb1);
                    }

                    if(Jogadores == 2){
                        PnPts.add(lb1);
                        PnPts.add(lb2);
                    }

                    if(Jogadores == 3){
                        PnPts.add(lb1);
                        PnPts.add(lb2);
                        PnPts.add(lb3);
                    }

                    if(Jogadores == 4){
                        PnPts.add(lb1);
                        PnPts.add(lb2);
                        PnPts.add(lb3);
                        PnPts.add(lb4);
                    }
                    
                    cp.remove(PnJgds);
                    cp.setSize(600,350);
                    cp.add(PnImg, BorderLayout.NORTH);
                    cp.add(PnPts, BorderLayout.CENTER);
                    cp.add(PnJogar, BorderLayout.SOUTH);
                    
                }
                else{
                    JOptionPane.showMessageDialog(null,"Por Favor informe um numero de jogadores entre 1 e 4");
                    tfJogadores.setText(null);
                    tfJogadores.requestFocus();
                }
                
                
                  }
        });
        
        
         btJogar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent b) {
                
                int aux = Integer.valueOf(tfJogadores.getText());
                
                if(aux > 0 || aux <= 4){
                    
                if(Rodada %2 != 0){
                    pts1 = random1.nextInt(11);
                    pts2 = random1.nextInt(11);
                    pts3 = random1.nextInt(11);
                    pts4 = random1.nextInt(11);
                    
//                    ActionEvent roll1 = new ActionEvent(this, Jogador1.getId(), ""+pts1);
//                    ActionEvent roll2 = new ActionEvent(this, Jogador2.getId(), ""+pts2);
//                    ActionEvent roll3 = new ActionEvent(this, Jogador3.getId(), ""+pts3);
//                    ActionEvent roll4 = new ActionEvent(this, Jogador4.getId(), ""+pts4);
                    Jogador1.roll(pts1);
                    Jogador2.roll(pts2);
                    Jogador3.roll(pts3);
                    Jogador4.roll(pts4);
                }
                
               if(Rodada %2 == 0){
                   
                    Jogador1.roll(random1.nextInt(10 - pts1 + 1));
                    Jogador2.roll(random2.nextInt(10 - pts2 + 1));
                    Jogador3.roll(random3.nextInt(10 - pts3 + 1));
                    Jogador4.roll(random4.nextInt(10 - pts4 + 1));
               }
               
                lb1.setText("Jogador1 Pontuação: " + Jogador1.getScore());
                lb2.setText("Jogador2 Pontuação: " + Jogador2.getScore());
                lb3.setText("Jogador3 Pontuação: " + Jogador3.getScore());
                lb4.setText("Jogador4 Pontuação: " + Jogador4.getScore());
                
                Rodada++;
                lbRodada.setText("Rodada" + Rodada);
                
                if(Rodada == 2){
                    try {
                    InputStrike = Som.openStream();
                    AudioStrike = new AudioStream(InputStrike);
                    } catch (IOException ex) {
                        Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
                    }
                
                    AudioPlayer.player.start(AudioStrike);
                }
                
                if(Rodada == 21){
                    PnJogar.remove(btJogar);
                    lbRodada.setText("FIM DE JOGO!");
                    
                    try {
                    InputWin = Som2.openStream();
                    AudioWin = new AudioStream(InputWin);
                    } catch (IOException ex) {
                        Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
                    }
                
                    AudioPlayer.player.start(AudioWin);
                }

                }
                  }
        });
         
       setVisible(true); 
       
    }

    @Override
    public void update(Observable o, Object arg) {
        Integer Id = (Integer) arg;
        Boliche jogo = (Boliche) o;
        
        if(Id == 1){
            lb1.setText("Jogador1 Pontuação: " + Jogador1.getScore());
        }
        
        if(Id == 2){
            lb2.setText("Jogador2 Pontuação: " + Jogador2.getScore());
        }
                   
        if(Id == 3){
            lb3.setText("Jogador3 Pontuação: " + Jogador3.getScore());
        }
        
        if(Id == 4){
            lb4.setText("Jogador4 Pontuação: " + Jogador4.getScore());
        }
    }
    
}


