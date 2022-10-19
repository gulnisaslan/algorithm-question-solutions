Objective

Today, we're discussing data types. Check out the attached tutorial for more details.

Task

Variables named , , and  are declared for you in the editor below. You must use the  operator to perform the following sequence of operations:

Convert  to an integer (Number type), then sum it with  and print the result on a new line using console.log.
Convert  to a floating-point number (Number type), then sum it with  and print the result on a new line using console.log.
Print the concatenation of  and  on a new line using console.log. Note that  must be printed first.
Input Format

Data Type	Parameter	Description
string		The string representation of an integer you must sum with .
string		The string representation of a floating-point number you must sum with .
string		A string of one or more space-separated words you must append to .
Output Format

Print the following three lines of output:

On the first line, print the sum of  and the integer representation of .
On the second line, print the sum of  and the floating-point representation of .
On the third line, print  concatenated with . You must print  before .
Sample Input 0

12
4.32
is the best place to learn and practice coding!
Sample Output 0

16
8.32
HackerRank is the best place to learn and practice coding!
Explanation 0

When we sum the integers  and , we get the integer .
When we sum the floating-point numbers  and , we get . When we concatenate HackerRank with is the best place to learn and practice coding!, we get HackerRank is the best place to learn and practice coding!.

You will not pass this challenge if you attempt to assign the Sample Case values to your variables instead of following the instructions above.

Language: JavaScript (Node.js)

More
42434441353637383940
    const firstDecimal = 4.0;
    console.log(Number(firstDecimal) + Number(secondDecimal))
    // Declare a variable named 'firstString' and initialize with the string "HackerRank".
    const firstString = 'HackerRank ';
    console.log(firstString+secondString)
    // Write code that uses console.log to print the sum of the 'firstInteger' and 'secondInteger' (converted to a Number        type) on a new line.

Line: 42 Col: 30

Submit Code

Run Code

Upload Code as File

Test against custom input
Congratulations!

You have passed the sample test cases. Click the submit button to run your code against all the test cases.


Sample Test case 0
Input (stdin)

Download
12
4.32
is the best place to learn and practice coding!
Your Output (stdout)
16
8.32
HackerRank is the best place to learn and practice coding!
Expected Output

Download
16
8.32
HackerRank is the best place to learn and practice coding!
BlogScoringEnvironment