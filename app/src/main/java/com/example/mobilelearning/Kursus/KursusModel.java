package com.example.mobilelearning.Kursus;

import com.google.gson.annotations.SerializedName;

public class KursusModel {

    @SerializedName("idjurusan")
    private String idJurusan;

    @SerializedName("idenrol")
    private String idEnrol;

    @SerializedName("iduserenrol")
    private String idUserEnrol;

    @SerializedName("userid")
    private String userId;

    @SerializedName("name")
    private String name;

    @SerializedName("description")
    private String description;

    @SerializedName("parent")
    private String parent;

    @SerializedName("enrol")
    private String enrol;

    @SerializedName("status")
    private String status;

    @SerializedName("firstname")
    private String firstName;

    public String getIdJurusan() {
        return idJurusan;
    }

    public void setIdJurusan(String idJurusan) {
        this.idJurusan = idJurusan;
    }

    public String getIdEnrol() {
        return idEnrol;
    }

    public void setIdEnrol(String idEnrol) {
        this.idEnrol = idEnrol;
    }

    public String getIdUserEnrol() {
        return idUserEnrol;
    }

    public void setIdUserEnrol(String idUserEnrol) {
        this.idUserEnrol = idUserEnrol;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    public String getEnrol() {
        return enrol;
    }

    public void setEnrol(String enrol) {
        this.enrol = enrol;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public long getId() {
        return 0;
    }
}
