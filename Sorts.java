import java.util.*;

public class Sorts{
    private long steps;

    /**
     *  Description of Constructor
     *
     * @param  list  Description of Parameter
     */
    public Sorts(){
        steps = 0;
    }

    /**
     *  Description of the Method
     *
     * @param  list  reference to an array of integers to be sorted
     */
    public void bubbleSort(ArrayList <Integer> list){
        for (int i = 1 ; i < list.size(); i++) { 
            for (int j =0; j < list.size()-i; j ++) {
                if (list.get(j) > list.get(j+1)) {
                    // exchange elements
                    int temp = list.get(j);  
                    list.set(j, list.get(j+1));
                    list.set(j+1, temp);
                }
            }
        }

        System.out.println();
        System.out.println("Bubble Sort");
        System.out.println();
    }

    /**
     *  Description of the Method
     *
     * @param  list  reference to an array of integers to be sorted
     */
    public void selectionSort(ArrayList <Integer> list){
        for (int i = 0; i < list.size() - 1; i++) {
            int min = i;
            for (int j = i; j < list.size(); j++) {
                if (list.get(j) < list.get(min)){
                    min = j;
                }
            }
            // Swap min (smallest num) to current position on array
            int temp = list.get(min);
            list.set(min, list.get(i));
            list.set(i, temp);
        }
        System.out.println();
        System.out.println("Selection Sort");
        System.out.println();
    }

    /**
     *  Description of the Method
     *
     * @param  list  reference to an array of integers to be sorted
     */
    public void insertionSort(ArrayList <Integer> list){
        for(int i = 1; i < list.size(); i++){
            int key = list.get(i);
            for(int j = i-1; j >= 0; j--){
                if(key < list.get(j)){

                    if(j == 0){
                        list.set(0, key);
                    }
                }else{
                    list.set(j + 1,key);
                    break; 
                }
            }
        }
        System.out.println();
        System.out.println("Insertion Sort");
        System.out.println();
    }

    public int sequentialSearch(ArrayList <Integer> list, int searchFor){
        for(int i = 0; i < list.size(); i++){
            if (list.get(i) == searchFor){
                return i;
            }
        }
        return -1;
    }

    /**
     *  Accessor method to return the current value of steps
     *
     */
    public long getStepCount(){
        return steps;
    }

    /**
     *  Modifier method to set or reset the step count. Usually called
     *  prior to invocation of a sort method.
     *
     * @param  stepCount   value assigned to steps
     */
    public void setStepCount(long stepCount){
        steps = stepCount;
    }
}