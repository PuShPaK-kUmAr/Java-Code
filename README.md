# Coding Problems Statement:
## Hello Readers this is a repository for coding problems in java.

## (A). Math 
1. Take Input as Integer from user and check for Prime Number.
    
       example :- 
               Input: 5
               Output: "This is a Prime Number"
   #### Solution Link :  [PrimeNumber](https://github.com/PuShPaK-kUmAr/Java-Code/blob/master/src/Math/PrimeNumber.java)
2. Take Input as Array of Integer from user and return the addition of all the elements.

        example :- 
                Input: Size 5
                       Array [1,2,3,4,5]
                Output: 15
   #### Solution Link :  [VariableArgumentSum](https://github.com/PuShPaK-kUmAr/Java-Code/blob/master/src/Math/VariableArgumentSum.java)
3. Take Input as an Integer from user and print all the fibonnacci series numbers which are less than given input.

        example :- 
                Input:  30
                Output: 0,1,1,2,3,5,8,13,21.
   #### Solution Link :  [Fibonacci](https://github.com/PuShPaK-kUmAr/Java-Code/blob/master/src/Math/Fibonacci.java)
4. Take Input as Integer from user as Dividend and Divisor and Return the result by dividing Divisor by Dividend.

        example :- 
                Input: Enter the dividend : 25
                       Enter the divisor :  5
                Output: The result is : 5
   #### Solution Link :  [Divisor](https://github.com/PuShPaK-kUmAr/Java-Code/blob/master/src/Math/Divisor.java)
5. Take two numbers from user as Input and return the number after swapping without using third variable.

       example :- 
               Input : num1 = 5 ,  num2 = 6
               Output: num1 = 6 ,  num2 = 5
   #### Solution Link :  [SwapTwoNumber](https://github.com/PuShPaK-kUmAr/Java-Code/blob/master/src/Math/SwapTwoNumber.java)

6. Take any number from user as Input and return the if the number is  Armstrong Number or Not.

       example 1. :- 
               Input : 153
               Output: 153 is Armstrong Number.
       example 1. :- 
               Input : 142
               Output: 142 is Not a Armstrong Number

#### Solution Link :  [ArmstrongNumber](https://github.com/PuShPaK-kUmAr/Java-Code/blob/master/src/Math/ArmstrongNumber.java)
7. Take any number from user as Input and return reversed integer for the same.

       example 1. :- 
               Input : 153
               Output: 351
       example 1. :- 
               Input : -142
               Output: -241

#### Solution Link :  [ReverseInteger](https://github.com/PuShPaK-kUmAr/Java-Code/blob/master/src/Math/ReverseInteger.java)

## (B). String
1. Take Input as String from user and write code to return the reversed string.

        example :- 
                Input: "hello"
                Output: "olleh"
   #### Solution Link :  [ReverseString](https://github.com/PuShPaK-kUmAr/Java-Code/blob/master/src/String/ReverseString.java)
2. Take Input as Sentence of String from user and write code to reverse the Sentence.

        example :- 
                Input: "hello from jack"
                Output: "jack from hello"
   #### Solution Link :  [ReverseSentence](https://github.com/PuShPaK-kUmAr/Java-Code/blob/master/src/String/ReverseSentence.java)
3. Take Input as String from user and write code to remove the repeated character from the string.

        example :- 
                Input: "Hello World"
                Output: "Helo Wrd"

        Assumptions:
                Length of the string S can be 0 to 10000
                Character comparisons will be case-sensitive.*/
   #### Solution Link :  [RemoveDuplicate](https://github.com/PuShPaK-kUmAr/Java-Code/blob/master/src/String/RemoveDuplicate.java)
4. Take two Strings as Input from the user and return the first occurrence index of Second String in First String, and if Second String is not present in First String return -1.

       example 1. :- 
                 Input: First String  => "sadbutnothappy"
                        Second String => "not"
                 Output: 6 

       Explanation:
                 As Second String which is "not" is present at 6th index of First String "sadbutnothappy", So The output is 6.


       example 2. :- 
                 Input: First String  => "sadbutnothappy"
                        Second String => "car"
                 Output: -1 

       Explanation:
                 As Second String which is "car" is not present at any index position of First String "sadbutnothappy", So The output is -1.

   #### Solution Link :  [FirstOccurrence](https://github.com/PuShPaK-kUmAr/Java-Code/blob/master/src/String/FirstOccurrence.java)
5. Take Input as n number of String from user and return the largest Common Prefix.

       example 1. :- 
                 Input: Enter the number of strings as Integer value : 3
                        Enter string 1: "geek" 
                        Enter string 2: "geeks"
                        Enter string 3: gee
                 Output: The Largest common prefix in the given strings is :gee

       Explanation:
                 As the number of strings is 3 so user need to give 3 strings as Input and the common largest prefix between three string is gee, So the answer will be "gee".


       example 2. :- 
                 Input: Enter the number of strings as Integer value : 1
                        Enter string 1: "geek" 
                 Output: The Largest common prefix in the given strings is : geek

       Explanation:
                   As the number of strings is 1 so user need to give 1 string as Input and the common largest prefix in this case is the String itself, So the answer will be "geek".

   #### Solution Link :  [LargestCommonPrefix](https://github.com/PuShPaK-kUmAr/Java-Code/blob/master/src/String/LargestCommonPrefix.java)
6. Take Input as String from user and write code to check if the input string is Palindrome or not.

        example 1. :- 
                 Input:  "palindrome"
                 Output:  Not a Palindrome

       example 2. :- 
                 Input:  "level"
                 Output:  Palindrome  
   #### Solution Link :  [IsPalindrome](https://github.com/PuShPaK-kUmAr/Java-Code/blob/master/src/String/IsPalindrome.java)
7. Take Input from user as String of Roman Numbers and convert them to integer, If user provide incorrect string send suitable message and if roman number is in lowercase convert them to uppercase.
       
       example 1. :-
                 Input: s = "III"
                 Output: 3
       Explanation: III = 3

       example 2. :- 
                 Input: s = "MCMXCIV"
                 Output: 1994
       Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
#### Solution Link :  [RomanToInteger](https://github.com/PuShPaK-kUmAr/Java-Code/blob/master/src/String/RomanToInteger.java)
8. Take n as pairs of parentheses from user, write a function to generate all combinations of well-formed parentheses using n pair of parenthesis.
   
       Example 1:
                  Input: n = 3
                  Output: ["((()))","(()())","(())()","()(())","()()()"]

       Example 2:
                  Input: n = 1
                  Output: ["()"]
#### Solution Link :  [GenerateParenthesis](https://github.com/PuShPaK-kUmAr/Java-Code/blob/master/src/String/GenerateParenthesis.java)


## (C). Sorting Algorithm
1. Take array of integer as Input and Sort the array in ascending order using Bubble Sort.

        example :- 
                Input: Size   5
                       Array  [32,42,11,2,7]

                Output: [2,7,11,32,42]
   #### Solution Link :  [BubbleSort](https://github.com/PuShPaK-kUmAr/Java-Code/blob/master/src/SortingAlgorithm/BubbleSort.java)

## (D). Array
1. Take array of integer as Input and return the reversed Array.

        example :- 
                Input: Size   5
                       Array  [32,42,11,2,7]

                Output: [7,2,11,42,32]
   #### Solution Link :  [ReverseArray](https://github.com/PuShPaK-kUmAr/Java-Code/blob/master/src/Array/ReverseArray.java)

2. Take array of integer as Input and return the 2nd Largest Element.

        example :- 
                Input: Size   5
                       Array  [32,42,11,2,7]

                Output: 32
   #### Solution Link :  [SecondLargest](https://github.com/PuShPaK-kUmAr/Java-Code/blob/master/src/Array/SecondLargest.java)

3. Take array of Integer and a Target value as Input and return the Index if Target is present in Array else return "Target Element not found in array".

        example 1.:- 
                Input: Target 11
                       Size   5
                       Array  [32,42,11,2,7]

                Output: Target found at index: 2
        example 1.:- 
                Input: Target 11
                       Size   5
                       Array  [3,4,1,2,7]

                Output: Target Element not found in array    
   #### Solution Link :  [BinarySearch](https://github.com/PuShPaK-kUmAr/Java-Code/blob/master/src/Array/BinarySearch.java)

4. Take space separated list of items from user and return the Frequency Count of each item.

        example :- 
                Input: apple orange banana apple banana
                
                Output: 
                       Item 'apple' appears 2 times.
                       Item 'orange' appears 1 times.
                       Item 'banana' appears 2 times.
   #### Solution Link :  [FrequencyCounter](https://github.com/PuShPaK-kUmAr/Java-Code/blob/master/src/Array/FrequencyCounter.java)

5. Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target. You may assume that each input would have exactly one solution, and you may not use the same element twice. You can return the answer in any order.

       Example 1:
               Input: nums = [2,7,11,15], target = 9
               Output: [0,1]
       Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
       
       Example 2:
               Input: nums = [3,2,4], target = 6
               Output: [1,2]

       Example 3:
               Input: nums = [3,3], target = 6
               Output: [0,1]
   #### Solution Link :  [TwoSum](https://github.com/PuShPaK-kUmAr/Java-Code/blob/master/src/Array/TwoSum.java)

## (E). Map
1. Take Input as String and return the count of Vowels and Consonants in that string.

       example :- 
               Input: "string"
               Output: Character frequency:
                        r: 1
                        s: 1
                        t: 1
                        g: 1
                        i: 1
                        n: 1

   #### Solution Link :  [FrequencyCount](https://github.com/PuShPaK-kUmAr/Java-Code/blob/master/src/Map/FrequencyCounter.java)
2. Take Input as String and return the Frequency count of characters in that string.

       example :- 
               Input: "string"
               Output: {consonantCount=5, vowelCount=1}
   #### Solution Link :  [VowelConsonantCounter](https://github.com/PuShPaK-kUmAr/Java-Code/blob/master/src/Map/VowelConsonantCounter.java)

## (F). Stream API
A simple Java project that manages a list of Employees using Stream API.

### Features
- Add Employees to the list
- Increase Salary of  Employee from the list
- Delete Employee by their First Name from the list

### Technologies
- Java

### How to use
1. Clone the repository

       git clone https://github.com/PuShPaK-kUmAr/Java-Code.git
2. Open the project in your preferred Java IDE
3. Run the Main class to start the program
4. Follow the prompts to add, delete, update and print students

### Files
- `Employee.java`: The class that defines the Employee object, with fields for firstName, lastName, salary, and projects.
- `CrudEmployee.java`: The class that has methods for increasing salary by a particular percentage and adding new employee to the list.
- `Main.java` : The class that runs the program and creates the Employee object.

### Contributing
If you would like to contribute to this project, please fork the repository and create a pull request with your changes.
   #### Solution Link :  [Stream_API](https://github.com/PuShPaK-kUmAr/Java-Code/tree/master/src/Stream_API)

## (G). Pattern
1.  Pyramid Program, Write the java code to print the pattern.

           Example :-Input  5
                     Output       *
                                 * *
                                * * * 
                               * * * * 
                              * * * * *

         
   #### Solution Link :  [Pyramid](https://github.com/PuShPaK-kUmAr/Java-Code/blob/master/src/Pattern/Pyramid.java)

1.  Write the java code to print the Right and Left Triangle Star by taking the height by the user.

           Example :-
                     Input  : 5
                     Output : 
                                Right Triangled Star :   * 
                                                         * *
                                                         * * * 
                                                         * * * * 
                                                         * * * * *
                                
                                Left Triangled Star  :           * 
                                                               * * 
                                                             * * * 
                                                           * * * * 
                                                         * * * * * 

#### Solution Link :  [RightAndLeftTriangleStar](https://github.com/PuShPaK-kUmAr/Java-Code/blob/master/src/Pattern/RightAndLeftTriangleStar.java)
