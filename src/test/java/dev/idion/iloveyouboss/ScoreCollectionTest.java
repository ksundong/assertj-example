package dev.idion.iloveyouboss;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class ScoreCollectionTest {

  @Test
  void answersArithmeticMeanOfTwoNumbers() {
    // 준비
    ScoreCollection collection = new ScoreCollection();
    collection.add(() -> 5);
    collection.add(() -> 7);

    // 실행
    int actualResult = collection.arithmeticMean();

    // 단언
    assertThat(actualResult).isEqualTo(6);
  }
}
