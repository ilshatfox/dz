package mystream;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Optional;
import java.util.Spliterator;
import java.util.function.*;
import java.util.stream.*;
import java.util.ArrayList;
//import jav

public class MyList<T> {
//    private T[] array;

    private ArrayList<T> array = new ArrayList<>();

//    public MyList() {
////        this.array = array;
//    }

    public void add(int index, T file) {
//        System.out.println(file);
        array.add(index, file);
    }

    public void add(T file) {
        array.add(file);
    }

    public T get(int index) {
        return array.get(index);
    }

    public int size() {
        return array.size();
    }

    public Stream<T> stream() {
        return new MyStream(array);
    }

    public class MyStream implements Stream<T> {
        private ArrayList<T> arr;

        public MyStream(ArrayList<T> arrayList) {
            this.arr = arrayList;
        }

        @Override
        public Stream<T> filter(Predicate<? super T> predicate) {
            // тест
//            ArrayList<T> a = new ArrayList<>();
//            a.stream().filter(predicate).collect(Collectors.toList());
            // тест
//            System.out.println(arr.size());
            for (int i = arr.size()-1; i >= 0; i--) {
                if (!predicate.test(arr.get(i))) {
                    arr.remove(i);
                }
//                arr.remove(i);
            }
            return this;
        }

        @Override
        public <R> Stream<R> map(Function<? super T, ? extends R> mapper) {
            MyList<R> newArr = new MyList<R>();
//            MyStream arr2 = new MyStream(new ArrayList<R>());
            for (int i = 0; i < arr.size(); i++) {
                newArr.add(mapper.apply(arr.get(i)));
//                System.out.println(arr2);
            }

            return newArr.stream();

            }


        @Override
        public void forEach(Consumer<? super T> action) {
            for (int i = 0; i < arr.size(); i++) {
                action.accept(arr.get(i));
            }
        }

        @Override
        public <R> R collect(Supplier<R> supplier, BiConsumer<R, ? super T> accumulator, BiConsumer<R, R> combiner) {


            return null;
        }

        @Override
        public <R, A> R collect(Collector<? super T, A, R> collector) {
            return null;
        }

        @Override
        public IntStream mapToInt(ToIntFunction<? super T> mapper) {
            return null;
        }

        @Override
        public LongStream mapToLong(ToLongFunction<? super T> mapper) {
            return null;
        }

        @Override
        public DoubleStream mapToDouble(ToDoubleFunction<? super T> mapper) {
            return null;
        }

        @Override
        public <R> Stream<R> flatMap(Function<? super T, ? extends Stream<? extends R>> mapper) {
            return null;
        }

        @Override
        public IntStream flatMapToInt(Function<? super T, ? extends IntStream> mapper) {
            return null;
        }

        @Override
        public LongStream flatMapToLong(Function<? super T, ? extends LongStream> mapper) {
            return null;
        }

        @Override
        public DoubleStream flatMapToDouble(Function<? super T, ? extends DoubleStream> mapper) {
            return null;
        }

        @Override
        public Stream<T> distinct() {
            return null;
        }

        @Override
        public Stream<T> sorted() {
            return null;
        }

        @Override
        public Stream<T> sorted(Comparator<? super T> comparator) {
            return null;
        }

        @Override
        public Stream<T> peek(Consumer<? super T> action) {
            return null;
        }

        @Override
        public Stream<T> limit(long maxSize) {
            return null;
        }

        @Override
        public Stream<T> skip(long n) {
            return null;
        }

        @Override
        public void forEachOrdered(Consumer<? super T> action) {

        }

        @Override
        public Object[] toArray() {
            return new Object[0];
        }

        @Override
        public <A> A[] toArray(IntFunction<A[]> generator) {
            return null;
        }

        @Override
        public T reduce(T identity, BinaryOperator<T> accumulator) {
            return null;
        }

        @Override
        public Optional<T> reduce(BinaryOperator<T> accumulator) {
            return Optional.empty();
        }

        @Override
        public <U> U reduce(U identity, BiFunction<U, ? super T, U> accumulator, BinaryOperator<U> combiner) {
            return null;
        }


        @Override
        public Optional<T> min(Comparator<? super T> comparator) {
            return Optional.empty();
        }

        @Override
        public Optional<T> max(Comparator<? super T> comparator) {
            return Optional.empty();
        }

        @Override
        public long count() {
            return 0;
        }

        @Override
        public boolean anyMatch(Predicate<? super T> predicate) {
            return false;
        }

        @Override
        public boolean allMatch(Predicate<? super T> predicate) {
            return false;
        }

        @Override
        public boolean noneMatch(Predicate<? super T> predicate) {
            return false;
        }

        @Override
        public Optional<T> findFirst() {
            return Optional.empty();
        }

        @Override
        public Optional<T> findAny() {
            return Optional.empty();
        }

        @Override
        public Iterator<T> iterator() {
            return null;
        }

        @Override
        public Spliterator<T> spliterator() {
            return null;
        }

        @Override
        public boolean isParallel() {
            return false;
        }

        @Override
        public Stream<T> sequential() {
            return null;
        }

        @Override
        public Stream<T> parallel() {
            return null;
        }

        @Override
        public Stream<T> unordered() {
            return null;
        }

        @Override
        public Stream<T> onClose(Runnable closeHandler) {
            return null;
        }

        @Override
        public void close() {

        }
    }
}