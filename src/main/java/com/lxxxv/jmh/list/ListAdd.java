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
public class ListAdd
{
    public List<String> benchArrayList;
    public List<String> benchLinkedList;
    public List<String> benchVector;

    @Benchmark
    public void addArrayList(Blackhole bl)
    {
        benchArrayList = new ArrayList<>();

        new CallBackRandom().getString
        (
            (Sender)->
            {
                benchArrayList.add(Sender);
                bl.consume(Sender);
            }
        );

        benchArrayList.clear();
    }

    @Benchmark
    public void addLinkedList(Blackhole bl)
    {
        benchLinkedList = new LinkedList<>();

        new CallBackRandom().getString
        (
            (Sender)->
            {
                benchLinkedList.add(Sender);
                bl.consume(Sender);
            }
        );

        benchLinkedList.clear();
    }

    @Benchmark
    public void addVector(Blackhole bl)
    {
        benchVector = new Vector<>();

        new CallBackRandom().getString
        (
            (Sender)->
            {
                benchVector.add(Sender);
                bl.consume(Sender);
            }
        );

        benchVector.clear();
    }
}
