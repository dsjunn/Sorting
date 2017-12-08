import processing.core.PApplet;

import java.util.ArrayList;

public class ReverseQuick extends Sort {

    PApplet pApplet;

    public ReverseQuick (ArrayList<Bar> bars) {
        super(bars);
    }

    @Override
    public void run() {
        try{
            quickSort(0, bars.size()-1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void quickSort(int lowerIndex, int higherIndex) throws InterruptedException {
        int i = lowerIndex;
        int j = higherIndex;

        int pivot = bars.get(lowerIndex+(higherIndex-lowerIndex)/2).getY();

        while (i <= j) {

            while (bars.get(i).getY() > pivot) {
                i++;
            }
            while (bars.get(j).getY() < pivot) {
                j--;
            }
            if (i <= j) {
                swap(i, j);
                i++;
                j--;
                sleep(100);
            }

        }

        if (lowerIndex < j)
            quickSort(lowerIndex, j);
        if (i < higherIndex)
            quickSort(i, higherIndex);

    }
}

