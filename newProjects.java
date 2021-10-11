import java.util.ArrayList;
import java.util.Scanner;

public class newProjects {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int menu;
        boolean run = true;

        /*
        When using IntelliJ it asked me if I want to convert my array list with <java.io.Serializable>
        After some research i learnt that serialization allows us to convert the state of an object into a byte stream,
        which then can be saved into a file on the local disk or sent over the network to any other
        machine on website dzone.com
        */
        ArrayList<java.io.Serializable> jobCard = new ArrayList<>();
        ArrayList<java.io.Serializable> architectDetails = new ArrayList<>();
        ArrayList<java.io.Serializable> contractorDetails = new ArrayList<>();
        ArrayList<java.io.Serializable> customerDetails = new ArrayList<>();

    while (run) {
        System.out.println("Please select an option below:");
        System.out.println("1. Create new project.");
        System.out.println("2. Change Due Date");
        System.out.println("3. Change amount paid to date: ");
        System.out.println("4. Change Contractors details");
        System.out.println("5. Exit");
        menu = input.nextInt();

        switch (menu) {
            /* I used switch and case, when researching java I came across the simplicity
            of using case on https://www.geeksforgeeks.org/switch-statement-in-java/
            to ask a user to input A option.
            */

            case 1 : {

                // Create class Project number to take input of project number
                //Use jobCard to store it into the array called jobCard for each question below

                //***********************
                //Project Details
                //***********************

                System.out.println("Please enter a project number: ");
                int projectNumber = input.nextInt();
                input.nextLine();
                jobCard.add(projectNumber);

                System.out.println("Please enter a project name: ");
                String projectName = input.nextLine();
                jobCard.add(projectName);

                System.out.println("What type of building is it: ");
                String buildingType = input.nextLine();
                jobCard.add(buildingType);

                System.out.println("What is the building address: ");
                String buildingAddress = input.nextLine();
                jobCard.add(buildingAddress);

                System.out.println("What is the ERF number: ");
                String erfNumber = input.nextLine();
                jobCard.add(erfNumber);

                System.out.println("What is the total Project Price: R");
                int totalPrice = input.nextInt();
                input.nextLine();
                jobCard.add(totalPrice);

                System.out.println("How much has been paid: R");
                int totalPaid = input.nextInt();
                input.nextLine();
                jobCard.add(totalPaid);

                System.out.println("When will the project be due: ");
                String deadline = input.nextLine();
                jobCard.add(deadline);

                //**********************************************************************
                //Architect details
                //*********************************************************************
                System.out.println("\nArchitects Details\n");
                System.out.println("Architects name: ");
                String architectName = input.nextLine();
                architectDetails.add(architectName);
                System.out.println("Architects Contact Number: ");
                int architectPhoneNumber = input.nextInt();
                input.nextLine();
                architectDetails.add(architectPhoneNumber);
                System.out.println("Architects EMail Address: ");
                String architectEmail = input.nextLine();
                architectDetails.add(architectEmail);
                System.out.println("Architects Address: ");
                String architectPhysicalAddress = input.nextLine();
                architectDetails.add(architectPhysicalAddress);

                //*********************
                //Contractor details
                //*********************

                System.out.println("\nContractor Details\n");
                System.out.println("Contractor name: ");
                String contractorName = input.nextLine();
                contractorDetails.add(contractorName);
                System.out.println("contractor Contact Number: ");
                int contractorPhoneNumber = input.nextInt();
                input.nextLine();
                contractorDetails.add(contractorPhoneNumber);
                System.out.println("contractor EMail Address: ");
                String contractorEmail = input.nextLine();
                contractorDetails.add(contractorEmail);
                System.out.println("contractor Address: ");
                String contractorPhysicalAddress = input.nextLine();
                contractorDetails.add(contractorPhysicalAddress);

                //***************************
                //Customer details
                //***************************
                System.out.println("\nCustomers Details\n");
                System.out.println("customer name: ");
                String customerName = input.nextLine();
                customerDetails.add(customerName);
                System.out.println("customer Contact Number: ");
                int customerPhoneNumber = input.nextInt();
                input.nextLine();
                customerDetails.add(customerPhoneNumber);
                System.out.println("customer EMail Address: ");
                String customerEmail = input.nextLine();
                customerDetails.add(customerEmail);
                System.out.println("customer Address: ");
                String customerPhysicalAddress = input.nextLine();
                customerDetails.add(customerPhysicalAddress);
                project details = new project(projectNumber, projectName, buildingType, buildingAddress, erfNumber,
                        totalPrice, totalPaid, deadline);
                person architect = new person(architectName, architectPhoneNumber, architectEmail,
                        architectPhysicalAddress);
                person contractor = new person(contractorName, contractorPhoneNumber, contractorEmail,
                        contractorPhysicalAddress);
                person customer = new person(customerName, customerPhoneNumber, customerEmail, customerPhysicalAddress);

                System.out.println(details);
                System.out.println(architect);
                System.out.println(contractor);
                System.out.println(customer);

            }
            case 2 : {
                /* When asking the user to change a date call the job card array and use .set with index number and
                new variable created to change the old date to the new date
                the concept will be used for the other changes for fee paid and changing of contractors details.
                 */

                System.out.print("Please enter new due date: ");
                input.nextLine();
                String newDate = input.nextLine();
                jobCard.set(7, newDate);
                System.out.println(jobCard);

            }
            case 3 : {
                System.out.println("How much has been paid: ");
                int feePaid = input.nextInt();
                jobCard.set(6, feePaid);
                System.out.println(jobCard);
            }
            case 4 : {

                System.out.println("Contractors Number: ");
                int contractorNumber = input.nextInt();
                input.nextLine();
                contractorDetails.set(1, contractorNumber);

                System.out.println("Contractors Name: ");
                String contractorName = input.nextLine();
                contractorDetails.set(0, contractorName);


                System.out.println("Contractors EMail: ");
                String contractorEmail = input.nextLine();
                contractorDetails.set(2, contractorEmail);

                System.out.println("Contractors Address: ");
                String contractorAddress = input.nextLine();
                contractorDetails.set(3, contractorAddress);
                System.out.println(contractorDetails);

            }
            case 5 : System.exit(0);
        }

        }
    }
}
