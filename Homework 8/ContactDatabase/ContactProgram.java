public class ContactProgram {
    private ContactDatabase database;
    private int choice;
    public ContactProgram() {
        database= new ContactDatabase();
        //ContactDatabaseFiller.fill( your_contact_database );
        ContactDatabaseFiller.fill(database);
        choice=0;
        
        while(choice!=7) {
            choice = printMenu();
            doChoice();
        }
    }
    public int printMenu(){
        System.out.println("Select an option:");
        System.out.println("1) Print the entire database");
        System.out.println("2) Search by id");
        System.out.println("3) Search by email");
        System.out.println("4) Search by phone");
        System.out.println("5) Search by last name");
        System.out.println("6) Search by first name");
        System.out.println("7) Exit");
        System.out.println("OPTION: ");
        return Keyboard.readInt();
    }
    public void doChoice() {
        switch (choice) {
            case 1: System.out.println(database.toString()); break;
            case 2: searchID(); break;
            case 3: searchEmail(); break;
            case 4: searchPhone();break;
            case 5: searchLastName(); break;
            case 6: searchFirstName(); break;
        }
    }
    public void searchID() {
        System.out.println("ENTER ID: ");
        String id=Keyboard.readString();
        Contact contact=database.getByID(id);
        if(contact!=null) {
            System.out.println(contact.toString());
        }else{
            System.out.println("No Results");
        }
    }
    public void searchEmail() {
        System.out.println("ENTER EMAIL: ");
        String email=Keyboard.readString();
        Contact emails=database.getByEmail(email);
        if(emails!= null) {
            System.out.println(emails.toString());
        }else{
            System.out.println("No Results");
        }
    }
    public void searchPhone() {
        System.out.println("ENTER PHONE: ");
        String phone=Keyboard.readString();
        Contact[] phones= database.getByPhone(phone);
        if(phones!= null) {
            for(int i=0; i<phones.length; i++) {
                if(phones[i]!=null) {
                    System.out.println(phones[i].toString());
                }
            }
        }else{
            System.out.println("No Results");
        }
    }
    public void searchLastName() {
        System.out.println("ENTER LAST NAME: ");
        String lastName=Keyboard.readString();
        database.getByLastName(lastName);
        Contact[] people= database.getByLastName(lastName);
        if(people!= null) {
            for(int i=0; i<people.length; i++) {
                if(people[i]!=null) {
                    System.out.println(people[i].toString());
                }
            }
        }else{
            System.out.println("No Results");
        }
    }
    public void searchFirstName() {
        System.out.println("ENTER FIRST NAME: ");
        String firstName=Keyboard.readString();
        Contact[] people= database.getByFirstName(firstName);
        if(people!= null) {
            for(int i=0; i<people.length; i++) {
                if(people[i]!=null) {
                    System.out.println(people[i].toString());
                }
            }
        }else{
            System.out.println("No Results");
        }
    }
}
        