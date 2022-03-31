package com.lxxxv.map;

import com.lxxxv.ITimeComplexity;
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
public class MapDel implements ITimeComplexity
{
    Random rm;

    public Map<String, String> benchHashMap;
    public Map<String, String> benchTreeMap;
    public Map<String, String> benchLinkedHashMap;
    public Map<String, String> benchIdentityHashMap;
    public Map<String, String> benchWeakHashMap;

    @Setup
    public void setUp()
    {
        rm = new Random();
    }

    @Benchmark
    public void delHashMap(Blackhole bl)
    {
        benchHashMap = new HashMap<>();

        String result;
        for (int loop = 0; loop < LOOP_COUNT; loop++)
        {
            result = Integer.toString(rm.nextInt()) + "_" + Integer.toString(loop);
            benchHashMap.put(result, result);
        }

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

        String result;
        for (int loop = 0; loop < LOOP_COUNT; loop++)
        {
            result = Integer.toString(rm.nextInt()) + "_" + Integer.toString(loop);
            benchTreeMap.put(result, result);
        }

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

        String result;
        for (int loop = 0; loop < LOOP_COUNT; loop++)
        {
            result = Integer.toString(rm.nextInt()) + "_" + Integer.toString(loop);
            benchLinkedHashMap.put(result, result);
        }

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

        String result;
        for (int loop = 0; loop < LOOP_COUNT; loop++)
        {
            result = Integer.toString(rm.nextInt()) + "_" + Integer.toString(loop);
            benchIdentityHashMap.put(result, result);
        }

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

        String result;
        for (int loop = 0; loop < LOOP_COUNT; loop++)
        {
            result = Integer.toString(rm.nextInt()) + "_" + Integer.toString(loop);
            benchWeakHashMap.put(result, result);
        }

        List<String> keyList = new ArrayList<>();
        for(String key: benchWeakHashMap.keySet()) {keyList.add(key);}
        for(String key: keyList)
        {
            benchWeakHashMap.remove(key);
            bl.consume(key);
        }
    }

    public static void main(String args[]) throws Exception
    {
        Options opt = new OptionsBuilder()
                .include(MapDel.class.getSimpleName())
                .build();

        new Runner(opt).run();
    }
}