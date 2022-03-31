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
public class QueueGet
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
    public void getPriorityQueue(Blackhole bl)
    {
        benchPriorityQueue = new PriorityQueue<>();

        new CallBackAdd
        (
            (Sender)->
            {
                benchPriorityQueue.add(Sender.getData());
            }
        ).start();

        while(benchPriorityQueue.size() > 0)
        {
            benchPriorityQueue.poll();
            bl.consume(benchPriorityQueue.size());
        }
    }

    @Benchmark
    public void getArrayBlockingQueue(Blackhole bl)
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
    public void getConcurrentLinkedQueue(Blackhole bl)
    {
        benchConcurrentLinkedQueue = new ConcurrentLinkedQueue<>();

        new CallBackAdd
        (
            (Sender)->
            {
                benchConcurrentLinkedQueue.add(Sender.getData());
            }
        ).start();

        while(benchConcurrentLinkedQueue.size() > 0)
        {
            benchConcurrentLinkedQueue.poll();
            bl.consume(benchConcurrentLinkedQueue.size());
        }
    }

    @Benchmark
    public void getDelayQueue(Blackhole bl)
    {
//        benchDelayQueue = new DelayQueue<>();
//
//        new CallBackAdd
//        (
//            (Sender)->
//            {
//                benchDelayQueue.add(Sender.getData());
//            }
//        ).start();
    }

    @Benchmark
    public void getLinkedBlockingQueue(Blackhole bl)
    {
        benchLinkedBlockingQueue = new LinkedBlockingQueue<>();

        new CallBackAdd
        (
            (Sender)->
            {
                benchLinkedBlockingQueue.add(Sender.getData());
            }
        ).start();

        while(benchLinkedBlockingQueue.size() > 0)
        {
            benchLinkedBlockingQueue.poll();
            bl.consume(benchLinkedBlockingQueue.size());
        }
    }

    @Benchmark
    public void getLinkedTransferQueue(Blackhole bl)
    {
        benchLinkedTransferQueue = new LinkedTransferQueue<>();

        new CallBackAdd
        (
            (Sender)->
            {
                benchLinkedTransferQueue.add(Sender.getData());
            }
        ).start();

        while(benchLinkedTransferQueue.size() > 0)
        {
            benchLinkedTransferQueue.poll();
            bl.consume(benchLinkedTransferQueue.size());
        }
    }

    @Benchmark
    public void getPriorityBlockingQueue(Blackhole bl)
    {
        benchPriorityBlockingQueue = new PriorityBlockingQueue<>();

        new CallBackAdd
        (
            (Sender)->
            {
                benchPriorityBlockingQueue.add(Sender.getData());
            }
        ).start();

        while(benchPriorityBlockingQueue.size() > 0)
        {
            benchPriorityBlockingQueue.poll();
            bl.consume(benchPriorityBlockingQueue.size());
        }
    }

    @Benchmark
    public void getSynchronousQueue(Blackhole bl)
    {
        benchSynchronousQueue = new SynchronousQueue<>();

        new CallBackAdd
        (
            (Sender)->
            {
                benchSynchronousQueue.add(Sender.getData());
            }
        ).start();

        while(benchSynchronousQueue.size() > 0)
        {
            benchSynchronousQueue.poll();
            bl.consume(benchSynchronousQueue.size());
        }
    }

    public static void main(String args[]) throws Exception
    {
        Options opt = new OptionsBuilder()
                .include(QueueGet.class.getSimpleName())
                .build();

        new Runner(opt).run();
    }
}