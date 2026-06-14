package cz.ikis.ward.view;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class SidebarButton extends JButton {

    public SidebarButton(String text){
        super(text);

        this.setFocusPainted(false);
        this.setBorderPainted(false);

        this.setBackground(new Color(149, 213, 245));
        this.setForeground(new Color(50,50,50));
        this.setOpaque(true);

        this.setFont(new Font("Segoe UI", Font.BOLD, 14));

        this.setBorder(new EmptyBorder(10,20,10,20));
        this.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }
}
