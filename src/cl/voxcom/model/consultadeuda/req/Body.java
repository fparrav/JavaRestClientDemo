
package cl.voxcom.model.consultadeuda.req;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Body {

    @SerializedName("consultarDeudaRequest")
    @Expose
    private ConsultarDeudaRequest consultarDeudaRequest;

    public ConsultarDeudaRequest getConsultarDeudaRequest() {
        return consultarDeudaRequest;
    }

    public void setConsultarDeudaRequest(ConsultarDeudaRequest consultarDeudaRequest) {
        this.consultarDeudaRequest = consultarDeudaRequest;
    }

}
