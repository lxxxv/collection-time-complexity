package com.lxxxv.list;

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
public class ListDel
{
    public List<String> benchArrayList;
    public List<String> benchLinkedList;
    public List<String> benchVector;

    @Benchmark
    public void delArrayList(Blackhole bl)
    {
        benchArrayList = new ArrayList<>();

        new CallBackAdd
        (
            (Sender)->
            {
                benchArrayList.add(Sender.getData());
            }
        ).start();

        while(benchArrayList.size() > 0)
        {
            benchArrayList.remove(0);
            bl.consume(benchArrayList.size());
        }
    }

    @Benchmark
    public void delLinkedList(Blackhole bl)
    {
        benchLinkedList = new LinkedList<>();

        new CallBackAdd
        (
            (Sender)->
            {
                benchLinkedList.add(Sender.getData());
            }
        ).start();

        while(benchLinkedList.size() > 0)
        {
            benchLinkedList.remove(0);
            bl.consume(benchLinkedList.size());
        }
    }

    @Benchmark
    public void delVector(Blackhole bl)
    {
        benchVector = new Vector<>();

        new CallBackAdd
        (
            (Sender)->
            {
                benchVector.add(Sender.getData());
            }
        ).start();

        while(benchVector.size() > 0)
        {
            benchVector.remove(0);
            bl.consume(benchVector.size());
        }
    }
}
