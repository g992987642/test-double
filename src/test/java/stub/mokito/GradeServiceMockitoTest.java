package stub.mokito;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import stub.GradeService;
import stub.GradeSystem;

import java.util.Arrays;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class GradeServiceMockitoTest {
    @Mock
    GradeSystem mockGradeSystem;
    @InjectMocks
    GradeService mockGradeService;
    @Test
     void shouldReturn90WhenCalculateStudentAverageGradeAndGradeIs80And90And100(){
         when(mockGradeSystem.gradesFor(1)).thenReturn(Arrays.asList(80.0,90.0,100.0));
         double result =mockGradeService.calculateAverageGrades(1);
         Assertions.assertEquals(90.0,result);
     }


}
