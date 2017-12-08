import java.util.ArrayList;

public class ReverseSelection extends Sort {

    public ReverseSelection(ArrayList<Bar> bars) {
        super(bars);
    }

    @Override
    public void run() {
        try{
            selectionSort();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void selectionSort() throws InterruptedException {
        for (int i = 0; i < bars.size() - 1; i++)
        {
            int index = i;

            for (int j = i + 1; j < bars.size()-1; j++) {
                if (bars.get(j).getY() > bars.get(index).getY())
                    index = j;
            }

            swap(index, i);
            sleep(100);

        }
    }
}
