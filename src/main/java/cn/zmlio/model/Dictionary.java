package cn.zmlio.model;

import javax.persistence.*;

/**
 * Created by ZML on 2015/8/6.
 */


@Entity
@Table(name = "t_dictionary")
public class Dictionary {

    private Integer dictId;

    private String expression;

    private String description;

    private DictType type;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getDictId() {
        return dictId;
    }

    public void setDictId(Integer dictId) {
        this.dictId = dictId;
    }

    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    @ManyToOne(targetEntity = DictType.class)
    @JoinColumn(name = "type")
    public DictType getType() {
        return type;
    }

    public void setType(DictType type) {
        this.type = type;
    }
}
