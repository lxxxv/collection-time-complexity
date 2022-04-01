package com.lxxxv.jmh.set;

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
public class SetAdd
{
    public Set<String> benchHashSet;
    public Set<String> benchLinkedHashSet;
    public Set<String> benchTreeSet;
    public Set<String> benchConcurrentSkipListSet;
    public Set<String> benchCopyOnWriteArraySet;

    @Benchmark
    public void addHashSet(Blackhole bl)
    {
        benchHashSet = new HashSet<>();

        new CallBackAdd
        (
            (Sender)->
            {
                benchHashSet.add(Sender.getData());
                bl.consume(Sender.getData());
            }
        ).start();

        benchHashSet.clear();
    }

    @Benchmark
    public void addLinkedHashSet(Blackhole bl)
    {
        benchLinkedHashSet = new LinkedHashSet<>();

        new CallBackAdd
        (
            (Sender)->
            {
                benchLinkedHashSet.add(Sender.getData());
                bl.consume(Sender.getData());
            }
        ).start();

        benchLinkedHashSet.clear();
    }

    @Benchmark
    public void addTreeSet(Blackhole bl)
    {
        benchTreeSet = new TreeSet<>();

        new CallBackAdd
        (
            (Sender)->
            {
                benchTreeSet.add(Sender.getData());
                bl.consume(Sender.getData());
            }
        ).start();

        benchTreeSet.clear();
    }

    @Benchmark
    public void addConcurrentSkipListSet(Blackhole bl)
    {
        benchConcurrentSkipListSet = new ConcurrentSkipListSet<>();

        new CallBackAdd
        (
            (Sender)->
            {
                benchConcurrentSkipListSet.add(Sender.getData());
                bl.consume(Sender.getData());
            }
        ).start();

        benchConcurrentSkipListSet.clear();
    }

    @Benchmark
    public void addCopyOnWriteArraySet(Blackhole bl)
    {
        benchCopyOnWriteArraySet = new CopyOnWriteArraySet<>();

        new CallBackAdd
        (
            (Sender)->
            {
                benchCopyOnWriteArraySet.add(Sender.getData());
                bl.consume(Sender.getData());
            }
        ).start();

        benchCopyOnWriteArraySet.clear();
    }
}