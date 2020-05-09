package cl.voxcom;


import cl.voxcom.model.consultadeuda.req.Body;
import cl.voxcom.model.consultadeuda.req.ConsultarDeudaRequest;
import cl.voxcom.model.consultadeuda.req.Header;
import cl.voxcom.model.consultadeuda.req.ReqConsultaDeuda;
import cl.voxcom.model.consultadeuda.res.ResConsultaDeuda;
import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class Main {


    public static void main(String[] args) {


        final String uri1 = "http://200.29.32.83:2350/v1/consultadeuda";

        //Objeto request
        ReqConsultaDeuda reqConsultaDeuda = new ReqConsultaDeuda();

        Header header = new Header();
        header.setCanal(1);
        header.setTimeStamp("08-05-2020 12:00");

        Body body = new Body();
        ConsultarDeudaRequest consultarDeudaRequest = new ConsultarDeudaRequest();
        consultarDeudaRequest.setIdentificador1("1");
        consultarDeudaRequest.setIdentificador1("?");
        consultarDeudaRequest.setIdentificador1("?");
        consultarDeudaRequest.setIdentificador1("?");
        consultarDeudaRequest.setIdentificador1("?");
        consultarDeudaRequest.setIdTransaccion("2020050112000000001");
        consultarDeudaRequest.setCanal("12345");
        consultarDeudaRequest.setSucursal("?");
        consultarDeudaRequest.setCodigoServicio("1234567");

        body.setConsultarDeudaRequest(consultarDeudaRequest);

        reqConsultaDeuda.setHeader(header);
        reqConsultaDeuda.setBody(body);


        try {

            URL url = new URL(uri1);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Content-Type", "application/json; utf-8");
            conn.setRequestProperty("Accept", "application/json");
            conn.setDoOutput(true);

            //Objeto request se transforma a json string
            Gson gson = new Gson();
            String jsonInputString = gson.toJson(reqConsultaDeuda);

            try (OutputStream os = conn.getOutputStream()) {
                byte[] input = jsonInputString.getBytes("utf-8");
                os.write(input, 0, input.length);
            }

            if (conn.getResponseCode() != 200) {
                throw new RuntimeException("Failed : HTTP Error code : "
                        + conn.getResponseCode());
            }


            ResConsultaDeuda resConsultaDeuda = new ResConsultaDeuda();
            try (BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(), "utf-8"))) {
                StringBuilder response = new StringBuilder();
                String responseLine = null;
                while ((responseLine = br.readLine()) != null) {
                    response.append(responseLine.trim());
                }
                System.out.println(response.toString());
                // Respuesta json string se transforma a objeto java
                resConsultaDeuda = gson.fromJson(response.toString(), ResConsultaDeuda.class);

            }


            conn.disconnect();

            // TODO validaciones y extraer datos de objeto resConsultaDeuda

        } catch (Exception e) {
            System.err.println("Exception in Consulta deuda:- " + e);
        }
    }


}
