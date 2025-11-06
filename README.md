# Simple Wordle

A fun little remake of the classic (well technically, one advantage is you can play it without wifi 😃)...

<img width="699" height="795" alt="Screenshot 2025-11-05 at 4 55 55 PM" src="https://github.com/user-attachments/assets/b066c3e1-b42a-46d0-a552-a6f70b533f7c" />


# Guide (step by step):

## Downloading:
To download the game, just tap on the green code button at the top, navigate to the "Local" tab on the top, and then press on "Download Zip". This will give you a zip file with all the code.


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
- I will probably update this somewhat constantly (at least for a while), so any current bugs (I don't think they are any, but I could be wrong), will probably be patched soon (basically I'm saying, let me know of any bugs).
