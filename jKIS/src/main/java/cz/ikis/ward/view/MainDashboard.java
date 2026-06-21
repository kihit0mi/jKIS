package cz.ikis.ward.view;

import javax.swing.*;
import java.awt.*;

public class MainDashboard extends JFrame {

    private SidebarPanel sidebar;
    private JTabbedPane mainWorkspace;

    public MainDashboard(SidebarPanel sidebar){

        this.sidebar = sidebar;

        //WINDOW SETTINGS
        setTitle("Ward Dashboard - Clinical Information System");
        setSize(1024,768);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new BorderLayout());

        mainWorkspace = new JTabbedPane();

        add(sidebar, BorderLayout.WEST);
        add(mainWorkspace, BorderLayout.CENTER);

        // Open Welcome/Home tab by default (non-closeable)
        openTabInWorkspace("Home", new WelcomePanel(), false);
    }

    public void openTabInWorkspace(String title, JPanel contentPanel) {
        openTabInWorkspace(title, contentPanel, true);
    }

    public void openTabInWorkspace(String title, JPanel contentPanel, boolean isCloseable) {
        mainWorkspace.addTab(title, contentPanel);
        int index = mainWorkspace.indexOfComponent(contentPanel);
        if (isCloseable) {
            setupTabCloseButton(index);
        }
        mainWorkspace.setSelectedComponent(contentPanel);
    }

    private void setupTabCloseButton(int index) {
        JPanel tabHeader = new JPanel(new FlowLayout(FlowLayout.LEFT, 5, 0));
        tabHeader.setOpaque(false);

        JLabel label = new JLabel(mainWorkspace.getTitleAt(index));

        JButton closeBtn = new JButton("×");
        closeBtn.setFont(new Font("Segoe UI", Font.BOLD, 14));
        closeBtn.setMargin(new Insets(0, 2, 0, 2));
        closeBtn.setBorderPainted(false);
        closeBtn.setContentAreaFilled(false);
        closeBtn.setFocusPainted(false);
        closeBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        closeBtn.setForeground(new Color(150, 150, 150));

        closeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeBtn.setForeground(new Color(200, 50, 50));
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeBtn.setForeground(new Color(150, 150, 150));
            }
        });

        closeBtn.addActionListener(e -> {
            int i = mainWorkspace.indexOfTabComponent(tabHeader);
            if (i != -1) {
                mainWorkspace.remove(i);
            }
        });

        tabHeader.add(label);
        tabHeader.add(closeBtn);
        mainWorkspace.setTabComponentAt(index, tabHeader);
    }

    public boolean isTabOpen(String title) {
        for (int i = 0; i <mainWorkspace.getTabCount(); i++) {
            // Find tab component or compare with the label text inside custom tab header if set
            Component tabComp = mainWorkspace.getTabComponentAt(i);
            String tabTitle = "";
            if (tabComp instanceof JPanel) {
                JPanel panel = (JPanel) tabComp;
                for (Component child : panel.getComponents()) {
                    if (child instanceof JLabel) {
                        tabTitle = ((JLabel) child).getText();
                        break;
                    }
                }
            } else {
                tabTitle = mainWorkspace.getTitleAt(i);
            }

            if (tabTitle.equals(title)) {
                mainWorkspace.setSelectedIndex(i);
                return true;
            }
        }
        return false;
    }
}
