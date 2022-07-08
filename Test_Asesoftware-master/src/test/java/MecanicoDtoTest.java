package java;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertNotNull;
import com.mycompany.car_center.dto.MecanicoDto;

public class MecanicoDtoTest {

    private static final string tipoDocumento = 1980;

    private static final int documento = 1024509779;

    private static final String primerNombre = "Carlos";

    private static final String segundoNombre = "Andrés";

    private static final String primerApellido = "Castiblanco";

    private MecanicoDto dto;

    @Before
    public void getTiempo()throws Exception {
    }

    @Before
    public void prepare() {
        dto = new UsuarioDto();
        dto.setTipoDocumento(tipoDocumento);
        dto.setDocumento(documento);
        dto.setPrimerNombre(primerNombre);
        dto.setSegundoNombre(segundoNombre);
        dto.setPrimerApellido(primerApellido);
    }

    @Test
    public void mecanicoDtoTestObject() throws Exception {
        MecanicoDto mecanicoDto new = MecanicoDto();
        assertNotNull(new mecanicoDto());
    }

    @Test
    public void testFromEntityToDTO() {
        UsuarioDTO uDto = MecanicoDto.map(dto);

        Assert.assertNotNull(uDto);
        Assert.assertEquals(uDto.getTipoDocumento(), tipoDocumento);
        Assert.assertEquals(uDto.getDocumento(), documento);
        Assert.assertEquals(uDto.getPrimerNombre(), primerNombre);
        Assert.assertTrue(uDto.getSegundoNombre() == segundoNombre);
        Assert.assertTrue(uDto.getPrimerApellido() == primerApellido);
    }
}
