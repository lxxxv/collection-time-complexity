package com.lxxxv;

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
public class TimeComplexityListAdd implements ITimeComplexity
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
    public void addArrayList(Blackhole bl)
    {
        String result;
        for (int loop = 0; loop < LOOP_COUNT; loop++)
        {
            result = Integer.toString(rm.nextInt()) + "_" + Integer.toString(loop);
            benchArrayList.add(result);
            bl.consume(result);
        }
    }

    @Benchmark
    public void addLinkedList(Blackhole bl)
    {
        String result;
        for (int loop = 0; loop < LOOP_COUNT; loop++)
        {
            result = Integer.toString(rm.nextInt()) + "_" + Integer.toString(loop);
            benchLinkedList.add(result);
            bl.consume(result);
        }
    }

    @Benchmark
    public void addVector(Blackhole bl)
    {
        String result;
        for (int loop = 0; loop < LOOP_COUNT; loop++)
        {
            result = Integer.toString(rm.nextInt()) + "_" + Integer.toString(loop);
            benchVector.add(result);
            bl.consume(result);
        }
    }

    public static void main(String args[]) throws Exception
    {
        Options opt = new OptionsBuilder()
                .include(TimeComplexityListAdd.class.getSimpleName())
                .forks(1)
                .build();

        new Runner(opt).run();
    }
}
