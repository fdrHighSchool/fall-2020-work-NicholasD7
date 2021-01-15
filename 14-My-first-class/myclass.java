import java.util.Arrays;

public class myclass {
  private String username;
  private String password;
  private int highscore;
  private int leaderboard_position;

  public game_stats(String n, String o, int m, int z) {
    this.username = n;
    this.password = o;
    this.highscore = m;
    this.leaderboard_position = z;
  }
  public String getUsername() {
    return this.username;
  }
  public String getPassword() {
    return this.password;
  }
  public String getHighscore() {
    return this.highscore;
  }
  public String getLeaderboard_postion() {
    return this.leaderboard_position;
  }
  public String toString() {
    return "gamer: " + this.username + "password: " + this.password + "highscore: "
     + this.highscore + "leaderboard_position: " + this.leaderboard_position;
  }
}
