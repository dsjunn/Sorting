import java.util.ArrayList;

public class MergeSort extends Sort {

    int[] temp;

    public MergeSort(ArrayList<Bar> bars) {
        super(bars);
    }

    @Override
    public void run() {
        try{
            sort();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void sort() throws InterruptedException {

        this.temp = new int[bars.size()];
        doMergeSort(0, bars.size() - 1);
    }

    private void doMergeSort(int lowerIndex, int higherIndex) throws InterruptedException {

        if (lowerIndex < higherIndex) {
            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
            doMergeSort(lowerIndex, middle);
            doMergeSort(middle + 1, higherIndex);
            mergeParts(lowerIndex, middle, higherIndex);
        }
    }

    private void mergeParts(int lowerIndex, int middle, int higherIndex) throws InterruptedException {

        for (int i = lowerIndex; i <= higherIndex; i++) {
            temp[i] = bars.get(i).getY();
        }
        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;
        while (i <= middle && j <= higherIndex) {
            if (temp[i] <= temp[j]) {
                bars.get(k).setY(temp[i]);
                i++;
            } else {
                bars.get(k).setY(temp[j]);
                j++;
            }
            k++;
            sleep(20);
        }
        while (i <= middle) {
            bars.get(k).setY(temp[i]);
            k++;
            i++;
            sleep(20);
        }

    }
}
