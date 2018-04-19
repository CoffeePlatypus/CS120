import java.awt.event.*;
import javax.swing.JButton;

/** EventButton class (abstract)
 *  Author: David Riley
 *  Date: May, 2004 */
public abstract class EventButton extends JButton implements ActionListener  {

	/**	post:   this is created with itself as an action listener
     *          and  getText() == s 
     */
    public EventButton(String s)  {
    	super(s);
        addActionListener(this);
    }

	public abstract void actionPerformed( ActionEvent e );
}