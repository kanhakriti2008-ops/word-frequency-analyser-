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

## Sample Visualisation 
<img width="859" height="581" alt="2026081314445854" src="https://github.com/user-attachments/assets/e7079d28-6b76-4cd8-9eda-5b6f4cda27a6" />

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

Enter a sentence:
Fair is foul and foul is fair hover through the fog and filthy air double double toil and trouble fire burn and cauldron bubble by the pricking of my thumbs something wicked this way comes

Word Frequencies:
and : 4
is : 2
foul : 2
fair : 2
the : 2
double : 2
hover : 1
fog : 1
filthy : 1
air : 1
through : 1
toil : 1
trouble : 1
fire : 1
burn : 1
cauldron : 1
bubble : 1
by : 1
pricking : 1
of : 1
my : 1
thumbs : 1
something : 1
wicked : 1
this : 1
way : 1
comes : 1
