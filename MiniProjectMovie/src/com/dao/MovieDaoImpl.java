package com.dao;

import java.util.ArrayList;
import java.util.List;

import com.pojo.Movie;

public class MovieDaoImpl implements MovieDao{

	List<Movie> movieList=null;
	Movie mobj=null;
	
	public MovieDaoImpl() {
		movieList=new ArrayList<Movie>();
	}
	@Override
	public void addMovie(Movie movie) {
		movieList.add(movie);
		
	}

	@Override
	public void updateMovie(Movie movie) {
	
		for(int i=0;i<movieList.size();i++)
		{
			if(movieList.get(i).getId()==movie.getId())
			{
				movieList.set(i, movie);
			}
		}
	
		
	}

	@Override
	public void deleteMovie(int mid) {
		mobj=searchMovieById(mid);
		if(mobj!=null)
		{
			for(int i=0;i<movieList.size();i++)
			{
				if(movieList.get(i).getId()==mid)
				{
					movieList.remove(i);
					break;
				}
			}
			
		}
		else
		{
			System.out.println("No record of Empoyee Found");
		}
		
	}

	@Override
	public List<Movie> showAll() {
		
		return movieList;
	}

	@Override
	public Movie searchMovieById(int mid) {
		
		mobj=null;
	
		for (int i = 0; i <movieList.size(); i++) {
			if(movieList.get(i).getId()==mid)
				mobj=movieList.get(i);
			break;
			
		}
		return mobj;
	}

}
