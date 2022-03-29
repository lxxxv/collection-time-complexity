package com.lxxxv;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

public class TimeComplexity
{
    @Benchmark
    public void wellHelloThere()
    {
        // this method was intentionally left blank.
    }

    public static void main(String args[]) throws Exception
    {
        System.out.println("======================================================");

        Options opt = new OptionsBuilder()
                .include(TimeComplexity.class.getSimpleName())
                .forks(1)
                .build();

        new Runner(opt).run();
    }
}
