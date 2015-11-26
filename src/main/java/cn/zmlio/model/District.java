package cn.zmlio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Created by ZML on 2015/8/7.
 */

@Entity
@Table(name="t_district")
public class District {

    public int distId;//id

    public String distName;//地区名称

    public District parentDist;//上级地区

    public String postcode;//邮政编码

    public String areaCode;//电话区号

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getDistId() {
        return distId;
    }

    public void setDistId(int distId) {
        this.distId = distId;
    }

    public String getDistName() {
        return distName;
    }

    public void setDistName(String distName) {
        this.distName = distName;
    }

    @ManyToOne(targetEntity = District.class)
    @JoinColumn(name = "parentId")
    public District getParentDist() {
        return parentDist;
    }

    public void setParentDist(District parentDist) {
        this.parentDist = parentDist;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }
}
