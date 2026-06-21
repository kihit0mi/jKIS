package cz.ikis.ward.view;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class SidebarPanel extends JPanel{

    private StyledButton patientsBtn;
    private StyledButton wardBtn;
    private StyledButton contactBtn;

    public SidebarPanel(){

        this.setPreferredSize(new Dimension(200,0));
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        this.setBackground(new Color(79, 166, 209));
        this.setBorder(new EmptyBorder(20,20,20,20));

        patientsBtn = StyledButton.sidebar("Patients");
        wardBtn = StyledButton.sidebar("Wards");
        StyledButton manageBtn = StyledButton.sidebar("Manage patients");
        contactBtn = StyledButton.sidebar("Contacts");

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

    public void addWardsButtonListener(java.awt.event.ActionListener listener) {
        wardBtn.addActionListener(listener);
    }

    public void addContactsButtonListener(java.awt.event.ActionListener listener) {
        contactBtn.addActionListener(listener);
    }
}
