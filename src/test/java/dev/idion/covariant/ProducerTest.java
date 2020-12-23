package dev.idion.covariant;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class ProducerTest {

  @Test
  void whenInputIsArbitrary_thenProducerProducesString() {
    String arbitraryInput = "just a random text";
    Producer producer = new Producer();

    Object objectOutput = producer.produce(arbitraryInput);

    assertThat(objectOutput).isEqualTo(arbitraryInput).isInstanceOf(String.class);
  }

  @Test
  void whenInputIsSupported_thenProducerCreatesInteger() {
    String integerAsString = "42";
    IntegerProducer producer = new IntegerProducer();

    Object result = producer.produce(integerAsString);

    assertThat(result).isInstanceOf(Integer.class).isEqualTo(Integer.parseInt(integerAsString));
  }

  @Test
  void whenInputIsSupported_thenIntegerProducerCreatesIntegerWithoutCasting() {
    String integerAsString = "42";
    IntegerProducer producer = new IntegerProducer();

    Integer result = producer.produce(integerAsString);

    assertThat(result).isEqualTo(Integer.parseInt(integerAsString));
  }
}
