package com.lxxxv.quick.list;

import com.lxxxv.CallBackRandom;

import java.util.concurrent.*;
import java.util.*;

public class ListAdd
{
    public void execute()
    {
        List<String> benchArrayList = new ArrayList<>();
        List<String> benchLinkedList = new LinkedList<>();
        List<String> benchVector = new Vector<>();

        this.benchMark(benchArrayList, this.getClass().getSimpleName() + " " + "ArrayList");
        this.benchMark(benchLinkedList, this.getClass().getSimpleName() + " " + "LinkedList");
        this.benchMark(benchVector, this.getClass().getSimpleName() + " " + "Vector");
    }

    private void benchMark(List<String> _collection, String _name)
    {
        long startTick = System.nanoTime();

        this.start(_collection);

        long totalTick = System.nanoTime() - startTick;
        System.out.println(_name + " score : " + totalTick / 1000);
    }

    private void start(List<String> _collection)
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
