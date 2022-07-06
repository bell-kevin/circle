# Circle
Create a project that has a Circle class. The Circle class should contain:  -One instance variable – radius -A method named setRadius that assigns the passed-in radius value to the radius instance variable -A method named initialize that prompts the user for a radius value and then assigns the entered value to the radius instance variable. (Note that the method will prompt the user, not the driver class.) -A method named printCircleData that uses the circle’s radius to calculate the circle’s diameter, circumference, and area and print the results. Use the Java API constant Math.PI for the value of pi. Use local variables to store the diameter, circumference, and area. Print the circle’s radius, diameter, circumference, and area.  Create a Driver class (the main class) that tests all of the variables and methods of the Circle class. In that driver class, create a circle object and name it “spot”. Initialize it, print the circle data, then set the radius to a different specific value, and print the circle data again.  In the first example, the driver class contained the interaction with the user, asking for the necessary values, then passed that data to the methods in the class. In this example, the method initialize in the class contains the interaction with the user, asking for the radius. How do you decide where the user interaction goes? It’s often best to put those interactions in the class, because it makes the driver class shorter and easier to understand, and it adds documentation to the class. But you can put those interactions in either location, as we demonstrated with these examples.  As in the first example, create a project – name it “Example2Circle”, and the IDE will provide you with the starting structure for the main class, the driver class. If you know what code you need in the driver class, you can go ahead and type it now, and you’ll get a lot of errors because none of the class references exist yet. It’s usually better to create the class and enter its code first, then come back to the driver class to write the code that tests the class.  In the File menu, click on New, then File, and create a new Java class named “Circle”. Write the necessary code to create the instance variable radius, and the methods to initialize, set the radius, and print the results, as described.  Here is the Driver class code. Note that every method in the Circle class is tested. The initialize method will ask the user for the radius and set it, then the driver prints out the results for that circle. Next, the driver executes the method to change the radius to a different value, and prints out those results.


== We're Using GitHub Under Protest ==

This project is currently hosted on GitHub.  This is not ideal; GitHub is a
proprietary, trade-secret system that is not Free and Open Souce Software
(FOSS).  We are deeply concerned about using a proprietary system like GitHub
to develop our FOSS project.  We have an
[open {bug ticket, mailing list thread, etc.} ](INSERT_LINK) where the
project contributors are actively discussing how we can move away from GitHub
in the long term.  We urge you to read about the
[Give up GitHub](https://GiveUpGitHub.org) campaign from
[the Software Freedom Conservancy](https://sfconservancy.org) to understand
some of the reasons why GitHub is not a good place to host FOSS projects.

If you are a contributor who personally has already quit using GitHub, please
[check this resource](INSERT_LINK) for how to send us contributions without
using GitHub directly.

Any use of this project's code by GitHub Copilot, past or present, is done
without our permission.  We do not consent to GitHub's use of this project's
code in Copilot.

![Logo of the GiveUpGitHub campaign](https://sfconservancy.org/img/GiveUpGitHub.png)
