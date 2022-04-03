package com.lxxxv.quick.set;

import com.lxxxv.CallBackRandom;

import java.util.concurrent.*;
import java.util.*;

public class SetGet
{
    public void execute()
    {
        Set<String> benchHashSet = new HashSet<>();
        Set<String> benchLinkedHashSet = new LinkedHashSet<>();
        Set<String> benchTreeSet = new TreeSet<>();
        Set<String> benchConcurrentSkipListSet = new ConcurrentSkipListSet<>();
        Set<String> benchCopyOnWriteArraySet = new CopyOnWriteArraySet<>();

        new CallBackRandom().getString
        (
            (Sender)->
            {
                benchHashSet.add(Sender);
                benchLinkedHashSet.add(Sender);
                benchTreeSet.add(Sender);
                benchConcurrentSkipListSet.add(Sender);
                benchCopyOnWriteArraySet.add(Sender);
            }
        );

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
        Iterator<String> iterList = _collection.iterator();
        while(iterList.hasNext())
        {
            _collection.contains(iterList.next());
        }
    }
}
