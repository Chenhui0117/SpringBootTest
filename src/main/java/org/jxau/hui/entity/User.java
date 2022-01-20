package org.jxau.hui.entity;

/**
 * @author Huihui
 * @date 2021/12/15 13:30
 * @Version 1.0
 */
public class User {

    private int id;
    private String name;
    private String pwd;
    private String notes;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public User() {
    }

    public User(int id, String name, String pwd, String notes) {
        this.id = id;
        this.name = name;
        this.pwd = pwd;
        this.notes = notes;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                ", notes='" + notes + '\'' +
                '}';
    }
}
