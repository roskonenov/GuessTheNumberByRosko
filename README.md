## LIVE DEMO 

[********PLAY********](https://replit.com/@roskonenov/GuessTheNumberByRosko?v=1)


## Guess-The-Number-ByRosko 🔢🤔
![1531093844](https://github.com/roskonenov/GuessTheNumberByRosko/assets/133804876/adcb604d-682c-4fbb-aee5-3971b646e50f)

**Another Console Game within the Programing Fundamentals course @SoftUni

**For this project we had to implement a simple game of number guessing.

 The program allows the user to play the game in multiple levels where they have to guess a randomly generated number within a specified range.
 The game provides hints to the user, indicating if the guessed number is too low or too high.
 
 1. The main method initializes variables related to the game, including the current level (level) and
     the upper bound of the numbers that can be guessed (bound).
     Additionally, there is a variable anotherGame to store the user's response if they want to play again.
    
 2. The core logic of the game is within the do-while loop, ensuring that the game runs at least once and continues based on the user's desire to play again.
     Each iteration of the loop starts with displaying the current level and generating a new random number within the current bound.
  
 3. The user is prompted to enter their guess, and the inputInOrder method validates their input, ensuring it is a number and within the valid range.
     If the input is invalid, the user is prompted to try again.
  
 4. Once the user provides a valid guess, the numberGuessed method determines whether the number is correct or provides helpful hints for higher or lower guesses.
     If the user successfully guesses the number, the level is incremented, and the bound is adjusted for the next level if it's not the last level.
  
 5. After completing level 5, the user is asked if they want to play again. The input is validated until the user provides a valid response.
      If the user chooses not to play again, the game ends with a farewell message.
     If the user decides to play again, the loop restarts, and the game continues.
 
 6. The code also uses ANSI escape codes for changing text colors, making the output more colorful and engaging.

**#screenshot**
![image](https://github.com/roskonenov/GuessTheNumberByRosko/assets/133804876/4da6a7e2-965e-49a7-bcb9-a6b2fbe1816d)

#Source code link: [view code](src/GuessTheNumberByRosko.java)


