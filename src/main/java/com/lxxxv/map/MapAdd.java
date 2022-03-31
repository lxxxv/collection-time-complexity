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
public class MapAdd implements ITimeComplexity
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
    public void addHashMap(Blackhole bl)
    {
        benchHashMap = new HashMap<>();

        String result;
        for (int loop = 0; loop < LOOP_COUNT; loop++)
        {
            result = Integer.toString(rm.nextInt()) + "_" + Integer.toString(loop);
            benchHashMap.put(result, result);
            bl.consume(result);
        }
    }

    @Benchmark
    public void addTreeMap(Blackhole bl)
    {
        benchTreeMap = new TreeMap<>();

        String result;
        for (int loop = 0; loop < LOOP_COUNT; loop++)
        {
            result = Integer.toString(rm.nextInt()) + "_" + Integer.toString(loop);
            benchTreeMap.put(result, result);
            bl.consume(result);
        }
    }

    @Benchmark
    public void addLinkedHashMap(Blackhole bl)
    {
        benchLinkedHashMap = new LinkedHashMap<>();

        String result;
        for (int loop = 0; loop < LOOP_COUNT; loop++)
        {
            result = Integer.toString(rm.nextInt()) + "_" + Integer.toString(loop);
            benchLinkedHashMap.put(result, result);
            bl.consume(result);
        }
    }

    @Benchmark
    public void addIdentityHashMap(Blackhole bl)
    {
        benchIdentityHashMap = new IdentityHashMap<>();

        String result;
        for (int loop = 0; loop < LOOP_COUNT; loop++)
        {
            result = Integer.toString(rm.nextInt()) + "_" + Integer.toString(loop);
            benchIdentityHashMap.put(result, result);
            bl.consume(result);
        }
    }

    @Benchmark
    public void addWeakHashMap(Blackhole bl)
    {
        benchWeakHashMap = new WeakHashMap<>();

        String result;
        for (int loop = 0; loop < LOOP_COUNT; loop++)
        {
            result = Integer.toString(rm.nextInt()) + "_" + Integer.toString(loop);
            benchWeakHashMap.put(result, result);
            bl.consume(result);
        }
    }

    public static void main(String args[]) throws Exception
    {
        Options opt = new OptionsBuilder()
                .include(MapAdd.class.getSimpleName())
                .build();

        new Runner(opt).run();
    }
}

