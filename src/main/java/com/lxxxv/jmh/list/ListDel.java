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
public class ListDel
{
    public List<String> benchArrayList;
    public List<String> benchLinkedList;
    public List<String> benchVector;

    @Benchmark
    public void delArrayList(Blackhole bl)
    {
        benchArrayList = new ArrayList<>();

        new CallBackRandom().getString((Sender)-> benchArrayList.add(Sender));

        while(benchArrayList.size() > 0)
        {
            benchArrayList.remove(0);
            bl.consume(benchArrayList.size());
        }
    }

    @Benchmark
    public void delLinkedList(Blackhole bl)
    {
        benchLinkedList = new LinkedList<>();

        new CallBackRandom().getString((Sender)-> benchLinkedList.add(Sender));

        while(benchLinkedList.size() > 0)
        {
            benchLinkedList.remove(0);
            bl.consume(benchLinkedList.size());
        }
    }

    @Benchmark
    public void delVector(Blackhole bl)
    {
        benchVector = new Vector<>();

        new CallBackRandom().getString((Sender)-> benchVector.add(Sender));

        while(benchVector.size() > 0)
        {
            benchVector.remove(0);
            bl.consume(benchVector.size());
        }
    }
}
