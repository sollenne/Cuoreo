package com.mover.mover.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mover.mover.objects.Company;
import com.mover.mover.objects.CompanyRepository;
import com.mover.mover.vo.CompanyVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
public class CompanyRegistrationController {

    @Autowired
    private CompanyRepository companyRepository;

    @RequestMapping(value = "/registerCompany", method = RequestMethod.POST)
    public String register(@Valid @ModelAttribute CompanyVO requestVO) {

        Company company = new Company();
        company.setCompanyName(requestVO.getCompanyName());
        company.setEmailAddress(requestVO.getEmailAddress());
        company.setPhoneNumber(requestVO.getPhoneNumber());
        company.setMarketingDescription(requestVO.getMarketingDescription());
        company.setNonOperationalDays(requestVO.getNonOperationalDays());

        Company created = companyRepository.save(company);

        return "successfully created company with ID: " + created.getId();

    }


    @RequestMapping(value = "/companies", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public String getCompanies(@Valid @ModelAttribute CompanyVO requestVO) throws JsonProcessingException {
        Iterable<Company> companies = companyRepository.findAll();
        List<Company> target = new ArrayList<>();
        companies.forEach(target::add);
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(companies);
    }

}