package steps.api;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.assertj.core.api.Assertions;
import service.CharacterApiService;

import java.util.List;

public class CharacterSteps {

    private final CharacterApiService service;
    private Response characterResponse;

    public CharacterSteps() {
        this.service = new CharacterApiService();
    }

//    @When("I send GET request to my url {string}")
//    public void iSendGETRequestToHttpsRickandmortyapiComApiCharacterName(String name) {
//        this.characterResponse = service.getAllCharacters(name);
//    }
//    @When("I send GET request to character/ by name {string}")
//    public void iSendGETRequestToHttpsRickandmortyapiComApiCharacterName(String name) {
//        this.characterResponse = service.getAllCharacters(name);
//    }

    @Then("response status should be {int}")
    public void responseStatusShouldBe(int statusCode) {
        characterResponse.then()
                .statusCode(statusCode);
    }

    @When("I send GET request to character by name {string}")
    public void iSendGETRequestToCharacterByName(String name) {
        this.characterResponse = service.getAllCharacters(name);
    }

    @And("results should contain characters with {string} in name")
    public void resultsShouldContainCharactersWithInName(String expectedName) {
        List<String> nameList = characterResponse.then()
                .extract()
                .jsonPath()
                .getList("results.name");

        Assertions.assertThat(nameList.stream()
                        .map(String::toLowerCase)
                        .toList())
                .allMatch(r -> r.contains(expectedName));
    }

    @When("I send GET request to character by id {int}")
    public void iSendGETRequestToCharacterById(int id) {
        this.characterResponse = service.getCharacterById(id);
    }

    @And("response should contain error message")
    public void responseShouldContainErrorMessage() {
        String error = characterResponse.then()
                .extract()
                .jsonPath()
                .getString("error");
        Assertions.assertThat(error).isEqualTo("Character not found");
    }
}
