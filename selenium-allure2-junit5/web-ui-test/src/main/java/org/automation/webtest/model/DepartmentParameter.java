package org.automation.webtest.model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Author: Arafat Mamun
 * username: amamun@freshdirect.com
 * Email: arafatmamun@hotmail.com
 * Date: 4/21/2019
 * Time: 10:49 AM
 */
public class DepartmentParameter {
    private String pageType;
    private String id;
    private String pageSize;
    private String all;
    private String activePage;
    private String sortBy;
    private String orderAsc;
    private String activeTab;
    private String trk;

    public DepartmentParameter() {
    }

    public DepartmentParameter(String pageType, String id, String pageSize, String all, String activePage, String sortBy, String orderAsc, String activeTab, String trk) {
        this.pageType = pageType;
        this.id = id;
        this.pageSize = pageSize;
        this.all = all;
        this.activePage = activePage;
        this.sortBy = sortBy;
        this.orderAsc = orderAsc;
        this.activeTab = activeTab;
        this.trk = trk;
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

    public String getTrk() {
        return trk;
    }

    public void setTrk(String trk) {
        this.trk = trk;
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
                "&activeTab=" + activeTab +
                "&trk=" + trk;
    }

    public static DepartmentParameter getDepartmentParameter(final String url){
        DepartmentParameter departmentParameter = new DepartmentParameter();
        //todo
        // parsing the url string and setting the values

        String[] parameters = url.split("&");
        for(String temp : parameters){
            Pattern pattern = Pattern.compile("(\\w+)=(.+)");
            Matcher matcher = pattern.matcher(temp);
            if(matcher.find()){
                String type = matcher.group(1);
                String value = matcher.group(2);

                if("pageType".equals(type))
                    departmentParameter.setPageType(value);
                else if("id".equals(type))
                    departmentParameter.setId(value);
                else if("pageSize".equals(type))
                    departmentParameter.setPageSize(value);
                else if("all".equals(type))
                    departmentParameter.setAll(value);
                else if("activePage".equals(type))
                    departmentParameter.setActivePage(value);
                else if("sortBy".equals(type))
                    departmentParameter.setSortBy(value);
                else if("orderAsc".equals(type))
                    departmentParameter.setOrderAsc(value);
                else if("activeTab".equals(type))
                    departmentParameter.setActiveTab(value);
                else if("trk".equals(type))
                    departmentParameter.setTrk(value);
                else System.out.println("error url");
            }
        }

        return departmentParameter;

    }

    public static void main(String[] args) {
        System.out.println(DepartmentParameter.getDepartmentParameter("pageType=browse&id=meals&pageSize=30&all=false&activePage=1&sortBy=null&orderAsc=false&activeTab=product&trk=gnav").toString());
    }


    //pageType=browse&id=fru&pageSize=30&all=false&activePage=1&sortBy=null&orderAsc=false&
    // activeTab=product&trk=gnav
}
