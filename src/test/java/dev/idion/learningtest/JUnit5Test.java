package dev.idion.learningtest;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.Test;

class JUnit5Test {

  static Set<JUnit5Test> testObjects = new HashSet<>();

  @Test
  void test1() {
    assertThat(this).isNotIn(testObjects);
    assertThat(testObjects).doesNotContain(this);
    testObjects.add(this);
  }

  @Test
  void test2() {
    assertThat(this).isNotIn(testObjects);
    assertThat(testObjects).doesNotContain(this);
    testObjects.add(this);
  }

  @Test
  void test3() {
    assertThat(this).isNotIn(testObjects);
    assertThat(testObjects).doesNotContain(this);
    testObjects.add(this);
  }
}
