Sometimes it's better to use dynamic size arrays. Java's Arraylist can provide you this feature. Try to solve this problem using Arraylist.

You are given  lines. In each line there are zero or more integers. You need to answer a few queries where you need to tell the number located in  position of  line.

Take your input from System.in.

Input Format
The first line has an integer . In each of the next  lines there will be an integer  denoting number of integers on that line and then there will be  space-separated integers. In the next line there will be an integer  denoting number of queries. Each query will consist of two integers  and .

Constraints

Each number will fit in signed integer.
Total number of integers in  lines will not cross .

Output Format
In each line, output the number located in  position of  line. If there is no such position, just print "ERROR!"

Sample Input

5
5 41 77 74 22 44
1 12
4 37 34 36 52
0
3 20 22 33
5
1 3
3 4
3 1
4 3
5 5
Sample Output

74
52
37
ERROR!
ERROR!
Explanation

The diagram below explains the queries:

image

Language
Java 8
More
1617101112131415123456789
            list.add(integers);
            input.nextLine();
            
        }
            int numQueries = Integer.parseInt(input.nextLine());
        for(int i=0;i<numQueries;i++){
            int x = input.nextInt()-1;
            int y = input.nextInt()-1;
            input.nextLine();

Line: 22 Col: 54

Test against custom input
Java
You have earned 10.00 points!
35/64 challenges solved.
55%
Congratulations
You solved this challenge. Would you like to challenge your friends?Share on FacebookShare on TwitterShare on LinkedIn

Test case 0

Test case 1

Test case 2

Test case 3

Test case 4

Test case 5
Compiler Message
Success
Input (stdin)
5
5 41 77 74 22 44
1 12
4 37 34 36 52
0
3 20 22 33
5
1 3
3 4
3 1
4 3
5 5
Expected Output
74
52
37
ERROR!
ERROR!
BlogScoringEnvironment