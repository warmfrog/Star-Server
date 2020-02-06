package com.warmfrog.star.common.dto;

import java.math.BigDecimal;

/**
 * @author libo
 * @date 2020/2/6
 */
public class PurchaseLink {
    private String platform;
    private String url;
    private BigDecimal price;

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
