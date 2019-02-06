package simpleTasks;

public class Rescale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] original = new int[640][480];
		int newWidth = 480;
		int newHeight = 300;
		rescale(original, newWidth, newHeight);
	}

	public static int[][] rescale(int[][] original, int newWidth, int newHeight) {
		int[][] pixels = null;
		int[][] temp = new int[newWidth][newHeight];
		double x_ratio = original.length / (double) newWidth;
		double y_ratio = original[0].length / (double) newHeight;
		double px, py;
		for (int i = 0; i < newHeight; i++) {
			for (int j = 0; j < newWidth; j++) {
				px = Math.floor(j * x_ratio);
				py = Math.floor(i * y_ratio);

				temp[(i * newWidth) + j] = pixels[(int) ((py * original.length) + px)];
			}
		}
		return temp;
	}
}




/** public int[] resizePixels(int[] pixels,int w1,int h1,int w2,int h2) {
int[] temp = new int[w2*h2] ;
double x_ratio = w1/(double)w2 ;
double y_ratio = h1/(double)h2 ;
double px, py ; 
for (int i=0;i<h2;i++) {
    for (int j=0;j<w2;j++) {
        px = Math.floor(j*x_ratio) ;
        py = Math.floor(i*y_ratio) ;
        temp[(i*w2)+j] = pixels[(int)((py*w1)+px)] ;
    }
}
return temp ;
} */