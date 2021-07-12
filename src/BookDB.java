import java.util.Scanner;

public class BookDB {
    public static void main(String[] args){
        String SKU;
        Scanner kbd = new Scanner(System.in);
        BookClass book1 = new BookClass();


        System.out.println("Look up book by SKU: ");
        book1.lookUpBook(kbd.nextLine());

        }
    }

