/**
 * 
 */
package hiki.o2o;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
/**
 * @Hiki msi
 *��������Spring��junit���ϣ�junit����ʱ����SpringIOC����
 */
@RunWith(SpringJUnit4ClassRunner.class)
//����junit spring�����ļ���λ��
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class BaseTest {
	
}
