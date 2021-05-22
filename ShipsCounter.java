package package1;

public class ShipsCounter {
    static int count;
    static int[][] ships =
                    {{0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
                    {0, 1, 0, 0, 0, 0, 0, 1, 0, 0},
                    {0, 1, 0, 1, 1, 0, 0, 0, 0, 0},
                    {0, 1, 0, 1, 1, 0, 0, 1, 1, 1},
                    {0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                    {1, 1, 1, 1, 0, 1, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                    {1, 1, 0, 0, 0, 0, 0, 1, 0, 0},
                    {1, 1, 0, 0, 0, 0, 0, 0, 0, 1}};

    public static void main(String[] args) {
        for(int j = 0; j < ships.length; j++) {
            for(int i = 0; i < ships[j].length; i++) {
                if(ships[j][i] == 1) checkConnection(j, i);
            }
        }
        String formatted = String.format("Кількість кораблів: %d", count);
        System.out.print(formatted);
    }

    public static void checkConnection(int j, int i) {
        if(j != 0 && ships[j - 1][i] != 0) return;
        if(i != 0 && ships[j][i - 1] != 0) return;
        count++;
    }
}
