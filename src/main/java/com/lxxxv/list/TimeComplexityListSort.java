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
public class TimeComplexityListSort implements ITimeComplexity
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

        for (int loop = 0; loop < LOOP_COUNT; loop++)
        {
            benchArrayList.add(Integer.toString(rm.nextInt()) + "_" + Integer.toString(loop));
            benchLinkedList.add(Integer.toString(rm.nextInt()) + "_" + Integer.toString(loop));
            benchVector.add(Integer.toString(rm.nextInt()) + "_" + Integer.toString(loop));
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

    public static void main(String args[]) throws Exception
    {
        Options opt = new OptionsBuilder()
                .include(TimeComplexityListSort.class.getSimpleName())
                .forks(1)
                .build();

        new Runner(opt).run();
    }
}
