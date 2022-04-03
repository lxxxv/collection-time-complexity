package com.lxxxv.quick.set;

import com.lxxxv.CallBackRandom;

import java.util.concurrent.*;
import java.util.*;

public class SetAdd
{
    public void execute()
    {
        Set<String> benchHashSet = new HashSet<>();
        Set<String> benchLinkedHashSet = new LinkedHashSet<>();
        Set<String> benchTreeSet = new TreeSet<>();
        Set<String> benchConcurrentSkipListSet = new ConcurrentSkipListSet<>();
        Set<String> benchCopyOnWriteArraySet = new CopyOnWriteArraySet<>();

        this.benchMark(benchHashSet, this.getClass().getSimpleName() + " " + "HashSet");
        this.benchMark(benchLinkedHashSet, this.getClass().getSimpleName() + " " + "LinkedHashSet");
        this.benchMark(benchTreeSet, this.getClass().getSimpleName() + " " + "TreeSet");
        this.benchMark(benchConcurrentSkipListSet, this.getClass().getSimpleName() + " " + "ConcurrentSkipListSet");
        this.benchMark(benchCopyOnWriteArraySet, this.getClass().getSimpleName() + " " + "CopyOnWriteArraySet");
    }

    private void benchMark(Set<String> _collection, String _name)
    {
        long startTick = System.nanoTime();

        this.start(_collection);

        long totalTick = System.nanoTime() - startTick;
        System.out.println(_name + " score : " + totalTick / 1000);
    }

    private void start(Set<String> _collection)
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
