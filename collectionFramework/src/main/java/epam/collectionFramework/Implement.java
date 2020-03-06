package epam.collectionFramework;

public class Implement {
	public static void main(String[] args) 
    {
        Collection<Integer> element = new Collection<Integer>();
        element.add(1);
        element.add(2);
        element.add(3);
        element.add(4);
        element.add(5);
        element.add(6);
        element.add(7);
        element.add(8);
        element.add(9);
        element.add(10);
        System.out.println(element);           
        element.remove(4);
        System.out.println(element);        
        System.out.println( element.get(2) );
        System.out.println( element.get(6) ); 
        System.out.println(element.size());
    }
}
