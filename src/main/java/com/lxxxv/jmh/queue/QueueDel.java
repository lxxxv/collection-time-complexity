package com.lxxxv.jmh.queue;

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
public class QueueDel
{
    public Queue<String> benchPriorityQueue;
    public Queue<String> benchArrayBlockingQueue;
    public Queue<String> benchConcurrentLinkedQueue;
    public Queue<String> benchDelayQueue;
    public Queue<String> benchLinkedBlockingQueue;
    public Queue<String> benchLinkedTransferQueue;
    public Queue<String> benchPriorityBlockingQueue;
    public Queue<String> benchSynchronousQueue;

    @Benchmark
    public void delPriorityQueue(Blackhole bl)
    {
        benchPriorityQueue = new PriorityQueue<>();

        new CallBackRandom().getString
        (
            (Sender)->
            {
                benchPriorityQueue.add(Sender);
            }
        );

        while(benchPriorityQueue.size() > 0)
        {
            benchPriorityQueue.remove(0);
            bl.consume(benchPriorityQueue.size());
        }
    }

    @Benchmark
    public void delArrayBlockingQueue(Blackhole bl)
    {
        benchArrayBlockingQueue = new ArrayBlockingQueue<>(Policy.LOOP_COUNT);

        new CallBackRandom().getString
        (
            (Sender)->
            {
                benchArrayBlockingQueue.add(Sender);
            }
        );

        while(benchArrayBlockingQueue.size() > 0)
        {
            benchArrayBlockingQueue.remove(0);
            bl.consume(benchArrayBlockingQueue.size());
        }
    }

    @Benchmark
    public void delConcurrentLinkedQueue(Blackhole bl)
    {
        benchConcurrentLinkedQueue = new ConcurrentLinkedQueue<>();

        new CallBackRandom().getString
        (
            (Sender)->
            {
                benchConcurrentLinkedQueue.add(Sender);
            }
        );

        while(benchConcurrentLinkedQueue.size() > 0)
        {
            benchConcurrentLinkedQueue.remove(0);
            bl.consume(benchConcurrentLinkedQueue.size());
        }
    }

    @Benchmark
    public void delLinkedBlockingQueue(Blackhole bl)
    {
        benchLinkedBlockingQueue = new LinkedBlockingQueue<>();

        new CallBackRandom().getString
        (
            (Sender)->
            {
                benchLinkedBlockingQueue.add(Sender);
            }
        );

        while(benchLinkedBlockingQueue.size() > 0)
        {
            benchLinkedBlockingQueue.remove(0);
            bl.consume(benchLinkedBlockingQueue.size());
        }
    }

    @Benchmark
    public void delLinkedTransferQueue(Blackhole bl)
    {
        benchLinkedTransferQueue = new LinkedTransferQueue<>();

        new CallBackRandom().getString
        (
            (Sender)->
            {
                benchLinkedTransferQueue.add(Sender);
            }
        );

        while(benchLinkedTransferQueue.size() > 0)
        {
            benchLinkedTransferQueue.remove(0);
            bl.consume(benchLinkedTransferQueue.size());
        }
    }

    @Benchmark
    public void delPriorityBlockingQueue(Blackhole bl)
    {
        benchPriorityBlockingQueue = new PriorityBlockingQueue<>();

        new CallBackRandom().getString
        (
            (Sender)->
            {
                benchPriorityBlockingQueue.add(Sender);
            }
        );

        while(benchPriorityBlockingQueue.size() > 0)
        {
            benchPriorityBlockingQueue.remove(0);
            bl.consume(benchPriorityBlockingQueue.size());
        }
    }

    @Benchmark
    public void delSynchronousQueue(Blackhole bl)
    {
        benchSynchronousQueue = new SynchronousQueue<>();

        new CallBackRandom().getString
        (
            (Sender)->
            {
                benchSynchronousQueue.add(Sender);
            }
        );

        while(benchSynchronousQueue.size() > 0)
        {
            benchSynchronousQueue.remove(0);
            bl.consume(benchSynchronousQueue.size());
        }
    }
}