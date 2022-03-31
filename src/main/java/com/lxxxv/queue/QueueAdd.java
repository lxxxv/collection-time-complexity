package com.lxxxv.queue;

import com.lxxxv.CallBackAdd;
import com.lxxxv.Policy;
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
        // https://codechacha.com/ko/java-arrayblockingqueue/
        // ArrayBlockingQueue는 BlockingQueue 인터페이스를 구현
        // Queue를 생성할 때 크기를 설정하며 내부적으로 배열을 사용하여 아이템을 저장
        // 동시성에 안전하여 멀티 쓰레드에서 synchronized 없이 사용 가능
        // 아이템을 꺼낼 때 비어있으며 추가될 때까지 기다림
        // 아이템을 추가할 때 Queue가 가득차있으면 Exception이 발생하거나 일정 시간 기다릴 수 있음
        benchArrayBlockingQueue = new ArrayBlockingQueue<>(Policy.LOOP_COUNT);

        new CallBackAdd
        (
            (Sender)->
            {
                benchArrayBlockingQueue.add(Sender.getData());
                bl.consume(Sender.getData());
            }
        ).start();
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
}