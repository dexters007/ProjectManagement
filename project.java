import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class project {
    //Attributes
    int projectNumber;
    String projectName;
    String buildingType;
    String buildingAddress;
    String erfNumber;
    int totalPrice;
    int totalPaid;
    String deadline;

    //Constructor
    // Call upon the constructor in the main program to get data
    public project(int projectNumber, String projectName, String buildingType, String buildingAddress, String erfNumber,
                   int totalPrice, int totalPaid, String deadline) {
        this.projectNumber = projectNumber;
        this.projectName = projectName;
        this.buildingType = buildingType;
        this.buildingAddress = buildingAddress;
        this.erfNumber = erfNumber;
        this.totalPrice = totalPrice;
        this.totalPaid = totalPaid;
        this.deadline = deadline;
    }

    // Create the to string to print out details in a certain format
    public String toString() {
        String output = "Project details\n";
        output += "\nProject number: " + projectNumber;
        output += "\nProject Name: " + projectName;
        output += "\nBuilding Type: " + buildingType;
        output += "\nBuilding Address: " + buildingAddress;
        output += "\nERF Number: " + erfNumber;
        output += "\nTotal Project Price: R" + totalPrice;
        output += "\nTotal Paid: R" + totalPaid;
        output += "\nProject DueDate: " + deadline;

        return output;

    }
}


