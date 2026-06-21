package cz.ikis.ward.view;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class ContactPanel extends JPanel {
    public ContactPanel() {
        setLayout(new GridBagLayout());
        setBackground(new Color(245, 245, 245));
        setBorder(new EmptyBorder(40, 40, 40, 40));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = GridBagConstraints.RELATIVE;
        gbc.insets = new Insets(10, 0, 10, 0);
        gbc.anchor = GridBagConstraints.CENTER;

        JLabel titleLabel = new JLabel("Contact Support");
        titleLabel.setFont(new Font("Segoe UI", Font.BOLD, 24));
        titleLabel.setForeground(new Color(50, 50, 50));
        add(titleLabel, gbc);

        JLabel infoLabel = new JLabel("If you experience any issues with the application, please reach out to:");
        infoLabel.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        infoLabel.setForeground(new Color(100, 100, 100));
        add(infoLabel, gbc);

        JLabel emailLabel = new JLabel("ondrej.vavera@gmail.com");
        emailLabel.setFont(new Font("Segoe UI", Font.BOLD, 18));
        emailLabel.setForeground(new Color(79, 166, 209));
        add(emailLabel, gbc);
    }
}
