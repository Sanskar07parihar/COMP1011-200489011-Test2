package com.example.comp1011200489011test2;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;

import java.io.FileReader;
import java.io.Reader;
import java.lang.reflect.Type;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Utility {
    /**
     * We will use GSON to parse JSON object
     * This method will read the file and parse out the JSON object to java object
     */
    public static List<Song> getSongsFromJSONFile(String fileName){

        //Create a GSON object to parse JSON object
        Gson gson = new Gson();

        try(
                //open the .json file from local disk
                FileReader fileReader = new FileReader(fileName);
                JsonReader jsonReader = new JsonReader(fileReader);
        ){
            //Convert JSON object to Song object
//            response = gson.fromJson(jsonReader, Song[].class);
//            response = gson.fromJson(jsonReader, Song.class);
            Type listType = new TypeToken<List<Song>>() {}.getType();

            List<Song> songList = gson.fromJson(jsonReader, listType);

            for (Song songs: songList) {
                System.out.println(songs.toString());
            }

            return songList;
        }
        catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }
}
