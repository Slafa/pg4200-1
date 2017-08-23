package oppgv1;

import org.pg4200.datastructure.delete.DeleteContainer;
import org.pg4200.datastructure.delete.DeleteContainerTestTemplate;

public class MyArrayListTest extends DeleteContainerTestTemplate{

    @Override
    protected <T> DeleteContainer<T> getNewInstance(Class<T> klass) {
        return new MyArrayList<>(1);
    }
}


    /*Write a test class called `MyArrayListTest` that extends `DeleteContainerTestTemplate`,
        where the instance of `MyArrayList` is initialized with capacity of 1
        (i.e., the size for the internal array).
        If your implementation of `MyArrayList#add` is correct, then all tests should pass.
*/
