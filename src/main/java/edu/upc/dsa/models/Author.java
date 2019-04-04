package edu.upc.dsa.models;
import edu.upc.dsa.util.RandomUtils;
import java.util.*;
public class Author {
    private String id;
    private String name;
    private LinkedList<Track> canciones;
    private LinkedList<Album> albums;

    //COnstructores
    public Author(){
        this.id =RandomUtils.getId();
    }

    public Author(String name){
        this();
        this.name=name;
        this.canciones=new LinkedList<>();
        this.albums=new LinkedList<>();
    }

    //Metodos

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCanciones(LinkedList<Track> canciones) {
        this.canciones = canciones;
    }

    public LinkedList<Track> getCanciones() {
        return canciones;
    }

    public void setAlbums(LinkedList<Album> albums) {
        this.albums = albums;
    }

    public LinkedList<Album> getAlbums() {
        return albums;
    }

    public void addCancion(Track cancion){
        this.canciones.add(cancion);
    }

    public void addAlbum(Album album){
        this.albums.add(album);
    }
}

