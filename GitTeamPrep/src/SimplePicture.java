import acm.graphics.GImage;
import acm.graphics.GLabel;
import acm.program.GraphicsProgram;

public class SimplePicture extends GraphicsProgram {
	public static int SIZE = 700;
	
	public void init() {
		setSize(SIZE, SIZE);
	}
	
	public void run() {
		GImage robot = new GImage("robot.png", 200, 100);
		add(robot);
		GLabel label = new GLabel("How I feel when using github hackslash", 200, 400);
		add(label);
	}
	// Change for step 7
	public static void main(String[] args) {
		new SimplePicture().start();
	}
}