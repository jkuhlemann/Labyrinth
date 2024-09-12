/**
 * Die Klasse Labyrinth stellt einen Konstruktor bereit, der ein Labyrinth als
 * 2D-Array
 * von Chars speichert. Außerdem enthält sie eine Methode, die einen rekursiven
 * Algorithmus verwendet, um einen Ausweg aus dem Labyrinth zu finden.
 * 
 * @author jkuhlemann
 * @version 1.0
 *          Java Version: 17.0.7
 */
public class Labyrinth {
    private char[][] lab; // Das Labyrinth wird als 2D-Array von Zeichen gespeichert.

    /**
     * Konstruktor zum Initialisieren des Labyrinths mit einem gegebenen Array.
     * 
     * @param lab Das zweidimensionale Array von Zeichen, das das Labyrinth
     *            darstellt.
     */
    public Labyrinth(char[][] lab) {
        this.lab = lab;
    }

    /**
     * Sucht rekursiv nach einem Ausweg aus dem Labyrinth, beginnend bei den
     * gegebenen Koordinaten.
     * 
     * @param x Die X-Koordinate der Startposition im Labyrinth.
     * @param y Die Y-Koordinate der Startposition im Labyrinth.
     * @return true, wenn ein Ausweg gefunden wurde, sonst false.
     */
    public boolean existWeg(int x, int y) {
        // Prüfen, ob die aktuelle Position außerhalb der Grenzen des Labyrinths liegt.
        if (x < 0 || x >= 10 || y < 0 || y >= 10) {
            return false;
        }

        // Prüfen, ob die aktuelle Position eine Wand ist.
        if (lab[x][y] == 'X') {
            return false;
        }

        // Prüfen, ob die aktuelle Position am Rand des Labyrinths liegt und keine Wand ist.
        if (lab[x][y] == ' ' && (x == 0 || x == 9 || y == 0 || y == 9)) {
            lab[x][y] = '*'; // Markieren der Ausgangsposition, wenn freier Rand erreicht wurde.
            return true;
        }

        // Prüfen, ob die aktuelle Position bereits besucht wurde.
        if (lab[x][y] == '*') {
            return false;
        }

        // Markieren der aktuellen Position als besucht.
        lab[x][y] = '*';

        // Rekursive Suche nach einem Weg aus dem Labyrinth in alle vier Richtungen
        if (existWeg(x + 1, y) || // Bewegung nach unten
                existWeg(x - 1, y) || // Bewegung nach oben
                existWeg(x, y + 1) || // Bewegung nach rechts
                existWeg(x, y - 1)) { // Bewegung nach links
            return true;
        }

        // Zurücksetzen der Markierung, wenn kein Weg gefunden wurde (Backtracking).
        lab[x][y] = ' ';

        return false;
    }
}
