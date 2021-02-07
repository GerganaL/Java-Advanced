package FunctionalProgramming;
//created by J.M.

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindTheSmallestElement {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        List<Integer>numbers = Arrays.stream(scan.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        Function<List<Integer>,Integer> getRightMostIndex=
                list-> list.lastIndexOf(list.stream().min(Integer::compare).orElseThrow());
        System.out.println(getRightMostIndex.apply(numbers));
    }
}
