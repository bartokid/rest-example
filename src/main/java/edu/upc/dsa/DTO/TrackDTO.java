package edu.upc.dsa.DTO;
import edu.upc.dsa.models.Track;
import edu.upc.dsa.util.RandomUtils;

public class TrackDTO {

    private String id;
    private String title;
    private String singer;
    private String album;

    public TrackDTO(Track track){
        this.id = track.getId();
        this.singer= track.getSinger();
        this.title = track.getTitle();
        this.album = track.getAlbum();
    }
}
