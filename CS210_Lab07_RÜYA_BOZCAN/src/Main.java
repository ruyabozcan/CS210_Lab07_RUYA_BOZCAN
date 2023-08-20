// RUYA BOZCAN
// 200201044
// CS 210
// COMPUTER ENGINEERING




import java.util.LinkedList;
import java.util.Queue;

public class Main
{
    public static void main(String[] args)
    {
        Queue<Product> productsQueue = new LinkedList<>();

        productsQueue.add(new Product("Product 1", "M", "Blue", 10.0));
        productsQueue.add(new Product("Product 2", "L", "Red", 20.0));
        productsQueue.add(new Product("Product 3", "S", "Green", 5.0));
        productsQueue.add(new Product("Product 4", "M", "Blue", 15.0));
        productsQueue.add(new Product("Product 5", "M", "Black", 25.0));
        productsQueue.add(new Product("Product 6", "L", "Blue", 30.0));
        productsQueue.add(new Product("Product 7", "S", "Red", 8.0));
        productsQueue.add(new Product("Product 8", "M", "Blue", 12.0));
        productsQueue.add(new Product("Product 9", "S", "Blue", 7.0));
        productsQueue.add(new Product("Product 10", "L", "Green", 22.0));


        Queue<Product> queue1 = new LinkedList<>(productsQueue);
        Queue<Product> queue2 = new LinkedList<>(productsQueue);
        Queue<Product> queue3 = new LinkedList<>(productsQueue);


        double total1 = getTotalPrice(queue1);
        double total2 = getTotalPrice(queue2);
        double total3 = getTotalPrice(queue3);
        System.out.println("Total price in queue1: " + total1);
        System.out.println("Total price in queue2: " + total2);
        System.out.println("Total price in queue3: " + total3);


        displayProducts(productsQueue, "M", "Blue");

    }

    private static double getTotalPrice(Queue<Product> queue)

    {
        double totalPrice = 0.0;
        for (Product product : queue)
        {
            totalPrice += product.getPrice();
        }
        return totalPrice;
    }

    private static void displayProducts(Queue<Product> queue, String size, String color)
    {
        System.out.println("Products of size " + size + " and color " + color + ":");
        for (Product product : queue)

        {
            if (product.getSize().equals(size) && product.getColor().equals(color))

            {
                System.out.println(product.getName() + ": " + product.getPrice());
            }
        }
    }
}

class Product

{
    private String name;
    private String size;
    private String color;
    private double price;

    public Product(String name, String size, String color, double price)

    {
        this.name = name;
        this.size = size;
        this.color = color;
        this.price = price;
    }

    public String getName()

    {
        return name;
    }

    public String getSize()

    {
        return size;
    }

    public String getColor()

    {
        return color;
    }

    public double getPrice()

    {
        return price;
    }
}
// RUYA BOZCAN
// 200201044
// CS 210
// COMPUTER ENGINEERING



