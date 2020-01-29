package eu.sig.training.ch02;

public class BoardFactory {
    // tag::createBoard[]
    public Board createBoard(Square[][] grid) {
        assert grid != null;

        return create(new Board(grid));
    }

	private Board create(Board board) {
		int width = board.getWidth();
        int height = board.getHeight();
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                linkSquare(board, x, y);
            }
        }
        return board;
	}

	private void linkSquare(Board board, int x, int y) {
		Square square = board.getGrid()[x][y];
		for (Direction dir : Direction.values()) {
		    int dirX = (board.getWidth() + x + dir.getDeltaX()) % board.getWidth();
		    int dirY = (board.getHeight() + y + dir.getDeltaY()) % board.getHeight();
		    Square neighbour = board.getGrid()[dirX][dirY];
		    square.link(neighbour, dir);
		}
	}
}

class Board {
    public Board(Square[][] grid) {}

    public int getWidth() {
        return 0;
    }

    public int getHeight() {
        return 0;
    }
    public Square[][] getGrid() {
    	return null;
    }
}

class Square {
    public void link(Square neighbour, Direction dir) {}
}

class Direction {

    public static Direction[] values() {
        return null;
    }

    public int getDeltaY() {
        return 0;
    }

    public int getDeltaX() {
        return 0;
    }
}
