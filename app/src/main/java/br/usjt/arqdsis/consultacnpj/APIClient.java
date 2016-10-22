package br.usjt.arqdsis.consultacnpj;

import java.util.List;


import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.client.OkClient;
import retrofit.http.GET;
import retrofit.http.Path;

public class APIClient {

    private static RestAdapter REST_ADAPTER;


    private static void createAdapterIfNeeded() {

        if (REST_ADAPTER == null) {
            REST_ADAPTER = new RestAdapter.Builder()
                    .setEndpoint("https://www.receitaws.com.br")
                    .setLogLevel(RestAdapter.LogLevel.FULL)
                    .setClient(new OkClient())
                    .build();
        }
    }

    public APIClient() {
        createAdapterIfNeeded();
    }

    public RestServices getRestService() {
        return REST_ADAPTER.create(RestServices.class);
    }


    public interface RestServices {


//        @GET("/produto/todos")
//        void getAllProdutos(
//                Callback<List<Produto>> callbackProdutos
//        );
//
//        @Headers( "Content-Type: application/json" )
//        @POST("/compra/cadastro")
//        void enviarCompra(
//                @Body Compra compra,
//                Callback<String> callbackCompra
//        );
//

//
//        @FormUrlEncoded()
//        @PUT("/produto")
//        void updateProduto(
//                @Field("id") String codigoBarras,
//                @Field("descricao") String descricao,
//                @Field("unidade") String unidade,
//                @Field("preco") double preco,
//                @Field("foto") String foto,
//                @Field("ativo") int ativo,
//                @Field("latitude") double latitude,
//                @Field("longitude") double longitude,
//                Callback<String> callbackUpdateProduto
//        );
//
//
//        @DELETE("/produto")
//        String deleteProduto(
//                @Query("id") String codigoBarras
//        );

        //@Headers( "Content-Type: application/json" )
//        @POST("/auth/login")
//        void login(
//                @Body Login login,
//                Callback<User> callbackLogin
//        );
//
//        @GET("/os")
//        void getAllOrdemServico(@Header("Authorization") String token,
//                                Callback<List<OrdemServico>> callbackOrdemServico
//        );
//
//
//        @PUT("/os/update")
//        void sendOSToServer(
//                @Header("Authorization") String token,
//                @Body OrdemServico ordemServico,
//                Callback<RestMessage> callbackOrdemServico
//        );


        @GET("/v1/cnpj/{cnpj}")
        void getConsultaCNPJ(@Path("cnpj") String cnpj, Callback<ConsultaCNPJ> callbackCliente);

    }


}