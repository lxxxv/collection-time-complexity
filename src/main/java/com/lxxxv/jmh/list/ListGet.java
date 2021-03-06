package com.lxxxv.jmh.list;

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

        new CallBackRandom().getString
        (
            (Sender)->
            {
                benchArrayList.add(Sender);
                benchLinkedList.add(Sender);
                benchVector.add(Sender);
            }
        );
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
