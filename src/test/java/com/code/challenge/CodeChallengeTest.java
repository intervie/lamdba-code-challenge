package com.code.challenge;

import org.junit.Assert;
import org.junit.Test;

public class CodeChallengeTest {

  @Test
  public void test_smallest_letters() {
    char[] chars = new char[]{'c', 'f', 'j'};
    Assert.assertEquals('c', CodeChallenge.findSmallestLetter(chars, 'a'));
    Assert.assertEquals('f', CodeChallenge.findSmallestLetter(chars, 'c'));
    Assert.assertEquals('f', CodeChallenge.findSmallestLetter(chars, 'd'));
    Assert.assertEquals('j', CodeChallenge.findSmallestLetter(chars, 'g'));
    Assert.assertEquals('c', CodeChallenge.findSmallestLetter(chars, 'j'));
  }

}
