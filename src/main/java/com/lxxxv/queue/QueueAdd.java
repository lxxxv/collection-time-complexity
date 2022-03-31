package com.lxxxv.queue;

import com.lxxxv.CallBackAdd;
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
public class QueueAdd
{
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

    }

    @Benchmark
    public void addPriorityQueue(Blackhole bl)
    {
        benchPriorityQueue = new PriorityQueue<>();

        new CallBackAdd
        (
            (Sender)->
            {
                benchPriorityQueue.add(Sender.getData());
                bl.consume(Sender.getData());
            }
        ).start();
    }

    @Benchmark
    public void addArrayBlockingQueue(Blackhole bl)
    {
//        benchArrayBlockingQueue = new ArrayBlockingQueue<>();
//
//        new CallBackAdd
//        (
//            (Sender)->
//            {
//                benchArrayBlockingQueue.add(Sender.getData());
//                bl.consume(Sender.getData());
//            }
//        ).start();
    }

    @Benchmark
    public void addConcurrentLinkedQueue(Blackhole bl)
    {
        benchConcurrentLinkedQueue = new ConcurrentLinkedQueue<>();

        new CallBackAdd
        (
            (Sender)->
            {
                benchConcurrentLinkedQueue.add(Sender.getData());
                bl.consume(Sender.getData());
            }
        ).start();
    }

    @Benchmark
    public void addDelayQueue(Blackhole bl)
    {
//        benchDelayQueue = new DelayQueue<>();
//
//        new CallBackAdd
//        (
//            (Sender)->
//            {
//                benchDelayQueue.add(Sender.getData());
//                bl.consume(Sender.getData());
//            }
//        ).start();
    }

    @Benchmark
    public void addLinkedBlockingQueue(Blackhole bl)
    {
        benchLinkedBlockingQueue = new LinkedBlockingQueue<>();

        new CallBackAdd
        (
            (Sender)->
            {
                benchLinkedBlockingQueue.add(Sender.getData());
                bl.consume(Sender.getData());
            }
        ).start();
    }

    @Benchmark
    public void addLinkedTransferQueue(Blackhole bl)
    {
        benchLinkedTransferQueue = new LinkedTransferQueue<>();

        new CallBackAdd
        (
            (Sender)->
            {
                benchLinkedTransferQueue.add(Sender.getData());
                bl.consume(Sender.getData());
            }
        ).start();
    }

    @Benchmark
    public void addPriorityBlockingQueue(Blackhole bl)
    {
        benchPriorityBlockingQueue = new PriorityBlockingQueue<>();

        new CallBackAdd
        (
            (Sender)->
            {
                benchPriorityBlockingQueue.add(Sender.getData());
                bl.consume(Sender.getData());
            }
        ).start();
    }

    @Benchmark
    public void addSynchronousQueue(Blackhole bl)
    {
        benchSynchronousQueue = new SynchronousQueue<>();

        new CallBackAdd
        (
            (Sender)->
            {
                benchSynchronousQueue.add(Sender.getData());
                bl.consume(Sender.getData());
            }
        ).start();
    }

    public static void main(String args[]) throws Exception
    {
        Options opt = new OptionsBuilder()
                .include(QueueAdd.class.getSimpleName())
                .build();

        new Runner(opt).run();
    }
}