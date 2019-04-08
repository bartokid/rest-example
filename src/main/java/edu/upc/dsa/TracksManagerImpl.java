package edu.upc.dsa;

import edu.upc.dsa.models.*;
import java.util.LinkedList;
import java.util.*;
import org.apache.log4j.Logger;

public class TracksManagerImpl implements TracksManager {

    private static TracksManager instance;
    protected List<Track> tracks;
    protected HashMap<String,Album> albums;
    protected HashMap<String,Author> authors;
    final static Logger logger = Logger.getLogger(TracksManagerImpl.class);

    private TracksManagerImpl() {
        this.tracks = new LinkedList<>();
        this.albums = new HashMap<>();
        this.authors = new HashMap<>();
    }

    public static TracksManager getInstance() {
        if (instance==null) instance = new TracksManagerImpl();
        return instance;
    }

    //tracks

    public int size() {
        int ret = this.tracks.size();
        logger.info("size " + ret);

        return ret;
    }

    public Track addTrack(Track t) {
        logger.info("new Track " + t);

        this.tracks.add (t);
        logger.info("new Track added");
        return t;
    }

    public Track addTrack(String title, String singer) {
        return this.addTrack(new Track(title, singer));
    }

    public Track getTrack(String id) {
        logger.info("getTrack("+id+")");

        for (Track t: this.tracks) {
            if (t.getId().equals(id)) {
                logger.info("getTrack("+id+"): "+t);

                return t;
            }
        }

        logger.warn("not found " + id);
        return null;
    }

    public List<Track> findAll() {
        return this.tracks;
    }

    @Override
    public void deleteTrack(String id) {

        Track t = this.getTrack(id);
        if (t==null) {
            logger.warn("not found " + t);
        }
        else logger.info(t+" deleted ");

        this.tracks.remove(t);

    }

    @Override
    public Track updateTrack(Track p) {
        Track t = this.getTrack(p.getId());

        if (t!=null) {
            logger.info(p+" rebut!!!! ");

            t.setSinger(p.getSinger());
            t.setTitle(p.getTitle());

            logger.info(t+" updated ");
        }
        else {
            logger.warn("not found "+p);
        }

        return t;
    }

    public List<Album> getAlbums(){
        ArrayList<Album> albumes = new ArrayList<>(this.albums.values());
        return albumes;
    }
    //Albums
    @Override
    public Album getAlbum(String id)  {
        Album album = this.albums.get(id);
        if (album != null){
            logger.info(id + "album found");
            return album;
        }else{
            logger.info("Album not found" + id);
            return null;

        }

    }

    @Override
    public void updateAlbum(Album album) {
         //completar
    }

    @Override
    public void deleteAlbum(String albumId) {
        //completar
    }

    //Authors
    @Override
    public Author getAuthor(String id){
        Author author = this.authors.get(id);
        if(author==null){
            logger.info(id +" Author not found");
        }else{
            logger.info(id +"Author found");
        }
        return author;
    }

    @Override
    public void updateAuthor(Author author) {
        //completar
    }

    @Override
    public List<Author> getAuthors() {
        //completar
        List<Author> aut= new ArrayList<Author>(this.authors.size());
        return aut;
    }

    @Override
    public void deleteAuthor(String authorId) {
        //completar
    }
}