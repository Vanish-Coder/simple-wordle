import java.awt.event.KeyEvent;

/**
 *	Display constants used in the Wordle game
 */
public class Constants
{
	public static final int SCREEN_WIDTH = 700;
	public static final int SCREEN_HEIGHT = 750;
	public static final int DRAW_DELAY = 20;
	
	public static final String [] KEYBOARD = 
	{ 
		"Q", "W", "E", "R", "T", "Y", "U", "I", "O", "P", 
		  "A", "S", "D", "F", "G", "H", "J", "K", "L", 
		"ENTER", "Z", "X", "C", "V", "B", "N", "M", "DELETE",
							"RESET"
	};
	
	public static final int [] KEYS = 
	{ 
		KeyEvent.VK_Q, KeyEvent.VK_W, KeyEvent.VK_E, KeyEvent.VK_R, KeyEvent.VK_T, KeyEvent.VK_Y, KeyEvent.VK_U, KeyEvent.VK_I, KeyEvent.VK_O, KeyEvent.VK_P, 
		  KeyEvent.VK_A, KeyEvent.VK_S, KeyEvent.VK_D, KeyEvent.VK_F, KeyEvent.VK_G, KeyEvent.VK_H, KeyEvent.VK_J, KeyEvent.VK_K, KeyEvent.VK_L, 
		KeyEvent.VK_ENTER, KeyEvent.VK_Z, KeyEvent.VK_X, KeyEvent.VK_C, KeyEvent.VK_V, KeyEvent.VK_B, KeyEvent.VK_N, KeyEvent.VK_M, KeyEvent.VK_BACK_SPACE,
	};
	
	public static final int [][] KEYPLACEMENT = 
	{ 
		{125, 234}, {174, 234}, {223, 234}, {272, 234}, {321, 234}, {370, 234}, {419, 234}, {468, 234}, {517, 234}, {566, 234},
			{149, 168}, {198, 168}, {247, 168}, {296, 168}, {345, 168}, {394, 168}, {443, 168}, {492, 168}, {541, 168},
		{139, 102}, {198, 102}, {247, 102}, {296, 102}, {345, 102}, {394, 102}, {443, 102}, {492, 102}, {551, 102},
													{345, 36}
	};
}