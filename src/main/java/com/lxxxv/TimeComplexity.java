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
        /*
         * ============================== HOW TO RUN THIS TEST: ====================================
         *
         * You are expected to see the run with large number of iterations, and
         * very large throughput numbers. You can see that as the estimate of the
         * harness overheads per method call. In most of our measurements, it is
         * down to several cycles per call.
         *
         * a) Via command-line:
         *    $ mvn clean install
         *    $ java -jar target/benchmarks.jar TimeComplexity
         *
         * JMH generates self-contained JARs, bundling JMH together with it.
         * The runtime options for the JMH are available with "-h":
         *    $ java -jar target/benchmarks.jar -h
         *
         *
         * b) Via the Java API:
         *    (see the JMH homepage for possible caveats when running from IDE:
         *      http://openjdk.java.net/projects/code-tools/jmh/)
         */

        //java -jar .\target\benchmarks.jar DequeAdd ;
        //java -jar .\target\benchmarks.jar DequeDel ;
        //java -jar .\target\benchmarks.jar DequeGet ;
        //java -jar .\target\benchmarks.jar ListAdd ;
        //java -jar .\target\benchmarks.jar ListDel ;
        //java -jar .\target\benchmarks.jar ListGet ;
        //java -jar .\target\benchmarks.jar ListSort ;
        //java -jar .\target\benchmarks.jar MapAdd ;
        //java -jar .\target\benchmarks.jar MapDel ;
        //java -jar .\target\benchmarks.jar MapGet ;
        //java -jar .\target\benchmarks.jar QueueAdd ;
        //java -jar .\target\benchmarks.jar QueueDel ;
        //java -jar .\target\benchmarks.jar QueueGet ;
        //java -jar .\target\benchmarks.jar SetAdd ;
        //java -jar .\target\benchmarks.jar SetDel ;
        //java -jar .\target\benchmarks.jar SetGet

        Options opt = new OptionsBuilder()
                .include(TimeComplexity.class.getSimpleName())
                .forks(1)
                .build();

        new Runner(opt).run();
    }
}
