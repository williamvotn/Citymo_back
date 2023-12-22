package com.example.demo.paris;

import jakarta.persistence.*;

public class Paris {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "lien_source")
    private String lienSource;

    @Column(name = "imageurl")
    private String imageUrl;

    @Column(name = "prix")
    private double prix;

    @Column(name = "arrondissement")
    private int arrondissement;

    @Column(name = "features")
    private String features;

    @Column(name = "classe_de_performance_energetique")
    private String classeDePerformanceEnergetique;

    @Column(name = "classe_d_emission_a_effet_de_serre")
    private String classeDEmissionAEffetDeSerre;

    @Column(name = "description")
    private String description;

    @Column(name = "latitude")
    private double latitude;

    @Column(name = "longitude")
    private double longitude;

    @Column(name = "surface")
    private double surface;

    @Column(name = "nombre_de_pieces")
    private int nombreDePieces;

    @Column(name = "nombre_de_chambres")
    private int nombreDeChambres;

    @Column(name = "nombre_de_salles_de_bain")
    private int nombreDeSallesDeBain;

    @Column(name = "nombre_de_salles_d_eau")
    private int nombreDeSallesDEau;

    @Column(name = "chauffage")
    private String chauffage;

    @Column(name = "cave")
    private boolean cave;

    @Column(name = "ascenseur")
    private boolean ascenseur;

    @Column(name = "balcon")
    private boolean balcon;

    @Column(name = "box")
    private boolean box;

    @Column(name = "digicode")
    private boolean digicode;

    @Column(name = "gardien")
    private boolean gardien;

    @Column(name = "exposition")
    private String exposition;

    @Column(name = "interphone")
    private boolean interphone;

    @Column(name = "garage")
    private boolean garage;

    @Column(name = "parking")
    private boolean parking;

    @Column(name = "cheminee")
    private boolean cheminee;

    @Column(name = "alarme")
    private boolean alarme;

    @Column(name = "climatisation")
    private boolean climatisation;

    @Column(name = "dependance")
    private boolean dependance;

    @Column(name = "terrasse")
    private boolean terrasse;

    @Column(name = "radiateurs")
    private boolean radiateurs;

    @Column(name = "jardin")
    private boolean jardin;


    // Constructeur par défaut
    public Paris() {
    }

    // Constructeur avec tous les champs
    public Paris(Long id, String lienSource, String imageUrl, double prix, int arrondissement, String features,
                 String classeDePerformanceEnergetique, String classeDEmissionAEffetDeSerre, String description,
                 double latitude, double longitude, double surface, int nombreDePieces, int nombreDeChambres,
                 int nombreDeSallesDeBain, int nombreDeSallesDEau, String chauffage, boolean cave, boolean ascenseur,
                 boolean balcon, boolean box, boolean digicode, boolean gardien, String exposition, boolean interphone,
                 boolean garage, boolean parking, boolean cheminee, boolean alarme, boolean climatisation,
                 boolean dependance, boolean terrasse, boolean radiateurs, boolean jardin) {
        this.id = id;
        this.lienSource = lienSource;
        this.imageUrl = imageUrl;
        this.prix = prix;
        this.arrondissement = arrondissement;
        this.features = features;
        this.classeDePerformanceEnergetique = classeDePerformanceEnergetique;
        this.classeDEmissionAEffetDeSerre = classeDEmissionAEffetDeSerre;
        this.description = description;
        this.latitude = latitude;
        this.longitude = longitude;
        this.surface = surface;
        this.nombreDePieces = nombreDePieces;
        this.nombreDeChambres = nombreDeChambres;
        this.nombreDeSallesDeBain = nombreDeSallesDeBain;
        this.nombreDeSallesDEau = nombreDeSallesDEau;
        this.chauffage = chauffage;
        this.cave = cave;
        this.ascenseur = ascenseur;
        this.balcon = balcon;
        this.box = box;
        this.digicode = digicode;
        this.gardien = gardien;
        this.exposition = exposition;
        this.interphone = interphone;
        this.garage = garage;
        this.parking = parking;
        this.cheminee = cheminee;
        this.alarme = alarme;
        this.climatisation = climatisation;
        this.dependance = dependance;
        this.terrasse = terrasse;
        this.radiateurs = radiateurs;
        this.jardin = jardin;
    }

    // Constructeur sans l'identifiant (pour les nouveaux enregistrements)
    public Paris(String lienSource, String imageUrl, double prix, int arrondissement, String features,
                 String classeDePerformanceEnergetique, String classeDEmissionAEffetDeSerre, String description,
                 double latitude, double longitude, double surface, int nombreDePieces, int nombreDeChambres,
                 int nombreDeSallesDeBain, int nombreDeSallesDEau, String chauffage, boolean cave, boolean ascenseur,
                 boolean balcon, boolean box, boolean digicode, boolean gardien, String exposition, boolean interphone,
                 boolean garage, boolean parking, boolean cheminee, boolean alarme, boolean climatisation,
                 boolean dependance, boolean terrasse, boolean radiateurs, boolean jardin) {
        this.lienSource = lienSource;
        this.imageUrl = imageUrl;
        this.prix = prix;
        this.arrondissement = arrondissement;
        this.features = features;
        this.classeDePerformanceEnergetique = classeDePerformanceEnergetique;
        this.classeDEmissionAEffetDeSerre = classeDEmissionAEffetDeSerre;
        this.description = description;
        this.latitude = latitude;
        this.longitude = longitude;
        this.surface = surface;
        this.nombreDePieces = nombreDePieces;
        this.nombreDeChambres = nombreDeChambres;
        this.nombreDeSallesDeBain = nombreDeSallesDeBain;
        this.nombreDeSallesDEau = nombreDeSallesDEau;
        this.chauffage = chauffage;
        this.cave = cave;
        this.ascenseur = ascenseur;
        this.balcon = balcon;
        this.box = box;
        this.digicode = digicode;
        this.gardien = gardien;
        this.exposition = exposition;
        this.interphone = interphone;
        this.garage = garage;
        this.parking = parking;
        this.cheminee = cheminee;
        this.alarme = alarme;
        this.climatisation = climatisation;
        this.dependance = dependance;
        this.terrasse = terrasse;
        this.radiateurs = radiateurs;
        this.jardin = jardin;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLienSource() {
        return lienSource;
    }

    public void setLienSource(String lienSource) {
        this.lienSource = lienSource;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public int getArrondissement() {
        return arrondissement;
    }

    public void setArrondissement(int arrondissement) {
        this.arrondissement = arrondissement;
    }

    public String getFeatures() {
        return features;
    }

    public void setFeatures(String features) {
        this.features = features;
    }

    public String getClasseDePerformanceEnergetique() {
        return classeDePerformanceEnergetique;
    }

    public void setClasseDePerformanceEnergetique(String classeDePerformanceEnergetique) {
        this.classeDePerformanceEnergetique = classeDePerformanceEnergetique;
    }

    public String getClasseDEmissionAEffetDeSerre() {
        return classeDEmissionAEffetDeSerre;
    }

    public void setClasseDEmissionAEffetDeSerre(String classeDEmissionAEffetDeSerre) {
        this.classeDEmissionAEffetDeSerre = classeDEmissionAEffetDeSerre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getSurface() {
        return surface;
    }

    public void setSurface(double surface) {
        this.surface = surface;
    }

    public int getNombreDePieces() {
        return nombreDePieces;
    }

    public void setNombreDePieces(int nombreDePieces) {
        this.nombreDePieces = nombreDePieces;
    }

    public int getNombreDeChambres() {
        return nombreDeChambres;
    }

    public void setNombreDeChambres(int nombreDeChambres) {
        this.nombreDeChambres = nombreDeChambres;
    }

    public int getNombreDeSallesDeBain() {
        return nombreDeSallesDeBain;
    }

    public void setNombreDeSallesDeBain(int nombreDeSallesDeBain) {
        this.nombreDeSallesDeBain = nombreDeSallesDeBain;
    }

    public int getNombreDeSallesDEau() {
        return nombreDeSallesDEau;
    }

    public void setNombreDeSallesDEau(int nombreDeSallesDEau) {
        this.nombreDeSallesDEau = nombreDeSallesDEau;
    }

    public String getChauffage() {
        return chauffage;
    }

    public void setChauffage(String chauffage) {
        this.chauffage = chauffage;
    }

    public boolean isCave() {
        return cave;
    }

    public void setCave(boolean cave) {
        this.cave = cave;
    }

    public boolean isAscenseur() {
        return ascenseur;
    }

    public void setAscenseur(boolean ascenseur) {
        this.ascenseur = ascenseur;
    }

    public boolean isBalcon() {
        return balcon;
    }

    public void setBalcon(boolean balcon) {
        this.balcon = balcon;
    }

    public boolean isBox() {
        return box;
    }

    public void setBox(boolean box) {
        this.box = box;
    }

    public boolean isDigicode() {
        return digicode;
    }

    public void setDigicode(boolean digicode) {
        this.digicode = digicode;
    }

    public boolean isGardien() {
        return gardien;
    }

    public void setGardien(boolean gardien) {
        this.gardien = gardien;
    }

    public String getExposition() {
        return exposition;
    }

    public void setExposition(String exposition) {
        this.exposition = exposition;
    }

    public boolean isInterphone() {
        return interphone;
    }

    public void setInterphone(boolean interphone) {
        this.interphone = interphone;
    }

    public boolean isGarage() {
        return garage;
    }

    public void setGarage(boolean garage) {
        this.garage = garage;
    }

    public boolean isParking() {
        return parking;
    }

    public void setParking(boolean parking) {
        this.parking = parking;
    }

    public boolean isCheminee() {
        return cheminee;
    }

    public void setCheminee(boolean cheminee) {
        this.cheminee = cheminee;
    }

    public boolean isAlarme() {
        return alarme;
    }

    public void setAlarme(boolean alarme) {
        this.alarme = alarme;
    }

    public boolean isClimatisation() {
        return climatisation;
    }

    public void setClimatisation(boolean climatisation) {
        this.climatisation = climatisation;
    }

    public boolean isDependance() {
        return dependance;
    }

    public void setDependance(boolean dependance) {
        this.dependance = dependance;
    }

    public boolean isTerrasse() {
        return terrasse;
    }

    public void setTerrasse(boolean terrasse) {
        this.terrasse = terrasse;
    }

    public boolean isRadiateurs() {
        return radiateurs;
    }

    public void setRadiateurs(boolean radiateurs) {
        this.radiateurs = radiateurs;
    }

    public boolean isJardin() {
        return jardin;
    }

    public void setJardin(boolean jardin) {
        this.jardin = jardin;
    }

}