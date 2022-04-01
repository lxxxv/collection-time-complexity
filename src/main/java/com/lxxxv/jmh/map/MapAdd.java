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
public class MapAdd
{
    public Map<String, String> benchHashMap;
    public Map<String, String> benchTreeMap;
    public Map<String, String> benchLinkedHashMap;
    public Map<String, String> benchIdentityHashMap;
    public Map<String, String> benchWeakHashMap;

    @Benchmark
    public void addHashMap(Blackhole bl)
    {
        benchHashMap = new HashMap<>();

        new CallBackRandom().getString
        (
            (Sender)->
            {
                benchHashMap.put(Sender, Sender);
                bl.consume(Sender);
            }
        );

        benchHashMap.clear();
    }

    @Benchmark
    public void addTreeMap(Blackhole bl)
    {
        benchTreeMap = new TreeMap<>();

        new CallBackRandom().getString
        (
            (Sender)->
            {
                benchTreeMap.put(Sender, Sender);
                bl.consume(Sender);
            }
        );

        benchTreeMap.clear();
    }

    @Benchmark
    public void addLinkedHashMap(Blackhole bl)
    {
        benchLinkedHashMap = new LinkedHashMap<>();

        new CallBackRandom().getString
        (
            (Sender)->
            {
                benchLinkedHashMap.put(Sender, Sender);
                bl.consume(Sender);
            }
        );

        benchLinkedHashMap.clear();
    }

    @Benchmark
    public void addIdentityHashMap(Blackhole bl)
    {
        benchIdentityHashMap = new IdentityHashMap<>();

        new CallBackRandom().getString
        (
            (Sender)->
            {
                benchIdentityHashMap.put(Sender, Sender);
                bl.consume(Sender);
            }
        );

        benchIdentityHashMap.clear();
    }

    @Benchmark
    public void addWeakHashMap(Blackhole bl)
    {
        benchWeakHashMap = new WeakHashMap<>();

        new CallBackRandom().getString
        (
            (Sender)->
            {
                benchWeakHashMap.put(Sender, Sender);
                bl.consume(Sender);
            }
        );

        benchWeakHashMap.clear();
    }
}

