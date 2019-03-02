import java.awt.*;
import javax.swing.*;

public class Threads extends JFrame
{
	private JProgressBar pb1 = new JProgressBar();
	private JPanel jobPanel = new JPanel();
	private JPanel timesPanel = new JPanel();
	private JLabel jobLabel = new JLabel("Job 1");
	private JLabel timesLabel = new JLabel("12 seconds Remaining...");
	private JLabel blankLabel ;
	private JButton terminateButton = new JButton("Terminate");

	public Threads()
	{
		super("");
		setLayout(new GridLayout(0,1));
		jobPanel.setLayout(new GridLayout(1,2));
		timesPanel.setLayout(new GridLayout(1,3));
		pb1.setValue(50);
		pb1.setMaximum(100);
		pb1.setString("50%");
		jobPanel.add(jobLabel);
		jobPanel.add(pb1);
		blankLabel = new JLabel();
		timesPanel.add(timesLabel);
		timesPanel.add(terminateButton);
		add(jobPanel);
		add(timesPanel);

	}
	public static void main(String[] args)
	{
		Threads frame = new Threads();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1000,500);
		frame.setVisible(true);
	}
}
