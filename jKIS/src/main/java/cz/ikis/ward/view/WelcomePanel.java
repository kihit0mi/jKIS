package cz.ikis.ward.view;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class WelcomePanel extends JPanel {
    public WelcomePanel() {
        setLayout(new GridBagLayout());
        setBackground(new Color(245, 248, 250));
        setBorder(new EmptyBorder(40, 40, 40, 40));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = GridBagConstraints.RELATIVE;
        gbc.insets = new Insets(12, 0, 12, 0);
        gbc.anchor = GridBagConstraints.CENTER;

        // Welcome Logo / Icon Placeholder or Styling
        JLabel logoLabel = new JLabel("jKIS");
        logoLabel.setFont(new Font("Segoe UI", Font.BOLD, 48));
        logoLabel.setForeground(new Color(79, 166, 209));
        add(logoLabel, gbc);

        // Title
        JLabel titleLabel = new JLabel("Welcome to jKIS");
        titleLabel.setFont(new Font("Segoe UI", Font.BOLD, 28));
        titleLabel.setForeground(new Color(50, 50, 50));
        add(titleLabel, gbc);

        // Subtitle
        JLabel subtitleLabel = new JLabel("Your simple patient management system");
        subtitleLabel.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        subtitleLabel.setForeground(new Color(120, 120, 120));
        add(subtitleLabel, gbc);

        // Separator Line
        JPanel separator = new JPanel();
        separator.setPreferredSize(new Dimension(200, 2));
        separator.setBackground(new Color(220, 225, 230));
        add(separator, gbc);

        // Instructions
        JLabel instrLabel = new JLabel("Use the sidebar on the left to navigate between patients, wards, and contacts.");
        instrLabel.setFont(new Font("Segoe UI", Font.ITALIC, 14));
        instrLabel.setForeground(new Color(150, 150, 150));
        add(instrLabel, gbc);
    }
}
