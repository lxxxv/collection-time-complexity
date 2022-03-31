package com.lxxxv.list;

import com.lxxxv.ITimeComplexity;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import java.util.concurrent.TimeUnit;
import java.util.*;

// http://tutorials.jenkov.com/java-performance/jmh.html
// https://ysjee141.github.io/blog/quality/java-benchmark/

@State(Scope.Thread)
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
public class ListDel implements ITimeComplexity
{
    Random rm;

    public List<String> benchArrayList;
    public List<String> benchLinkedList;
    public List<String> benchVector;

    @Setup
    public void setUp()
    {
        rm = new Random();

        benchArrayList = new ArrayList<>();
        benchLinkedList = new LinkedList<>();
        benchVector = new Vector<>();
    }

    @Benchmark
    public void delArrayList(Blackhole bl)
    {
        for (int loop = 0; loop < LOOP_COUNT; loop++)
        {
            benchArrayList.add(Integer.toString(rm.nextInt()) + "_" + Integer.toString(loop));
        }

        while(benchArrayList.size() > 0)
        {
            benchArrayList.remove(0);
            bl.consume(benchArrayList.size());
        }
    }

    @Benchmark
    public void delLinkedList(Blackhole bl)
    {
        for (int loop = 0; loop < LOOP_COUNT; loop++)
        {
            benchLinkedList.add(Integer.toString(rm.nextInt()) + "_" + Integer.toString(loop));
        }

        while(benchLinkedList.size() > 0)
        {
            benchLinkedList.remove(0);
            bl.consume(benchLinkedList.size());
        }
    }

    @Benchmark
    public void delVector(Blackhole bl)
    {
        for (int loop = 0; loop < LOOP_COUNT; loop++)
        {
            benchVector.add(Integer.toString(rm.nextInt()) + "_" + Integer.toString(loop));
        }

        while(benchVector.size() > 0)
        {
            benchVector.remove(0);
            bl.consume(benchVector.size());
        }
    }

    public static void main(String args[]) throws Exception
    {
        Options opt = new OptionsBuilder()
                .include(ListDel.class.getSimpleName())
                .forks(1)
                .build();

        new Runner(opt).run();
    }
}
