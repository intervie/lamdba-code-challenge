package com.code.challenge;

import com.code.challenge.model.Product;

import java.util.List;


public class ChallengeUtils {

  public static List<Product> getProducts() {
    return List.of(
      new Product(1L, "BluRay", 35.45, "Electronics"),
      new Product(2L, "MacBook", 1500.0, "Electronics"),
      new Product(3L, "Iphone 100X", 3500.10, "Electronics"),

      new Product(4L, "Clean Code", 101.00, "Books"),
      new Product(5L, "Elements of Programming", 99.9, "Books"),
      new Product(6L, "Deep Learning", 178.23, "Books"),
      new Product(7L, "The Stand", 25.00, "Books")
    );
  }

}
