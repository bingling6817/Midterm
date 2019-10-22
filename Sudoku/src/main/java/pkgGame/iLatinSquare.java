package pkgGame;

public interface iLatinSquare {
	public boolean isLatinSquare();
	public static boolean isLatinSquare(int[][] arr) {
		LatinSquare latSquare = new LatinSquare(arr);
		return latSquare.isLatinSquare();
	}

}
