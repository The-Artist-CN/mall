package com.aoding.mall.model;

import java.io.Serializable;

public class CmsPreferenceAreaProductRelation implements Serializable {

    private Long id;

    private Long preferenceAreaId;

    private Long productId;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPreferenceAreaId() {
        return preferenceAreaId;
    }

    public void setPreferenceAreaId(Long preferenceAreaId) {
        this.preferenceAreaId = preferenceAreaId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }


    @Override
    public String toString(){

        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", prefrenceAreaId=").append(preferenceAreaId);
        sb.append(", productId=").append(productId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();

    }

}
