package com.lxxxv.quick.queue;

import com.lxxxv.CallBackRandom;
import com.lxxxv.Policy;

import java.util.concurrent.*;
import java.util.*;

public class QueueAdd
{
    public void execute()
    {
        Queue<String> benchPriorityQueue = new PriorityQueue<>();
        Queue<String> benchArrayBlockingQueue = new ArrayBlockingQueue<>(Policy.LOOP_COUNT);
        Queue<String> benchConcurrentLinkedQueue = new ConcurrentLinkedQueue<>();
        //Queue<String> benchDelayQueue = new DelayQueue<>();
        Queue<String> benchLinkedBlockingQueue = new LinkedBlockingQueue<>();
        Queue<String> benchLinkedTransferQueue = new LinkedTransferQueue<>();
        Queue<String> benchPriorityBlockingQueue = new PriorityBlockingQueue<>();
        //Queue<String> benchSynchronousQueue = new SynchronousQueue<>();

        this.benchMark(benchPriorityQueue, this.getClass().getSimpleName() + " " + "HashMap");
        this.benchMark(benchArrayBlockingQueue, this.getClass().getSimpleName() + " " + "ArrayBlockingQueue");
        this.benchMark(benchConcurrentLinkedQueue, this.getClass().getSimpleName() + " " + "ConcurrentLinkedQueue");
        //this.benchMark(benchDelayQueue, this.getClass().getSimpleName() + " " + "DelayQueue");
        this.benchMark(benchLinkedBlockingQueue, this.getClass().getSimpleName() + " " + "LinkedBlockingQueue");
        this.benchMark(benchLinkedTransferQueue, this.getClass().getSimpleName() + " " + "LinkedTransferQueue");
        this.benchMark(benchPriorityBlockingQueue, this.getClass().getSimpleName() + " " + "PriorityBlockingQueue");
        //this.benchMark(benchSynchronousQueue, this.getClass().getSimpleName() + " " + "SynchronousQueue");
    }

    private void benchMark(Queue<String> _collection, String _name)
    {
        long startTick = System.nanoTime();

        this.start(_collection);

        long totalTick = System.nanoTime() - startTick;
        System.out.println(_name + " score : " + totalTick / 1000);
    }

    private void start(Queue<String> _collection)
    {
        new CallBackRandom().getString
        (
            (Sender)->
            {
                _collection.add(Sender);
            }
        );
    }
}
