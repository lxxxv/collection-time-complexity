package com.lxxxv.quick.map;

import com.lxxxv.CallBackRandom;

import java.util.concurrent.*;
import java.util.*;

public class MapDel
{
    public void execute()
    {
        Map<String, String> benchHashMap = new HashMap<>();
        Map<String, String> benchTreeMap = new TreeMap<>();
        Map<String, String> benchLinkedHashMap = new LinkedHashMap<>();
        Map<String, String> benchIdentityHashMap = new IdentityHashMap<>();
        Map<String, String> benchWeakHashMap = new WeakHashMap<>();

        new CallBackRandom().getString
        (
            (Sender)->
            {
                benchHashMap.put(Sender, Sender);
                benchTreeMap.put(Sender, Sender);
                benchLinkedHashMap.put(Sender, Sender);
                benchIdentityHashMap.put(Sender, Sender);
                benchWeakHashMap.put(Sender, Sender);
            }
        );

        this.benchMark(benchHashMap, this.getClass().getSimpleName() + " " + "HashMap");
        this.benchMark(benchTreeMap, this.getClass().getSimpleName() + " " + "TreeMap");
        this.benchMark(benchLinkedHashMap, this.getClass().getSimpleName() + " " + "LinkedHashMap");
        this.benchMark(benchIdentityHashMap, this.getClass().getSimpleName() + " " + "IdentityHashMap");
        this.benchMark(benchWeakHashMap, this.getClass().getSimpleName() + " " + "WeakHashMap");
    }

    private void benchMark(Map<String, String> _collection, String _name)
    {
        long startTick = System.nanoTime();

        this.start(_collection);

        long totalTick = System.nanoTime() - startTick;
        System.out.println(_name + " score : " + totalTick / 1000);
    }

    private void start(Map<String, String> _collection)
    {
        List<String> keyList = new ArrayList<>();
        for(String key: _collection.keySet()) {keyList.add(key);}
        for(String key: keyList)
        {
            _collection.remove(key);
        }
    }
}
