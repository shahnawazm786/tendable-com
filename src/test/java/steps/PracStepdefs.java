package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;

import java.util.List;
import java.util.Map;

public class PracStepdefs {
    @Given("the following animal:")
    public void theFollowingAnimal(List<String> anmial) {
        //List<String> a = anmial.asList();
        System.out.println(anmial);
    }

    @Given("the following wild animal:")
    public void theFollowingWildAnimal(Map<String,String> wild) {
        System.out.println(wild);
    }
}
