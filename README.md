# Jar-file-of-Calculator-Application
Creation of Jar file of Calculator Application in java \
I have taken my Existing Repository Calculator Application (https://github.com/RAVIKIRAN-DHULIPALA/Calculator-Applet) and Created a executable jar file which can run on any OS in which java is installed. \
The Process of Creating a executable jar file \
step 1: Consider a .java file (in my case it is Calculator.java) compile the java file with following command \
        ```javac Classname.java```     
which creates a .class file with the name of java file 
        
step 2: create manifest.txt in the current working directory and add the following line 

```Main-Class:(give one space)Classname(press enter for new line) // replace the Classname with the class name of your program``` 

step 3: type the following command to create a executable jar file 

```jar -cvmf manifest.txt name_of_jar_file.jar Classname.class``` 
replace the name_of_jar_file as you like and replace the Classname with the name of your class in the program.  

which creates a .jar file with the name you have given in your working directory. 

To execute the jar file run the following command 

```java -jar Classname.jar``` \

Once the jar file is created it can be executed from anywhere in the system.  


