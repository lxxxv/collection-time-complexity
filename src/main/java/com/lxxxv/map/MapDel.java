package com.lxxxv.map;

import com.lxxxv.CallBackAdd;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

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

        new CallBackAdd
        (
            (Sender)->
            {
                benchHashMap.put(Sender.getData(), Sender.getData());
            }
        ).start();

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

        new CallBackAdd
        (
            (Sender)->
            {
                benchTreeMap.put(Sender.getData(), Sender.getData());
            }
        ).start();

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

        new CallBackAdd
        (
            (Sender)->
            {
                benchLinkedHashMap.put(Sender.getData(), Sender.getData());
            }
        ).start();

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

        new CallBackAdd
        (
            (Sender)->
            {
                benchIdentityHashMap.put(Sender.getData(), Sender.getData());
            }
        ).start();

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

        new CallBackAdd
        (
            (Sender)->
            {
                benchWeakHashMap.put(Sender.getData(), Sender.getData());
            }
        ).start();

        List<String> keyList = new ArrayList<>();
        for(String key: benchWeakHashMap.keySet()) {keyList.add(key);}
        for(String key: keyList)
        {
            benchWeakHashMap.remove(key);
            bl.consume(key);
        }
    }
}