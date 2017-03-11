package com.aprendizagem.projeto.desafionativohibrido;

import com.google.gson.annotations.SerializedName;

/**
 * Created by jose on 11/03/17.
 */

public class Resposta {
    /*
    {
  "status": "success",
  "attempt": "58c420f3-6b03-4888-9705-5d27298d81d0",
  "id": "844853a0-e89a-4d92-829a-a3be609b3883",
  "request_id": "JLmnEcuS74QpBcEp"
}
    * */
    private String status;
    private String attempt;
    private String id;
    @SerializedName("request_id")
    private String requestId;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAttempt() {
        return attempt;
    }

    public void setAttempt(String attempt) {
        this.attempt = attempt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }
}
