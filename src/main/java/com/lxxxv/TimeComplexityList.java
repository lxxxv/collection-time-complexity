package com.lxxxv;

import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import java.util.concurrent.TimeUnit;
import java.util.*;

@State(Scope.Thread)
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MICROSECONDS)
public class TimeComplexityList
{
    public int LOOP_COUNT = 1000;

    public List<String> benchArrayList;
    public List<String> benchLinkedList;
    public List<String> benchVector;

    @Setup
    public void setUp()
    {
        benchArrayList = new ArrayList<>();
        benchLinkedList = new LinkedList<>();
        benchVector = new Vector<>();

        for (int loop = 0; loop < LOOP_COUNT; loop++)
        {
            benchArrayList.add(Integer.toString(loop));
            benchLinkedList.add(Integer.toString(loop));
            benchVector.add(Integer.toString(loop));
        }
    }

    @Benchmark
    public void addArrayList()
    {
        benchArrayList = new ArrayList<>();
        for (int loop = 0; loop < LOOP_COUNT; loop++)
        {
            benchArrayList.add(Integer.toString(loop));
        }
    }

    @Benchmark
    public void addLinkedList()
    {
        benchLinkedList = new LinkedList<>();
        for (int loop = 0; loop < LOOP_COUNT; loop++)
        {
            benchLinkedList.add(Integer.toString(loop));
        }
    }

    @Benchmark
    public void addVector()
    {
        benchVector = new Vector<>();
        for (int loop = 0; loop < LOOP_COUNT; loop++)
        {
            benchVector.add(Integer.toString(loop));
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

    public static void main(String args[]) throws Exception
    {
        Options opt = new OptionsBuilder()
                .include(TimeComplexityList.class.getSimpleName())
                .forks(1)
                .build();

        new Runner(opt).run();
    }
}
