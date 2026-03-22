# Restaurant Class Ideas
**Properties**
- Int waitTime
- Double Rating
- Double avgPrice
- Double Distance
- String hoursOpen


***What new was learned?***

Encapsulation; information hiding. Using the Private command it makes whatever the code is within it is private and is not capable to be used. It's locked down essentially.

Inheritance - A class can inherit behaviors from another class. And the code doesn't have to be rewritten. Ex: our Restaurant class inherited a class from our Main and was capable of being used in our Restaurant class.
 
Polymorphism - The same thing works different ways and depends on who calls it.
 
These are A FEW of the things I've learned in the course. I've also learned about ArrayLists, and with them you can basically store and re-call information.

Private - Using Private locks down the code within it making it impossible for other areas of code to call upon it. Acting as it's own "VPN" in a way. Locking it down and uncallable.

Void - using Void is telling the code that a method SHOULD NOT have a return value.

import javax.swing.JOptionPane; - I learned that using JOptionPane is a greater way to make code look neater, but provides a simple, standard way to pop up dialog boxes for user interaction

the last thing I learned is that using \t can indent words, or numbers, if you want to make things alligned then it's a great way to achieve that.




***3/21/2026***

What did we work on?

- We worked on making a file that when importing a .txt file we can scan the file and produce an output based on what's on the Text File.

- How did we do it? : I learned that when we add "import java.io.File;"
and "import java.io.FileNotFoundException;" it makes it easier for the program to dectect the file and if it crashes or doesn't find it, it can tell us what's wrong. But also with it being an import it makes it easier for us to package things together to make things functional and working.
- We had also learned how to use "Randy" and what randy will do; generate a random integer. Using this can generate a random restaurant from the list and output it into our terminal. As long as we have System.out.print active and the code knows what to spit out.
- This wasn't expected but explained by our teacher; but using something like "%-5.2f%n" can make the output of the code different and make it look cleaner, though more complex.
- Another thing we did was "public static void main(String[] args) throws FileNotFoundException { " which declares the entry point of a Java program and indicates that it can exit the program if it encounters a FileNotFoundException that is not handled within the method.
- When using "File file = new File("src/restaurants.txt");" we are declaring the file that we imported into the code or adding another section to it so the code can scan the file. Otherwise if it's not included it doesn't know what to scan, how to scan, or even where to scan.  A java.io.File object, ready to be used with file I/O classes like Scanner (what we used). java.io.File helps the File file = new file scan the current txt that we have imported and scans through it. Using the code Scanner scan = new Scanner(file); within the parentases we called "file" which was already called somewhere else. But how do we print what we want to print?

That's where the rest of the code comes in handy.
while (scan.hasNext()) {
            String name = scan.next();
            int waitTime = scan.nextInt();
            double rating = scan.nextDouble();
            double avgPrice = scan.nextDouble();
            double distance = scan.nextDouble();
            String hoursOpen = scan.next();

            Restaurant restaurant = new Restaurant(name, waitTime, rating, avgPrice, distance, hoursOpen);

            restaurants.add(restaurant);
        }

        int numRestaurants = restaurants.size();
        int randIndex = randy.nextInt(numRestaurants - 1);
        System.out.println(restaurants.get(randIndex));
    }
}

doing this will tell the code what to scan, what to look for, and let it choose a line to print. All within seconds.

Not to mention this is the Main file. Not including the Restaurant file with the other lines of code we have.
