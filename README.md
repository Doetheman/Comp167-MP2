# Meteor Blaster
## GEEN 165 Major Program 2 Spring 2018
## Due: April 3, 2018 @ 6:00pm

**READ THESE INSTRUCTIONS THOROUGHLY BEFORE STARTING THE PROJECT**

You **MUST** submit this program using GitHub. See the Instructions [here](https://gist.github.com/ccannon94/511115be821a873ae9ec5f4db9cfdda0) and the video [here](https://www.youtube.com/watch?v=l2bP9JKQkdA) **BEFORE** you start coding.

### Introduction

This programming assignment requires you to create the classes that will eventually be used to form the graphical objects in the Meteor Blaster game animation.  The focus of this assignment is the inheritance and aggregation relationships between the classes. 

![Figure01](https://github.com/NCATCS/images/blob/master/Spring2018-MP2/mp2img1.png)

### UML Diagrams

Here are the UML Diagrams that describe the classes you must implement in Java.

![UML1](https://github.com/NCATCS/images/blob/master/Spring2018-MP2/UML1.png)
![UML2](https://github.com/NCATCS/images/blob/master/Spring2018-MP2/UML2.png)
![UML3](https://github.com/NCATCS/images/blob/master/Spring2018-MP2/UML3.png)
![UML4](https://github.com/NCATCS/images/blob/master/Spring2018-MP2/UML4.png)
![UML5](https://github.com/NCATCS/images/blob/master/Spring2018-MP2/UML5.png)
![UML6](https://github.com/NCATCS/images/blob/master/Spring2018-MP2/UML6.png)
![UML7](https://github.com/NCATCS/images/blob/master/Spring2018-MP2/UML7.png)
![UML8](https://github.com/NCATCS/images/blob/master/Spring2018-MP2/UML8.png)
![UML9](https://github.com/NCATCS/images/blob/master/Spring2018-MP2/UML9.png)
![UML10](https://github.com/NCATCS/images/blob/master/Spring2018-MP2/UML10.png)
![UML11](https://github.com/NCATCS/images/blob/master/Spring2018-MP2/UML11.png)
![UML12](https://github.com/NCATCS/images/blob/master/Spring2018-MP2/UML12.png)
![UML13](https://github.com/NCATCS/images/blob/master/Spring2018-MP2/UML13.png)
![UML14](https://github.com/NCATCS/images/blob/master/Spring2018-MP2/UML14.png)
![UML15](https://github.com/NCATCS/images/blob/master/Spring2018-MP2/UML15.png)
![UML16](https://github.com/NCATCS/images/blob/master/Spring2018-MP2/UML16.png)

```
phaserClip = new AudioClip(phaserResource.toString());  //use the play() method to play the sound.
```
**Hint:** The following will create a new Image object from an image file:
```
images[i] = new Image( new FileInputStream(craftData.getImageFile(i)));

```

**Note:**  The javafx.scene.image.ImageView class will contain (x,y) coordinate properties  and a property of type Image that may be used by the subclasses of MovingSprite.

### Handling ArrayLists

Each ArrayList should have five associated methods to perform: getNum, add, get and set.  So if you have an ArrayList named widgets that stored items of type Widget, then the associated UML would be:

```
+getNumWidgets() : int  			//Return the number of items in the ArrayList widgets.
+getWidget(index:int) : Widget  			//get the Widget at location index in ArrayList widgets
+setWidget(index:int, item:Widget):void	//store item at location index in the ArrayList widgets.
+addWidget(item:Widget):void   		//Append the Widget to the ArrayList. 
+deleteWidget(index:int) : Widget 		//Remove and return the Widget at location index.
```

### Save Game File Format

Use the given format to save the GameUniverse object.  This file format will be used to save a game for resuming at a later time.

![SaveFileFormat](https://github.com/NCATCS/images/blob/master/Spring2018-MP2/mp2img2.png)

### Grading

**If your code does not compile it receives a grade of zero.  See the documentation guide for instructions to properly document your code.  Up to 20 points will be deducted if your code is not properly documented. Up to 20 points will be deducted if your submission does not follow the GitHub submission instructions.**


**Level 1: 30%** - Implement the Movable interface, MovingSprite abstract class, Torpedo and PhotonTorpedo classes.  Create a driver class with a main method to test your classes.  Your main should instantiate a PhotonTorpedo object, initialize the properties and then output the properties by calling the toString() method.

**Level 2: 50%** - Implement the Craft, Meteor, RadialBomb, SR_Torpedo and PowerCraft Classes.  You will need to populate the ArrayLists appropriate Torpedo subclass objects for testing purposes.  Use the toString() methods to verify your classes have been implemented correctly.

**Level 3: 60%**  - Implement and test the PowerUp class and its subclasses.

**Level 4: 90%**  - Implement and test the MeteorField and GameUniverse classes.  You do not have to implement the loadGame method of the GameUniverse class for this level.  You will be able to test the saveGame method in level 5 after you implement the loadGame method.

**Level 5: 100%**  - Implement the loadGame method of the GameUniverse class.  You are now ready to test the entire GameUniverse class.  Assume that the save file name will come from command line arguments.

**Extra Credit:**  See me for extra credit opportunities after you get Level 5 complete.
