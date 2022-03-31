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

        new CallBackAdd
        (
            (Sender)->
            {
                benchHashMap.put(Sender.getData(), Sender.getData());
                bl.consume(Sender.getData());
            }
        ).start();
    }

    @Benchmark
    public void addTreeMap(Blackhole bl)
    {
        benchTreeMap = new TreeMap<>();

        new CallBackAdd
        (
            (Sender)->
            {
                benchTreeMap.put(Sender.getData(), Sender.getData());
                bl.consume(Sender.getData());
            }
        ).start();
    }

    @Benchmark
    public void addLinkedHashMap(Blackhole bl)
    {
        benchLinkedHashMap = new LinkedHashMap<>();

        new CallBackAdd
        (
            (Sender)->
            {
                benchLinkedHashMap.put(Sender.getData(), Sender.getData());
                bl.consume(Sender.getData());
            }
        ).start();
    }

    @Benchmark
    public void addIdentityHashMap(Blackhole bl)
    {
        benchIdentityHashMap = new IdentityHashMap<>();

        new CallBackAdd
        (
            (Sender)->
            {
                benchIdentityHashMap.put(Sender.getData(), Sender.getData());
                bl.consume(Sender.getData());
            }
        ).start();
    }

    @Benchmark
    public void addWeakHashMap(Blackhole bl)
    {
        benchWeakHashMap = new WeakHashMap<>();

        new CallBackAdd
        (
            (Sender)->
            {
                benchWeakHashMap.put(Sender.getData(), Sender.getData());
                bl.consume(Sender.getData());
            }
        ).start();
    }
}

