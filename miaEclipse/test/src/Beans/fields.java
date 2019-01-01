package Beans;

public class fields {
    private String description;
    private String summary;
    private assignee assignee;
    private creator creator;
    private issuetype issuetype;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public Beans.assignee getAssignee() {
        return assignee;
    }

    public void setAssignee(Beans.assignee assignee) {
        this.assignee = assignee;
    }

    public Beans.creator getCreator() {
        return creator;
    }

    public void setCreator(Beans.creator creator) {
        this.creator = creator;
    }

    public Beans.issuetype getIssuetype() {
        return issuetype;
    }

    public void setIssuetype(Beans.issuetype issuetype) {
        this.issuetype = issuetype;
    }

    @Override
    public String toString() {
        return "fields{" +
                "description='" + description + '\'' +
                ", summary='" + summary + '\'' +
                ", assignee=" + assignee +
                ", creator=" + creator +
                ", issuetype=" + issuetype +
                '}';
    }
}
