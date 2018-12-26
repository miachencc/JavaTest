package modules;

import com.github.crab2died.annotation.ExcelField;

public class Feedback {
    // 学号
    @ExcelField(title = "反馈问题", order = 1)
    private String issue;

    // 姓名
    @ExcelField(title = "产生原因", order = 2)
    private String reason;

    // 班级
    @ExcelField(title = "解决方案", order = 3)
    private String solution;

    public String getIssue() {
        return issue;
    }

    public void setIssue(String issue) {
        this.issue = issue;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getSolution() {
        return solution;
    }

    public void setSolution(String solution) {
        this.solution = solution;
    }

    @Override
    public String toString() {
        return "Feedback{" +
                "issue='" + issue + '\'' +
                ", reason='" + reason + '\'' +
                ", solution='" + solution + '\'' +
                '}';
    }
}
