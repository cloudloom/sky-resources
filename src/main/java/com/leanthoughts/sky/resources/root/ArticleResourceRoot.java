package com.leanthoughts.sky.resources.root;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.leanthoughts.sky.resources.product.ArticleResource;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sadath on 08-Jan-2016.
 */
@JsonInclude(value = JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ArticleResourceRoot {
    private List<ArticleResource> articles = new ArrayList<ArticleResource>();

    public ArticleResourceRoot() {
    }

    public List<ArticleResource> getArticles() {
        return this.articles;
    }

    public void setArticles(List<ArticleResource> articles) {
        this.articles = articles;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof ArticleResourceRoot)) return false;
        final ArticleResourceRoot other = (ArticleResourceRoot) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$articles = this.articles;
        final Object other$articles = other.articles;
        if (this$articles == null ? other$articles != null : !this$articles.equals(other$articles)) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $articles = this.articles;
        result = result * PRIME + ($articles == null ? 0 : $articles.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof ArticleResourceRoot;
    }

    public String toString() {
        return "com.leanthoughts.sky.resources.root.ArticleResourceRoot(articles=" + this.articles + ")";
    }
}
