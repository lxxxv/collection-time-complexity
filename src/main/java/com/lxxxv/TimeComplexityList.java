package com.lxxxv;

import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import java.util.concurrent.TimeUnit;
import java.util.*;

@State(Scope.Thread)
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
public class TimeComplexityList
{
    public int LOOP_COUNT = 100000;

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
    public void addArrayList()
    {
        benchList = new ArrayList<>();
        for (int loop = 0; loop < LOOP_COUNT; loop++)
        {
            benchList.add(Integer.toString(rm.nextInt()) + "_" + Integer.toString(loop));
        }
    }

    @Benchmark
    public void addLinkedList()
    {
        benchList = new LinkedList<>();
        for (int loop = 0; loop < LOOP_COUNT; loop++)
        {
            benchList.add(Integer.toString(rm.nextInt()) + "_" + Integer.toString(loop));
        }
    }

    @Benchmark
    public void addVector()
    {
        benchList = new Vector<>();
        for (int loop = 0; loop < LOOP_COUNT; loop++)
        {
            benchList.add(Integer.toString(rm.nextInt()) + "_" + Integer.toString(loop));
        }
    }

    @Benchmark
    public void getArrayList()
    {
        String result;
        for (int loop = 0; loop < LOOP_COUNT; loop++)
        {
            result = benchArrayList.get(loop);
        }
    }

    @Benchmark
    public void getLinkedList()
    {
        String result;
        for (int loop = 0; loop < LOOP_COUNT; loop++)
        {
            result = benchLinkedList.get(loop);
        }
    }

    @Benchmark
    public void getVector()
    {
        String result;
        for (int loop = 0; loop < LOOP_COUNT; loop++)
        {
            result = benchVector.get(loop);
        }
    }

    @Benchmark
    public void sortArrayList()
    {
        Collections.sort(benchArrayList);
    }

    @Benchmark
    public void sortLinkedList()
    {
        Collections.sort(benchLinkedList);
    }

    @Benchmark
    public void sortVector()
    {
        Collections.sort(benchVector);
    }

    @Benchmark
    public void delArrayList()
    {
        for (int loop = 0; loop < LOOP_COUNT; loop++)
        {
            benchArrayList.remove(loop);
        }
    }

    @Benchmark
    public void delLinkedList()
    {
        for (int loop = 0; loop < LOOP_COUNT; loop++)
        {
            benchLinkedList.remove(loop);
        }
    }

    @Benchmark
    public void delVector()
    {
        for (int loop = 0; loop < LOOP_COUNT; loop++)
        {
            benchVector.remove(loop);
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
