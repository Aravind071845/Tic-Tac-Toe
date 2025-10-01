Tic-Tac-Toe (Java Console Game)

A simple two-player Tic-Tac-Toe game implemented in Java for the console.

Players take turns placing X or O on a 3×3 board until someone wins.

---

> Features

Two-player turn-based Tic-Tac-Toe.

Board displayed in the console after every move.

Detects all winning conditions:

3 in a row (horizontal)

3 in a column (vertical)

3 diagonally

Announces the winning player and stops the game immediately.

---

> Requirements

Java 8 or above.

Terminal / Command Prompt for running the program.

---

> How to Play

The board is a 3×3 grid initialized with empty spaces ' '.

The game starts with Player O.

On your turn, enter row and column numbers (0-based index: 0, 1, or 2) separated by space.

Example: entering 1 2 places your mark in row 1, column 2.

If the chosen cell is already occupied, you’ll be asked to try again.

Players alternate between O and X until one wins.

When a player wins, the game stops and displays the final board.

---

> Game Rules

A player wins if they occupy 3 consecutive cells:

Horizontally in any row

Vertically in any column

Diagonally (two possible diagonals)

The game currently does not handle draws — it keeps going until someone wins.

---