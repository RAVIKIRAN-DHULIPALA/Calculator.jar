# Creation of Jar file using Calculator.java
I have taken my Existing Repository Calculator Application (https://github.com/RAVIKIRAN-DHULIPALA/Calculator-Applet) and Created a executable jar file which can run on any OS in which java is installed. \
The Process of Creating a executable jar file \
step 1: Consider a .java file (in my case it is Calculator.java) compile the java file with following command 

```javac Classname.java```     
which creates a .class file with the name of java file 
        
step 2: create manifest.txt in the current working directory and add the following line 

```Main-Class:(give one space)Classname(press enter for new line) ``` \
replace the Classname with the class name of your program

step 3: type the following command to create a executable jar file 

```jar -cvmf manifest.txt name_of_jar_file.jar Classname.class``` \
replace the name_of_jar_file as you like and replace the Classname with the name of your class in the program. 

which creates a .jar file with the name you have given in your working directory.

Description of options that are used in creating a jar file

![](options.PNG)
The ```f``` option indicates that you want the output to go to a file rather than to stdout.

## To execute the jar file 
run the following command 

```java -jar Classname.jar``` 

Once the jar file is created it can be executed from anywhere in the system.  

The following Screenshot shows how i have run the above command to create a jar file and run it on my system.

Creating a jar file
![](command.PNG)

Executing a jar file \
![](run.PNG)
