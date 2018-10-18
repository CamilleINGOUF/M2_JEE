package dto;

public class SerieDTO {
	private String name;
	private int seasons;
	private int totalEpisodes;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSeasons() {
		return seasons;
	}
	public void setSeasons(int seasons) {
		this.seasons = seasons;
	}
	public int getTotalEpisodes() {
		return totalEpisodes;
	}
	public void setTotalEpisodes(int totalEpisodes) {
		this.totalEpisodes = totalEpisodes;
	}
}
