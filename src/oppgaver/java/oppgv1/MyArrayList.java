package oppgv1;


import org.pg4200.datastructure.delete.ArrayDeleteContainer;

import java.lang.reflect.Array;

public class MyArrayList<T> extends ArrayDeleteContainer<T>{

    public MyArrayList(){
        this(10);
    }

    public MyArrayList(int value){
        super(value);
    }


    @Override
    public void add(T value){
        if (data.length == size){
            Object[] bigArr = new Object[size*2];
            for (int i = 0; i < data.length; i++) {
                bigArr[i] = data[i];
            }
            data = bigArr;
        }
        super.add(value);
    }

}



    /*Write a class called `MyArrayList` that extends `ArrayDeleteContainer`.

        Override the method `add(T value)` in a way that, if the internal array is full,
        then such array should be doubled in size before inserting the new element.
*/