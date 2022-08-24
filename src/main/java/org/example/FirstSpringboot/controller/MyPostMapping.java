package org.example.FirstSpringboot.controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;











import java.util.Map;

@RestController
public class MyPostMapping {


    @PostMapping("/calculate")
    public int calculate (@RequestBody Map <String    ,     String> data   ){
                                            /*
                                            {
                                            "operator"   :   "+",
                                            "number1"    :   "100",
                                            "number2"    :   "100"
                                            }


                                            in postman: body/raw/json
                                            */



        String operator = data.get("operator");
        int number1 = Integer.parseInt(data.get("number1"));
        int number2 = Integer.parseInt(data.get("number2"));
        int result=0;


        if (operator.equals("+")) {
            result = number1 + number2;
        }
        else if (operator.equals("-")){
            result=number1-number2;
        }

        return result;

    }



    @PostMapping("/calculate2")
    public int calculate2 (@RequestBody MyData myData   ){


                                             /*

                                             automatic make json type of attributes


                                            {
                                            "operator"   :   "+",
                                            "number1"    :   "100",
                                            "number2"    :   "100"
                                            }


                                            in postman: body/raw/json
                                            */





        int result=0;


        if (myData.getOperator().equals("+")){
            result = myData.getNumber1() + myData.getNumber2();
        }
        else if (myData.getOperator().equals("-")){
            result = myData.getNumber1() - myData.getNumber2();
        }

        return result;


    }



}
