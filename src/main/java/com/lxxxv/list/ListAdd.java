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
@Warmup(iterations=2, time=2)
@Measurement(iterations=2, time=2)
public class ListAdd
{
    public List<String> benchArrayList;
    public List<String> benchLinkedList;
    public List<String> benchVector;

    @Benchmark
    public void addArrayList(Blackhole bl)
    {
        benchArrayList = new ArrayList<>();

        new CallBackAdd
        (
            (Sender)->
            {
                benchArrayList.add(Sender.getData());
                bl.consume(Sender.getData());
            }
        ).start();
    }

    @Benchmark
    public void addLinkedList(Blackhole bl)
    {
        benchLinkedList = new LinkedList<>();

        new CallBackAdd
        (
            (Sender)->
            {
                benchLinkedList.add(Sender.getData());
                bl.consume(Sender.getData());
            }
        ).start();
    }

    @Benchmark
    public void addVector(Blackhole bl)
    {
        benchVector = new Vector<>();

        new CallBackAdd
        (
            (Sender)->
            {
                benchVector.add(Sender.getData());
                bl.consume(Sender.getData());
            }
        ).start();
    }
}
