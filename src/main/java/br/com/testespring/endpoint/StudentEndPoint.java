package br.com.testespring.endpoint;

import br.com.testespring.model.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import static java.util.Arrays.asList;
import java.util.List;

@RestController
@ResponseBody //todo os metodos vão retornar json no corpo da requisição
@RequestMapping("student")
public class StudentEndPoint {

    @RequestMapping(method = RequestMethod.GET, path="/list")
    public List<Student> listAll(){
        return asList(new Student("Maria"), new Student("João"));
    }
}
