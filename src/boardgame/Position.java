package boardgame;

public class Position {
	
	private int row;
	private int column;
	
	public Position(int row, int column) {
		this.row = row;
		this.column = column;
	}

	public int getLinha() {
		return row;
	}

	public void setLinha(int row) {
		this.row = row;
	}

	public int getColuna() {
		return column;
	}

	public void setColuna(int coluna) {
		this.column = coluna;
	}
	
	@Override
	public String toString() {
		return row + ", " + column;
	}

}
