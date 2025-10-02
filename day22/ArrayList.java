package day22;
// implementation of arrayList`
public class ArrayList {

    private int data[];
    private int nextIndex;

    // constructor
    public ArrayList(){
        data = new int[5];
        nextIndex = 0;
    }

    // add method
    public void add(int element){
        if(nextIndex == data.length){
            // create a new array with double size and copy the elements
            int newData[] = new int[data.length * 2];
            for(int i = 0; i < data.length; i++){
                newData[i] = data[i];
            }
            data = newData;
        }
        data[nextIndex] = element;
        nextIndex++;
    }

    // get method
    public int get(int index){
        if(index < nextIndex){
            return data[index];
        } else {
            return -1; // invalid index
        }
    }

    // size method
    public int size(){
        return nextIndex;
    }

    // set method
    public void set(int index, int element){
        if(index < nextIndex){
            data[index] = element;
        } else if(index == nextIndex){
            add(element);
        } else {
            return; // invalid index
        }
    }

    // remove last element
    public int removeLast(){
        if(nextIndex == 0){
            return -1; // list is empty
        }
        int lastElement = data[nextIndex - 1];
        nextIndex--;
        return lastElement;
    }

    
}
