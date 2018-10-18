package dto;

import java.util.ArrayList;
import java.util.List;

public class HomeDTO {
	private List<SerieDTO> series;
	
	public List<SerieDTO> getSeries() {
		return series;
	}

	public void setSeries(List<SerieDTO> list) {
		this.series = new ArrayList<>(list.size());
		for(SerieDTO serie : list)
			this.series.add(serie);
	}
}
