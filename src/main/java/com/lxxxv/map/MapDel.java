package com.lxxxv.map;

import com.lxxxv.ITimeComplexity;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import java.util.concurrent.TimeUnit;
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

        benchHashMap = new HashMap<>();
        benchTreeMap = new TreeMap<>();
        benchLinkedHashMap = new LinkedHashMap<>();
        benchIdentityHashMap = new IdentityHashMap<>();
        benchWeakHashMap = new WeakHashMap<>();
    }

    @Benchmark
    public void delHashMap(Blackhole bl)
    {
        benchHashMap.clear();

        String result;
        for (int loop = 0; loop < LOOP_COUNT; loop++)
        {
            result = Integer.toString(rm.nextInt()) + "_" + Integer.toString(loop);
            benchHashMap.put(result, result);
            bl.consume(result);
        }

        List<String> keyList = new ArrayList<>();
        for(String key: benchHashMap.keySet()) {keyList.add(key);}
        for(String key: keyList) {benchHashMap.remove(key);}
    }

    @Benchmark
    public void delTreeMap(Blackhole bl)
    {
        benchTreeMap.clear();

        String result;
        for (int loop = 0; loop < LOOP_COUNT; loop++)
        {
            result = Integer.toString(rm.nextInt()) + "_" + Integer.toString(loop);
            benchTreeMap.put(result, result);
            bl.consume(result);
        }

        List<String> keyList = new ArrayList<>();
        for(String key: benchTreeMap.keySet()) {keyList.add(key);}
        for(String key: keyList) {benchTreeMap.remove(key);}
    }

    @Benchmark
    public void delLinkedHashMap(Blackhole bl)
    {
        benchLinkedHashMap.clear();

        String result;
        for (int loop = 0; loop < LOOP_COUNT; loop++)
        {
            result = Integer.toString(rm.nextInt()) + "_" + Integer.toString(loop);
            benchLinkedHashMap.put(result, result);
            bl.consume(result);
        }

        List<String> keyList = new ArrayList<>();
        for(String key: benchLinkedHashMap.keySet()) {keyList.add(key);}
        for(String key: keyList) {benchLinkedHashMap.remove(key);}
    }

    @Benchmark
    public void delIdentityHashMap(Blackhole bl)
    {
        benchIdentityHashMap.clear();

        String result;
        for (int loop = 0; loop < LOOP_COUNT; loop++)
        {
            result = Integer.toString(rm.nextInt()) + "_" + Integer.toString(loop);
            benchIdentityHashMap.put(result, result);
            bl.consume(result);
        }

        List<String> keyList = new ArrayList<>();
        for(String key: benchIdentityHashMap.keySet()) {keyList.add(key);}
        for(String key: keyList) {benchIdentityHashMap.remove(key);}
    }

    @Benchmark
    public void delWeakHashMap(Blackhole bl)
    {
        benchWeakHashMap.clear();

        String result;
        for (int loop = 0; loop < LOOP_COUNT; loop++)
        {
            result = Integer.toString(rm.nextInt()) + "_" + Integer.toString(loop);
            benchWeakHashMap.put(result, result);
            bl.consume(result);
        }

        List<String> keyList = new ArrayList<>();
        for(String key: benchWeakHashMap.keySet()) {keyList.add(key);}
        for(String key: keyList) {benchWeakHashMap.remove(key);}
    }

    public static void main(String args[]) throws Exception
    {
        Options opt = new OptionsBuilder()
                .include(MapDel.class.getSimpleName())
                .forks(1)
                .build();

        new Runner(opt).run();
    }
}