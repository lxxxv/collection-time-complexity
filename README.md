# collection-time-complexity

# JMH version: 1.33<br/>
# VM version: JDK 1.8.0_302, OpenJDK 64-Bit Server VM GraalVM CE 21.2.0, 25.302-b07-jvmci-21.2-b08<br/>
# VM invoker: D:\install\dev\graalvm\ce-java8-21.2.0\jre\bin\java.exe<br/>
# VM options: <none><br/>
# Blackhole mode: full + dont-inline hint (default, use -Djmh.blackhole.autoDetect=true to auto-detect)<br/>
# Warmup: 5 iterations, 10 s each<br/>
# Measurement: 5 iterations, 10 s each<br/>
# Timeout: 10 min per iteration<br/>
# Threads: 1 thread, will synchronize iterations<br/>
# Benchmark mode: Average time, time/op<br/>
# Benchmark: com.lxxxv.TimeComplexityList.addArrayList<br/>
<br/>
# Run progress: 0.00% complete, ETA 00:50:00<br/>
# Fork: 1 of 5<br/>
# Warmup Iteration   1: 11.856 us/op<br/>
# Warmup Iteration   2: 18.976 us/op<br/>
# Warmup Iteration   3: 19.830 us/op<br/>
# Warmup Iteration   4: 19.547 us/op<br/>
# Warmup Iteration   5: 19.019 us/op<br/>
Iteration   1: 19.643 us/op<br/>
Iteration   2: 20.145 us/op<br/>
Iteration   3: 20.197 us/op<br/>
Iteration   4: 20.488 us/op<br/>
Iteration   5: 19.476 us/op<br/>
<br/>
# Run progress: 3.33% complete, ETA 00:48:33<br/>
# Fork: 2 of 5<br/>
# Warmup Iteration   1: 10.947 us/op<br/>
# Warmup Iteration   2: 20.866 us/op<br/>
# Warmup Iteration   3: 20.125 us/op<br/>
# Warmup Iteration   4: 19.724 us/op<br/>
# Warmup Iteration   5: 19.589 us/op<br/>
Iteration   1: 19.813 us/op<br/>
Iteration   2: 18.968 us/op<br/>
Iteration   3: 17.897 us/op<br/>
Iteration   4: 18.917 us/op<br/>
Iteration   5: 9.899 us/op<br/>
<br/>
# Run progress: 6.67% complete, ETA 00:46:53<br/>
# Fork: 3 of 5<br/>
# Warmup Iteration   1: 11.164 us/op<br/>
# Warmup Iteration   2: 18.907 us/op<br/>
# Warmup Iteration   3: 20.171 us/op<br/>
# Warmup Iteration   4: 19.148 us/op<br/>
# Warmup Iteration   5: 18.953 us/op<br/>
Iteration   1: 19.828 us/op<br/>
Iteration   2: 19.026 us/op<br/>
Iteration   3: 18.552 us/op<br/>
Iteration   4: 18.579 us/op<br/>
Iteration   5: 19.185 us/op<br/>
<br/>
# Run progress: 10.00% complete, ETA 00:45:12<br/>
# Fork: 4 of 5<br/>
# Warmup Iteration   1: 11.307 us/op<br/>
# Warmup Iteration   2: 19.979 us/op<br/>
# Warmup Iteration   3: 19.397 us/op<br/>
# Warmup Iteration   4: 19.900 us/op<br/>
# Warmup Iteration   5: 19.306 us/op<br/>
Iteration   1: 19.195 us/op<br/>
Iteration   2: 19.129 us/op<br/>
Iteration   3: 19.779 us/op<br/>
Iteration   4: 19.456 us/op<br/>
Iteration   5: 19.307 us/op<br/>
<br/>
# Run progress: 13.33% complete, ETA 00:43:32<br/>
# Fork: 5 of 5<br/>
# Warmup Iteration   1: 10.935 us/op<br/>
# Warmup Iteration   2: 19.309 us/op<br/>
# Warmup Iteration   3: 20.182 us/op<br/>
# Warmup Iteration   4: 19.210 us/op<br/>
# Warmup Iteration   5: 19.571 us/op<br/>
Iteration   1: 19.269 us/op<br/>
Iteration   2: 19.345 us/op<br/>
Iteration   3: 19.138 us/op<br/>
Iteration   4: 19.894 us/op<br/>
Iteration   5: 19.992 us/op<br/>
<br/>
<br/>
Result "com.lxxxv.TimeComplexityList.addArrayList":<br/>
  19.005 ±(99.9%) 1.485 us/op [Average]<br/>
  (min, avg, max) = (9.899, 19.005, 20.488), stdev = 1.983<br/>
  CI (99.9%): [17.519, 20.490] (assumes normal distribution)<br/>
<br/>
<br/>
# JMH version: 1.33<br/>
# VM version: JDK 1.8.0_302, OpenJDK 64-Bit Server VM GraalVM CE 21.2.0, 25.302-b07-jvmci-21.2-b08<br/>
# VM invoker: D:\install\dev\graalvm\ce-java8-21.2.0\jre\bin\java.exe<br/>
# VM options: <none><br/>
# Blackhole mode: full + dont-inline hint (default, use -Djmh.blackhole.autoDetect=true to auto-detect)<br/>
# Warmup: 5 iterations, 10 s each<br/>
# Measurement: 5 iterations, 10 s each<br/>
# Timeout: 10 min per iteration<br/>
# Threads: 1 thread, will synchronize iterations<br/>
# Benchmark mode: Average time, time/op<br/>
# Benchmark: com.lxxxv.TimeComplexityList.addLinkedList<br/>
<br/>
# Run progress: 16.67% complete, ETA 00:41:51<br/>
# Fork: 1 of 5<br/>
# Warmup Iteration   1: 10.023 us/op<br/>
# Warmup Iteration   2: 16.682 us/op<br/>
# Warmup Iteration   3: 17.620 us/op<br/>
# Warmup Iteration   4: 17.538 us/op<br/>
# Warmup Iteration   5: 17.411 us/op<br/>
Iteration   1: 17.236 us/op<br/>
Iteration   2: 17.469 us/op<br/>
Iteration   3: 17.936 us/op<br/>
Iteration   4: 18.519 us/op<br/>
Iteration   5: 17.550 us/op<br/>
<br/>
# Run progress: 20.00% complete, ETA 00:40:11<br/>
# Fork: 2 of 5<br/>
# Warmup Iteration   1: 10.241 us/op<br/>
# Warmup Iteration   2: 18.107 us/op<br/>
# Warmup Iteration   3: 18.156 us/op<br/>
# Warmup Iteration   4: 17.728 us/op<br/>
# Warmup Iteration   5: 17.769 us/op<br/>
Iteration   1: 17.546 us/op<br/>
Iteration   2: 17.822 us/op<br/>
Iteration   3: 16.394 us/op<br/>
Iteration   4: 17.528 us/op<br/>
Iteration   5: 18.496 us/op<br/>
<br/>
# Run progress: 23.33% complete, ETA 00:38:30<br/>
# Fork: 3 of 5<br/>
# Warmup Iteration   1: 10.574 us/op<br/>
# Warmup Iteration   2: 17.265 us/op<br/>
# Warmup Iteration   3: 18.046 us/op<br/>
# Warmup Iteration   4: 17.194 us/op<br/>
# Warmup Iteration   5: 16.590 us/op<br/>
Iteration   1: 19.065 us/op<br/>
Iteration   2: 18.254 us/op<br/>
Iteration   3: 18.494 us/op<br/>
Iteration   4: 18.685 us/op<br/>
Iteration   5: 18.496 us/op<br/>
<br/>
# Run progress: 26.67% complete, ETA 00:36:50<br/>
# Fork: 4 of 5<br/>
# Warmup Iteration   1: 10.051 us/op<br/>
# Warmup Iteration   2: 17.594 us/op<br/>
# Warmup Iteration   3: 17.363 us/op<br/>
# Warmup Iteration   4: 18.100 us/op<br/>
# Warmup Iteration   5: 18.292 us/op<br/>
Iteration   1: 10.670 us/op<br/>
Iteration   2: 11.415 us/op<br/>
Iteration   3: 18.549 us/op<br/>
Iteration   4: 18.362 us/op<br/>
Iteration   5: 18.683 us/op<br/>
<br/>
# Run progress: 30.00% complete, ETA 00:35:09<br/>
# Fork: 5 of 5<br/>
# Warmup Iteration   1: 10.553 us/op<br/>
# Warmup Iteration   2: 18.117 us/op<br/>
# Warmup Iteration   3: 18.047 us/op<br/>
# Warmup Iteration   4: 18.370 us/op<br/>
# Warmup Iteration   5: 18.270 us/op<br/>
Iteration   1: 19.671 us/op<br/>
Iteration   2: 18.339 us/op<br/>
Iteration   3: 19.215 us/op<br/>
Iteration   4: 18.480 us/op<br/>
Iteration   5: 18.690 us/op<br/>
<br/>
<br/>
Result "com.lxxxv.TimeComplexityList.addLinkedList":<br/>
  17.663 ±(99.9%) 1.582 us/op [Average]<br/>
  (min, avg, max) = (10.670, 17.663, 19.671), stdev = 2.112<br/>
  CI (99.9%): [16.081, 19.244] (assumes normal distribution)<br/>
<br/>
<br/>
# JMH version: 1.33<br/>
# VM version: JDK 1.8.0_302, OpenJDK 64-Bit Server VM GraalVM CE 21.2.0, 25.302-b07-jvmci-21.2-b08<br/>
# VM invoker: D:\install\dev\graalvm\ce-java8-21.2.0\jre\bin\java.exe<br/>
# VM options: <none><br/>
# Blackhole mode: full + dont-inline hint (default, use -Djmh.blackhole.autoDetect=true to auto-detect)<br/>
# Warmup: 5 iterations, 10 s each<br/>
# Measurement: 5 iterations, 10 s each<br/>
# Timeout: 10 min per iteration<br/>
# Threads: 1 thread, will synchronize iterations<br/>
# Benchmark mode: Average time, time/op<br/>
# Benchmark: com.lxxxv.TimeComplexityList.addVector<br/>
<br/>
# Run progress: 33.33% complete, ETA 00:33:29<br/>
# Fork: 1 of 5<br/>
# Warmup Iteration   1: 13.905 us/op<br/>
# Warmup Iteration   2: 21.436 us/op<br/>
# Warmup Iteration   3: 21.950 us/op<br/>
# Warmup Iteration   4: 21.437 us/op<br/>
# Warmup Iteration   5: 21.634 us/op<br/>
Iteration   1: 21.234 us/op<br/>
Iteration   2: 21.942 us/op<br/>
Iteration   3: 20.437 us/op<br/>
Iteration   4: 21.523 us/op<br/>
Iteration   5: 20.568 us/op<br/>
<br/>
# Run progress: 36.67% complete, ETA 00:31:48<br/>
# Fork: 2 of 5<br/>
# Warmup Iteration   1: 14.112 us/op<br/>
# Warmup Iteration   2: 20.906 us/op<br/>
# Warmup Iteration   3: 19.332 us/op<br/>
# Warmup Iteration   4: 19.394 us/op<br/>
# Warmup Iteration   5: 18.972 us/op<br/>
Iteration   1: 20.693 us/op<br/>
Iteration   2: 22.095 us/op<br/>
Iteration   3: 21.991 us/op<br/>
Iteration   4: 22.110 us/op<br/>
Iteration   5: 21.720 us/op<br/>
<br/>
# Run progress: 40.00% complete, ETA 00:30:08<br/>
# Fork: 3 of 5<br/>
# Warmup Iteration   1: 14.380 us/op<br/>
# Warmup Iteration   2: 19.612 us/op<br/>
# Warmup Iteration   3: 20.756 us/op<br/>
# Warmup Iteration   4: 21.121 us/op<br/>
# Warmup Iteration   5: 21.795 us/op<br/>
Iteration   1: 22.387 us/op<br/>
Iteration   2: 21.474 us/op<br/>
Iteration   3: 20.459 us/op<br/>
Iteration   4: 20.602 us/op<br/>
Iteration   5: 21.243 us/op<br/>
<br/>
# Run progress: 43.33% complete, ETA 00:28:27<br/>
# Fork: 4 of 5<br/>
# Warmup Iteration   1: 14.476 us/op<br/>
# Warmup Iteration   2: 21.148 us/op<br/>
# Warmup Iteration   3: 21.927 us/op<br/>
# Warmup Iteration   4: 21.447 us/op<br/>
# Warmup Iteration   5: 20.949 us/op<br/>
Iteration   1: 21.521 us/op<br/>
Iteration   2: 22.046 us/op<br/>
Iteration   3: 21.654 us/op<br/>
Iteration   4: 20.729 us/op<br/>
Iteration   5: 21.437 us/op<br/>
<br/>
# Run progress: 46.67% complete, ETA 00:26:47<br/>
# Fork: 5 of 5<br/>
# Warmup Iteration   1: 14.016 us/op<br/>
# Warmup Iteration   2: 20.711 us/op<br/>
# Warmup Iteration   3: 21.424 us/op<br/>
# Warmup Iteration   4: 21.072 us/op<br/>
# Warmup Iteration   5: 21.020 us/op<br/>
Iteration   1: 20.604 us/op<br/>
Iteration   2: 21.440 us/op<br/>
Iteration   3: 20.874 us/op<br/>
Iteration   4: 21.141 us/op<br/>
Iteration   5: 21.449 us/op<br/>
<br/>
<br/>
Result "com.lxxxv.TimeComplexityList.addVector":<br/>
  21.335 ±(99.9%) 0.439 us/op [Average]<br/>
  (min, avg, max) = (20.437, 21.335, 22.387), stdev = 0.586<br/>
  CI (99.9%): [20.896, 21.774] (assumes normal distribution)<br/>
<br/>
<br/>
# JMH version: 1.33<br/>
# VM version: JDK 1.8.0_302, OpenJDK 64-Bit Server VM GraalVM CE 21.2.0, 25.302-b07-jvmci-21.2-b08<br/>
# VM invoker: D:\install\dev\graalvm\ce-java8-21.2.0\jre\bin\java.exe<br/>
# VM options: <none><br/>
# Blackhole mode: full + dont-inline hint (default, use -Djmh.blackhole.autoDetect=true to auto-detect)<br/>
# Warmup: 5 iterations, 10 s each<br/>
# Measurement: 5 iterations, 10 s each<br/>
# Timeout: 10 min per iteration<br/>
# Threads: 1 thread, will synchronize iterations<br/>
# Benchmark mode: Average time, time/op<br/>
# Benchmark: com.lxxxv.TimeComplexityList.getArrayList<br/>
<br/>
# Run progress: 50.00% complete, ETA 00:25:07<br/>
# Fork: 1 of 5<br/>
# Warmup Iteration   1: 1.421 us/op<br/>
# Warmup Iteration   2: 1.583 us/op<br/>
# Warmup Iteration   3: 1.606 us/op<br/>
# Warmup Iteration   4: 1.462 us/op<br/>
# Warmup Iteration   5: 1.553 us/op<br/>
Iteration   1: 1.595 us/op<br/>
Iteration   2: 1.553 us/op<br/>
Iteration   3: 1.617 us/op<br/>
Iteration   4: 1.584 us/op<br/>
Iteration   5: 1.569 us/op<br/>
<br/>
# Run progress: 53.33% complete, ETA 00:23:26<br/>
# Fork: 2 of 5<br/>
# Warmup Iteration   1: 1.427 us/op<br/>
# Warmup Iteration   2: 1.531 us/op<br/>
# Warmup Iteration   3: 1.570 us/op<br/>
# Warmup Iteration   4: 1.590 us/op<br/>
# Warmup Iteration   5: 1.623 us/op<br/>
Iteration   1: 1.594 us/op<br/>
Iteration   2: 1.592 us/op<br/>
Iteration   3: 1.535 us/op<br/>
Iteration   4: 1.559 us/op<br/>
Iteration   5: 1.595 us/op<br/>
<br/>
# Run progress: 56.67% complete, ETA 00:21:46<br/>
# Fork: 3 of 5<br/>
# Warmup Iteration   1: 1.405 us/op<br/>
# Warmup Iteration   2: 1.542 us/op<br/>
# Warmup Iteration   3: 1.601 us/op<br/>
# Warmup Iteration   4: 1.561 us/op<br/>
# Warmup Iteration   5: 1.565 us/op<br/>
Iteration   1: 1.446 us/op<br/>
Iteration   2: 1.598 us/op<br/>
Iteration   3: 1.582 us/op<br/>
Iteration   4: 1.603 us/op<br/>
Iteration   5: 1.507 us/op<br/>
<br/>
# Run progress: 60.00% complete, ETA 00:20:05<br/>
# Fork: 4 of 5<br/>
# Warmup Iteration   1: 1.419 us/op<br/>
# Warmup Iteration   2: 1.597 us/op<br/>
# Warmup Iteration   3: 1.570 us/op<br/>
# Warmup Iteration   4: 1.598 us/op<br/>
# Warmup Iteration   5: 1.588 us/op<br/>
Iteration   1: 1.550 us/op<br/>
Iteration   2: 1.557 us/op<br/>
Iteration   3: 1.571 us/op<br/>
Iteration   4: 1.554 us/op<br/>
Iteration   5: 1.546 us/op<br/>
<br/>
# Run progress: 63.33% complete, ETA 00:18:24<br/>
# Fork: 5 of 5<br/>
# Warmup Iteration   1: 1.419 us/op<br/>
# Warmup Iteration   2: 1.523 us/op<br/>
# Warmup Iteration   3: 1.635 us/op<br/>
# Warmup Iteration   4: 1.601 us/op<br/>
# Warmup Iteration   5: 1.646 us/op<br/>
Iteration   1: 1.564 us/op<br/>
Iteration   2: 1.578 us/op<br/>
Iteration   3: 1.557 us/op<br/>
Iteration   4: 1.577 us/op<br/>
Iteration   5: 1.530 us/op<br/>
<br/>
<br/>
Result "com.lxxxv.TimeComplexityList.getArrayList":<br/>
  1.564 ±(99.9%) 0.027 us/op [Average]<br/>
  (min, avg, max) = (1.446, 1.564, 1.617), stdev = 0.036<br/>
  CI (99.9%): [1.538, 1.591] (assumes normal distribution)<br/>
<br/>
<br/>
# JMH version: 1.33<br/>
# VM version: JDK 1.8.0_302, OpenJDK 64-Bit Server VM GraalVM CE 21.2.0, 25.302-b07-jvmci-21.2-b08<br/>
# VM invoker: D:\install\dev\graalvm\ce-java8-21.2.0\jre\bin\java.exe<br/>
# VM options: <none><br/>
# Blackhole mode: full + dont-inline hint (default, use -Djmh.blackhole.autoDetect=true to auto-detect)<br/>
# Warmup: 5 iterations, 10 s each<br/>
# Measurement: 5 iterations, 10 s each<br/>
# Timeout: 10 min per iteration<br/>
# Threads: 1 thread, will synchronize iterations<br/>
# Benchmark mode: Average time, time/op<br/>
# Benchmark: com.lxxxv.TimeComplexityList.getLinkedList<br/>
<br/>
# Run progress: 66.67% complete, ETA 00:16:44<br/>
# Fork: 1 of 5<br/>
# Warmup Iteration   1: 316.574 us/op<br/>
# Warmup Iteration   2: 619.064 us/op<br/>
# Warmup Iteration   3: 656.617 us/op<br/>
# Warmup Iteration   4: 635.707 us/op<br/>
# Warmup Iteration   5: 632.533 us/op<br/>
Iteration   1: 648.653 us/op<br/>
Iteration   2: 611.960 us/op<br/>
Iteration   3: 620.984 us/op<br/>
Iteration   4: 636.371 us/op<br/>
Iteration   5: 637.733 us/op<br/>
<br/>
# Run progress: 70.00% complete, ETA 00:15:03<br/>
# Fork: 2 of 5<br/>
# Warmup Iteration   1: 315.778 us/op<br/>
# Warmup Iteration   2: 648.895 us/op<br/>
# Warmup Iteration   3: 653.820 us/op<br/>
# Warmup Iteration   4: 669.941 us/op<br/>
# Warmup Iteration   5: 649.301 us/op<br/>
Iteration   1: 648.646 us/op<br/>
Iteration   2: 654.877 us/op<br/>
Iteration   3: 645.199 us/op<br/>
Iteration   4: 649.376 us/op<br/>
Iteration   5: 638.082 us/op<br/>
<br/>
# Run progress: 73.33% complete, ETA 00:13:23<br/>
# Fork: 3 of 5<br/>
# Warmup Iteration   1: 316.101 us/op<br/>
# Warmup Iteration   2: 642.271 us/op<br/>
# Warmup Iteration   3: 648.170 us/op<br/>
# Warmup Iteration   4: 644.279 us/op<br/>
# Warmup Iteration   5: 639.782 us/op<br/>
Iteration   1: 656.050 us/op<br/>
Iteration   2: 647.627 us/op<br/>
Iteration   3: 635.259 us/op<br/>
Iteration   4: 630.475 us/op<br/>
Iteration   5: 624.389 us/op<br/>
<br/>
# Run progress: 76.67% complete, ETA 00:11:43<br/>
# Fork: 4 of 5<br/>
# Warmup Iteration   1: 318.887 us/op<br/>
# Warmup Iteration   2: 629.089 us/op<br/>
# Warmup Iteration   3: 636.598 us/op<br/>
# Warmup Iteration   4: 640.650 us/op<br/>
# Warmup Iteration   5: 630.073 us/op<br/>
Iteration   1: 638.335 us/op<br/>
Iteration   2: 630.532 us/op<br/>
Iteration   3: 644.818 us/op<br/>
Iteration   4: 649.350 us/op<br/>
Iteration   5: 646.063 us/op<br/>
<br/>
# Run progress: 80.00% complete, ETA 00:10:02<br/>
# Fork: 5 of 5<br/>
# Warmup Iteration   1: 318.375 us/op<br/>
# Warmup Iteration   2: 623.495 us/op<br/>
# Warmup Iteration   3: 652.286 us/op<br/>
# Warmup Iteration   4: 642.554 us/op<br/>
# Warmup Iteration   5: 628.870 us/op<br/>
Iteration   1: 608.884 us/op<br/>
Iteration   2: 622.725 us/op<br/>
Iteration   3: 673.278 us/op<br/>
Iteration   4: 608.441 us/op<br/>
Iteration   5: 649.541 us/op<br/>
<br/>
<br/>
Result "com.lxxxv.TimeComplexityList.getLinkedList":<br/>
  638.306 ±(99.9%) 11.802 us/op [Average]<br/>
  (min, avg, max) = (608.441, 638.306, 673.278), stdev = 15.755<br/>
  CI (99.9%): [626.504, 650.108] (assumes normal distribution)<br/>
<br/>
<br/>
# JMH version: 1.33<br/>
# VM version: JDK 1.8.0_302, OpenJDK 64-Bit Server VM GraalVM CE 21.2.0, 25.302-b07-jvmci-21.2-b08<br/>
# VM invoker: D:\install\dev\graalvm\ce-java8-21.2.0\jre\bin\java.exe<br/>
# VM options: <none><br/>
# Blackhole mode: full + dont-inline hint (default, use -Djmh.blackhole.autoDetect=true to auto-detect)<br/>
# Warmup: 5 iterations, 10 s each<br/>
# Measurement: 5 iterations, 10 s each<br/>
# Timeout: 10 min per iteration<br/>
# Threads: 1 thread, will synchronize iterations<br/>
# Benchmark mode: Average time, time/op<br/>
# Benchmark: com.lxxxv.TimeComplexityList.getVector<br/>
<br/>
# Run progress: 83.33% complete, ETA 00:08:22<br/>
# Fork: 1 of 5<br/>
# Warmup Iteration   1: 19.533 us/op<br/>
# Warmup Iteration   2: 41.116 us/op<br/>
# Warmup Iteration   3: 39.018 us/op<br/>
# Warmup Iteration   4: 40.455 us/op<br/>
# Warmup Iteration   5: 35.318 us/op<br/>
Iteration   1: 39.961 us/op<br/>
Iteration   2: 38.477 us/op<br/>
Iteration   3: 40.536 us/op<br/>
Iteration   4: 39.303 us/op<br/>
Iteration   5: 40.514 us/op<br/>
<br/>
# Run progress: 86.67% complete, ETA 00:06:41<br/>
# Fork: 2 of 5<br/>
# Warmup Iteration   1: 19.621 us/op<br/>
# Warmup Iteration   2: 39.457 us/op<br/>
# Warmup Iteration   3: 39.332 us/op<br/>
# Warmup Iteration   4: 37.531 us/op<br/>
# Warmup Iteration   5: 39.370 us/op<br/>
Iteration   1: 38.925 us/op<br/>
Iteration   2: 40.134 us/op<br/>
Iteration   3: 39.082 us/op<br/>
Iteration   4: 38.404 us/op<br/>
Iteration   5: 38.954 us/op<br/>
<br/>
# Run progress: 90.00% complete, ETA 00:05:01<br/>
# Fork: 3 of 5<br/>
# Warmup Iteration   1: 19.414 us/op<br/>
# Warmup Iteration   2: 38.119 us/op<br/>
# Warmup Iteration   3: 38.771 us/op<br/>
# Warmup Iteration   4: 39.089 us/op<br/>
# Warmup Iteration   5: 37.456 us/op<br/>
Iteration   1: 38.342 us/op<br/>
Iteration   2: 38.664 us/op<br/>
Iteration   3: 39.274 us/op<br/>
Iteration   4: 39.053 us/op<br/>
Iteration   5: 38.491 us/op<br/>
<br/>
# Run progress: 93.33% complete, ETA 00:03:20<br/>
# Fork: 4 of 5<br/>
# Warmup Iteration   1: 19.509 us/op<br/>
# Warmup Iteration   2: 39.852 us/op<br/>
# Warmup Iteration   3: 37.742 us/op<br/>
# Warmup Iteration   4: 39.035 us/op<br/>
# Warmup Iteration   5: 37.550 us/op<br/>
Iteration   1: 37.673 us/op<br/>
Iteration   2: 37.973 us/op<br/>
Iteration   3: 38.185 us/op<br/>
Iteration   4: 37.715 us/op<br/>
Iteration   5: 38.311 us/op<br/>
<br/>
# Run progress: 96.67% complete, ETA 00:01:40<br/>
# Fork: 5 of 5<br/>
# Warmup Iteration   1: 19.217 us/op<br/>
# Warmup Iteration   2: 38.273 us/op<br/>
# Warmup Iteration   3: 37.945 us/op<br/>
# Warmup Iteration   4: 36.876 us/op<br/>
# Warmup Iteration   5: 39.162 us/op<br/>
Iteration   1: 38.242 us/op<br/>
Iteration   2: 37.712 us/op<br/>
Iteration   3: 37.359 us/op<br/>
Iteration   4: 37.453 us/op<br/>
Iteration   5: 37.398 us/op<br/>
<br/>
<br/>
Result "com.lxxxv.TimeComplexityList.getVector":<br/>
  38.645 ±(99.9%) 0.698 us/op [Average]<br/>
  (min, avg, max) = (37.359, 38.645, 40.536), stdev = 0.932<br/>
  CI (99.9%): [37.947, 39.343] (assumes normal distribution)<br/>
<br/>
<br/>
# Run complete. Total time: 00:50:12<br/>
<br/>
REMEMBER: The numbers below are just data. To gain reusable insights, you need to follow up on<br/>
why the numbers are the way they are. Use profilers (see -prof, -lprof), design factorial<br/>
experiments, perform baseline and negative tests that provide experimental control, make sure<br/>
the benchmarking environment is safe on JVM/OS/HW level, ask for reviews from the domain experts.<br/>
Do not assume the numbers tell you what you want them to tell.<br/>
<br/>
Benchmark                         Mode  Cnt    Score    Error  Units<br/>
TimeComplexityList.addArrayList   avgt   25   19.005 ±  1.485  us/op<br/>
TimeComplexityList.addLinkedList  avgt   25   17.663 ±  1.582  us/op<br/>
TimeComplexityList.addVector      avgt   25   21.335 ±  0.439  us/op<br/>
TimeComplexityList.getArrayList   avgt   25    1.564 ±  0.027  us/op<br/>
TimeComplexityList.getLinkedList  avgt   25  638.306 ± 11.802  us/op<br/>
TimeComplexityList.getVector      avgt   25   38.645 ±  0.698  us/op<br/>
