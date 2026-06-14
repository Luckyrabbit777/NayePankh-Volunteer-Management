import java.util.ArrayList;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.io.IOException;

public class VolunteerManager {
    private ArrayList<Volunteer> volunteers;
    private String filename = "volunteers.txt";

    public VolunteerManager() {
        volunteers = new ArrayList<Volunteer>();
        loadVolunteersFromFile();
    }

    // Add a new volunteer
    public void addVolunteer(String name, String email, String phone, String address) {
        Volunteer v = new Volunteer(name, email, phone, address);
        volunteers.add(v);
        saveToFile();
    }

    // Get all volunteers
    public ArrayList<Volunteer> getAllVolunteers() {
        return volunteers;
    }

    // Search volunteer by name
    public ArrayList<Volunteer> searchVolunteerByName(String searchName) {
        ArrayList<Volunteer> searchResults = new ArrayList<Volunteer>();
        for (int i = 0; i < volunteers.size(); i++) {
            Volunteer v = volunteers.get(i);
            if (v.getName().toLowerCase().contains(searchName.toLowerCase())) {
                searchResults.add(v);
            }
        }
        return searchResults;
    }

    // Save volunteers to file
    public void saveToFile() {
        try {
            FileWriter fw = new FileWriter(filename);
            BufferedWriter bw = new BufferedWriter(fw);

            for (int i = 0; i < volunteers.size(); i++) {
                Volunteer v = volunteers.get(i);
                String line = v.getName() + "|" +
                        v.getEmail() + "|" +
                        v.getPhone() + "|" +
                        v.getAddress();

                bw.write(line);
                bw.newLine();
            }

            bw.close();
            fw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Load volunteers from file
    public void loadVolunteersFromFile() {
        File file = new File(filename);

        if (!file.exists()) {
            return;
        }

        try {
            FileReader fr = new FileReader(filename);
            BufferedReader br = new BufferedReader(fr);

            String line = br.readLine();

            while (line != null) {
                String[] parts = line.split("\\|");

                if (parts.length == 4) {
                    Volunteer v = new Volunteer(
                            parts[0],
                            parts[1],
                            parts[2],
                            parts[3]);

                    volunteers.add(v);
                }

                line = br.readLine();
            }

            br.close();
            fr.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Get total volunteers count
    public int getTotalVolunteers() {
        return volunteers.size();
    }
}
