package edu.upc.dsa.models;

import edu.upc.dsa.util.RandomUtils;

public class Track {

   private String id;
   private String title;
   private String singer; //podria ser private Author singer?? (consulta)
   private String album; //podria ser private Album album?? (consulta)

    //Constructores
    public Track() {
        this.id = RandomUtils.getId();
    }

    public Track(String title, String singer, String album) {
        this();
        this.setSinger(singer);
        this.setTitle(title);
        this.setAlbum(album);
    }
    //Metodos
    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id=id;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public void setAlbum(String album){ this.album = album; }

    public String getAlbum() {  return album;   }

    @Override
    public String toString() {
        return "Track [id="+id+", title=" + title + ", singer=" + singer +"]";
    }

}