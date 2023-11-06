package utils;


import com.google.gson.JsonElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

    @Data
    @AllArgsConstructor
    @RequiredArgsConstructor
    public class HttpResponse {

        @NonNull
        private String statusReponse;

        private JsonElement data;

        private String description;
    }


