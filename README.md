# Labyrinth Pathfinding in Java
This project implements a labyrinth solver in Java. The labyrinth is represented as a 2D array of characters, where walls, open paths, and exit points are defined. A recursive algorithm is used to find a path from a starting point to an exit. The solution is demonstrated through test cases that showcase different labyrinth structures.

## Features
Represents the labyrinth as a 2D character array.
Uses recursion to search for an exit from a given starting point.
Provides visual output of the labyrinth and the path found (if any).
Includes test cases to validate the solution against multiple labyrinth configurations.
## How to Run
1. Clone the repository:
```
git clone https://github.com/yourusername/labyrinth-solver.git
```
2. Navigate to the repository:
```
cd labyrinth-solver
```
3. Compile the Java files:
```
javac Labyrinth.java Testklasse.java
```
4. Run the test cases:
```
javac Labyrinth.java Testklasse.java
```
## Example Output
For each labyrinth, the output shows the layout and whether a path was found.
```
Labyrinth 1:
X X X X X X X X * X 
X X X X X X X X * X 
X * * * * * * * * X 
X * X X X X X X X X 
X * X X * * * * * X 
X * X X X X X X * X 
X * X X X X X X * X 
X * X X X X X X * X 
X * * * * * * * * X 
X X X X X X X X X X
Weg gefunden.
```
## Requirements
- Java 17 or later
## License
This project is licensed under the MIT License.
