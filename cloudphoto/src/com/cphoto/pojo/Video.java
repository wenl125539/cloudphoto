package com.cphoto.pojo;

public class Video {
    private Long videoid;

    private String userid;

    private String videopath;

    private Long dz;

    private String videointro;

    public Long getVideoid() {
        return videoid;
    }

    public void setVideoid(Long videoid) {
        this.videoid = videoid;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getVideopath() {
        return videopath;
    }

    public void setVideopath(String videopath) {
        this.videopath = videopath == null ? null : videopath.trim();
    }

    public Long getDz() {
        return dz;
    }

    public void setDz(Long dz) {
        this.dz = dz;
    }

    public String getVideointro() {
        return videointro;
    }

    public void setVideointro(String videointro) {
        this.videointro = videointro == null ? null : videointro.trim();
    }
}