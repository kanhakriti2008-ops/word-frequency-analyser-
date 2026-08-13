# word-frequency-analyser-

## About
A Java program that analyzes a sentence or text and counts how often 
each word appears, then displays results ranked from most to least 
frequent. Built using core Java fundamentals — arrays, loops, and 
selection sort — without relying on built-in collection utilities.

## How it works
1. User inputs a sentence via console
2. Text is converted to lowercase for consistency
3. The program manually parses the text character-by-character to 
   extract words
4. Word frequencies are tracked using parallel arrays
5. Results are sorted by frequency (highest to lowest) using 
   selection sort
6. Final word-frequency pairs are printed to the console

## Why this project
As an English Honours + Digital Humanities student, I built this to 
explore how computational methods can reveal word patterns in text — 
connecting my interest in language and literary analysis with 
foundational programming logic.

## Tech used
Java (core — arrays, loops, string manipulation, selection sort)

## How to run
1. Compile: `javac WordFrequencyAnalyzer.java`
2. Run: `java WordFrequencyAnalyzer`
3. Enter a sentence when prompted
4. View word frequencies printed in descending order

## Sample run
Enter a sentence:
the quick brown fox jumps over the lazy dog the fox runs

Word Frequencies:
the : 3
fox : 2
quick : 1
brown : 1
jumps : 1
over : 1
lazy : 1
dog : 1
runs : 1