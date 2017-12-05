package com.bofaonline.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bofa")
public class BofaOnlineController {

  private static final Logger log = LoggerFactory.getLogger(BofaOnlineController.class);
  
  @RequestMapping(path = "/deposit", method = RequestMethod.GET)
  public String depositAmount() {
    log.info("Inside depositAmount method.");
    log.info("Exiting depositAmount method.");
    return "deposit success";
  }
  
  @RequestMapping(path = "/withdraw", method = RequestMethod.GET)
  public String withdrawAmount() {
    log.info("Inside withdrawAmount method.");
    log.info("Exiting withdrawAmount method.");
    return "withdraw success";
  }
}
