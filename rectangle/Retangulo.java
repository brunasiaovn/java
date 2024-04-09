package rectangle;

public class Retangulo {
    public int left;
    public int top;
    public int width;
    public int height;

    public void initialize(int left, int top, int width, int height) {
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = height;
    }

    public void initialize(int left, int top) {
        this.left = left;
        this.top = top;
        this.width = 0;
        this.height = 0;
    }

    public void initialize(int left, int top, int width) {
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = width;
    }

    public void initialize(Retangulo retangulo) {
        this.left = retangulo.left;
        this.top = retangulo.top;
        this.width = retangulo.width;
        this.height = retangulo.height;
    }

    public static void main(String[] args) {

    }
}
