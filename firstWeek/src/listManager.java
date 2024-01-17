public class listManager {
    int[] myList;
    public listManager (int[] myList){
        this.myList = myList;
    }
    public int getLargest(){
        int largest = 0;
        for( int item: myList){
            if(item > largest){
                largest = item;
            }
        }
        return largest;
    }
}
