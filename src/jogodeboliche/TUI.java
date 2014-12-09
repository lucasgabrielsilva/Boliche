
package jogodeboliche;

import java.util.Random;
import java.util.Scanner;

public class TUI {
    
    Random random = new Random();
    Scanner scnr = new Scanner(System.in);
    int pts = 0;
       public TUI(){
           
           pts += random.nextInt(11);
           System.out.println("Jogador1 --> Pressione enter para jogar");
           scnr.nextLine();
           System.out.println("Rodada1 --> Pontuação:" + pts);
           pts += random.nextInt(11);
           System.out.println("Rodada2 --> Pontuação:" + pts);
           pts += random.nextInt(11);
           System.out.println("Rodada3 --> Pontuação:" + pts);
           pts += random.nextInt(11);
           System.out.println("Rodada4 --> Pontuação:" + pts);
           pts += random.nextInt(11);
           System.out.println("Rodada5 --> Pontuação:" + pts);
           pts += random.nextInt(11);
           System.out.println("Rodada6 --> Pontuação:" + pts);
           pts += random.nextInt(11);
           System.out.println("Rodada7 --> Pontuação:" + pts);
           pts += random.nextInt(11);
           System.out.println("Rodada8 --> Pontuação:" + pts);
           pts += random.nextInt(11);
           System.out.println("Rodada9 --> Pontuação:" + pts);
           pts += random.nextInt(11);
           System.out.println("Rodada10 --> Pontuação:" + pts);
           pts += random.nextInt(11);
           System.out.println("Rodada11 --> Pontuação:" + pts);
           pts += random.nextInt(11);
           System.out.println("Rodada12 --> Pontuação:" + pts);
           pts += random.nextInt(11);
           System.out.println("Rodada13 --> Pontuação:" + pts);
           pts += random.nextInt(11);
           System.out.println("Rodada14 --> Pontuação:" + pts);
           pts += random.nextInt(11);
           System.out.println("Rodada15 --> Pontuação:" + pts);
           pts += random.nextInt(11);
           System.out.println("Rodada16 --> Pontuação:" + pts);
           pts += random.nextInt(11);
           System.out.println("Rodada17 --> Pontuação:" + pts);
           pts += random.nextInt(11);
           System.out.println("Rodada18 --> Pontuação:" + pts);
           pts += random.nextInt(11);
           System.out.println("Rodada19 --> Pontuação:" + pts);
           pts += random.nextInt(11);
           System.out.println("Rodada20 --> Pontuação:" + pts);
           pts += random.nextInt(11);
           System.out.println("Rodada21 --> Pontuação:" + pts);
           
           System.out.println("Jogador1 --> Pontuação Final:" + pts);
           System.out.println("FIM DE JOGO!");
       }
    
}
