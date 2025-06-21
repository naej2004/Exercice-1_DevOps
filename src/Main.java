public class Main {
    public static void main(String[] args) {
        ContactManager myContactsManager = new ContactManager();
        Contact naej = new Contact();
        naej.name = "Naej";
        naej.phoneNumber = "0716841889";
        myContactsManager.addContact(naej);
        //1e
        Contact eile = new Contact();
        eile.name = "Eile";
        eile.phoneNumber = "0710069554";
        myContactsManager.addContact(eile);
        //2e
        Contact mum = new Contact();
        mum.name = "Mum";
        mum.phoneNumber = "0140377224";
        myContactsManager.addContact(mum);
        //3e
        Contact grandMother = new Contact();
        grandMother.name = "Meme";
        grandMother.phoneNumber = "0747179155";
        myContactsManager.addContact(grandMother);
        //4e
        Contact dad = new Contact();
        dad.name = "Dad";
        dad.phoneNumber = "0758327764";
        myContactsManager.addContact(dad);
        // Search Contact
        Contact search = myContactsManager.searchContact(naej.name);
        System.out.println("Numero de telephone : " + search.phoneNumber);
    }
}
