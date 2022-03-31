package com.lxxxv.queue;

import com.lxxxv.ITimeComplexity;
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
public class QueueAdd implements ITimeComplexity
{
    Random rm;

    public Queue<String> benchPriorityQueue;
    public Queue<String> benchArrayBlockingQueue;
    public Queue<String> benchConcurrentLinkedQueue;
    public Queue<String> benchDelayQueue;
    public Queue<String> benchLinkedBlockingQueue;
    public Queue<String> benchLinkedTransferQueue;
    public Queue<String> benchPriorityBlockingQueue;
    public Queue<String> benchSynchronousQueue;

    @Setup
    public void setUp()
    {
        rm = new Random();
    }

    @Benchmark
    public void addPriorityQueue(Blackhole bl)
    {
        benchPriorityQueue = new PriorityQueue<>();

        String result;
        for (int loop = 0; loop < LOOP_COUNT; loop++)
        {
            result = Integer.toString(rm.nextInt()) + "_" + Integer.toString(loop);
            benchPriorityQueue.add(result);
            bl.consume(result);
        }
    }

    @Benchmark
    public void addArrayBlockingQueue(Blackhole bl)
    {
//        benchArrayBlockingQueue = new ArrayBlockingQueue<>();
//
//        String result;
//        for (int loop = 0; loop < LOOP_COUNT; loop++)
//        {
//            result = Integer.toString(rm.nextInt()) + "_" + Integer.toString(loop);
//            benchArrayBlockingQueue.add(result);
//            bl.consume(result);
//        }
    }

    @Benchmark
    public void addConcurrentLinkedQueue(Blackhole bl)
    {
        benchConcurrentLinkedQueue = new ConcurrentLinkedQueue<>();

        String result;
        for (int loop = 0; loop < LOOP_COUNT; loop++)
        {
            result = Integer.toString(rm.nextInt()) + "_" + Integer.toString(loop);
            benchConcurrentLinkedQueue.add(result);
            bl.consume(result);
        }
    }

    @Benchmark
    public void addDelayQueue(Blackhole bl)
    {

    }

    @Benchmark
    public void addLinkedBlockingQueue(Blackhole bl)
    {

    }

    @Benchmark
    public void addLinkedTransferQueue(Blackhole bl)
    {

    }

    @Benchmark
    public void addPriorityBlockingQueue(Blackhole bl)
    {

    }

    @Benchmark
    public void addSynchronousQueue(Blackhole bl)
    {

    }

    public static void main(String args[]) throws Exception
    {
        Options opt = new OptionsBuilder()
                .include(QueueAdd.class.getSimpleName())
                .build();

        new Runner(opt).run();
    }
}