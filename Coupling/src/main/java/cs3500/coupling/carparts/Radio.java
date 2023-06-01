package cs3500.coupling.carparts;

import java.util.List;

public class Radio {
  private final List<String> favoriteStations;
  private int volume;

  public Radio (List<String> stations) {
    System.out.println("Creating a new car radio...");
    favoriteStations = stations;
  }

  public void playFavoriteStation(int stationId) {
    if (stationId >= favoriteStations.size()){
      throw new IllegalArgumentException("Invalid favorite station id");
    }
    volume = 15;
    System.out.printf("Playing %s station at vol %d.\n",
        favoriteStations.get(stationId),
        volume
    );
  }

  public void setVolume (int newVolume) {
    volume = newVolume;
  }
}
