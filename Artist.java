public  class Artist {
    int artistID;
    String artistName;

    //setter method for name
    public void setArtistName(Artist artist, String name) {
        artist.artistName = name;
    }
    //setter method for ID
    public void setArtistID(Artist artist, int artistID) {
        artist.artistID = artistID;
    }
}