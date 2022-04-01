package com.lxxxv.jmh.map;

import com.lxxxv.*;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;

import java.util.concurrent.*;
import java.util.*;

// http://tutorials.jenkov.com/java-performance/jmh.html
// https://ysjee141.github.io/blog/quality/java-benchmark/

@State(Scope.Thread)
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
@Warmup(iterations=1, time=5)
@Measurement(iterations=1, time=5)
public class MapGet
{
    public Map<String, String> benchHashMap;
    public Map<String, String> benchTreeMap;
    public Map<String, String> benchLinkedHashMap;
    public Map<String, String> benchIdentityHashMap;
    public Map<String, String> benchWeakHashMap;

    @Setup
    public void setUp()
    {
        benchHashMap = new HashMap<>();
        benchTreeMap = new TreeMap<>();
        benchLinkedHashMap = new LinkedHashMap<>();
        benchIdentityHashMap = new IdentityHashMap<>();
        benchWeakHashMap = new WeakHashMap<>();

        new CallBackAdd
        (
            (Sender)->
            {
                benchHashMap.put(Sender.getData(), Sender.getData());
                benchTreeMap.put(Sender.getData(), Sender.getData());
                benchLinkedHashMap.put(Sender.getData(), Sender.getData());
                benchIdentityHashMap.put(Sender.getData(), Sender.getData());
                benchWeakHashMap.put(Sender.getData(), Sender.getData());
            }
        ).start();
    }

    @Benchmark
    public void getHashMap(Blackhole bl)
    {
        String resultKey;
        Iterator <Map.Entry<String, String>> iterList = benchHashMap.entrySet().iterator();
        while(iterList.hasNext())
        {
            Map.Entry<String, String> entry = iterList.next();
            resultKey = entry.getKey();
            benchHashMap.containsKey(resultKey);
            bl.consume(benchHashMap.get(resultKey));
        }

//        for(String key: benchHashMap.keySet())
//        {
//            bl.consume(benchHashMap.get(key));
//        }
    }

    @Benchmark
    public void getTreeMap(Blackhole bl)
    {
        String resultKey;
        Iterator <Map.Entry<String, String>> iterList = benchTreeMap.entrySet().iterator();
        while(iterList.hasNext())
        {
            Map.Entry<String, String> entry = iterList.next();
            resultKey = entry.getKey();
            benchTreeMap.containsKey(resultKey);
            bl.consume(benchTreeMap.get(resultKey));
        }
    }

    @Benchmark
    public void getLinkedHashMap(Blackhole bl)
    {
        String resultKey;
        Iterator <Map.Entry<String, String>> iterList = benchLinkedHashMap.entrySet().iterator();
        while(iterList.hasNext())
        {
            Map.Entry<String, String> entry = iterList.next();
            resultKey = entry.getKey();
            benchLinkedHashMap.containsKey(resultKey);
            bl.consume(benchLinkedHashMap.get(resultKey));
        }
    }

    @Benchmark
    public void getIdentityHashMap(Blackhole bl)
    {
        String resultKey;
        Iterator <Map.Entry<String, String>> iterList = benchIdentityHashMap.entrySet().iterator();
        while(iterList.hasNext())
        {
            Map.Entry<String, String> entry = iterList.next();
            resultKey = entry.getKey();
            benchIdentityHashMap.containsKey(resultKey);
            bl.consume(benchIdentityHashMap.get(resultKey));
        }
    }

    @Benchmark
    public void getWeakHashMap(Blackhole bl)
    {
        String resultKey;
        Iterator <Map.Entry<String, String>> iterList = benchWeakHashMap.entrySet().iterator();
        while(iterList.hasNext())
        {
            Map.Entry<String, String> entry = iterList.next();
            resultKey = entry.getKey();
            benchWeakHashMap.containsKey(resultKey);
            bl.consume(benchWeakHashMap.get(resultKey));
        }
    }
}