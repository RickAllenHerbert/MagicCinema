package ac.za.cput.project3.design;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomeGUI extends JFrame implements ActionListener {
    private JPanel panelNorth, panelCenter, panelSouth;
    private JLabel lblHeading;
    private JButton btnBookItem, btnReturnItem, btnAddCustomer, btnAddProduct, btnRemoveProduct, btnLogout;
    private ImageIcon iconLogo, iconBookItem, iconReturnItem, iconAddCustomer, iconAddProduct, iconRemoveProduct;
    private Color main_color, sub_color, text_color;

    public HomeGUI() {
        super("Home Menu");

        // Color

        main_color = new Color(153,198,47);
        sub_color = new Color(20,24,27);
        text_color = new Color(169,169,169);

        // Image

        iconLogo = new ImageIcon("logo.png");
        lblHeading = new JLabel();
        lblHeading.setHorizontalAlignment(SwingConstants.CENTER);
        lblHeading.setIcon(iconLogo);

        iconBookItem = new ImageIcon("bookItem.png");
        iconReturnItem = new ImageIcon("returnItem.png");
        iconAddCustomer = new ImageIcon("addCustomer.png");
        iconAddProduct = new ImageIcon("addProduct.png");
        iconRemoveProduct = new ImageIcon("removeProduct.png");

        //Buttons

        btnBookItem = new JButton("Book Item", iconBookItem);
        btnBookItem.setVerticalTextPosition(SwingConstants.BOTTOM);
        btnBookItem.setHorizontalTextPosition(SwingConstants.CENTER);
        btnBookItem.setPreferredSize(new Dimension(130, 70));
        btnBookItem.setBackground(sub_color);
        btnBookItem.setForeground(Color.WHITE);
        btnBookItem.setBorder(BorderFactory.createLineBorder(main_color));

        btnReturnItem = new JButton("Return Item", iconReturnItem);
        btnReturnItem.setVerticalTextPosition(SwingConstants.BOTTOM);
        btnReturnItem.setHorizontalTextPosition(SwingConstants.CENTER);
        btnReturnItem.setPreferredSize(new Dimension(130, 70));
        btnReturnItem.setBackground(sub_color);
        btnReturnItem.setForeground(Color.WHITE);
        btnReturnItem.setBorder(BorderFactory.createLineBorder(main_color));

        btnAddCustomer = new JButton("Add Customer", iconAddCustomer);
        btnAddCustomer.setVerticalTextPosition(SwingConstants.BOTTOM);
        btnAddCustomer.setHorizontalTextPosition(SwingConstants.CENTER);
        btnAddCustomer.setPreferredSize(new Dimension(130, 70));
        btnAddCustomer.setBackground(sub_color);
        btnAddCustomer.setForeground(Color.WHITE);
        btnAddCustomer.setBorder(BorderFactory.createLineBorder(main_color));

        btnAddProduct = new JButton("Add Product", iconAddProduct);
        btnAddProduct.setVerticalTextPosition(SwingConstants.BOTTOM);
        btnAddProduct.setHorizontalTextPosition(SwingConstants.CENTER);
        btnAddProduct.setPreferredSize(new Dimension(130, 70));
        btnAddProduct.setBackground(sub_color);
        btnAddProduct.setForeground(Color.WHITE);
        btnAddProduct.setBorder(BorderFactory.createLineBorder(main_color));

        btnRemoveProduct = new JButton("Remove Product", iconRemoveProduct);
        btnRemoveProduct.setVerticalTextPosition(SwingConstants.BOTTOM);
        btnRemoveProduct.setHorizontalTextPosition(SwingConstants.CENTER);
        btnRemoveProduct.setPreferredSize(new Dimension(130, 70));
        btnRemoveProduct.setBackground(sub_color);
        btnRemoveProduct.setForeground(Color.WHITE);
        btnRemoveProduct.setBorder(BorderFactory.createLineBorder(main_color));

        btnLogout = new JButton("Logout");
        btnLogout.setBackground(sub_color);
        btnLogout.setForeground(Color.WHITE);

        //ActionListener
        btnBookItem.addActionListener(this);
        btnReturnItem.addActionListener(this);
        btnAddCustomer.addActionListener(this);
        btnRemoveProduct.addActionListener(this);
        btnAddProduct.addActionListener(this);
        btnLogout.addActionListener(this);

        Container ctrMain = this.getContentPane();
        ctrMain.setLayout(new BorderLayout(8,6));
        ctrMain.setBackground(sub_color);

        getRootPane().setBorder(BorderFactory.createEmptyBorder(4,4,4,4));

        //Top Panel
        panelNorth = new JPanel();
        panelNorth.setBackground(sub_color);
        panelNorth.add(lblHeading);

        //Center Panel
        panelCenter = new JPanel();
        panelCenter.setLayout(new FlowLayout(4,4,4));
        panelCenter.setBackground(sub_color);

        JPanel panelGrid = new JPanel();
        panelGrid.setLayout(new GridLayout(6,1,5,5));
        panelGrid.setBackground(sub_color);

        panelGrid.add(btnBookItem);
        panelGrid.add(btnReturnItem);
        panelGrid.add(btnAddProduct);
        panelGrid.add(btnRemoveProduct);
        panelGrid.add(btnAddCustomer);

        //Calender --> Add Calender System here
        JLabel calender = new JLabel("CALENDER PLACEHOLDER", SwingConstants.CENTER);
        calender.setOpaque(true);
        panelCenter.add(panelGrid);


        //South Panel
        panelSouth = new JPanel();
        panelSouth.setLayout(new GridLayout(1,4));
        panelSouth.setBackground(sub_color);
        panelSouth.add(new JLabel());
        panelSouth.add(new JLabel());
        panelSouth.add(new JLabel());
        panelSouth.add(btnLogout);

        ctrMain.add(calender);
        ctrMain.add(panelNorth, BorderLayout.NORTH);
        ctrMain.add(panelCenter, BorderLayout.WEST);
        ctrMain.add(panelSouth, BorderLayout.SOUTH);

        setSize(1000,800);
        setBackground(sub_color);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Book Item")) {
            System.out.println("GO TO BOOKING PAGE");
        }
        else if(e.getActionCommand().equals("Return Item")) {
            System.out.println("GO TO RETURN PAGE");
        }
        else if(e.getActionCommand().equals("Add Customer")) {
            System.out.println("GO TO ADD CUSTOMER");
        }
        else if(e.getActionCommand().equals("Add Product")) {
            System.out.println("GO TO ADD PRODUCT");
        }
        else if(e.getActionCommand().equals("Remove Product")) {
            System.out.println("GO TO REMOVE PRODUCT");
        }
        else if(e.getActionCommand().equals("Logout")) {
            LoginGUI loginGUI = new LoginGUI();
            this.dispose();

        }
    }
}
