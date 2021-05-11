# Chatbot14
Group14 Chatbot

## package chatbot14 
Contains the two classes Bot and ChatBot which include the starter code that Nicholas has been working on.

## package sample
Implemented by Heather. Refer to her for questions about it. 

Instead of using System.out.println() I created a class print to use instead. (Too lazy to use System.out.println())

### chatty0 class
Simple example of how to implement regex expressions. Exists for the sake of learning and understanding the chatty1 class. Applies regex expression to extract content from a user input and add it to a bot response pattern template. Uses single keyword and single response pattern template.

### chatty1 class
Implements the Eliza script for the keyword remember. Matches multiple regex patterns to user input to extract content and add it to a randomly selected bot response pattern template. Uses single keyword and multiple response pattern templates.

Limitations of chatty1 class: 
 * Can only write in lowercase - it doesn't parse uppercase yet.
 * Need to use keyword "i remember" or "do you remember" in user input
Sample output:
  	Bot: What do you remember?
	User: i remember going for a walk
	Bot: Do you often think of going for a walk?
	User: do you remember walking with me
	Bot: You mentioned walking with me.
	User: i remember walking with you
	Bot: Do you often think of walking with you?

You can set the number of iterations by changing line 41:
int n = 3;

There are two Strings in the String array rememberPattern on line 22. These strings are regex patterns. The parenthesis form one block, so the String "(.\*)(i remember )(.\*)" has three blocks, referred to as $1, $2, and $3 respectively. The (.\*) identifies any number of characters. Essentially the code "i remember picking flowers".matches("(.\*)(i remember )(.\*)") checks to see if the phrase contains the words i remember, which it does, so it returns true. This is essentially what line 47 is doing:
if (userInput.matches(rememberPattern[i])) { 

In line 51 a random number is generated to return one of the responses in the rememberResponse String array.

## ideas
Text-to-speech - free services - 350 daily requests
http://www.voicerss.org/default.aspx

## UPDATE
Project relocated to new repository. Keeping this up in case other group members want access to the old files.
