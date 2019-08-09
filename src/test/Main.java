package test;

import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import java.util.Optional;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
@State(Scope.Benchmark)
@Fork(value = 2, jvmArgs = {"-Xms2G", "-Xmx2G"})
public class Main {
    public static void main(String[] args) throws RunnerException {
        Options opt = new OptionsBuilder()
                .include(Main.class.getSimpleName())
                .forks(1)
                .build();

        new Runner(opt).run();

    }

    @Benchmark
    public void single(Blackhole bh) {
        Optional<Integer> reduce = IntStream.rangeClosed(1, 1000000)
                .boxed()
                .reduce(Integer::sum);
        bh.consume(reduce);
    }

    @Benchmark
    public void parallel(Blackhole bh) {
        Optional<Integer> reduce = IntStream.rangeClosed(1, 1000000)
                .parallel()
                .boxed()
                .reduce(Integer::sum);
        bh.consume(reduce);
    }

    @Benchmark
    public void parallel2(Blackhole bh) {
        Optional<Integer> reduce = IntStream.rangeClosed(1, 1000000)
                .boxed()
                .parallel()
                .reduce(Integer::sum);
        bh.consume(reduce);
    }
}
