package org.automation.model;


import java.util.Comparator;

public class Bug  {
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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bug)) return false;

        Bug bug = (Bug) o;

        if (!getTitle().equals(bug.getTitle())) return false;
        if (getSummary() != null ? !getSummary().equals(bug.getSummary()) : bug.getSummary() != null) return false;
        if (getDescription() != null ? !getDescription().equals(bug.getDescription()) : bug.getDescription() != null)
            return false;
        if (getAttachmentPath() != null ? !getAttachmentPath().equals(bug.getAttachmentPath()) : bug.getAttachmentPath() != null)
            return false;
        if (getExceptions() != null ? !getExceptions().equals(bug.getExceptions()) : bug.getExceptions() != null)
            return false;
        if (getComments() != null ? !getComments().equals(bug.getComments()) : bug.getComments() != null) return false;
        if (getFoundDateTime() != null ? !getFoundDateTime().equals(bug.getFoundDateTime()) : bug.getFoundDateTime() != null)
            return false;
        if (getTags() != null ? !getTags().equals(bug.getTags()) : bug.getTags() != null) return false;
        if (!getPriority().equals(bug.getPriority())) return false;
        return getServility().equals(bug.getServility());

    }

    @Override
    public int hashCode() {
        int result = getTitle().hashCode();
        result = 31 * result + (getSummary() != null ? getSummary().hashCode() : 0);
        result = 31 * result + (getDescription() != null ? getDescription().hashCode() : 0);
        result = 31 * result + (getAttachmentPath() != null ? getAttachmentPath().hashCode() : 0);
        result = 31 * result + (getExceptions() != null ? getExceptions().hashCode() : 0);
        result = 31 * result + (getComments() != null ? getComments().hashCode() : 0);
        result = 31 * result + (getFoundDateTime() != null ? getFoundDateTime().hashCode() : 0);
        result = 31 * result + (getTags() != null ? getTags().hashCode() : 0);
        result = 31 * result + getPriority().hashCode();
        result = 31 * result + getServility().hashCode();
        return result;
    }

    private String priority;

    @Override
    public String toString() {
        return "Bug{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", summary='" + summary + '\'' +
                ", description='" + description + '\'' +
                ", attachmentPath='" + attachmentPath + '\'' +
                ", exceptions='" + exceptions + '\'' +
                ", comments='" + comments + '\'' +
                ", foundDateTime='" + foundDateTime + '\'' +
                ", tags='" + tags + '\'' +
                ", priority='" + priority + '\'' +
                ", servility='" + servility + '\'' +
                '}';
    }

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
