package codejava;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.simple.JSONArray;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;

//@RestController annotation specifies this class will handle requests and produce responses following REST style.
// It does all the default configurations so you can start coding your API quickly.
@RestController
@RequestMapping("/OpenMateGateway/api/v2")
public class APIController {

    //method and querry path
    @GetMapping("/9321/vehicle_inventory")
    public JSONArray getProductMaint(//@RequestParam(name = "last_modified_after") Date modifiedAfter,
                                     //@RequestParam(name = "last_modified_before") Date modifiedBefore,
                                     @RequestParam(name = "offset", defaultValue = "0") int offset,
                                     @RequestParam(name = "limit", defaultValue = "200") int limit) {
        try {
            System.out.println(offset);
            System.out.println(limit);

            //creating new file path
            return readFile(new File(Paths.get("src", "main", "resources", "OpenMateGateway", "responseAutomateVehicleInventory.json").toUri()));


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    //deserialized to array
    private JSONArray readFile(File file) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(file, JSONArray.class);
    }
}
