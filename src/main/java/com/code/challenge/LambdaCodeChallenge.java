package com.code.challenge;

import com.code.challenge.model.Product;

import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;

public class LambdaCodeChallenge {

  public static void main(String[] args) {
    challenge01();
    challenge02();
  }

  public static void challenge01() {
    // Given the next array
    int[] arr = {1, 576, 3, -1, 56, 3, 9, 23, 12};

    // get the min value
    System.out.println("The min: ");
    // get the max value
    System.out.println("Them Max: ");
    // get the average of the array
    System.out.println("The Average: ");
    // get the sum
    System.out.println("The Sum:" );
  }

  public static void challenge02() {
    List<Product> products = ChallengeUtils.getProducts();
    // Get the most expensive product and print the result
    System.out.println("\n*****************Get the most expensive product and print the result");

    // Get the Cheapest product and print it
    System.out.println("\n*****************Get the Cheapest product and print it");

    // Obtain a list of products belongs to category “Books” with price > 100
    System.out.println("\n*****************Obtain a list of products belongs to category “Books” with price > 100");

    // Obtain a list of product with category = “Electronics” and then apply 10% discount
    System.out.println("\n*****************Obtain a list of product with category = “Electronics” and then apply 10% discount");

    // Convert Product Name to Uppercase and join them using coma and print the result
    System.out.println("\n*****************Convert Product Name to Uppercase and join them using coma and print the result");

    // Get the list of categories
    System.out.println("\n*****************Get the list of categories");
  }

}
