import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class VolunteerManagementUI extends JFrame implements ActionListener {
    
    private VolunteerManager manager;
    private JPanel mainPanel;
    private JPanel inputPanel;
    private JPanel buttonPanel;
    private JPanel displayPanel;
    
    private JLabel nameLabel;
    private JLabel emailLabel;
    private JLabel phoneLabel;
    private JLabel addressLabel;
    
    private JTextField nameField;
    private JTextField emailField;
    private JTextField phoneField;
    private JTextField addressField;
    private JTextField searchField;
    
    private JButton addButton;
    private JButton viewButton;
    private JButton searchButton;
    private JButton clearButton;
    
    private JTextArea displayArea;
    private JScrollPane scrollPane;

    public VolunteerManagementUI() {
        manager = new VolunteerManager();
        
        // Frame settings
        setTitle("NayePankh - Volunteer Management System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);
        setResizable(false);
        
        // Main panel
        mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBackground(new Color(240, 248, 255));
        
        // Input Panel
        inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(5, 2, 10, 10));
        inputPanel.setBorder(BorderFactory.createTitledBorder("Add New Volunteer"));
        inputPanel.setBackground(new Color(240, 248, 255));
        
        nameLabel = new JLabel("Name:");
        nameField = new JTextField();
        
        emailLabel = new JLabel("Email:");
        emailField = new JTextField();
        
        phoneLabel = new JLabel("Phone:");
        phoneField = new JTextField();
        
        addressLabel = new JLabel("Address:");
        addressField = new JTextField();
        
        JLabel searchLabel = new JLabel("Search Name:");
        searchField = new JTextField();
        
        inputPanel.add(nameLabel);
        inputPanel.add(nameField);
        inputPanel.add(emailLabel);
        inputPanel.add(emailField);
        inputPanel.add(phoneLabel);
        inputPanel.add(phoneField);
        inputPanel.add(addressLabel);
        inputPanel.add(addressField);
        inputPanel.add(searchLabel);
        inputPanel.add(searchField);
        
        // Button Panel
        buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(1, 4, 10, 10));
        buttonPanel.setBackground(new Color(240, 248, 255));
        
        addButton = new JButton("Add Volunteer");
        addButton.addActionListener(this);
        addButton.setBackground(new Color(60, 179, 113));
        addButton.setForeground(Color.WHITE);
        addButton.setFont(new Font("Arial", Font.BOLD, 12));
        
        viewButton = new JButton("View All");
        viewButton.addActionListener(this);
        viewButton.setBackground(new Color(30, 144, 255));
        viewButton.setForeground(Color.WHITE);
        viewButton.setFont(new Font("Arial", Font.BOLD, 12));
        
        searchButton = new JButton("Search");
        searchButton.addActionListener(this);
        searchButton.setBackground(new Color(255, 165, 0));
        searchButton.setForeground(Color.WHITE);
        searchButton.setFont(new Font("Arial", Font.BOLD, 12));
        
        clearButton = new JButton("Clear");
        clearButton.addActionListener(this);
        clearButton.setBackground(new Color(220, 20, 60));
        clearButton.setForeground(Color.WHITE);
        clearButton.setFont(new Font("Arial", Font.BOLD, 12));
        
        buttonPanel.add(addButton);
        buttonPanel.add(viewButton);
        buttonPanel.add(searchButton);
        buttonPanel.add(clearButton);
        
        // Display Panel
        displayPanel = new JPanel();
        displayPanel.setLayout(new BorderLayout());
        displayPanel.setBorder(BorderFactory.createTitledBorder("Display Area"));
        displayPanel.setBackground(new Color(240, 248, 255));
        
        displayArea = new JTextArea();
        displayArea.setEditable(false);
        displayArea.setFont(new Font("Courier New", Font.PLAIN, 11));
        displayArea.setBackground(Color.WHITE);
        
        scrollPane = new JScrollPane(displayArea);
        displayPanel.add(scrollPane, BorderLayout.CENTER);
        
        // Add panels to main panel
        mainPanel.add(inputPanel, BorderLayout.NORTH);
        mainPanel.add(buttonPanel, BorderLayout.CENTER);
        mainPanel.add(displayPanel, BorderLayout.SOUTH);
        
        add(mainPanel);
        setVisible(true);
        
        displayWelcomeMessage();
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addButton) {
            addVolunteer();
        } else if (e.getSource() == viewButton) {
            viewAllVolunteers();
        } else if (e.getSource() == searchButton) {
            searchVolunteer();
        } else if (e.getSource() == clearButton) {
            clearFields();
        }
    }

    private void addVolunteer() {
        String name = nameField.getText().trim();
        String email = emailField.getText().trim();
        String phone = phoneField.getText().trim();
        String address = addressField.getText().trim();

        if (name.isEmpty() || email.isEmpty() || phone.isEmpty() || address.isEmpty()) {
            displayArea.setText("Error: Please fill all fields!");
            return;
        }

        manager.addVolunteer(name, email, phone, address);
        displayArea.setText("✓ Volunteer '" + name + "' added successfully!");
        clearInputFields();
    }

    private void viewAllVolunteers() {
        ArrayList<Volunteer> volunteers = manager.getAllVolunteers();
        
        if (volunteers.size() == 0) {
            displayArea.setText("No volunteers in the system yet.");
            return;
        }

        String text = "============ ALL VOLUNTEERS ============\n\n";
        for (int i = 0; i < volunteers.size(); i++) {
            text += (i + 1) + ". " + volunteers.get(i).getDetails() + "\n\n";
        }
        text += "Total Volunteers: " + manager.getTotalVolunteers();
        displayArea.setText(text);
    }

    private void searchVolunteer() {
        String searchName = searchField.getText().trim();

        if (searchName.isEmpty()) {
            displayArea.setText("Error: Please enter a name to search!");
            return;
        }

        ArrayList<Volunteer> results = manager.searchVolunteerByName(searchName);

        if (results.size() == 0) {
            displayArea.setText("No volunteers found with name: " + searchName);
            return;
        }

        String text = "============ SEARCH RESULTS ============\n\n";
        for (int i = 0; i < results.size(); i++) {
            text += (i + 1) + ". " + results.get(i).getDetails() + "\n\n";
        }
        displayArea.setText(text);
    }

    private void clearFields() {
        clearInputFields();
        searchField.setText("");
        displayArea.setText("Cleared!");
    }

    private void clearInputFields() {
        nameField.setText("");
        emailField.setText("");
        phoneField.setText("");
        addressField.setText("");
    }

    private void displayWelcomeMessage() {
        String welcome = "========== Welcome to NayePankh ==========\n";
        welcome += "Volunteer Management System\n\n";
        welcome += "How to use:\n";
        welcome += "1. Fill all fields and click 'Add Volunteer'\n";
        welcome += "2. Click 'View All' to see all volunteers\n";
        welcome += "3. Enter a name and click 'Search' to find volunteers\n";
        welcome += "4. Click 'Clear' to clear all fields\n\n";
        welcome += "Total Volunteers: " + manager.getTotalVolunteers();
        displayArea.setText(welcome);
    }

    public static void main(String[] args) {
        new VolunteerManagementUI();
    }
}
