public class ContactDatabaseFiller {
    private static String[] firsts = { "Carlos", "James", "Stephen", "Harry", "Timothy", "Lillian", "Diana", "Christina", "James", "Peter", "Patricia",
                                 "Martha", "Bruce", "Chris", "Amanda", "Dorothy", "Beverly", "Willie", "Charles", "Sara", "Ruby", "Jeffrey", "Paula",
                                 "John", "Margaret", "Rachel", "Katherine", "Martha", "Ralph", "Kenneth", "Ruby", "Stephanie", "Betty", "Frances", "Ronald",
                                 "Anthony", "Brian", "Tammy", "Aaron", "Craig", "Shawn", "Shirley", "Ruby", "Jean", "Amy", "Chris", "Virginia", "Christopher",
                                 "John", "Donna", "Deborah", "Shawn", "Marilyn", "Timothy", "Teresa", "Keith", "Rose", "Ronald", "Laura", "Rachel", "Steve",
                                 "Juan", "Stephen", "Diana", "Denise", "Michael", "Aaron", "David", "Gerald", "Jeffrey", "Laura", "Ruby", "Elizabeth", "Nicole",
                                 "Ashley", "Wanda", "Jonathan", "Joan", "Robert", "Sandra", "Donald", "Craig", "Janice", "Gerald", "Susan", "Joan", "Ashley",
                                 "Johnny", "Randy", "Janet", "Gregory", "Eric", "Janice", "Laura", "Anna", "Jason", "Fred", "Benjamin"
    };

    private static String[] lasts = {"Griffin", "Meyer", "Watkins", "Watkins", "Hernandez", "Sims", "Morales", "Hernandez", "Turner", "Sanchez", "Wallace", "Rice",
                                  "Williamson", "Stephens", "Vasquez", "Lopez", "King", "Graham", "Fuller", "Knight", "Cruz", "Howell", "Patterson", "Chapman",
                                  "Jenkins", "Stanley", "Griffin", "Henry", "Frazier", "Bennett", "Johnston", "Dunn", "Morrison", "Sims", "Moore", "West",
                                  "Marshall", "Armstrong", "Vasquez", "Meyer", "Evans", "Jordan", "Rice", "Woods", "Lynch", "Wheeler", "Tucker", "Davis", "Jackson",
                                  "Reyes", "Boyd", "Cook", "Mccoy", "Grant", "Knight", "Rose", "Kennedy", "Carter", "Perez", "Rice", "Barnes", "Diaz", "Banks",
                                  "Chavez", "Burns", "Reynolds", "Shaw", "Jackson", "Cook", "Frazier", "Day", "Stanley", "Armstrong", "Perez", "Flores", "Harris",
                                  "Murray", "Ward", "Warren", "Hanson", "Jenkins", "Stanley", "Ortiz", "Harvey", "Ruiz", "Olson", "Gutierrez", "Simmons", "West",
                                  "Burke", "Butler", "Ray", "Gray", "Austin", "Barnes", "Walker", "Hicks", "Martin", "Morris", "Ross"  };
    

    public static String choose( String[] vals ) {
        int i = (int)(Math.random() * vals.length);
        return vals[i];
    }

    public static String randomDigit() {
        int digit = (int)(Math.random() * 10 );
        return digit + "";
    }
    
    public static String randomPhone() {
        String area = randomDigit() + randomDigit() + randomDigit();
        String prefix = randomDigit() + randomDigit() + randomDigit();
        String number = randomDigit() + randomDigit() + randomDigit() + randomDigit();
        return area + "-" + prefix + "-" + number;
    }

    public static String randomDomain() {
        String[] domains = {"google", "apple", "ibm", "rocket", "uwl", "email", "rocketmail", "hotmail", "slowmail", "em", "microsoft", "trane", "sap" };
        String[] exts = {"edu", "org", "abc", "dom", "kah" };

        return choose( domains ) + "." + choose( domains ) + "." + choose( domains ) + "." + choose( exts );
    }
    
    public static String randomEmail( String first, String last ) {
        return (last + "." + first +  ((int)(Math.random() * 100 + 100 )) + "@" + randomDomain()).toLowerCase();
    }

    private static int id = 1;
    public static Contact randomContact() {
        Contact c = new Contact( choose( firsts), choose( lasts), "" + (id++) );
        int numEmails = (int)(Math.random() * 5);
        int numPhones = (int)(Math.random() * 5);
        
        for( int i = 0; i < numEmails; i ++ ) {
            c.addEmail( randomEmail( c.getFirstName(), c.getLastName() ) );
        }

        for( int j = 0; j < numPhones; j++ ) {
            c.addPhone( randomPhone() );
        }
        
        return c;
    }
    
    public static void fill( ContactDatabase db ) {
        int n = (int)(Math.random() * 1500 );
        for( int i = 0; i < n; i ++ ) {
            db.addContact( randomContact() );
        }
    }
}