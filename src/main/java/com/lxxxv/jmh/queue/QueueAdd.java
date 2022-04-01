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

        new CallBackRandom().getString
        (
            (Sender)->
            {
                benchPriorityQueue.add(Sender);
                bl.consume(Sender);
            }
        );

        benchPriorityQueue.clear();
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

        new CallBackRandom().getString
        (
            (Sender)->
            {
                benchArrayBlockingQueue.add(Sender);
                bl.consume(Sender);
            }
        );

        benchArrayBlockingQueue.clear();
    }

    @Benchmark
    public void addConcurrentLinkedQueue(Blackhole bl)
    {
        benchConcurrentLinkedQueue = new ConcurrentLinkedQueue<>();

        new CallBackRandom().getString
        (
            (Sender)->
            {
                benchConcurrentLinkedQueue.add(Sender);
                bl.consume(Sender);
            }
        );

        benchConcurrentLinkedQueue.clear();
    }

    @Benchmark
    public void addLinkedBlockingQueue(Blackhole bl)
    {
        benchLinkedBlockingQueue = new LinkedBlockingQueue<>();

        new CallBackRandom().getString
        (
            (Sender)->
            {
                benchLinkedBlockingQueue.add(Sender);
                bl.consume(Sender);
            }
        );

        benchLinkedBlockingQueue.clear();
    }

    @Benchmark
    public void addLinkedTransferQueue(Blackhole bl)
    {
        benchLinkedTransferQueue = new LinkedTransferQueue<>();

        new CallBackRandom().getString
        (
            (Sender)->
            {
                benchLinkedTransferQueue.add(Sender);
                bl.consume(Sender);
            }
        );

        benchLinkedTransferQueue.clear();
    }

    @Benchmark
    public void addPriorityBlockingQueue(Blackhole bl)
    {
        benchPriorityBlockingQueue = new PriorityBlockingQueue<>();

        new CallBackRandom().getString
        (
            (Sender)->
            {
                benchPriorityBlockingQueue.add(Sender);
                bl.consume(Sender);
            }
        );

        benchPriorityBlockingQueue.clear();
    }
}