// comment for step 6
// additional comment
// last one
import acm.graphics.GImage;
import acm.graphics.GLabel;
import acm.program.GraphicsProgram;

public class SimplePicture extends GraphicsProgram {
	public static int SIZE = 700;
	public static final String IMAGE_FILENAME = "robot.png";
	
	public void init() {
		setSize(SIZE, SIZE);
	}
	
	public void run() {
		GImage robot = new GImage(IMAGE_FILENAME, 200, 100);
		add(robot);
<<<<<<< HEAD
		GLabel label = new GLabel("Alex - Hackslashhhh", 200, 400);
=======
		GLabel label = new GLabel("Abdallah - Martyr", 200, 400);
>>>>>>> branch 'main' of https://github.com/Fall2024Comp55/git-team-lab-team-jaac
		add(label);
	}
	// Change for step 7
	public static void main(String[] args) {
		new SimplePicture().start();
	}
}