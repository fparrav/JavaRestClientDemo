
package cl.voxcom.model.consultadeuda.req;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ReqConsultaDeuda {

    @SerializedName("Header")
    @Expose
    private Header header;
    @SerializedName("Body")
    @Expose
    private Body body;

    public Header getHeader() {
        return header;
    }

    public void setHeader(Header header) {
        this.header = header;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "ReqConsultaDeuda{" +
                "header=" + header +
                ", body=" + body +
                '}';
    }
}
