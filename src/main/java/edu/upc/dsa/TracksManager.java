package edu.upc.dsa;

import edu.upc.dsa.models.Album;
import edu.upc.dsa.models.Track;
import edu.upc.dsa.models.Author;
import java.util.List;

public interface TracksManager {

    //Tracks
    public Track addTrack(String title, String singer);
    public Track addTrack(Track t);
    public Track getTrack(String id);
    public List<Track> findAll();
    public void deleteTrack(String trackId);
    public Track updateTrack(Track t);
    public int size();

    //Albums
    Album getAlbum(String id);
    List<Album> getAlbums();
    void updateAlbum(Album album);
    void deleteAlbum(String albumId);

    //Authors
    public Author getAuthor(String id);
    List<Author> getAuthors();
    void updateAuthor(Author author);
    void deleteAuthor(String authorId);


}
