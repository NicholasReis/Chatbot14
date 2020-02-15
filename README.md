# Chatbot14
Group14 Chatbot

# package chatbot14 
Contains the two classes Bot and ChatBot which include the starter code that Nicholas has been working on.

# package sample 
Contains the class chatty that has the Eliza script implemented for the keyword remember - done by Heather

Limitations of chatty class: 
 * 1. can only write in lowercase - it doesn't parse uppercase yet.
 * 2. Need to use keyword "i remember" or "do you remember" in user input
 * Sample output:
  	Bot: What do you remember?
	User: i remember going for a walk
	Bot: Do you often think of going for a walk?
	User: do you remember walking with me
	Bot: You mentioned walking with me.
	User: i remember walking with you
	Bot: Do you often think of walking with you?
	
Instead of using System.out.println() I created a class print to use instead.

You can set the number of iterations by changing line 41:
int n = 3;

There are two Strings in the String array rememberPattern on line 22. These strings are regex patterns. The parenthesis form one block, so the String "(.*)(i remember )(.*)" has three blocks, referred to as $1, $2, and $3 respectively. The (.*) identifies any number of characters. Essentially the code "i remember picking flowers".matches("(.*)(i remember )(.*)") checks to see if the phrase contains the words i remember, which it does, so it returns true. This is essentially what line 47 is doing:
if (userInput.matches(rememberPattern[i])) { 

In line 51 a random number is generated to return one of the responses in the rememberResponse String array.


