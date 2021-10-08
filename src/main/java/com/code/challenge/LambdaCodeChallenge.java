package com.code.challenge;

import com.code.challenge.model.Product;

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

    // get the max value

    // get the average of the array
  }

  public static void challenge02() {
    List<Product> products = ChallengeUtils.getProducts();
    products.forEach(System.out::println);
    // Obtain a list of products belongs to category “Books” with price > 100

    // Obtain a list of product with category = “Electronics” and then apply 10% discount
  }

}
