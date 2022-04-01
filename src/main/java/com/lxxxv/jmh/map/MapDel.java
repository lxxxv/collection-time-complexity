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
public class MapDel
{
    public Map<String, String> benchHashMap;
    public Map<String, String> benchTreeMap;
    public Map<String, String> benchLinkedHashMap;
    public Map<String, String> benchIdentityHashMap;
    public Map<String, String> benchWeakHashMap;

    @Setup
    public void setUp()
    {

    }

    @Benchmark
    public void delHashMap(Blackhole bl)
    {
        benchHashMap = new HashMap<>();

        new CallBackRandom().getString
        (
            (Sender)->
            {
                benchHashMap.put(Sender, Sender);
            }
        );

        List<String> keyList = new ArrayList<>();
        for(String key: benchHashMap.keySet()) {keyList.add(key);}
        for(String key: keyList)
        {
            benchHashMap.remove(key);
            bl.consume(key);
        }
    }

    @Benchmark
    public void delTreeMap(Blackhole bl)
    {
        benchTreeMap = new TreeMap<>();

        new CallBackRandom().getString
        (
            (Sender)->
            {
                benchTreeMap.put(Sender, Sender);
            }
        );

        List<String> keyList = new ArrayList<>();
        for(String key: benchTreeMap.keySet()) {keyList.add(key);}
        for(String key: keyList)
        {
            benchTreeMap.remove(key);
            bl.consume(key);
        }
    }

    @Benchmark
    public void delLinkedHashMap(Blackhole bl)
    {
        benchLinkedHashMap = new LinkedHashMap<>();

        new CallBackRandom().getString
        (
            (Sender)->
            {
                benchLinkedHashMap.put(Sender, Sender);
            }
        );

        List<String> keyList = new ArrayList<>();
        for(String key: benchLinkedHashMap.keySet()) {keyList.add(key);}
        for(String key: keyList)
        {
            benchLinkedHashMap.remove(key);
            bl.consume(key);
        }
    }

    @Benchmark
    public void delIdentityHashMap(Blackhole bl)
    {
        benchIdentityHashMap = new IdentityHashMap<>();

        new CallBackRandom().getString
        (
            (Sender)->
            {
                benchIdentityHashMap.put(Sender, Sender);
            }
        );

        List<String> keyList = new ArrayList<>();
        for(String key: benchIdentityHashMap.keySet()) {keyList.add(key);}
        for(String key: keyList)
        {
            benchIdentityHashMap.remove(key);
            bl.consume(key);
        }
    }

    @Benchmark
    public void delWeakHashMap(Blackhole bl)
    {
        benchWeakHashMap = new WeakHashMap<>();

        new CallBackRandom().getString
        (
            (Sender)->
            {
                benchWeakHashMap.put(Sender, Sender);
            }
        );

        List<String> keyList = new ArrayList<>();
        for(String key: benchWeakHashMap.keySet()) {keyList.add(key);}
        for(String key: keyList)
        {
            benchWeakHashMap.remove(key);
            bl.consume(key);
        }
    }
}