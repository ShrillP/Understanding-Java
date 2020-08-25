package Recursion;

public class MazeMain {

	public static void main (String [] args) throws Exception {

//		Maze maze = new Maze ("maze.txt");
//		maze.traversal();
		
		MazeGenerator maker = new MazeGenerator ();
		maker.starter();
		
	}
}