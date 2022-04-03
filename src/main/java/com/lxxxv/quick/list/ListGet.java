package com.lxxxv.quick.list;

import com.lxxxv.CallBackRandom;

import java.util.concurrent.*;
import java.util.*;

public class ListGet
{
    public void execute()
    {
        List<String> benchArrayList = new ArrayList<>();
        List<String> benchLinkedList = new LinkedList<>();
        List<String> benchVector = new Vector<>();

        new CallBackRandom().getString
        (
            (Sender)->
            {
                benchArrayList.add(Sender);
                benchLinkedList.add(Sender);
                benchVector.add(Sender);
            }
        );

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
        for (int loop = 0; loop < _collection.size(); loop++)
        {
            String data = _collection.get(loop);
        }
    }
}
