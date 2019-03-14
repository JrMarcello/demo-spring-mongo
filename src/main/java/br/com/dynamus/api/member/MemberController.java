package br.com.dynamus.api.member;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value="/member")
public class MemberController {

    @Autowired
    private MemberRepository repository;

    // Crinado um controller para paths constomizados
    @RequestMapping(value = "/controller", method = RequestMethod.GET)
    public List<MemberEntity> getMembers() {
        System.out.println("OPAAAA");
        return repository.findAll();
    }
}