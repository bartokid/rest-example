package edu.upc.dsa.models;
import com.sun.org.apache.bcel.internal.generic.ALOAD;
import edu.upc.dsa.util.RandomUtils;
import java.util.*;

public class Album {

    private String id;
    private String name;
    private int year;
    private String singer;
    private HashMap<String,Track> canciones;

    //Constructores
    public Album(){
        this.id=RandomUtils.getId();
    }

    public Album(String name, int year, String singer){
        this();
        this.name=name;
        this.year=year;
        this.singer=singer;
        this.canciones= new HashMap<>();
    }

    //metodos


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

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getSinger() {
        return singer;
    }

    public void setCanciones(HashMap<String, Track> canciones) {
        this.canciones = canciones;
    }

    public HashMap<String, Track> getCanciones() {
        return canciones;
    }

    public void addTrack(Track cancion){
        this.canciones.put(cancion.getId(),cancion);
    }
    public Track getTrackById(String idCancion){
        return this.canciones.get(idCancion);
    }
}

