import javax.swing.*;
import javax.swing.table.TableColumnModel;
import java.awt.*;

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
        displayTableInMessageBox(table);
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
    void displayTableInMessageBox(short[][] table){
        JTable tab= new JTable(11,11);

        TableColumnModel columnModel = tab.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(15);
        columnModel.getColumn(1).setPreferredWidth(15);
        columnModel.getColumn(2).setPreferredWidth(15);
        columnModel.getColumn(3).setPreferredWidth(15);
        columnModel.getColumn(4).setPreferredWidth(15);
        columnModel.getColumn(5).setPreferredWidth(15);
        columnModel.getColumn(6).setPreferredWidth(15);
        columnModel.getColumn(7).setPreferredWidth(15);
        columnModel.getColumn(8).setPreferredWidth(15);
        columnModel.getColumn(9).setPreferredWidth(15);
        columnModel.getColumn(10).setPreferredWidth(15);

        tab.setShowGrid(true);
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                tab.setValueAt(table[i][j],i,j);
            }
        }
        ScrollPane pane = new ScrollPane();
        pane.add(tab);
        pane.setPreferredSize(new Dimension(300,178));
        JOptionPane.showMessageDialog(null, pane);
    }
}
