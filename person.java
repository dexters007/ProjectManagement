public class person {
    String name;
    int phoneNumber;
    String email;
    String physicalAddress;

    //Constructor
    // Call upon the constructor in the main program to get data

    public person(String name, int phoneNumber, String email, String physicalAddress) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.physicalAddress = physicalAddress;
    }

    // Create the to string to print out details in a certain format

    public String toString() {
        String output = "\nContact Details\n";
        output += "\nName: " + name;
        output += "\nContact Number: " + phoneNumber;
        output += "\nEmail Address: " + email;
        output += "\nPhysical Address: " + physicalAddress + "\n";

        return output;
    }


}
