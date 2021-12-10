/* Popular Movie Page 
 * Use Underscore JavaScript Fuction */
//var _ = require(‘underscore’);
import com.github.underscore.lodash.U;

var compiled = _.template{
        <!-- One Movie Per Column (and Row) -->
        "<div class="column">" +
          "<img alt='title' src= 'movie_image' width="250" height="370">" +
          "<p id="movieTitle"> <%= title %> </p>" +
          "<p id="movieYear"> <%= year %> </p>" +
        "</div>"
}

// Compiles all Movie Data
    int i;

    for(i = 0; i < data.movies.length; i++) {

      // Create New Row after 5th Movie
      if(i == 0 OR i % 5 = 0) {
          // Add New Row 
          _.template += "<div class="row">"

          // Add New Category 
          _.template += "<body>" +
	                    "<p id = "category"><%= category %></p>" +
                       "<p id = "seeMore"> see More ></p>" + "</body>"
      }
      
      toAppendString += compiled(data.movies[i]);
      }

     // Using JQuery
     // $("body").append(toAppendString);

