package org.automation.model;


public class Bug {
    public Bug() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAttachmentPath() {
        return attachmentPath;
    }

    public void setAttachmentPath(String attachmentPath) {
        this.attachmentPath = attachmentPath;
    }

    public String getExceptions() {
        return exceptions;
    }

    public void setExceptions(String exceptions) {
        this.exceptions = exceptions;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getFoundDateTime() {
        return foundDateTime;
    }

    public void setFoundDateTime(String foundDateTime) {
        this.foundDateTime = foundDateTime;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getServility() {
        return servility;
    }

    public void setServility(String servility) {
        this.servility = servility;
    }

    private Long id;
    private String title;
    private String summary;
    private String description;
    private String attachmentPath;
    private String exceptions;
    private String comments;
    private String foundDateTime;
    private String tags;
    private String priority;

    public Bug(Long id, String title, String summary, String description, String attachmentPath, String exceptions, String comments, String foundDateTime, String tags, String priority, String servility) {
        this.id = id;
        this.title = title;
        this.summary = summary;
        this.description = description;
        this.attachmentPath = attachmentPath;
        this.exceptions = exceptions;
        this.comments = comments;
        this.foundDateTime = foundDateTime;
        this.tags = tags;
        this.priority = priority;
        this.servility = servility;
    }

    private String servility;

 public static Bug getABug(){
     return new Bug(null, "title","summary","description","/home/shantonu","RuntimeException","from code","Today","rest assure","NORM","BLOCKER");
 }
}
