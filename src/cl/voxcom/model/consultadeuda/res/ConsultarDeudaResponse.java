
package cl.voxcom.model.consultadeuda.res;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ConsultarDeudaResponse {

    @SerializedName("Identificador1")
    @Expose
    private String identificador1;
    @SerializedName("IdTransaccion")
    @Expose
    private String idTransaccion;
    @SerializedName("Canal")
    @Expose
    private String canal;
    @SerializedName("Biller")
    @Expose
    private String biller;
    @SerializedName("CodigoServicio")
    @Expose
    private String codigoServicio;
    @SerializedName("CodigoError")
    @Expose
    private String codigoError;
    @SerializedName("Documentos")
    @Expose
    private List<Documento> documentos = null;

    public String getIdentificador1() {
        return identificador1;
    }

    public void setIdentificador1(String identificador1) {
        this.identificador1 = identificador1;
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

    public String getBiller() {
        return biller;
    }

    public void setBiller(String biller) {
        this.biller = biller;
    }

    public String getCodigoServicio() {
        return codigoServicio;
    }

    public void setCodigoServicio(String codigoServicio) {
        this.codigoServicio = codigoServicio;
    }

    public String getCodigoError() {
        return codigoError;
    }

    public void setCodigoError(String codigoError) {
        this.codigoError = codigoError;
    }

    public List<Documento> getDocumentos() {
        return documentos;
    }

    public void setDocumentos(List<Documento> documentos) {
        this.documentos = documentos;
    }

}
