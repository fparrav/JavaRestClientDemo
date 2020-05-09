
package cl.voxcom.model.consultadeuda.res;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Documento {

    @SerializedName("Identificador")
    @Expose
    private String identificador;
    @SerializedName("Fecha")
    @Expose
    private String fecha;
    @SerializedName("Monto")
    @Expose
    private int monto;

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

}
