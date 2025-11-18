package service;

import core.BaseApiService;
import io.restassured.response.Response;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class CharacterApiService extends BaseApiService {
    private static final String ALL_CHARACTERS_URL = "/character";
    private static final String CHARACTER_URL = "/character/{id}";

    public Response getAllCharacters(String filter) {
        return given()
                .queryParam("name", filter)
                .when()
                .get(ALL_CHARACTERS_URL)
                .then()
                .extract()
                .response();
    }

    public Response getCharacterById(Integer id) {
        return given()
                .pathParam("id", id)
                .when()
                .get(CHARACTER_URL)
                .then()
                .extract()
                .response();
    }

}
