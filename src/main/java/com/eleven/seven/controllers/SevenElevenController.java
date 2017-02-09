package com.eleven.seven.controllers;

import com.eleven.seven.model.SevenElevenForm;
import com.eleven.seven.model.SevenElevenRepository;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.text.Format;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by JPMPC-B209 on 1/5/2017.
 */

@Controller

public class SevenElevenController {


    private SevenElevenRepository sevenElevenRepository;

    @Autowired
    public SevenElevenController(SevenElevenRepository sevenElevenRepository) {
        this.sevenElevenRepository = sevenElevenRepository;
    }

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String loadRegistrationPage() {
        return "sevenEleven/index";
    }

        /*@RequestMapping(value = {"/thankyou"}, method = RequestMethod.POST)
        public ModelAndView loadThankYouPage(@ModelAttribute @Valid SevenElevenForm sevenEleven,
                                             ModelAndView model, WebRequest request,
                                             HttpServletRequest response,
                                             BindingResult bindingResult) {

            if (!bindingResult.hasErrors()) {
                sevenElevenRepository.save(sevenEleven);
                model.setViewName("sevenEleven/thankyou");
            }

            return model;
        }*/


   /* @RequestMapping(value = "/thankyou",method = RequestMethod.POST)
    public ModelAndView loadThankYou(@ModelAttribute @Valid SevenElevenForm sevenEleven,
                                  ModelAndView model, BindingResult bindingResult,
                                  WebRequest request,
                                  HttpServletResponse response) throws IOException, JSONException {

            if (!bindingResult.hasErrors()) {

                    sevenElevenRepository.save(sevenEleven);
                    JSONObject data = new JSONObject();

                    data.put("id", sevenEleven.getId());
                    data.put("name", sevenEleven.getField1());
                    data.put("email", sevenEleven.getField2());
                    data.put("contact", sevenEleven.getTel_no());

                    response.setContentType("application/json");

                    PrintWriter out = response.getWriter();
                    out.print(data);
                    out.flush();

            } */

        /*@RequestMapping(value = "/data", method = RequestMethod.GET)
        public ModelAndView loadDatas(ModelAndView model){
            model.setViewName("sevenEleven/data");
            return model;
        }*/

        @RequestMapping(value = "/list", method = RequestMethod.GET)
        public ModelAndView loadDatas(ModelAndView model) {
            model.setViewName("sevenEleven/list");
            return model;
        }

        @ModelAttribute("sevenElevenData")
        public List<SevenElevenForm> sevenElevenData() {

            return sevenElevenRepository.findAll();
        }

        @RequestMapping (value = "/userinfo/{id}")
        public String loadSpecificPage (@PathVariable int id, Model model) {
            model.addAttribute("member", sevenElevenRepository.findOne(id));
            return "sevenEleven/userinfo";
        }
        /*@RequestMapping(value = "/thankyou",method = RequestMethod.POST)
        public String getThankyouPage(){
            return "wews";
        }*/
        @RequestMapping(value = "/thankyou",method = RequestMethod.POST)
        public void getResponseinJSON(@ModelAttribute @Valid SevenElevenForm sevenEleven,
                                      Errors errors,
                                      HttpServletResponse response,BindingResult bindingResult){
            try {

                PrintWriter out = response.getWriter();

                JSONObject object = new JSONObject();
                JSONArray list = new JSONArray();

                    if (!errors.hasErrors()) {
                        object.put("field1",sevenEleven.getField1());
                        object.put("message", "success");

                    } else {
                        List<FieldError> errors1 = bindingResult.getFieldErrors();
                       for (FieldError error : errors1) {
                            //list.add(error.getField());
                            //list.add(error.getDefaultMessage());
                            object.put(error.getField(),error.getDefaultMessage());
                        }
                    }
                out.print(object);
                sevenElevenRepository.save(sevenEleven);
                } catch (Exception ex) {
                    ex.toString();
                }
            }
        }
