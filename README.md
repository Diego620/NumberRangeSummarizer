# Number Range Summarizer

A Java implementation of the `NumberRangeSummarizer` interface.

## Requirements

- Java 8+
- Maven

## Example

Input:

`1,3,6,7,8,12,13,14,15,21,22,23,24,31`

Output:

`1, 3, 6-8, 12-15, 21-24, 31`

## Assumptions

- Input contains comma-delimited whole numbers.
- Whitespace around numbers is ignored.
- Input does not need to be sorted.
- Sequential numbers are grouped into ranges.
- Empty input returns an empty result.

## Running Tests

```bash
mvn test
```

## Assignment Checklist

### Code

- [x] Provided interface implemented
- [x] `collect()` implemented
- [x] Input split by comma
- [x] Whitespace handled
- [x] Strings converted to integers
- [x] Numbers sorted
- [x] `summarizeCollection()` implemented
- [x] Sequential numbers grouped
- [x] Ranges formatted with `-`
- [x] Results separated by `, `
- [x] Empty input handled

### Tests

- [x] Sample input
- [x] All sequential
- [x] No sequential numbers
- [x] Single number
- [x] Unsorted input
- [x] Whitespace
- [x] Empty collection
- [x] Empty input
- [x] `collect()` itself

### Project

- [x] Maven `pom.xml`
- [x] Java 8 compatibility
- [x] `src/main/java`
- [x] `src/test/java`
- [x] `.gitignore`
- [x] README
- [x] All tests passing

### GitHub

- [x] Create GitHub repository
- [x] Push project
- [x] Create feature branch
- [x] Push implementation
- [x] Create Pull Request into `main`
- [x] Add description to PR
- [x] Submit **PR/repository link through Greenhouse**
