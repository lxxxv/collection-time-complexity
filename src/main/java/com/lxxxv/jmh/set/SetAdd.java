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

        new CallBackRandom().getString
        (
            (Sender)->
            {
                benchHashSet.add(Sender);
                bl.consume(Sender);
            }
        );

        benchHashSet.clear();
    }

    @Benchmark
    public void addLinkedHashSet(Blackhole bl)
    {
        benchLinkedHashSet = new LinkedHashSet<>();

        new CallBackRandom().getString
        (
            (Sender)->
            {
                benchLinkedHashSet.add(Sender);
                bl.consume(Sender);
            }
        );

        benchLinkedHashSet.clear();
    }

    @Benchmark
    public void addTreeSet(Blackhole bl)
    {
        benchTreeSet = new TreeSet<>();

        new CallBackRandom().getString
        (
            (Sender)->
            {
                benchTreeSet.add(Sender);
                bl.consume(Sender);
            }
        );

        benchTreeSet.clear();
    }

    @Benchmark
    public void addConcurrentSkipListSet(Blackhole bl)
    {
        benchConcurrentSkipListSet = new ConcurrentSkipListSet<>();

        new CallBackRandom().getString
        (
            (Sender)->
            {
                benchConcurrentSkipListSet.add(Sender);
                bl.consume(Sender);
            }
        );

        benchConcurrentSkipListSet.clear();
    }

    @Benchmark
    public void addCopyOnWriteArraySet(Blackhole bl)
    {
        benchCopyOnWriteArraySet = new CopyOnWriteArraySet<>();

        new CallBackRandom().getString
        (
            (Sender)->
            {
                benchCopyOnWriteArraySet.add(Sender);
                bl.consume(Sender);
            }
        );

        benchCopyOnWriteArraySet.clear();
    }
}