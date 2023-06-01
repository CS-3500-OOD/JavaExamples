package cs3500.coupling.carparts;

import java.util.List;

public class Radio {
  private List<String> favoriteStations;
  private int volume;

  public Radio (List<String> stations) {
    System.out.println("Creating a new car radio...");
    favoriteStations = stations;
  }

  public void playFavoriteStation(int stationId) {
    if (stationId >= favoriteStations.size()){
      throw new IllegalArgumentException("Invalid favorite station id");
    }
    volume = 10;
    System.out.printf("Playing %s station.\n", favoriteStations.get(stationId));
  }

  public void setVolume (int newVolume) {
    volume = newVolume;
  }
}
