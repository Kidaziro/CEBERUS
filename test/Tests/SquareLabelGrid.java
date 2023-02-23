package Tests;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class SquareLabelGrid {

    int rows = 6;
    int cols = 7;
    JLabel[][] labelArray = new JLabel[cols][rows];
    Font bigFont = new Font(Font.SANS_SERIF, Font.BOLD, 30);
    Insets labelInsets;

    SquareLabelGrid() {
        JPanel gameBoard = new JPanel(new GridLayout(rows, cols));
        // a border to make the cell boundaries more clear and add 
        // some space around the text
        Border border = new CompoundBorder(
                new LineBorder(Color.BLACK),new EmptyBorder(4,4,4,4));
        for (int yy = 0; yy < rows; yy++) {
            for (int xx = 0; xx < cols; xx++) {
                JLabel l = getColoredSquareLabel(xx, yy);
                labelArray[xx][yy] = l;
                gameBoard.add(l);
                l.setBorder(border);
            }
        }
        JOptionPane.showMessageDialog(null, gameBoard);
    }

    private JLabel getColoredSquareLabel(int x, int y) {
        SquareLabel label = new SquareLabel(
                String.format("%1s,%1s", (x+1), (y+1)));
        label.setFont(bigFont);
        label.setOpaque(true); // so we can see the BG color
        label.setBackground(Color.ORANGE); // I prefer orange!
        // make the GUI less 'crowded'
        label.setBorder(new EmptyBorder(4,4,4,4)); 

        return label;
    }

    public static void main(String[] args) {
        Runnable r = () -> {
            new SquareLabelGrid();
        };
        SwingUtilities.invokeLater(r);
    }
}

class SquareLabel extends JLabel {

    SquareLabel(String label) {
        super(label);
    }

    /* This will create a square component that accounts for the 
     size of the String / Icon it contains. No guesswork! */
    @Override
    public Dimension getPreferredSize() {
        Dimension d = super.getPreferredSize();
        int w = d.width;
        int h = d.height;
        int sz = w > h ? w : h;

        return new Dimension(sz, sz);
    }
}