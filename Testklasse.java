/**
 * Testklasse, um den rekursiven Algorithmus aus Labyrinth.java zu testen.
 * Enthält 10 Testlabyrinthe, eine Methode zum Testen eines Labryinths und eine
 * Methode zum Drucken eines Labyrinths.
 * 
 * @author jkuhlemann
 * @version 1.0
 *          Java Version: 17.0.7
 */
public class Testklasse {

    /**
     * Main-Methode, um die Testklasse auszuführen. Erstellt 10 Testlabyrinthe und
     * testet sie mit der Methode testLabyrinth. Die Testlabyrinthe sind als
     * 2D-Arrays
     * von Chars definiert.
     *
     * @param args Kommandozeilenargumente (nicht verwendet).
     */
    public static void main(String[] args) {
        // 10 Testlabyrinthe als 2D-Arrays von Chars
        char[][] labyrinth1 = {
                { 'X', 'X', ' ', ' ', ' ', ' ', 'X', ' ', ' ', 'X' },
                { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'X', ' ' },
                { 'X', 'X', ' ', ' ', ' ', ' ', 'X', ' ', ' ', ' ' },
                { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' },
                { ' ', ' ', 'X', ' ', ' ', ' ', ' ', ' ', ' ', 'X' },
                { 'X', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'X', ' ' },
                { ' ', 'X', 'X', ' ', ' ', ' ', ' ', ' ', ' ', ' ' },
                { 'X', 'X', ' ', ' ', ' ', 'X', ' ', ' ', 'X', ' ' },
                { ' ', ' ', ' ', 'X', ' ', ' ', ' ', ' ', 'X', ' ' },
                { ' ', ' ', 'X', 'X', 'X', ' ', ' ', ' ', ' ', ' ' }
        };

        char[][] labyrinth2 = {
                { 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X' },
                { 'X', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'X' },
                { 'X', ' ', 'X', 'X', 'X', 'X', 'X', 'X', ' ', 'X' },
                { 'X', ' ', 'X', ' ', ' ', ' ', ' ', 'X', ' ', 'X' },
                { 'X', ' ', 'X', ' ', ' ', ' ', ' ', 'X', ' ', 'X' },
                { 'X', ' ', 'X', ' ', ' ', ' ', ' ', 'X', ' ', 'X' },
                { 'X', ' ', 'X', 'X', 'X', 'X', 'X', 'X', ' ', 'X' },
                { 'X', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'X' },
                { 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X' }
        };

        char[][] labyrinth3 = {
                { 'X', 'X', ' ', 'X', ' ', 'X', ' ', ' ', 'X', ' ' },
                { ' ', ' ', ' ', ' ', 'X', ' ', ' ', ' ', 'X', ' ' },
                { ' ', ' ', ' ', ' ', ' ', 'X', 'X', 'X', ' ', 'X' },
                { ' ', 'X', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' },
                { 'X', ' ', ' ', 'X', ' ', ' ', ' ', 'X', ' ', ' ' },
                { 'X', ' ', ' ', ' ', ' ', ' ', ' ', 'X', ' ', ' ' },
                { ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'X', ' ', ' ' },
                { ' ', ' ', ' ', 'X', ' ', ' ', 'X', 'X', ' ', 'X' },
                { ' ', ' ', ' ', ' ', ' ', 'X', ' ', ' ', ' ', ' ' },
                { 'X', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'X' }
        };
        char[][] labyrinth4 = {
                { 'X', 'X', 'X', 'X', ' ', 'X', 'X', 'X', 'X', 'X' },
                { 'X', 'X', 'X', 'X', ' ', 'X', 'X', 'X', 'X', 'X' },
                { 'X', 'X', 'X', 'X', ' ', 'X', 'X', 'X', 'X', 'X' },
                { 'X', 'X', 'X', 'X', ' ', 'X', 'X', ' ', ' ', ' ' },
                { 'X', 'X', 'X', 'X', ' ', 'X', 'X', ' ', 'X', 'X' },
                { 'X', 'X', 'X', 'X', ' ', 'X', 'X', ' ', ' ', 'X' },
                { 'X', 'X', 'X', 'X', ' ', 'X', 'X', 'X', ' ', 'X' },
                { 'X', 'X', 'X', 'X', ' ', ' ', ' ', ' ', ' ', 'X' },
                { 'X', 'X', 'X', 'X', ' ', 'X', 'X', 'X', 'X', 'X' },
                { 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X' },
        };
        char[][] labyrinth5 = {
                { 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X' },
                { 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X' },
                { 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X' },
                { 'X', 'X', 'X', 'X', 'X', ' ', ' ', ' ', ' ', ' ' },
                { 'X', 'X', 'X', 'X', ' ', ' ', 'X', 'X', 'X', 'X' },
                { 'X', 'X', 'X', 'X', ' ', 'X', 'X', 'X', 'X', 'X' },
                { 'X', 'X', 'X', 'X', ' ', ' ', 'X', 'X', 'X', 'X' },
                { ' ', ' ', ' ', ' ', ' ', 'X', 'X', 'X', 'X', 'X' },
                { 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X' },
                { 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X' },
        };
        char[][] labyrinth6 = {
                { ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'X', 'X', ' ' },
                { 'X', 'X', 'X', 'X', ' ', ' ', ' ', 'X', ' ', ' ' },
                { ' ', ' ', 'X', 'X', ' ', ' ', 'X', ' ', ' ', ' ' },
                { ' ', ' ', ' ', ' ', 'X', ' ', 'X', 'X', 'X', ' ' },
                { 'X', 'X', 'X', 'X', ' ', ' ', ' ', 'X', ' ', 'X' },
                { 'X', 'X', ' ', ' ', ' ', ' ', ' ', ' ', 'X', 'X' },
                { ' ', 'X', ' ', ' ', ' ', ' ', 'X', 'X', 'X', 'X' },
                { ' ', ' ', 'X', ' ', 'X', ' ', ' ', ' ', ' ', ' ' },
                { ' ', ' ', ' ', ' ', 'X', 'X', 'X', ' ', ' ', 'X' },
                { ' ', 'X', ' ', ' ', 'X', ' ', 'X', 'X', 'X', ' ' }
        };
        char[][] labyrinth7 = {
                { ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'X', ' ', ' ' },
                { ' ', ' ', ' ', 'X', ' ', ' ', ' ', ' ', 'X', 'X' },
                { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' },
                { ' ', ' ', 'X', ' ', 'X', ' ', ' ', 'X', ' ', 'X' },
                { 'X', ' ', 'X', ' ', ' ', ' ', ' ', 'X', ' ', 'X' },
                { ' ', 'X', ' ', 'X', ' ', ' ', ' ', ' ', ' ', ' ' },
                { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'X', ' ' },
                { ' ', ' ', ' ', 'X', 'X', ' ', ' ', ' ', ' ', ' ' },
                { ' ', ' ', 'X', ' ', ' ', ' ', 'X', 'X', 'X', ' ' },
                { 'X', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'X', ' ' }
        };
        char[][] labyrinth8 = {
                { ' ', 'X', 'X', ' ', ' ', ' ', ' ', 'X', 'X', ' ' },
                { ' ', 'X', ' ', ' ', ' ', 'X', ' ', ' ', ' ', ' ' },
                { ' ', 'X', ' ', ' ', 'X', ' ', 'X', ' ', ' ', ' ' },
                { 'X', ' ', ' ', 'X', ' ', ' ', ' ', ' ', ' ', 'X' },
                { ' ', ' ', 'X', ' ', 'X', ' ', ' ', ' ', ' ', 'X' },
                { ' ', ' ', 'X', 'X', ' ', ' ', ' ', ' ', 'X', ' ' },
                { ' ', ' ', 'X', 'X', 'X', 'X', ' ', 'X', ' ', 'X' },
                { ' ', ' ', ' ', ' ', ' ', 'X', ' ', ' ', ' ', ' ' },
                { 'X', ' ', ' ', ' ', ' ', ' ', 'X', ' ', ' ', ' ' },
                { ' ', 'X', ' ', ' ', ' ', 'X', ' ', ' ', ' ', ' ' }
        };
        char[][] labyrinth9 = {
                { ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'X', ' ', ' ' },
                { ' ', 'X', ' ', ' ', 'X', ' ', 'X', ' ', ' ', 'X' },
                { ' ', 'X', 'X', ' ', ' ', ' ', ' ', 'X', ' ', 'X' },
                { ' ', ' ', ' ', ' ', ' ', ' ', 'X', 'X', 'X', 'X' },
                { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'X', ' ' },
                { 'X', 'X', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'X' },
                { ' ', ' ', 'X', ' ', 'X', 'X', 'X', 'X', ' ', ' ' },
                { ' ', 'X', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'X' },
                { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'X', ' ' },
                { ' ', ' ', ' ', 'X', ' ', ' ', ' ', ' ', 'X', 'X' }
        };
        char[][] labyrinth10 = {
                { 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', ' ', 'X' },
                { 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', ' ', 'X' },
                { 'X', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'X' },
                { 'X', ' ', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X' },
                { 'X', ' ', 'X', 'X', ' ', ' ', ' ', ' ', ' ', 'X' },
                { 'X', ' ', 'X', 'X', 'X', 'X', 'X', 'X', ' ', 'X' },
                { 'X', ' ', 'X', 'X', 'X', 'X', 'X', 'X', ' ', 'X' },
                { 'X', ' ', 'X', 'X', 'X', 'X', 'X', 'X', ' ', 'X' },
                { 'X', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'X' },
                { 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X' }
        };

        // Testen der Labyrinthe
        testLabyrinth(labyrinth1, "Labyrinth 1");
        testLabyrinth(labyrinth2, "Labyrinth 2");
        testLabyrinth(labyrinth3, "Labyrinth 3");
        testLabyrinth(labyrinth4, "Labyrinth 4");
        testLabyrinth(labyrinth5, "Labyrinth 5");
        testLabyrinth(labyrinth6, "Labyrinth 6");
        testLabyrinth(labyrinth7, "Labyrinth 7");
        testLabyrinth(labyrinth8, "Labyrinth 8");
        testLabyrinth(labyrinth9, "Labyrinth 9");
        testLabyrinth(labyrinth10, "Labyrinth 10");
    }

    /**
     * Testet ein gegebenes Labyrinth, ob ein Weg zu einem freien Rand gefunden
     * werden
     * kann. Druckt das Labyrinth und eine Nachricht, ob ein Weg gefunden wurde oder
     * nicht.
     *
     * @param labyrinth     Das Labyrinth, das getestet wird.
     * @param labyrinthName Der Name des Labyrinths, der in der Ausgabe verwendet
     *                      wird.
     */
    private static void testLabyrinth(char[][] labyrinth, String labyrinthName) {
        Labyrinth lab = new Labyrinth(labyrinth);
        boolean found = lab.existWeg(4, 4); // Startpunkt (4, 4) in der Mitte des Labyrinths (4,4, da Index bei 0
                                            // beginnt)

        System.out.println(labyrinthName + ":");
        printLabyrinth(labyrinth);
        System.out.println(found ? "Weg gefunden." : "Kein Weg gefunden.");
        System.out.println();
    }

    /**
     * Druckt ein Labyrinth formatier aus. Jede Zelle wird mit einem Leerzeichen
     * getrennt und jede Zeile wird in einer neuen Zeile gedruckt.
     *
     * @param labyrinth Das Labyrinth, das gedruckt wird.
     */
    private static void printLabyrinth(char[][] labyrinth) {
        for (char[] row : labyrinth) {
            for (char cell : row) {
                System.out.print(cell + " "); // Druckt jede Zelle mit einem Leerzeichen dazwischen
            }
            System.out.println(); // Neue Zeile nach jeder Zeile des Labyrinths
        }
    }
}
