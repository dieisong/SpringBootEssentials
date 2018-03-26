package br.com.testespring.endpoint;

import br.com.testespring.model.Student;
import br.com.testespring.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import static java.util.Arrays.asList;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@ResponseBody //todo os metodos vão retornar json no corpo da requisição
@RequestMapping("student")
public class StudentEndPoint {

    @Autowired
    private DateUtil dateUtil;

    @RequestMapping(method = RequestMethod.GET, path="/list")
    public List<Student> listAll(){
        System.out.println("######################### - "+dateUtil.formatLocalDateTimeToDatabaseStyle(LocalDateTime.now()));
        return asList(new Student("Maria"), new Student("João"));
    }
}
