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
        for(String key: benchHashMap.keySet())
        {
            bl.consume(benchHashMap.get(key));
        }

//        Iterator <Map.Entry<String, String>> entries = benchHashMap.entrySet().iterator();
//        while(entries.hasNext())
//        {
//            Map.Entry<String, String> entry = entries.next();
//        }
    }

    @Benchmark
    public void getTreeMap(Blackhole bl)
    {
        for(String key: benchTreeMap.keySet())
        {
            bl.consume(benchTreeMap.get(key));
        }
    }

    @Benchmark
    public void getLinkedHashMap(Blackhole bl)
    {
        for(String key: benchLinkedHashMap.keySet())
        {
            bl.consume(benchLinkedHashMap.get(key));
        }
    }

    @Benchmark
    public void getIdentityHashMap(Blackhole bl)
    {
        for(String key: benchIdentityHashMap.keySet())
        {
            bl.consume(benchIdentityHashMap.get(key));
        }
    }

    @Benchmark
    public void getWeakHashMap(Blackhole bl)
    {
        for(String key: benchWeakHashMap.keySet())
        {
            bl.consume(benchWeakHashMap.get(key));
        }
    }

    public static void main(String args[]) throws Exception
    {
        Options opt = new OptionsBuilder()
                .include(MapGet.class.getSimpleName())
                .build();

        new Runner(opt).run();
    }
}