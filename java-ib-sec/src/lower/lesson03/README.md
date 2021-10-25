# 1.7 Input and Output

When we learn about computers, input and output are two of the main modules so naturally we need to deal with them when building programs.

We have already seen how we can output a message to the console using the following command:

`System.out.println("Do you see this message?");`

We used it to display joined text and variables...

`System.out.println("Total Points: " + totalPoints);`

How can we accept input? Surely if Java provides a feature to display output that it already provides something for us to use to accept user input from the keyboard. After all, many programs would need this feature! And of course, you are right in thinking this way.

Java provides a `Scanner` *class* in a package called `util`. To access it place the following line at the very beggining of your source file:

`import java.util`

To get an instance of the `Scanner` *class* we need to write:

`Scanner sc = new Scanner(System.in)`

I am sure you have heard me say a number of times that Java is an object-oriented language. The `new` keyword in Java is a sign that we are creating one in our program. The object we created with the line above gives us basic features to accept input from the user via the keyboard so that we do not have to worry about how the hardware works. The object hides the complexity of all that. All we have to do is something like:

`int age = sc.nextInt();`

`double salary = sc.nextDouble();`

Unfortunately, Java does not give us a nice and easy function to accept a character from the user. It is is a little bit more meaty...

`char c = sc.next().charAt(0);`

You will probably understand the line above much better once we talk about another whidely used class called the `String` class in the next lesson!
