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
public class TimeComplexityList
{
    public int LOOP_COUNT = 1000;

    Random rm;

    public List<String> benchArrayList;
    public List<String> benchLinkedList;
    public List<String> benchVector;

    public List<String> benchList;

    @Setup
    public void setUp()
    {
        rm = new Random();

        benchArrayList = new ArrayList<>();
        benchLinkedList = new LinkedList<>();
        benchVector = new Vector<>();

        for (int loop = 0; loop < LOOP_COUNT; loop++)
        {
            benchArrayList.add(Integer.toString(rm.nextInt()) + "_" + Integer.toString(loop));
            benchLinkedList.add(Integer.toString(rm.nextInt()) + "_" + Integer.toString(loop));
            benchVector.add(Integer.toString(rm.nextInt()) + "_" + Integer.toString(loop));
        }
    }

    @Benchmark
    public void addArrayList(Blackhole bl)
    {
        benchList = new ArrayList<>();
        String result;
        for (int loop = 0; loop < LOOP_COUNT; loop++)
        {
            result = Integer.toString(rm.nextInt()) + "_" + Integer.toString(loop);
            benchList.add(result);
            bl.consume(result);
        }
    }

    @Benchmark
    public void addLinkedList(Blackhole bl)
    {
        benchList = new LinkedList<>();
        String result;
        for (int loop = 0; loop < LOOP_COUNT; loop++)
        {
            result = Integer.toString(rm.nextInt()) + "_" + Integer.toString(loop);
            benchList.add(result);
            bl.consume(result);
        }
    }

    @Benchmark
    public void addVector(Blackhole bl)
    {
        benchList = new Vector<>();
        String result;
        for (int loop = 0; loop < LOOP_COUNT; loop++)
        {
            result = Integer.toString(rm.nextInt()) + "_" + Integer.toString(loop);
            benchList.add(result);
            bl.consume(result);
        }
    }

    @Benchmark
    public void getArrayList(Blackhole bl)
    {
        String result;
        for (int loop = 0; loop < LOOP_COUNT; loop++)
        {
            result = benchArrayList.get(loop);
            bl.consume(result);
        }
    }

    @Benchmark
    public void getLinkedList(Blackhole bl)
    {
        String result;
        for (int loop = 0; loop < LOOP_COUNT; loop++)
        {
            result = benchLinkedList.get(loop);
            bl.consume(result);
        }
    }

    @Benchmark
    public void getVector(Blackhole bl)
    {
        String result;
        for (int loop = 0; loop < LOOP_COUNT; loop++)
        {
            result = benchVector.get(loop);
            bl.consume(result);
        }
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

    @Benchmark
    public void delArrayList(Blackhole bl)
    {
        while(benchArrayList.size() > 0)
        {
            benchArrayList.remove(0);
            bl.consume(benchArrayList.size());
        }
    }

    @Benchmark
    public void delLinkedList(Blackhole bl)
    {
        while(benchLinkedList.size() > 0)
        {
            benchLinkedList.remove(0);
            bl.consume(benchLinkedList.size());
        }
    }

    @Benchmark
    public void delVector(Blackhole bl)
    {
        while(benchVector.size() > 0)
        {
            benchVector.remove(0);
            bl.consume(benchVector.size());
        }
    }

    public static void main(String args[]) throws Exception
    {
        Options opt = new OptionsBuilder()
                .include(TimeComplexityList.class.getSimpleName())
                .forks(1)
                .build();

        new Runner(opt).run();
    }
}
