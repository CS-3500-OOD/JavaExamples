package cs3500.examples;

public class PlayingCard implements Comparable<PlayingCard>{
  private FaceValue value;
  private Suit suit;

  PlayingCard (FaceValue v, Suit s) {
    value = v;
    suit = s;
  }

  @Override
  public int compareTo(PlayingCard o) {
    return this.value.ordinal() - o.value.ordinal();
  }
}
