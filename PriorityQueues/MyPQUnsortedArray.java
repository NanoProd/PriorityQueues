public class MyPQUnsortedArray<K,V> extends AbstractPQ<K,V>{
    //attributes
    private int size; 
    private K[] array;

    //constructors
    public MyPQUnsortedArray(){
        super();
        size = 1;
        array = new K[1]; 
    }
    public MyPQUnsortedArray(Comparator<K> comp){
        super(comp);
        size = 1;
        array = new K[1];
    }
    public boolean insert(K,V){
        if((size + 1) > array.length){

        }
    }

    public Entry removeMin(){
        
    }


}