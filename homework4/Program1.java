import java.util.List;
import java.util.*;
import java.util.stream.*;


class Product{

    int id;
    String name;
    Double price;
    int quantity;


    Product(String name, double price, int quantity, int id){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    public double getQuantity(){
        return quantity;
    }

    public double getId(){
        return id;
    }
}

class Program1{
    public static double maxPrice(ArrayList<Product> allProducts) {
        double maxP = allProducts.stream().max((p1, p2) -> p1.price.compareTo(p2.price)).get().price;
        return maxP;
    }

    public static double minPrice(ArrayList<Product> allProducts) {
        double minP = allProducts.stream().min((p1, p2) -> p1.price.compareTo(p2.price)).get().price;
        return minP;
    }

    public static boolean anyMatch(ArrayList<Product> allProducts) {
        boolean isUpper = allProducts.stream().anyMatch(p -> Character.isUpperCase(p.name.charAt(0)));
        return isUpper;
    }

    public static boolean allMatch(ArrayList<Product> allProducts) {
        boolean isUpper = allProducts.stream().anyMatch(p -> Character.isUpperCase(p.name.charAt(0)));
        return isUpper;
    }

    public static double AveragePrice(ArrayList<Product> allProducts) {
        Double Ap = allProducts.stream().collect(Collectors.averagingDouble(Product :: getPrice));
        return Ap;
    }

    public static double avgAfterIncrement(ArrayList<Product> allProducts) {
        allProducts.stream().forEach(product -> product.price = (product.price * 1.25));
        double avgIncrement = allProducts.stream().collect(Collectors.averagingDouble(Product :: getPrice));
        return avgIncrement;
    }

    public static void main(String[] args) {

        ArrayList<Product> allProducts = new ArrayList<>();
        allProducts.add(new Product("Apple1",15.0, 10, 1));
        allProducts.add(new Product("apple2",42.0, 5, 2));
        allProducts.add(new Product("Apple3",34.0, 3, 3));
        allProducts.add(new Product("apple4",25.0, 7, 4));
        allProducts.add(new Product("Apple5",51.0, 2, 5));
        allProducts.add(new Product("apple6",49.0, 6, 6));
        allProducts.add(new Product("Apple7",69.0, 8, 7));

        System.out.println("\nMaximum price among all products is: " + maxPrice(allProducts));
        System.out.println("\nMinimum price among all products is: " + minPrice(allProducts));
        System.out.println("\nAny Match: " + anyMatch(allProducts));
        System.out.println("\nAll Match: " + allMatch(allProducts));



        System.out.println("\nProducts whose price is divisible by 5");
        allProducts.stream().filter(p -> p.price.intValue() % 5 == 0)
                .forEach(p -> System.out.println(p.name));

        List<Product> sortedPrices =  allProducts.stream()
                .sorted((p1,p2) -> p1.price.compareTo(p2.price)).collect(Collectors.toList());

        System.out.println("\nAfter sorting");
        for(Product product : sortedPrices){
            System.out.println(product.name + " " + product.price);
        }

        Map<String,Double> groupByPrices = allProducts.stream()
                .collect(Collectors.groupingBy(Product::getName, Collectors.summingDouble(Product::getPrice)));
        System.out.println("\nAll the products grouped by Prices: " + groupByPrices);



        System.out.println("\nAverage price of all the products is: " + AveragePrice(allProducts));
        System.out.println("\nAverage price after 25% increment is " + avgAfterIncrement(allProducts));
    }
}