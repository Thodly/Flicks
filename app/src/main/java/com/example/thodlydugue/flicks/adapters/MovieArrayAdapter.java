package com.example.thodlydugue.flicks.adapters;

import android.content.Context;
import android.widget.ArrayAdapter;

import com.example.thodlydugue.flicks.models.Movie;

import java.util.List;

/**
 * Created by thodlydugue on 7/19/2017.
 */

public class MovieArrayAdapter extends ArrayAdapter<Movie>{
    public MovieArrayAdapter(Context context, List<Movie> movies){
        super(context, android.R.layout.simple_list_item_1, movies);
    }

}
