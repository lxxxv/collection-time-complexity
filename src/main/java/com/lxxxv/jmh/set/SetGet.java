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

        new CallBackRandom().getString
        (
            (Sender)->
            {
                benchHashSet.add(Sender);
                benchLinkedHashSet.add(Sender);
                benchTreeSet.add(Sender);
                benchConcurrentSkipListSet.add(Sender);
                benchCopyOnWriteArraySet.add(Sender);
            }
        );
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