package com.schroeter.eric.mathapi.equation;

import org.springframework.hateoas.EntityModel;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class EquationController {

    public final EquationService equationService;

    public EquationController(EquationService equationService) {
        this.equationService = equationService;
    }

    @PostMapping("/equation")
    public ResponseEntity<EquationResponse> newEquationResponse(@RequestBody EquationRequest equationRequest) {
        EquationResponse equationResponse = new EquationResponse();




       Float answer = equationService.process(equationRequest.getOperation(), equationRequest.getValueOne(), equationRequest.getValueTwo());

       equationResponse.setResult(answer);

       String operand = "";

       if (equationRequest.getOperation().equals("add")) {
           operand = "+";
       } else if (equationRequest.getOperation().equals("subtract")) {
           operand = "-";
        } else if (equationRequest.getOperation().equals("multiply")) {
           operand = "*";
       } else if (equationRequest.getOperation().equals("divide")) {
           operand = "/";
       }

       String equation = equationRequest.getValueOne() + " " + operand + " " + equationRequest.getValueTwo();

       equationResponse.setEquation(equation);

        return ResponseEntity.ok(equationResponse);
    }

}
