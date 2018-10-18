package bo;

import java.util.ArrayList;
import java.util.List;

import dao.SeasonDAO;
import dao.SerieDAO;
import dos.SeasonDO;
import dos.SerieDO;
import dto.SerieDTO;

public class NetflixService {
	SerieDAO daoSerie;
	SeasonDAO daoSeason;
	
	public NetflixService() 
	{
		daoSerie = new SerieDAO();
		daoSeason = new SeasonDAO();
	}
	
	public List<SerieDTO> findAll() {
		List<SerieDO> series = daoSerie.findAll();
		List<SeasonDO> seasons = daoSeason.findAll();
		
		List<SerieDTO> seriesDTO = new ArrayList<>();
		
		for(SerieDO serie : series)
		{
			SerieDTO s = new SerieDTO();
			s.setName(serie.getName());
			int nbSeasons = 0;
			int nbEpisodes = 0;
			for(SeasonDO season : seasons)
			{
				if(season.getFk_serie() == serie.getId())
				{
					nbSeasons++;
					nbEpisodes += season.getNb_episodes();
				}
			}
			s.setSeasons(nbSeasons);
			s.setTotalEpisodes(nbEpisodes);
			seriesDTO.add(s);
		}
		
		return seriesDTO;
	}
}
