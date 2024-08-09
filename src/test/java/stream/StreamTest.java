package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) {
        // tworzenie strumienia
        List<String> names = Arrays.asList("Tom", "John", "Mat", "MB");

       Stream<String> streamNames = names.stream();
       Stream<Integer> streamInt = Arrays.asList(new Integer[]{1,2}).stream();
        DoubleStream doubleStream = DoubleStream.of(3,3,2,1,2,4);
        IntStream intStream = IntStream.range(1,100);

        //przetwarzanie danych
        //filter - filtrowanie
        //map - zmiana elementu na cos innego
        //limit - zwraca okreslona liczbe elementow
        // peek - pozwala przeprowadzic operacje na kazdym elemencie

        // forEach - wykonanie akcji dla kazdego elementu strumienia
        // count - zwroci ilosc elementow w strumieniu
        // allMatch - sprawdzenie czy wszystkie elementy spelniaja warunek
        // collect - zwraca nowy typ na podstawie strumienia

        streamNames.filter( el -> el.startsWith("T"))
                .map(el-> el.toUpperCase())
                .forEach(el -> System.out.println(el));

        intStream.filter(el -> el>20)
                .map(el -> el*2)
                .limit(10)
                .forEach(el -> System.out.println(el));
    }
}
