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
    }
    public void openTabInWorkspace(String title, JPanel contentPanel) {
        mainWorkspace.addTab(title, contentPanel);
        mainWorkspace.setSelectedComponent(contentPanel);
    }

    public boolean isTabOpen(String title) {
        for (int i = 0; i <mainWorkspace.getTabCount(); i++) {
            if (mainWorkspace.getTitleAt(i).equals(title)) {
                mainWorkspace.setSelectedIndex(i);
                return true;
            }
        }
        return false;
    }
}
