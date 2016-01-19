package com.leanthoughts.sky.resources;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by sadath on 01-Jan-2016.
 */
public class CatalogResource extends BaseResource {
    private String name;
    private String description;
    private Date published;
    private Set<ArticleResource> articles = new HashSet<ArticleResource>(0);
    private SellerResource seller;

    public CatalogResource() {
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public Date getPublished() {
        return this.published;
    }

    public Set<ArticleResource> getArticles() {
        return this.articles;
    }

    public SellerResource getSeller() {
        return this.seller;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPublished(Date published) {
        this.published = published;
    }

    public void setArticles(Set<ArticleResource> articles) {
        this.articles = articles;
    }

    public void setSeller(SellerResource seller) {
        this.seller = seller;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof CatalogResource)) return false;
        final CatalogResource other = (CatalogResource) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$name = this.name;
        final Object other$name = other.name;
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        final Object this$description = this.description;
        final Object other$description = other.description;
        if (this$description == null ? other$description != null : !this$description.equals(other$description))
            return false;
        final Object this$published = this.published;
        final Object other$published = other.published;
        if (this$published == null ? other$published != null : !this$published.equals(other$published)) return false;
        final Object this$articles = this.articles;
        final Object other$articles = other.articles;
        if (this$articles == null ? other$articles != null : !this$articles.equals(other$articles)) return false;
        final Object this$seller = this.seller;
        final Object other$seller = other.seller;
        if (this$seller == null ? other$seller != null : !this$seller.equals(other$seller)) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $name = this.name;
        result = result * PRIME + ($name == null ? 0 : $name.hashCode());
        final Object $description = this.description;
        result = result * PRIME + ($description == null ? 0 : $description.hashCode());
        final Object $published = this.published;
        result = result * PRIME + ($published == null ? 0 : $published.hashCode());
        final Object $articles = this.articles;
        result = result * PRIME + ($articles == null ? 0 : $articles.hashCode());
        final Object $seller = this.seller;
        result = result * PRIME + ($seller == null ? 0 : $seller.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof CatalogResource;
    }
}