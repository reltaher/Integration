# League of Legends Knowledge Quiz

If you have ever played the game "League of Legends", then this quiz program will test your knowledge on it. Started in January 2019, and finished in April 2019, this quiz program was the first project that I have ever made in Java. At the time, I was completely new to the language, and was learning the basic fundamentals of programming at FGCU. This project was made for my Integration Project assignment in my Introduction to Programming (COP 2006) class, and for that projct, I wanted to do mix programming with something in my interest. In this case, I decided to make a project related to League of Legends, a game that I have been playing since 2013. I have gotten a lot of positive feedback about this project from different colleagues, as well as my professor, so this project has overall helped sparked my interest in software development, and because of that I have gained an interest to continue making different projects.

## Demonstration


## Documentation


## Diagrams


## Getting Started


## Built With

This program has been built with Eclipse, which is an IDE for Java Developers that also contains a marketplace for other useful plugins such as SpotBugs, CheckStyle, Darkest Dark Theme, and more. Udemy Courses on learning Java were also an important resource that was utilized in the making of this program.

## Contributing

This project was primarily for me to gain knowledge on Java and programming in general. Since this was my first project in Java, there is always room for improvement. If you would like to contribute to improve this project, then feel free to send me a message!

## Author

Ramzy El-Taher

## License


## Acknowledgments

Special Thanks to:

-Professor Scott Vanselow: Helped guide me through the difficulties that I had in the later stages of this project, specifically when I had to apply OOP concepts such as polymorphism to this program.

-The TAs (Carlos Reyes, Anthony Cangelosi, Moises Martinez) in the COP 2006 class who were able to help right at the moment when I struggled with an error or another issue that was difficult for me to understand at the time.

-StackOverflow: Whenever I encountered a strange problem with Eclipse, StackOverflow usually had a solution to it. This helped me save a ton of time which would have been spent trying to fix the error otherwise.

## History

(NOTE: LINES FOR EACH PSI REQUIREMENT ARE OFF BY 8 LINES DUE TO IMPROVED COMMENT IN EACH CLASS.)

    PSI 1:
    Add your name as a comment at top of every file
    -First Javadoc comment of every class
    
    Add a description of the program as a comment at top
    -First Multiline comment of every class
    
    Add a list and description of Java built-in data types within the user interface or in comments
    -Main.java Line 25-46
    
    Add a greeting / introduction to the user
    -MainMenu.java Line 24-26
    
    Use a boolean variable with an appropriate name  (singular noun, lowerCamelCase)
    -MainMenu.java Line 36
    
    Use an int variable with an appropriate name (singular noun, lowerCamelCase)
    -MainMenu.java Line 33
    
    Use an double variable with an appropriate name (singular noun, lowerCamelCase)
    -ChampionNumber.java Line 26
    
    Use a String object with an appropriate name (singular noun, lowerCamelCase)
    -ChampionNumber.java Line 27/28
    
    Define (in English) the term "variable" as it relates to computer programming in a comment or the user interface
    -Question.java Line 19
    
    Define (in English) the term "scope" as it relates to computer programming in a comment or the user interface
    -Question.java Lines 17-25
    
    Use final with a variable and describe what it means in a comment
    -MainMenu.java Line 30-32
    
    Use casting and describe what it means in a comment
    -Result.java Lines 37-39
    
    Format strings using escape sequences
    -ChampionList.java Line 187, 189, 191, 193, ... (other strings are formatted in this class)
    -------------------------------------------------------------------------------------------------------------------------

    PSI 2:
    Create a method with arguments and return values
    Question.java Line 44+
    
    Identify a method call and argument in comments
    Quiz.java Line 45-88
    
    Identify a header and parameter in comments
    Main.java Line 48-56
    
    Use the Random class
    RandomChampion.java Line 36+
    
    Use the Math class
    Result.java Line 103
    
    Create if/else constructs
    Result.java Line 79-100
    
    Create ternary constructs
    ChampionNumber.java Line 57
    
    Use a switch statement
    MainMenu.java Line 56+
    
    Compare two String objects by using the compareTo and equals methods and make a comment describing how == works with objects
    Comment: Quiz.java Line 26-28
    equals: Quiz.java Line 29
    compareTo: Quiz.java Line 195
    
    Use +, -, *, /, %, ++, --, += 
    Quiz.java (Line 51 (+), Line 196 (++), Line 204(--))
    ChampionNumber.java Line 45 (+=, -, *, /, %) 
    
    Use relational operators
    ChampionNumber.java, which uses >= and <=. (Line 59-83)
    
    Use conditional operators
    ChampionNumber.java Line 44 (Uses ||)
    
    Describe operator precedence as a comment
    Main.java Line 42-46
    
    Create and use while loops
    MainMenu.java Line 34
    
    Create and use for loops
    RandomChampion.java Line 40
    
    Create and use do/while loops
    MainMenu.java Lines 37-54
    
    Use break in a loop with a comment describing what it does
    MainMenu.java Line 81
    
    Use continue in a loop with a comment describing what it does
    Quiz.java Line 198
    
    ------------------------------------------------------------------------------------------------------------
    
    PSI 3

    Make a class in a separate file with private fields, public getters and setters, a constructor with and without parameters
    -Result.java, all lines apply
    
    Overload a method
    -Result.java, Lines 36-39, 50-51
    
    Describe inheritance and its benefits
    -MCQuestion.java, Line 16-19
    
    Develop code that makes use of polymorphism
    -Quiz.java, Line 33-206
    -Question.java (base), MCQuestion.java (derived), TFQuestion.java (derived)
    
    Use super and this to access objects and constructors
    -This: Question.java Line 55, 74
    -Super: MCQuestion.java Line 127
    
    Declare, instantiate, initialize and use a one-dimensional array
    -SmallestChamp.java, Line 35
    
    Manually find the smallest value in an array
    -SmallestChamp.java, Lines 36-47
    
    Get a sum of the values in an array using an accumulator.
    -SmallestChamp.java, Line 43
    
    Search an array and identify the index where a value was found.
    -SmallestChamp.java, Lines 49-59
    
    Create and use the enhanced for loop
    -SmallestChamp.java, Lines 42-47
    
    Declare, instantiate, initialize and use multi-dimensional arrays
    -ChampionList.java, Lines 37+
    
    Declare and use an ArrayList of a given type
    -ChampionList.java, Lines 428+
    
    Search a two-dimensional array and identify the coordinates where a value was found
    -ChampionList.java, Lines 56-60
    
    Effectively utilize exception handling for user input of an int
    -MainMenu.java, Lines 44-53


## Key Programming Concepts Utilized

*Use of Classes, which is essentially code in which objects are created.

*Use of Objects, which are instances of a class. Objects contain two characteristics: State (Stored in Fields) and Behavior (Stored in Methods).

*Use of Packages, which are namespaces that sorts classes and interfaces.

*Use of comments, contained all over the program, which the program ignores when the program is compiled. The comments used in this program explains different programming concepts such as data types, variables (Location in memory), inheritance (concept in which a class contains the fields and methods of another class), etc.
