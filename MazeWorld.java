import javalib.impworld.*;
import javalib.worldimages.*;

class MazeWorld extends World {
    static final int ROWS = 20;
    static final int COLS = 40;
    static final int WIDTH = COLS * Cell.SIZE;
    static final int HEIGHT = ROWS * Cell.SIZE;
    
    Maze maze;
    
    MazeWorld() {
        this.maze = new Maze();
    }
    
    @Override
    public WorldScene makeScene() {
        return maze.draw(this.getEmptyScene());
    }
    
}