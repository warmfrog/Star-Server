package com.warmfrog.star.common.dto;

/**
 * @author libo
 * @date 2020/2/6
 */
public class Douban {
    private String id;
    private String url;
    private String ebookPurchaseLink;
    private String paperPurchaseLink;
    private double score;
    private Star star;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getEbookPurchaseLink() {
        return ebookPurchaseLink;
    }

    public void setEbookPurchaseLink(String ebookPurchaseLink) {
        this.ebookPurchaseLink = ebookPurchaseLink;
    }

    public String getPaperPurchaseLink() {
        return paperPurchaseLink;
    }

    public void setPaperPurchaseLink(String paperPurchaseLink) {
        this.paperPurchaseLink = paperPurchaseLink;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public Star getStar() {
        return star;
    }

    public void setStar(Star star) {
        this.star = star;
    }

    public static class Star {
        private int oneStar;
        private int twoStar;
        private int threeStar;
        private int fourStar;
        private int fiveStar;

        public int getOneStar() {
            return oneStar;
        }

        public void setOneStar(int oneStar) {
            this.oneStar = oneStar;
        }

        public int getTwoStar() {
            return twoStar;
        }

        public void setTwoStar(int twoStar) {
            this.twoStar = twoStar;
        }

        public int getThreeStar() {
            return threeStar;
        }

        public void setThreeStar(int threeStar) {
            this.threeStar = threeStar;
        }

        public int getFourStar() {
            return fourStar;
        }

        public void setFourStar(int fourStar) {
            this.fourStar = fourStar;
        }

        public int getFiveStar() {
            return fiveStar;
        }

        public void setFiveStar(int fiveStar) {
            this.fiveStar = fiveStar;
        }
    }
}
