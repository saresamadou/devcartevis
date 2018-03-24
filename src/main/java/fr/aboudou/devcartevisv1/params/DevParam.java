package fr.aboudou.devcartevisv1.params;

import fr.aboudou.devcartevisv1.enums.BU;

public class DevParam {

    private Long Id;
    private String email;
    private BU bu;

    public DevParam(Long id, String email, BU bu) {
        Id = id;
        this.email = email;
        this.bu = bu;
    }

    public DevParam() {
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public BU getBu() {
        return bu;
    }

    public void setBu(BU bu) {
        this.bu = bu;
    }
}
