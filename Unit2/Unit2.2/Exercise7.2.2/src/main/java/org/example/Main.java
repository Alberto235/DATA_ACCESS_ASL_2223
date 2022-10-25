package org.example;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    protected static  Scanner sc;
    protected static  ArrayList<Contact> contactList;
    protected static final String filename = "contact.obj";



    protected static int menu(){
        System.out.println("Menu");
        System.out.println("=====");
        System.out.println();
        System.out.println("1 - Add a contact.");
        System.out.println("2 - write in object.");
        System.out.println("3 - write object xml contact.");
        System.out.println("0 - Terminate");

        while (!sc.hasNextInt()){
            System.out.println("Choose an option between 0 and 3, please");
            sc.next();
        }
        return(sc.nextInt());


    }

    public  static Contact readContact(){
        Contact contact = new Contact();

        System.out.print("Name: ");
        contact.setName(sc.next());
        System.out.print("Surname: ");
        contact.setSurname(sc.next());
        System.out.print("Email: ");
        contact.setEmail(sc.next());
        System.out.print("phone: ");
        contact.setPhone(sc.next());
        System.out.println();

        return contact;
    }
    public static void showContact(Contact contact){
        System.out.print("Name: ");
        System.out.println(contact.getName());
        System.out.print("Surname: ");
        System.out.println(contact.getSurname());
        System.out.print("Email: ");
        System.out.println(contact.getEmail());
        System.out.print("phone: ");
        System.out.println(contact.getPhone());
        System.out.println();


    }

    public static void readContactFile() throws FileNotFoundException, IOException, ClassNotFoundException{
        File file = new File(filename);

        if (file.exists()){
            ObjectInputStream objectsFile = new ObjectInputStream(new FileInputStream(file));

            int numObjects = objectsFile.readInt();

            for (; numObjects > 0 ; numObjects--){
                contactList.add((Contact) objectsFile.readObject());
            }
        }
    }
    public static void writeContactFile() throws FileNotFoundException, IOException{
        ObjectOutputStream objectsFile = new ObjectOutputStream(new FileOutputStream(new File(filename)));

        objectsFile.writeInt(contactList.size());
        for (Contact c : contactList)
            objectsFile.writeObject(c);
    }
    public static void ObjtoXml(Contact contact) throws JAXBException, FileNotFoundException {

        try {
        JAXBContext context = JAXBContext.newInstance(Contact.class);
        //Create Marshaller using JAXB context
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        Contact Contact2 = new Contact("123123", "123123123", "123123","123123");
        marshaller.marshal(Contact2, new FileOutputStream("C:\\Contact.xml"));

        System.out.println("java object converted to xml successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static  void main(String[] args){

        contactList = new ArrayList<>();
        sc = new Scanner(System.in);

        try
        {
            readContactFile();
            int option = menu();
            while (option !=0){
                switch (option){
                    case 1:
                        contactList.add(readContact());
                        break;
                    case 2:

                        writeContactFile();
                        break;
                    case 3:
                        for (Contact contact : contactList){
                            ObjtoXml(contact);
                        }

                        break;

                }

                option = menu();
            }
        }catch (IOException e){
            System.out.println("An error ocurred: ");
            e.printStackTrace();
        }
        catch (ClassNotFoundException e){
            System.out.println("An error ocurred.");
            e.printStackTrace();
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
    }
}
