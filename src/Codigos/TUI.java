
package Codigos;

import java.util.Random;
import java.util.Scanner;

public class TUI {
    
    int pts1 = 0;
    int pts2 = 0;
    int pts3 = 0;
    int pts4 = 0;
    
    Random random1 = new Random();
    Random random2 = new Random();
    Random random3 = new Random();
    Random random4 = new Random();
    
    Scanner scnr = new Scanner(System.in);
    
    int pts = 0;
    
    Boliche Jogador1 = new Boliche();
    Boliche Jogador2 = new Boliche();
    Boliche Jogador3 = new Boliche();
    Boliche Jogador4 = new Boliche();
    
       public TUI() throws InterruptedException{
           
           System.out.println("  ---> Bem Vindo ao BOLICHE GAME <--- \n");
           System.out.println("Numero de Jogadores?");
           String Jogadores = scnr.nextLine();
           
           if(Jogadores.equals("1")){

               System.out.println("Jogador1 --> Pontuação: 0\n");
               System.out.println("Pressione ENTER Para Começar o Jogo!\n");
               scnr.nextLine();
                for(int Rodada = 1; Rodada <= 21; Rodada++){
                    
                    if(Rodada %2 != 0){
                        pts1 = random1.nextInt(11);
                        Jogador1.roll(pts1);
                        System.out.println("Jogador1 --> Pontuação:" + Jogador1.getScore() + "\n");
                        System.out.println("Rodada" + Rodada);
                        System.out.println("Pressione ENTER Para Jogar!\n");
                        scnr.nextLine();
                    }
                    
                    if(Rodada %2 == 0){
                        Jogador1.roll(random1.nextInt(10 - pts1 + 1));
                        System.out.println("Jogador1 --> Pontuação:" + Jogador1.getScore() + "\n");
                        System.out.println("Rodada" + Rodada);
                        System.out.println("Pressione ENTER Para Jogar!\n");
                        scnr.nextLine();
                    }
                   
               }
               System.out.println("FIM DE JOGO!");
           }
           
           if(Jogadores.equals("2")){
               
               System.out.println("Jogador1 --> Pontuação: 0\n");
               System.out.println("Jogador2 --> Pontuação: 0\n");
               System.out.println("Pressione ENTER Para Começar o Jogo!\n");
               scnr.nextLine();
               
                for(int Rodada = 2; Rodada < 21; Rodada++){
                   if(Rodada %2 != 0){
                        pts1 = random1.nextInt(11);
                        pts2 = random2.nextInt(11);
                        
                        Jogador1.roll(pts1);
                        Jogador2.roll(pts2);
                        
                        System.out.println("Jogador1 --> Pontuação:" + Jogador1.getScore() + "\n");
                        System.out.println("Jogador2 --> Pontuação:" + Jogador2.getScore() + "\n");
                        
                        System.out.println("Rodada" + Rodada);
                        System.out.println("Pressione ENTER Para Jogar!\n");
                        scnr.nextLine();
                    }
                    
                    if(Rodada %2 == 0){
                        Jogador1.roll(random1.nextInt(10 - pts1 + 1));
                        Jogador2.roll(random2.nextInt(10 - pts2 + 1));
                        
                        System.out.println("Jogador1 --> Pontuação:" + Jogador1.getScore() + "\n");
                        System.out.println("Jogador2 --> Pontuação:" + Jogador2.getScore() + "\n");
                        
                        System.out.println("Rodada" + Rodada);
                        System.out.println("Pressione ENTER Para Jogar!\n");
                        scnr.nextLine();
                    }
               }
           }
           
           if(Jogadores.equals("3")){
               
               System.out.println("Jogador1 --> Pontuação: 0\n");
               System.out.println("Jogador2 --> Pontuação: 0\n");
               System.out.println("Jogador3 --> Pontuação: 0\n");
               System.out.println("Pressione ENTER Para Começar o Jogo!\n");
               scnr.nextLine();
               
                for(int Rodada = 1; Rodada < 21; Rodada++){
                  
                    if(Rodada %2 != 0){
                        pts1 = random1.nextInt(11);
                        pts2 = random2.nextInt(11);
                        pts3 = random3.nextInt(11);
                        
                        Jogador1.roll(pts1);
                        Jogador2.roll(pts2);
                        Jogador3.roll(pts3);
                        
                        System.out.println("Jogador1 --> Pontuação:" + Jogador1.getScore() + "\n");
                        System.out.println("Jogador2 --> Pontuação:" + Jogador2.getScore() + "\n");
                        System.out.println("Jogador3 --> Pontuação:" + Jogador3.getScore() + "\n");
                        
                        System.out.println("Rodada" + Rodada);
                        System.out.println("Pressione ENTER Para Jogar!\n");
                        scnr.nextLine();
                    }
                    
                    if(Rodada %2 == 0){
                        Jogador1.roll(random1.nextInt(10 - pts1 + 1));
                        Jogador2.roll(random2.nextInt(10 - pts2 + 1));
                        Jogador3.roll(random3.nextInt(10 - pts3 + 1));
                        
                        System.out.println("Jogador1 --> Pontuação:" + Jogador1.getScore() + "\n");
                        System.out.println("Jogador2 --> Pontuação:" + Jogador2.getScore() + "\n");
                        System.out.println("Jogador3 --> Pontuação:" + Jogador3.getScore() + "\n");
                        
                        System.out.println("Rodada" + Rodada);
                        System.out.println("Pressione ENTER Para Jogar!\n");
                        scnr.nextLine();
                    }
               }
           }
           
           if(Jogadores.equals("4")){
               
               System.out.println("Jogador1 --> Pontuação: 0\n");
               System.out.println("Jogador2 --> Pontuação: 0\n");
               System.out.println("Jogador3 --> Pontuação: 0\n");
               System.out.println("Jogador4 --> Pontuação: 0\n");
               System.out.println("Pressione ENTER Para Começar o Jogo!\n");
               scnr.nextLine();
                for(int Jogadas = 1; Jogadas < 21; Jogadas++){
                   Jogador1.roll(random1.nextInt(5));
                   Jogador2.roll(random2.nextInt(5));
                   Jogador3.roll(random3.nextInt(5));
                   Jogador4.roll(random4.nextInt(5));
                   System.out.println("Jogador1 --> Pontuação:" + Jogador1.getScore());
                   System.out.println("Jogador2 --> Pontuação:" + Jogador2.getScore());
                   System.out.println("Jogador3 --> Pontuação:" + Jogador3.getScore());
                   System.out.println("Jogador4 --> Pontuação:" + Jogador4.getScore() + "\n");
                   System.out.println("Rodada" + Jogadas);
                   System.out.println("Pressione ENTER Para Jogar!\n");
                   scnr.nextLine();
               }
           }

       }
    
}
