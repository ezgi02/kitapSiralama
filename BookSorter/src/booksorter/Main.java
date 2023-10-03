package booksorter;

import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		//Kitap sıralayıcı
		  Set<Book> bookSetByName = new TreeSet<>();
	        
	        // 5 Book nesnesi oluşturup TreeSet'e ekleyelim
	        bookSetByName.add(new Book("Nar Ağacı", 300, "Nazan Bekiroğlu", "2019-09-05"));
	        bookSetByName.add(new Book("Kardeşimin Hikayesi", 250, "Zülfi Livaneli", "2021-12-15"));
	        bookSetByName.add(new Book("Empati", 400, "Adam Fever", "2022-03-10"));
	        bookSetByName.add(new Book("insanlar ve Fareler", 350, "John Steinbeck", "2022-02-20"));
	        bookSetByName.add(new Book("hayvanlar çiftliği", 280, "Goerge Orwell", "2022-04-05"));
	        
	        System.out.println("Kitaplar isme göre sıralandı:");
	        for (Book book : bookSetByName) {
	            System.out.println(book.getBookTitle());
	        }
	       System.out.println("*******************");
	       
	       TreeSet<Book> set2 = new TreeSet<>(new BookPageComparator());
	       
	       //Önceki nesneleri bu TreeSet ' e ekleyelim
	       set2.addAll(bookSetByName);
	       
	       System.out.println("\nKitaplar sayfa sayısına göre sıralandı:");
	        for (Book book : set2) {
	            System.out.println(book.getNumberOfPages());
	        }


	}

}
