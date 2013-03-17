package user47.frame.thread;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MainFrame extends Frame
{
	public MainFrame()
	{
		setLayout(null);
		setTitle("Sine Wave");
		setBounds(0, 0, 800, 500);		
		setVisible(true);
		
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e)
			{
				dispose();
			}
		});
	}
	
	@Override
	public void paint(Graphics grp)
	{		
		int tmp = 0;
		grp.drawLine(0, 250, 790, 250);
		
		int [] xPoints = new int[100];       //{20,30,40,50,60,70,80,90,100,110,120};
		int [] yPoints = new int[100];       //{250,230,215,215,230,250,270,285,285,270,250};
		
		for(int iTmp = 0; iTmp < 100; iTmp++)
		{
			xPoints[iTmp] = iTmp;
			if(iTmp < 50)
				yPoints[iTmp] = iTmp + 250 ;
			else
				yPoints[iTmp] = iTmp + 250 - tmp++;
				
		}
		grp.drawPolyline(xPoints, yPoints, 100);
		
	}
}













