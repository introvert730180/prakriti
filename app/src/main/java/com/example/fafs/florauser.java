package com.example.fafs;

public class florauser {


    public String name;
    public String type;
    public String sciName;
    public String plantFamily;
    public String nat;
    public String exposure;
    public String season;
    public String height;
    public String waterNeeds;
    public String soilTYpe;
    public String soilPh;
    public String soilDrainage;
    public String characteristics;
    public String tolerance;
    public int img;

    public florauser(int img, String name, String type, String sciName, String plantFamily, String nat, String exposure, String season, String height, String waterNeeds, String soilTYpe, String soilPh, String soilDrainage, String characteristics, String tolerance) {
        this.img = img;
        this.type = type;
        this.sciName = sciName;
        this.plantFamily = plantFamily;
        this.nat = nat;
        this.exposure = exposure;
        this.season = season;
        this.height = height;
        this.waterNeeds = waterNeeds;
        this.soilTYpe = soilTYpe;
        this.soilPh = soilPh;
        this.name = name;
        this.soilDrainage = soilDrainage;
        this.characteristics = characteristics;
        this.tolerance = tolerance;
    }

    public florauser(int img, String name, String type) {
        this.img = img;
        this.type = type;
        this.name = name;
    }
     public florauser(){

     }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSciName() {
        return sciName;
    }

    public void setSciName(String sciName) {
        this.sciName = sciName;
    }

    public String getPlantFamily() {
        return plantFamily;
    }

    public void setPlantFamily(String plantFamily) {
        this.plantFamily = plantFamily;
    }

    public String getNat() {
        return nat;
    }

    public void setNat(String nat) {
        this.nat = nat;
    }

    public String getExposure() {
        return exposure;
    }

    public void setExposure(String exposure) {
        this.exposure = exposure;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWaterNeeds() {
        return waterNeeds;
    }

    public void setWaterNeeds(String waterNeeds) {
        this.waterNeeds = waterNeeds;
    }

    public String getSoilTYpe() {
        return soilTYpe;
    }

    public void setSoilTYpe(String soilTYpe) {
        this.soilTYpe = soilTYpe;
    }

    public String getSoilPh() {
        return soilPh;
    }

    public void setSoilPh(String soilPh) {
        this.soilPh = soilPh;
    }

    public String getSoilDrainage() {
        return soilDrainage;
    }

    public void setSoilDrainage(String soilDrainage) {
        this.soilDrainage = soilDrainage;
    }

    public String getCharacteristics() {
        return characteristics;
    }

    public void setCharacteristics(String characteristics) {
        this.characteristics = characteristics;
    }

    public String getTolerance() {
        return tolerance;
    }

    public void setTolerance(String tolerance) {
        this.tolerance = tolerance;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}