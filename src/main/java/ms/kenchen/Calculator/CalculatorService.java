package ms.kenchen.Calculator;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
import java.util.Date;

@Path("/calculator")
public class CalculatorService {

    @GET
    @Path("ping")
    @Produces(MediaType.TEXT_PLAIN)
    public String ping() {
        return "Welcome to Java Web App!!! This is updated!\n" + new Date().toString();
    }

    @GET
    @Path("add")
    @Produces(MediaType.APPLICATION_JSON)
    public CalculatorResponse Add(@QueryParam("x") int x, @QueryParam("y") int y) {
        return new CalculatorResponse(x, y, x + y);
    }

    @GET
    @Path("sub")
    @Produces(MediaType.APPLICATION_JSON)
    public CalculatorResponse Sub(@QueryParam("x") int x, @QueryParam("y") int y) {
        return new CalculatorResponse(x, y, x - y);
    }

    @GET
    @Path("mul")
    @Produces(MediaType.APPLICATION_JSON)
    public CalculatorResponse Mul(@QueryParam("x") int x, @QueryParam("y") int y) {
        return new CalculatorResponse(x, y, x * y);
    }

    @GET
    @Path("div")
    @Produces(MediaType.APPLICATION_JSON)
    public CalculatorResponse Div(@QueryParam("x") int x, @QueryParam("y") int y) {
        return new CalculatorResponse(x, y, x / y);
    }
}
