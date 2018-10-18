package dos;

public class SeasonDO {
	public SeasonDO(int id, int fkSerie, int numSeasons, int numEpisodes) {
		this.id = id;
		this.fkSerie = fkSerie;
		this.nbEpisodes = numEpisodes;
		this.nbSeasons = numSeasons;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getFk_serie() {
		return fkSerie;
	}
	public void setFk_serie(int fk_serie) {
		this.fkSerie = fk_serie;
	}
	public int getNum_seasons() {
		return nbSeasons;
	}
	public void setNum_seasons(int num_seasons) {
		this.nbSeasons = num_seasons;
	}
	public int getNb_episodes() {
		return nbEpisodes;
	}
	public void setNb_episodes(int nb_episodes) {
		this.nbEpisodes = nb_episodes;
	}
	private int id;
	private int fkSerie;
	private int nbSeasons;
	private int nbEpisodes;
}
