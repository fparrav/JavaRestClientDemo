
package cl.voxcom.model.consultadeuda.req;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ConsultarDeudaRequest {

    @SerializedName("Identificador1")
    @Expose
    private String identificador1;
    @SerializedName("Identificador2")
    @Expose
    private String identificador2;
    @SerializedName("Identificador3")
    @Expose
    private String identificador3;
    @SerializedName("Identificador4")
    @Expose
    private String identificador4;
    @SerializedName("Identificador5")
    @Expose
    private String identificador5;
    @SerializedName("IdTransaccion")
    @Expose
    private String idTransaccion;
    @SerializedName("Canal")
    @Expose
    private String canal;
    @SerializedName("Sucursal")
    @Expose
    private String sucursal;
    @SerializedName("CodigoServicio")
    @Expose
    private String codigoServicio;

    public String getIdentificador1() {
        return identificador1;
    }

    public void setIdentificador1(String identificador1) {
        this.identificador1 = identificador1;
    }

    public String getIdentificador2() {
        return identificador2;
    }

    public void setIdentificador2(String identificador2) {
        this.identificador2 = identificador2;
    }

    public String getIdentificador3() {
        return identificador3;
    }

    public void setIdentificador3(String identificador3) {
        this.identificador3 = identificador3;
    }

    public String getIdentificador4() {
        return identificador4;
    }

    public void setIdentificador4(String identificador4) {
        this.identificador4 = identificador4;
    }

    public String getIdentificador5() {
        return identificador5;
    }

    public void setIdentificador5(String identificador5) {
        this.identificador5 = identificador5;
    }

    public String getIdTransaccion() {
        return idTransaccion;
    }

    public void setIdTransaccion(String idTransaccion) {
        this.idTransaccion = idTransaccion;
    }

    public String getCanal() {
        return canal;
    }

    public void setCanal(String canal) {
        this.canal = canal;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public String getCodigoServicio() {
        return codigoServicio;
    }

    public void setCodigoServicio(String codigoServicio) {
        this.codigoServicio = codigoServicio;
    }

}
