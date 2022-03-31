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
public class ListGet
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
    public void getArrayList(Blackhole bl)
    {
        String result;
        for (int loop = 0; loop < benchArrayList.size(); loop++)
        {
            result = benchArrayList.get(loop);
            bl.consume(result);
        }
    }

    @Benchmark
    public void getLinkedList(Blackhole bl)
    {
        String result;
        for (int loop = 0; loop < benchLinkedList.size(); loop++)
        {
            result = benchLinkedList.get(loop);
            bl.consume(result);
        }
    }

    @Benchmark
    public void getVector(Blackhole bl)
    {
        String result;
        for (int loop = 0; loop < benchVector.size(); loop++)
        {
            result = benchVector.get(loop);
            bl.consume(result);
        }
    }
}
