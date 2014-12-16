
package Codigos;

import java.util.Observable;

public class Boliche extends Observable {

    
     int Jogada = 0;
     int Pontuacao[] = new int[21];
     private int Id = 0;
    
    public int getjogada() {
        return Jogada;
    }
    
    public int getScore() {
        int Aux = 1;
        int Score = 0;
        for (int i = 0; i < (Pontuacao.length - 2); i++) {
            Score += Pontuacao[i];
            if (Aux == 1) {
                if (Pontuacao[i] == 10) {
                    Score += Pontuacao[i+2];
                    Score += Pontuacao[i+3];                  
                    Pontuacao[i+1] = 0;
                }
            }
            if (Aux == 2) {
                if ((Pontuacao[i-1] + Pontuacao[i])== 10) {                    
                    Score += Pontuacao[i+1];                    
                } 
                Aux = 1;
            } else {
                Aux = 2;                
            }
                        
        }
        
        if ((Pontuacao[18] + Pontuacao[19]) == 10) {
                    Score += Pontuacao[20];
                }
        
        return Score;
    }

    public void roll(int i) {
       Pontuacao[Jogada] = i;
       Jogada++;
       setChanged();
       notifyObservers(Id);
                
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }
    
    
    
}