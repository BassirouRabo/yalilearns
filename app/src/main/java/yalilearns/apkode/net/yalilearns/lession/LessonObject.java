package yalilearns.apkode.net.yalilearns.lession;

import java.io.Serializable;

/**
 * Created by brabo on 6/1/16.
 */
public class LessonObject implements Serializable {
    private String nom;
    private String duration;
    private String categorie;
    private String presentation;
    private String video;

    public LessonObject(String nom, String duration, String categorie, String presentation, String video) {
        this.nom = nom;
        this.duration = duration;
        this.categorie = categorie;
        this.presentation = presentation;
        this.video = video;
    }

    public LessonObject() {
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public String getPresentation() {
        return presentation;
    }

    public void setPresentation(String presentation) {
        this.presentation = presentation;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }
}
