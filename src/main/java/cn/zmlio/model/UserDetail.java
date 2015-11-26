package cn.zmlio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Created by ZML on 2015/8/7.
 */

@Entity
@Table(name = "t_userDetail")
public class UserDetail {

    private int detailId;

    private String nickName;

    private Attachment avartar;

    private Contacts contacts;

    private User user;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getDetailId() {
        return detailId;
    }

    public void setDetailId(int detailId) {
        this.detailId = detailId;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    @OneToOne(targetEntity = Attachment.class)
    @JoinColumn(name = "avartarId")
    public Attachment getAvartar() {
        return avartar;
    }

    public void setAvartar(Attachment avartar) {
        this.avartar = avartar;
    }

    @OneToOne(targetEntity = Contacts.class)
    @JoinColumn(name = "contact")
    public Contacts getContacts() {
        return contacts;
    }

    public void setContacts(Contacts contacts) {
        this.contacts = contacts;
    }

    @OneToOne(targetEntity = User.class)
    @JoinColumn(name = "userId")
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
