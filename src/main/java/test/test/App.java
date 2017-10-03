package test.test;

import java.awt.EventQueue;

/**
 * Hello world!
 *
 */
public class App 
{
	private static window windw;
	
    public static void main( String[] args )
    {
    	EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					windw = new window();
					windw.getFrame().setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
    }
    
    
}
