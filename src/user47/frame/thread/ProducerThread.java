package user47.frame.thread;


public class ProducerThread implements Runnable
{
	static int xPoints[] = null;
	static int yPoints[] = null;

	@Override
	public void run()
	{
		
		for(int iTmp = 0; iTmp < 800; iTmp++)
		{
			xPoints[iTmp] = iTmp;
			//yPoints[iTmp] = Sin();
		}
			
	}

}
