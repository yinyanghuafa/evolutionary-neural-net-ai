package checkers_framework;import java.io.File;import java.net.URL;import java.net.URLClassLoader;public abstract class CheckerInterface {	//Color of Player	/**	 	 * White Player	 	 */	public final static int WH = -1;	/**	 	 * Black Player	 	 */	public final static int BL = 1; //Black	//Square	/**	 	 * White	 	 */	public final static int WHITE = -1;	/**	 	 * White King	 	 */	public final static int WKING = -2;	/**	 	 * Black	 	 */	public final static int BLACK = 1;	/**	 	 * Black King	 	 */	public final static int BKING = 2; // Black-King	/**	 	 * Empty Square	 	 */	public final static int EMPTY = 0; // Empty Square	/**	 	 * Color of this player	 	 */	protected int color;	/**	 	 * This method will be executed by CheckerGame whenever this player is in turn.	 	 * Method has to return an Move-object indicating the next move.	 	 */	public abstract Move chooseMove(int board[][]);	/**	 	 * Setting color of this player.	 	 */	public void setColor(int c) {		color = c;	}	/**	 	 * Returning color of this player.	 	 */	public int getColor() {		return color;	}	/**	 * @return Returns the name.	 */	public abstract String getName();	}