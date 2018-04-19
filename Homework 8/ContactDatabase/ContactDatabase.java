// Julia Froegel
// makes a database
public class ContactDatabase {
    protected Contact[] contacts;
    public ContactDatabase() {
        contacts= new Contact[1000];
    }
    public boolean addContact( Contact c) {
        
        for(int i=0; i< contacts.length; i++) {
            if(contacts[i]!=null) {
                if(contacts[i].getID().equals(c.getID())) {
                    return false;
                }
            }else if(contacts[i]==null) {
                contacts[i]=c;
                return true;
            }
        }
        return false;
    }
    public Contact getByID(String id) {
        for(int i=0; i<contacts.length; i++) {
            if(contacts[i]!=null) {
                if(contacts[i].getID().equals(id)) {
                    return contacts[i];
                }
            }
        }
        return null;
    }
    public Contact[] getByFirstName(String first) {
        int countName=0;
        for(int i=0; i<contacts.length;i++) {
            if(contacts[i]!=null) {
                if(contacts[i].getFirstName().equalsIgnoreCase(first)) {
                    countName++;
                }
            }
        }
        if(countName==0){
            return null;
        }
        Contact[] sameNames=new Contact[countName];
        int j=0;
        for(int i=0; j<countName; i++) {
            if(contacts[i]!=null) {
                if(contacts[i].getFirstName().equalsIgnoreCase(first)) {
                    sameNames[j]=contacts[i];
                    j++;
                }
            }
        }
        return sameNames;
    }
    public Contact[] getByLastName(String last) {
        int countName=0;
        for(int i=0; i<contacts.length;i++) {
            if(contacts[i]!=null) {
                if(contacts[i].getLastName().equalsIgnoreCase(last)) {
                    countName++;
                }
            }
        }
        if(countName==0) {
            return null;
        }
        Contact[] sameNames=new Contact[countName];
        int j=0;
        for(int i=0; j<countName; i++) {
            if(contacts[i].getLastName().equalsIgnoreCase(last)) {
                sameNames[j]=contacts[i];
                j++;
            }
        }
        return sameNames;
    }
    public Contact[] getByPhone(String phone) {
        int countNumber=0;
        for(int i=0; i<contacts.length;i++) {
            if(contacts[i]!=null) {
                String [] numbers=contacts[i].getPhoneNumbers();
                for(int j=0; j<numbers.length; j++) {
                    if(numbers[j].equals(phone)) {
                        countNumber++;
                    }
                }
            }
        }
    
        if(countNumber==0) {
            return null;
        }
        Contact[] sameNumbers=new Contact[countNumber];
        int j=0;
        for(int i=0; j<countNumber; i++) {
            String [] numbers=contacts[i].getPhoneNumbers();
            for(int k=0; k<numbers.length;k++) {
                if(numbers[k].equals(phone)) {
                    sameNumbers[j]=contacts[i];
                    j++;
                }
            }
        }
        return sameNumbers;
    }
    public Contact getByEmail(String email) {
        for(int i=0; i<contacts.length;i++) {
            if(contacts[i]!=null) {
                String [] emails=contacts[i].getEmailAddresses();
                for(int j=0; j<emails.length; j++) {
                    if(emails[j].equals(email)) {
                        return contacts[i];
                    }
                }
            }
        }
        return null;
    }
    public String toString() {
        String result="";
        for(int i=0; i<contacts.length; i++) {
            if(contacts[i]!=null) {
                result= result +'\n' +contacts[i].toString();
            }
        }
        return result;
    }
}
    
    