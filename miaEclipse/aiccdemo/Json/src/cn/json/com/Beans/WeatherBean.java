package cn.json.com.Beans;

public class WeatherBean {
    private int resultcode;
    private String reason;
    private Result result;
    private int error_code;

    public int getResultcode() {
        return resultcode;
    }

    public void setResultcode(int resultcode) {
        this.resultcode = resultcode;
    }

    public  String getReason(){
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "{resultcode："+resultcode+"\n\r reason:"+ reason +"\n" +
                "\n\r error_code:"+error_code+"\n\r result:"+ result+"}";
    }
}
