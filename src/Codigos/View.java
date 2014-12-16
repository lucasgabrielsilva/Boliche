
package Codigos;

import java.awt.Button;
import java.awt.Panel;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.Label;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;	
import java.lang.Integer;		
import java.util.Observable;		
import java.util.Observer;
import java.awt.event.ActionListener;

interface View extends Observer {

	void addController(ActionListener controller);

	public void setValue(int v);
}
