### Please note that StdDraw.java was not created by me and I only made a few tweaks to it to fit my program (StdDraw is a java library program).


# Simple Wordle

A fun little remake of the classic (well technically, one change is you can play it without wifi 😃)...

<img width="699" height="795" alt="Screenshot 2025-11-05 at 4 55 55 PM" src="https://github.com/user-attachments/assets/b066c3e1-b42a-46d0-a552-a6f70b533f7c" />

# Guide (step by step):

### Install the latest release for best experience (older releases will work fine as well, but they will have more bugs and less features obviously). 

## Playing the Game:

### To play the game, do the following: 
1. Go to the shell on your laptop.
2. Go to the directory with the code inside it (to do so, use the command: cd [file directory info]).
   - For example, assuming my game files were stored in Simple Wordle, in a manner like this (image below), I would use the command: cd Desktop/SimpleWordle
  
<img width="601" height="409" alt="Screenshot 2025-11-05 at 4 29 57 PM" src="https://github.com/user-attachments/assets/e1254f76-b81b-4fd7-8b66-cca0b352b9f2" />

3. Next compile all the files using the command: javac *.java (It may show some warnings, but those are just because of some archaic methods the StdDraw.java file is, it won't be a problem).
4. Next run the game with the command: java Wordle
- A window should pop up that looks like this:

<img width="696" height="798" alt="Screenshot 2025-11-05 at 4 45 54 PM" src="https://github.com/user-attachments/assets/c771c174-b797-4feb-8554-cbdd222ce6a1" />

5. Enjoy!
- You can press the "Reset" button to reset the board and the word you have to guess
- Also the on-screen keyboard is not just for show, it actually works.

### Some simple command line "cheats":
- Saying: java Wordle show during runtime (instead of: java Wordle) will show you the word that you need to guess for this turn (and the next ones).
- You can choose your own words as well by putting a word in front of the "java Wordle show" command (i.e. to make the word "pizza", you should do: java Wordle show pizza)


### Final Notes:
- I will probably update this somewhat constantly (at least for a while), so any current bugs (I don't think they are any, but I could be wrong), will probably be patched soon (as of now).
