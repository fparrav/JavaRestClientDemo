
package cl.voxcom.model.consultadeuda.res;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ResConsultaDeuda {

    @SerializedName("Body")
    @Expose
    private Body body;

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

}
