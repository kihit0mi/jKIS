package cz.ikis.ward.view;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class StyledButton extends JButton {

    private StyledButton(String text, int fontSize, int paddingH) {
        super(text);

        this.setFocusPainted(false);
        this.setBorderPainted(false);

        this.setBackground(new Color(149, 213, 245));
        this.setForeground(new Color(50, 50, 50));
        this.setOpaque(true);

        this.setFont(new Font("Segoe UI", Font.BOLD, fontSize));
        this.setBorder(new EmptyBorder(10, paddingH, 10, paddingH));
        this.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }

    public static StyledButton sidebar(String text) {
        return new StyledButton(text, 14, 20);
    }

    public static StyledButton toolbar(String text) {
        return new StyledButton(text, 12, 5);
    }
}
