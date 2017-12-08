import com.sun.xml.internal.bind.v2.model.annotation.Quick;
import processing.core.PApplet;

import java.util.ArrayList;
import java.util.Random;

public class Program extends PApplet {

    private ArrayList<Bar> bBars;
    private ArrayList<Bar> qBars;
    private ArrayList<Bar> mBars;
    private ArrayList<Bar> sBars;

    private ArrayList<Bar> rbBars;
    private ArrayList<Bar> rqBars;
    private ArrayList<Bar> rmBars;
    private ArrayList<Bar> rsBars;


    public void initBar(int num) {
        int width = 480 / num;
        Random random = new Random();

        bBars =  new ArrayList<Bar>();
        qBars =  new ArrayList<Bar>();
        mBars =  new ArrayList<Bar>();
        sBars =  new ArrayList<Bar>();


        rbBars =  new ArrayList<Bar>();
        rqBars =  new ArrayList<Bar>();
        rmBars =  new ArrayList<Bar>();
        rsBars =  new ArrayList<Bar>();


        for(int i = 0; i < num; i++) {
            bBars.add(new Bar(this, i*width, random.nextInt(320), width, 0));
            qBars.add(new Bar(this, i*width+480, random.nextInt(320), width, 0));
            mBars.add(new Bar(this, i*width, random.nextInt(320), width, 320));
            sBars.add(new Bar(this, i*width+480, random.nextInt(320), width, 320));
        }

        for(int i = 0; i < num; i++) {
            rbBars.add(new Bar(this, i*width, random.nextInt(320), width, 0));
            rqBars.add(new Bar(this, i*width+480, random.nextInt(320), width, 0));
            rmBars.add(new Bar(this, i*width, random.nextInt(320), width, 320));
            rsBars.add(new Bar(this, i*width+480, random.nextInt(320), width, 320));
        }
    }

    @Override
    public void settings() {
        size(960,640);
        initBar(120);

        BubbleSort bubbleSort = new BubbleSort(bBars);
        bubbleSort.start();

        QuickSort quickSort = new QuickSort(qBars);
        quickSort.start();

        MergeSort mergeSort = new MergeSort(mBars);
        mergeSort.start();

        SelectionSort selectionSort = new SelectionSort(sBars);
        selectionSort.start();

            ReverseBubble reverseBubble = new ReverseBubble(rbBars);
            reverseBubble.start();

            ReverseQuick reverseQuick = new ReverseQuick(rqBars);
            reverseQuick.start();

            ReverseMerge reverseMerge = new ReverseMerge(rmBars);
            reverseMerge.start();

            ReverseSelection reverseSelection = new ReverseSelection(rsBars);
            reverseSelection.start();

    }

    @Override
    public void setup() {
        background(255);

    }

    @Override
    public void draw() {
        background(255);

        text("BubbleSort", 420, 20);
        text("QuickSort", 900, 20);
        text("MergeSort", 420, 340);
        text("SelectionSort", 880, 340);

        for (Bar bar : bBars) {
            fill(0);
            bar.draw();
        }
        for (Bar bar : qBars) {
            fill(50);
            bar.draw();
        }
        for (Bar bar : mBars) {
            fill(100);
            bar.draw();
        }
        for (Bar bar : sBars) {
            fill(150);
            bar.draw();
        }

        if (key == ' ') {
            background(255);

            text("BubbleSort", 420, 20);
            text("QuickSort", 900, 20);
            text("MergeSort", 420, 340);
            text("SelectionSort", 880, 340);

            for (Bar bar : rbBars) {

                fill(0);
                bar.draw();
            }
            for (Bar bar : rqBars) {

                fill(50);
                bar.draw();
            }
            for(Bar bar: rmBars) {

                fill(100);
                bar.draw();
            }
            for (Bar bar : rsBars) {

                fill(150);
                bar.draw();
            }
        }
    }

    public static void main(String[] args) {
        PApplet.main("Program");
    }
}
