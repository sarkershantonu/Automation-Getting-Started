package org.automation.webtest.model;

public class CategoryParameter {

    private String pageType;
    private String id;
    private String pageSize;
    private String all;
    private String activePage;
    private String sortBy;
    private String orderAsc;
    private String activeTab;

    public CategoryParameter() {
    }

    public CategoryParameter(String pageType, String id, String pageSize, String all, String activePage, String sortBy, String orderAsc, String activeTab) {
        this.pageType = pageType;
        this.id = id;
        this.pageSize = pageSize;
        this.all = all;
        this.activePage = activePage;
        this.sortBy = sortBy;
        this.orderAsc = orderAsc;
        this.activeTab = activeTab;
    }

    public String getPageType() {
        return pageType;
    }

    public void setPageType(String pageType) {
        this.pageType = pageType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPageSize() {
        return pageSize;
    }

    public void setPageSize(String pageSize) {
        this.pageSize = pageSize;
    }

    public String getAll() {
        return all;
    }

    public void setAll(String all) {
        this.all = all;
    }

    public String getActivePage() {
        return activePage;
    }

    public void setActivePage(String activePage) {
        this.activePage = activePage;
    }

    public String getSortBy() {
        return sortBy;
    }

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    public String getOrderAsc() {
        return orderAsc;
    }

    public void setOrderAsc(String orderAsc) {
        this.orderAsc = orderAsc;
    }

    public String getActiveTab() {
        return activeTab;
    }

    public void setActiveTab(String activeTab) {
        this.activeTab = activeTab;
    }


    @Override
    public String toString() {
        return "pageType=" + pageType +
                "&id=" + id +
                "&pageSize=" + pageSize +
                "&all=" + all +
                "&activePage=" + activePage +
                "&sortBy=" + sortBy +
                "&orderAsc=" + orderAsc +
                "&activeTab=" + activeTab;
    }

    public static CategoryParameter getCategoryParameter(final String url){
        CategoryParameter categoryParameter = new CategoryParameter();
        //todo
        // parsing the url string and setting the values
        return categoryParameter;

    }
}
