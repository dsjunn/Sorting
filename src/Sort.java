import java.util.ArrayList;

public class Sort extends Thread {

    protected ArrayList<Bar> bars;

    public Sort(ArrayList<Bar> bars) {
        this.bars = bars;
    }

    public void swap(int i, int j) {
        int temp = bars.get(i).getY();
        bars.get(i).setY(bars.get(j).getY());
        bars.get(j).setY(temp);
    }
}
