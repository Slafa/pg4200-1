package oppgv2;

import org.pg4200.datastructure.queue.MyQueue;

public class RingArrayQueue implements MyQueue {
    @Override
    public void enqueue(Object value) {

    }

    @Override
    public Object dequeue() {
        return null;
    }

    @Override
    public Object peek() {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }
}

    /*Write a class called `RingArrayQueue` that implements `MyQueue`.
        Internally, it should be similar to the implementation of `ArrayQueue`,
        but with a fundamental performance improvement.
        When by adding many elements the `tail` index reaches the end of the internal array,
        **instead of** shifting elements to the left or copying over to a new larger array,
        the `tail` should start back from `0`, unless of course `head==0`.

        The idea is to reuse the empty spaces before `head` when `head>0`.
        Note, when `head==0`, or when `tail` increases so much that it reaches `head`, then it would
        mean that the array is completely full, and you need to copy over to a new internal array.

        Write a `RingArrayQueueTest` that extends `MyQueueTestTemplate`.
        If your implementation is correct, all tests should pass.
        Run the tests with code coverage enabled, and verify that all of the instructions in your
        code are covered. If not, add new tests to `RingArrayQueueTest`.*/

