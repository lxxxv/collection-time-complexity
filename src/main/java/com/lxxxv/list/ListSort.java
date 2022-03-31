package com.lxxxv.list;

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
public class ListSort
{
    public List<String> benchArrayList;
    public List<String> benchLinkedList;
    public List<String> benchVector;

    @Setup
    public void setUp()
    {
        benchArrayList = new ArrayList<>();
        benchLinkedList = new LinkedList<>();
        benchVector = new Vector<>();

        new CallBackAdd
        (
            (Sender)->
            {
                benchArrayList.add(Sender.getData());
                benchLinkedList.add(Sender.getData());
                benchVector.add(Sender.getData());
            }
        ).start();
    }

    @Benchmark
    public void sortArrayList(Blackhole bl)
    {
        bl.consume(0);
        Collections.sort(benchArrayList);
        bl.consume(benchArrayList.size());
    }

    @Benchmark
    public void sortLinkedList(Blackhole bl)
    {
        bl.consume(0);
        Collections.sort(benchLinkedList);
        bl.consume(benchLinkedList.size());
    }

    @Benchmark
    public void sortVector(Blackhole bl)
    {
        bl.consume(0);
        Collections.sort(benchVector);
        bl.consume(benchVector.size());
    }
}
