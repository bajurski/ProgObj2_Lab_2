public class Calculations {
    private final short[][] table = new short[11][11];

    void calcTable() {

        for (short i = 0; i < 11; i++) {
            for (short j = 0; j < 11; j++) {
                short val = (short) (i * j);
                if (i == 0) val = j;
                if (j == 0) val = i;
                table[i][j] = val;

            }
        }
        diplayTableInConsol(table);
    }

    void diplayTableInConsol(short[][] table) {
        System.out.println(" _______________________________________________________");
        for (short i = 0; i < 11; i++) {
            for (short j = 0; j < 11; j++) {
                if(i==0 && j==0)System.out.print(" |   ");
                else if(i==10 && j==10)System.out.format("%2s%2d%1s\n","|", table[i][j], "|");
                else if (j == 10) System.out.format("%2s%2d%2s \n","|", table[i][j], "|");
                    else System.out.format("%2s%3d", "|", table[i][j]);
            }
            System.out.println(" -------------------------------------------------------");
        }
    }

}
