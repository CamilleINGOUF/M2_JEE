package dao;

import java.util.ArrayList;
import java.util.List;

import dos.SerieDO;

public class SerieDAO {
	
	public List<SerieDO> findAll()
	{
		List<SerieDO> series = new ArrayList<>(3);
		
		SerieDO casa = new SerieDO();
		casa.setName("Casa de papel");
		casa.setId(1);
		casa.setOriginal(true);
		casa.setYear(2017);
		
		SerieDO the = new SerieDO();
		the.setId(2);
		the.setName("The 100");
		the.setOriginal(false);
		the.setYear(2017);
		
		SerieDO black = new SerieDO();
		black.setId(3);
		black.setName("Black Mirror");
		black.setOriginal(true);
		black.setYear(2017);
		
		series.add(casa);
		series.add(the);
		series.add(black);
		
		return series;
	}
}
