import processing.core.PApplet;

public class Bar {

    private int x,y;
    private int barSize;
    private int sPoint;
    PApplet pApplet;

    public Bar(PApplet pApplet, int x, int y, int barSize, int sPoint) {
        this.pApplet = pApplet;
        this.x = x;
        this.y = y;
        this.barSize = barSize;
        this.sPoint = sPoint;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void draw() {
        pApplet.rect(x, y+sPoint, barSize, 320-y);
    }
}
