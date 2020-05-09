
package cl.voxcom.model.consultadeuda.res;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Body {

    @SerializedName("consultarDeudaResponse")
    @Expose
    private ConsultarDeudaResponse consultarDeudaResponse;

    public ConsultarDeudaResponse getConsultarDeudaResponse() {
        return consultarDeudaResponse;
    }

    public void setConsultarDeudaResponse(ConsultarDeudaResponse consultarDeudaResponse) {
        this.consultarDeudaResponse = consultarDeudaResponse;
    }

}
