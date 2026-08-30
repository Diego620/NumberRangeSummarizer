package test.java.numberrangesummarizer;

import main.java.numberrangesummarizer.NumberRangeSummarizer;
import main.java.numberrangesummarizer.NumberRangeSummarizerImplementation;
import org.junit.jupiter.api.Test;

import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumberRangeSummarizerImplementationTest {

    private final NumberRangeSummarizer summarizer =
            new NumberRangeSummarizerImplementation();

    @Test
    void shouldSummarizeSampleInput() {
        Collection<Integer> numbers = summarizer.collect(
                "1,3,6,7,8,12,13,14,15,21,22,23,24,31"
        );

        assertEquals(
                "1, 3, 6-8, 12-15, 21-24, 31",
                summarizer.summarizeCollection(numbers)
        );
    }

    @Test
    void shouldSummarizeAllSequentialNumbersAsOneRange() {
        Collection<Integer> numbers = summarizer.collect("1,2,3,4,5");

        assertEquals(
                "1-5",
                summarizer.summarizeCollection(numbers)
        );
    }

    @Test
    void shouldKeepNonSequentialNumbersSeparate() {
        Collection<Integer> numbers = summarizer.collect("1,3,5,7");

        assertEquals(
                "1, 3, 5, 7",
                summarizer.summarizeCollection(numbers)
        );
    }

    @Test
    void shouldHandleSingleNumber() {
        Collection<Integer> numbers = summarizer.collect("5");

        assertEquals(
                "5",
                summarizer.summarizeCollection(numbers)
        );
    }

    @Test
    void shouldSortUnorderedInput() {
        Collection<Integer> numbers = summarizer.collect("8,6,7,1,3");

        assertEquals(
                "1, 3, 6-8",
                summarizer.summarizeCollection(numbers)
        );
    }

    @Test
    void shouldHandleWhitespace() {
        Collection<Integer> numbers = summarizer.collect("1, 3, 6, 7, 8");

        assertEquals(
                "1, 3, 6-8",
                summarizer.summarizeCollection(numbers)
        );
    }

    @Test
    void shouldReturnEmptyStringForEmptyCollection() {
        assertEquals(
                "",
                summarizer.summarizeCollection(java.util.Collections.emptyList())
        );
    }

    @Test
    void shouldCollectAndSortNumbers() {
        Collection<Integer> numbers =
                summarizer.collect("8,6,7,1,3");

        assertEquals(
                java.util.Arrays.asList(1, 3, 6, 7, 8),
                numbers
        );
    }

    @Test
    void shouldReturnEmptyCollectionForEmptyInput() {
        assertEquals(
                java.util.Collections.emptyList(),
                summarizer.collect("")
        );
    }
}
