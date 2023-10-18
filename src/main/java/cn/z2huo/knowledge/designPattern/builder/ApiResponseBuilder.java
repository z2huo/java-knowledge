package cn.z2huo.knowledge.designPattern.builder;

public class ApiResponseBuilder {

    private long status;

    private String statusText;

    private Object data;

    public ApiResponseBuilder success() {
        this.status = ApiResponse.SUCCESS;
        this.statusText = ApiResponse.SUCCESS_TEXT;
        return this;
    }

    public ApiResponseBuilder success(String statusText) {
        this.status = ApiResponse.SUCCESS;
        this.statusText = statusText;
        return this;
    }

    public ApiResponseBuilder fail() {
        this.status = ApiResponse.FAIL;
        this.statusText = ApiResponse.FAIL_TEXT;
        return this;
    }

    public ApiResponseBuilder fail(String statusText) {
        this.status = ApiResponse.FAIL;
        this.statusText = statusText;
        return this;
    }

    public ApiResponseBuilder setStatusText(String statusText) {
        this.statusText = statusText;
        return this;
    }

    public ApiResponseBuilder setData(Object data) {
        this.data = data;
        return this;
    }

    public ApiResponse<?> build() {
        return new ApiResponse<>(status, statusText, data);
    }

}