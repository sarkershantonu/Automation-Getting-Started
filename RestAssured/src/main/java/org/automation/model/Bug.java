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
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getAttachmentPath() {
        return AttachmentPath;
    }

    public void setAttachmentPath(String attachmentPath) {
        AttachmentPath = attachmentPath;
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
    private String Description;
    private String AttachmentPath;
    private String exceptions;
    private String comments;
    private String foundDateTime;
    private String tags;
    private String priority;
    private String servility;

    private static final String modify = " {\n" +
            "    \"id\": 5,\n" +
            "    \"title\": \"this is a New\",\n" +
            "    \"summary\": \"Sample Bug\",\n" +
            "    \"exceptions\": \"Exception Is not present\",\n" +
            "    \"comments\": \"Comments \",\n" +
            "    \"foundDateTime\": \"1st december\",\n" +
            "    \"tags\": \"New, On production\",\n" +
            "    \"priority\": \"High\",\n" +
            "    \"servility\": \"Blocker\",\n" +
            "    \"description\": \"Sampel Data \",\n" +
            "    \"attachmentPath\": \"http://\"\n" +
            "  }";
    private static final String newBug = " {\n" +
            "    \"title\": \"this is a New\",\n" +
            "    \"summary\": \"Sample Bug\",\n" +
            "    \"exceptions\": \"Exception Is not present\",\n" +
            "    \"comments\": \"Comments \",\n" +
            "    \"foundDateTime\": \"1st december\",\n" +
            "    \"tags\": \"New, On production\",\n" +
            "    \"priority\": \"High\",\n" +
            "    \"servility\": \"Blocker\",\n" +
            "    \"description\": \"Sampel Data \",\n" +
            "    \"attachmentPath\": \"http://\"\n" +
            "  }";


}
