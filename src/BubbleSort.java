import java.util.ArrayList;

public class BubbleSort extends Sort {

    public BubbleSort(ArrayList<Bar> bars) {
        super(bars);

    }

    @Override
    public void run() {
        try{
            bubbleSort();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void bubbleSort() throws InterruptedException {
        for (int j = bars.size(); j >= 0; j--) {
            for (int i = 0; i < bars.size() - 1; i++) {
                if (bars.get(i).getY() > bars.get(i+1).getY()) {
                    swap(i, i+1);
                    sleep(2);
                }
            }
        }
    }

}
