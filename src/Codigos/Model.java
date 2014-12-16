
package Codigos;

import java.util.Observable;


public class Model extends Observable {
    
    private int counter;
    
    public Model(){
		counter = 0;
	}

	public int getValue(){
		return counter;
	}

	public void setValue(int value) {

		this.counter = value;
		System.out.println("Model init: counter = " + counter);
		setChanged();
		notifyObservers(counter);
        }
        
	public void incrementValue() {
		counter++;
		System.out.println("Model     : counter = " + counter);
		setChanged();
		notifyObservers(counter);
	}
    
    
}
