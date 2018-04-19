// Julia Froegel
// Provides a model of a contact for all contacts to follow
public class Contact {
    protected String firstName,lastName, id;
    protected String[] emailAddresses;
    protected String[] phoneNumbers;
    
    public Contact(String first, String last, String id) {
        firstName=first;
        lastName=last;
        this.id=id;
        emailAddresses=new String[5];
        phoneNumbers=new String[5];
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getID() {
        return id;
    }
    public String[] getPhoneNumbers() {
        int numberOfNumbers=0;
        for(int i=0;i<phoneNumbers.length;i++) {
            if(phoneNumbers[i]!=null) {
                numberOfNumbers++;
            }
        }
        String[] numbers=new String[numberOfNumbers];
        for(int i=0;i<numberOfNumbers; i++) {
            numbers[i]=phoneNumbers[i];
        }
        return numbers;
    }
    public String[] getEmailAddresses() {
        int numberOfEmails=0;
        for(int i=0;i<emailAddresses.length;i++) {
            if(emailAddresses[i]!=null) {
               numberOfEmails++;
            }
        }
        String[] numbers=new String[numberOfEmails];
        
        for(int i=0;i<numberOfEmails; i++) {
            numbers[i]=emailAddresses[i];
            
        }
        return numbers;
    }
    public boolean addEmail(String email){
        if(email.indexOf('@')>-1) {
            String substringEmail=email.substring(email.indexOf('@')+1,email.length());
            if(substringEmail.indexOf('@')<0) {
                for(int i=0; i<5; i++) {
                    if(emailAddresses[i]==email){
                        return false;
                    }else if(emailAddresses[i]==null) {
                        emailAddresses[i]=email;
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public boolean addPhone(String phone) {
        if(phone.length()==12 && phone.charAt(3)=='-' && phone.charAt(7)=='-') {
            if(checkDigits(phone)){
                for(int i=0; i<5;i++) {
                    if(phoneNumbers[i]==phone) {
                        return false;
                    }else if(phoneNumbers[i]==null) {
                        phoneNumbers[i]=phone;
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public boolean checkDigits(String phone){
        phone=phone.substring(0,3)+phone.substring(4,7)+phone.substring(8,phone.length());
        for(int i=1;i<phone.length();i++) {
            if (phone.charAt(i)!='1' && phone.charAt(i)!='2' && phone.charAt(i)!='3' && phone.charAt(i)!='4' && phone.charAt(i)!='5' && phone.charAt(i)!='6' && phone.charAt(i)!='7' && phone.charAt(i)!='8' && phone.charAt(i)!='9') {
                return false;
            }
        }
        return true;
    }
    public boolean hasPhone(String phone) {
        for(int i=0; i<phoneNumbers.length; i++) {
            if(phoneNumbers[i]==phone) {
                return true;
            }
        }
        return false;
    }
    public boolean hasEmail(String email) {
        for(int i=0; i<emailAddresses.length; i++) {
            if(emailAddresses[i]==email) {
                return true;
            }
        }
        return false;
    }
    public String toString() {
        return firstName +" "+lastName+ emails()+ phones();
    }
    public String emails(){
        String[] emails=getEmailAddresses();
        String result="";
        for(int i=0;i<emails.length;i++) {
            result= result+", "+ emails[i];
        }
        return result;
    }
    public String phones(){
        String[] phones=getPhoneNumbers();
        String result="";
        for(int i=0;i<phones.length;i++) {
            result= result+", "+ phones[i];
        }
        return result;
    }
}