package com.lxxxv.set;

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
@Warmup(iterations=2, time=2)
@Measurement(iterations=2, time=2)
public class SetGet
{
    public Set<String> benchHashSet;
    public Set<String> benchLinkedHashSet;
    public Set<String> benchTreeSet;
    public Set<String> benchConcurrentSkipListSet;
    public Set<String> benchCopyOnWriteArraySet;

    @Setup
    public void setUp()
    {
        benchHashSet = new HashSet<>();
        benchLinkedHashSet = new LinkedHashSet<>();
        benchTreeSet = new TreeSet<>();
        benchConcurrentSkipListSet = new ConcurrentSkipListSet<>();
        benchCopyOnWriteArraySet = new CopyOnWriteArraySet<>();

        new CallBackAdd
        (
            (Sender)->
            {
                benchHashSet.add(Sender.getData());
                benchLinkedHashSet.add(Sender.getData());
                benchTreeSet.add(Sender.getData());
                benchConcurrentSkipListSet.add(Sender.getData());
                benchCopyOnWriteArraySet.add(Sender.getData());
            }
        ).start();
    }

    @Benchmark
    public void getHashSet(Blackhole bl)
    {
        Iterator<String> iterList = benchHashSet.iterator();
        while(iterList.hasNext())
        {
            benchHashSet.contains(iterList.next());
            bl.consume(iterList.next());
        }
    }

    @Benchmark
    public void getLinkedHashSet(Blackhole bl)
    {
        Iterator<String> iterList = benchLinkedHashSet.iterator();
        while(iterList.hasNext())
        {
            benchLinkedHashSet.contains(iterList.next());
            bl.consume(iterList.next());
        }
    }

    @Benchmark
    public void getTreeSet(Blackhole bl)
    {
        Iterator<String> iterList = benchTreeSet.iterator();
        while(iterList.hasNext())
        {
            benchTreeSet.contains(iterList.next());
            bl.consume(iterList.next());
        }
    }

    @Benchmark
    public void getConcurrentSkipListSet(Blackhole bl)
    {
        Iterator<String> iterList = benchConcurrentSkipListSet.iterator();
        while(iterList.hasNext())
        {
            benchConcurrentSkipListSet.contains(iterList.next());
            bl.consume(iterList.next());
        }
    }

    @Benchmark
    public void getCopyOnWriteArraySet(Blackhole bl)
    {
        Iterator<String> iterList = benchCopyOnWriteArraySet.iterator();
        while(iterList.hasNext())
        {
            benchCopyOnWriteArraySet.contains(iterList.next());
            bl.consume(iterList.next());
        }
    }
}