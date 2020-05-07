package lk.cyberston.v1.cyberston.models;

import javax.persistence.*;

@Entity
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Enumerated(EnumType.STRING)
    @Column(length = 20)
    private UserRoles rname;

    public Role() {
    }
    public Role(UserRoles rname) {
        this.rname=rname;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public UserRoles getRname() {
        return rname;
    }

    public void setRname(UserRoles rname) {
        this.rname = rname;
    }
}
