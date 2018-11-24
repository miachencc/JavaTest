package Beans;

import java.util.ArrayList;
import java.util.List;

public class Result {
    private String expand;
    private int startAt;
    private int maxResults;
    private int total;
    private ArrayList<issues> issues;

    public ArrayList<Beans.issues> getIssues() {
        return issues;
    }

    public void setIssues(ArrayList<Beans.issues> issues) {
        this.issues = issues;
    }

    public String getExpand() {
        return expand;
    }

    public void setExpand(String expand) {
        this.expand = expand;
    }

    public int getStartAt() {
        return startAt;
    }

    public void setStartAt(int startAt) {
        this.startAt = startAt;
    }

    public int getMaxResults() {
        return maxResults;
    }

    public void setMaxResults(int maxResults) {
        this.maxResults = maxResults;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }


    @Override
    public String toString() {
        return "Result{" +
                "expand='" + expand + '\'' +
                ", startAt=" + startAt +
                ", maxResults=" + maxResults +
                ", total=" + total +
                ", issues=" + issues +
                '}';
    }
}
