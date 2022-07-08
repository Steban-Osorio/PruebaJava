package java;

import org.junit.Test;
import com.mycompany.car_center.entities.MantenimientosEntity;
import com.mycompany.car_center.repositories.MantenimientosRepository;

@RunWith(SpringRunner.class)
@DataJpaTest
public class MantenimientosEntityTest {

    @Autowired
    private MantenimientosEntity mantenimientosEntity;

    @Autowired
    private MantenimientosRepository mantenimientosRepository;

    @Test
    public void whenFindByNameTest() {
        MantenimientosEntity mantenimientosEntity = new MantenimientosEntity();
        mantenimientosEntity.setCodigo(1);
        entityManager.persist(mantenimientosEntity);
        entityManager.flush();
        MantenimientosEntity found = mantenimientosRepository.findAllCustom(mantenimientosEntity.getCodigo());
    }
}
