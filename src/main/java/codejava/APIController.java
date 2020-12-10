package codejava;

import codejava.datamodel.DealerInfo;
import codejava.datamodel.Info;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;
import org.json.simple.JSONArray;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;


@RestController
@RequestMapping("/OpenMateGateway/api/v2")
public class APIController {


    private static final Logger LOGGER = LoggerFactory.getLogger(APIController.class);
    private static DateTimeFormatter FORMATTER = ISODateTimeFormat.dateTime().withZone(DateTimeZone.UTC);


    @GetMapping("/403/vehicle_inventory")
    public ResponseEntity get403Error() {
        return new ResponseEntity<>(HttpStatus.FORBIDDEN);
    }


    @GetMapping("/500/vehicle_inventory")
    public ResponseEntity get500Error() {
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }


    @GetMapping("/{dealerId}/vehicle_inventory")
    public DealerInfo getProductMaint(//@RequestParam(name = "last_modified_after") Date modifiedAfter,
                                      //@RequestParam(name = "last_modified_before") Date modifiedBefore,
                                      @PathVariable("dealerId") int dealerId,
                                      @RequestParam(name = "offset", defaultValue = "0") int offset,
                                      @RequestParam(name = "limit", defaultValue = "200") int limit) {
        DealerInfo dealerInfo;
        Path filePath = Paths.get("src", "main", "resources", "OpenMateGateway", "responseAutomateVehicleInventory.json");


        // Read File Content
        try {
            ObjectMapper mapper = new ObjectMapper();
            dealerInfo = mapper.readValue(new File(filePath.toUri()), DealerInfo.class);
            LOGGER.info("Loaded {} records from: {}", dealerInfo.size(), filePath);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // Modify Content
        for (Info info : dealerInfo) {
            info.setStatusDate(FORMATTER.print(DateTime.now()));

            // Determine File to Return
            switch (dealerId) {
                case 111:
                    info.setMake(null);
                    break;
                case 222:
                    info.setVin(null);
                    break;
            }
        }

        DealerInfo response = new DealerInfo();
        if (offset < dealerInfo.size()) {
            int count = offset + limit > dealerInfo.size() ? dealerInfo.size() - offset : limit;

            LOGGER.info("Retrieving offset: {} limit: {} count: {}", offset, limit, count);

            response.addAll(dealerInfo.subList(offset, offset + count));
        } else {
            throw new RuntimeException("Invalid Offset: " + offset + " / " + dealerInfo.size());
        }

        return response;
    }

}
