package main.java.numberrangesummarizer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class NumberRangeSummarizerImplementation implements NumberRangeSummarizer {

    @Override
    public Collection<Integer> collect(String input) {

        if (input == null || input.trim().isEmpty()) {
            return new ArrayList<>();
        }

        List<Integer> numbers = new ArrayList<>();

        String[] values = input.split(",");

        for (String value : values) {
            numbers.add(Integer.parseInt(value.trim()));
        }

        Collections.sort(numbers);

        return numbers;
    }

    @Override
    public String summarizeCollection(Collection<Integer> input) {

        if (input == null || input.isEmpty()) {
            return "";
        }

        List<Integer> numbers = new ArrayList<>(input);
        Collections.sort(numbers);

        List<String> ranges = new ArrayList<>();

        int start = numbers.get(0);

        for (int i = 0; i < numbers.size() - 1; i++) {

            int current = numbers.get(i);
            int next = numbers.get(i + 1);

            if (next == current + 1) {
                continue;
            }

            if (start == current) {
                ranges.add(String.valueOf(current));
            } else {
                ranges.add(start + "-" + current);
            }

            start = next;
        }

        int last = numbers.get(numbers.size() - 1);

        if (start == last) {
            ranges.add(String.valueOf(last));
        } else {
            ranges.add(start + "-" + last);
        }

        return String.join(", ", ranges);
    }
}