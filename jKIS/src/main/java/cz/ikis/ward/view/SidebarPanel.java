package cz.ikis.ward.view;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class SidebarPanel extends JPanel{

    private SidebarButton patientsBtn;

    public SidebarPanel(){

        this.setPreferredSize(new Dimension(200,0));
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        this.setBackground(new Color(79, 166, 209));
        this.setBorder(new EmptyBorder(20,20,20,20));

        patientsBtn = new SidebarButton("Patients");
        SidebarButton wardBtn = new SidebarButton("Wards");
        SidebarButton manageBtn = new SidebarButton("Manage patients");
        SidebarButton contactBtn = new SidebarButton("Contacts");

        this.add(patientsBtn);
        this.add(Box.createRigidArea(new Dimension(0,15)));
        this.add(wardBtn);
        this.add(Box.createRigidArea(new Dimension(0,15)));
        this.add(manageBtn);
        this.add(Box.createRigidArea(new Dimension(0,15)));
        this.add(contactBtn);

    };

    public void addPatientsButtonListener(java.awt.event.ActionListener listener) {
        patientsBtn.addActionListener(listener);
    }
}
