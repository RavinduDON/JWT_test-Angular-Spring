package lk.cyberston.v1.cyberston.models;

import javax.persistence.*;

@Entity
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Enumerated(EnumType.STRING)
    @Column(length = 20)
    private UserRoles name;

    public Role() {
    }
    public Role(UserRoles name) {
        this.name=name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public UserRoles getRname() {
        return name;
    }

    public void setRname(UserRoles name) {
        this.name = name;
    }
}
