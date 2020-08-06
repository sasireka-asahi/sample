$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Feature/login.feature");
formatter.feature({
  "name": "Sign up function successfully",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Sign up E-commerce site.",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user navigates to sign up page",
  "keyword": "Given "
});
formatter.step({
  "name": "I enter email address as \"\u003cemail\u003e\",\"\u003cfirstname\u003e\",\"\u003clastname\u003e\",\"\u003cpassword\u003e\",\"\u003caddress\u003e\",\"\u003cphoneno\u003e\",\"\u003ccity\u003e\",\"\u003cstate\u003e\",\"\u003ccountry\u003e\"",
  "keyword": "When "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "email",
        "firstname",
        "lastname",
        "password",
        "address",
        "phoneno",
        "city",
        "state",
        "country",
        "status"
      ]
    },
    {
      "cells": [
        "sasi223@smail.com",
        "renu1",
        "raj",
        "Asahi@123",
        "ss",
        "1234567890",
        "chennai",
        "Indiana",
        "United States",
        "Created successfully"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Sign up E-commerce site.",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user navigates to sign up page",
  "keyword": "Given "
});
formatter.match({
  "location": "Signup.user_navigates_to_Landing_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter email address as \"sasi223@smail.com\",\"renu1\",\"raj\",\"Asahi@123\",\"ss\",\"1234567890\",\"chennai\",\"Indiana\",\"United States\"",
  "keyword": "When "
});
formatter.match({
  "location": "Signup.i_enter(String,String,String,String,String,String,String,String,String)"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//*[@id\u003d\u0027email_create\u0027]\"}\n  (Session info: chrome\u003d84.0.4147.105)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:25:48\u0027\nSystem info: host: \u0027USER-PC\u0027, ip: \u0027192.168.1.11\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027x86\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_121\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 84.0.4147.105, chrome: {chromedriverVersion: 84.0.4147.30 (48b3e868b4cc0..., userDataDir: C:\\Users\\user\\AppData\\Local...}, goog:chromeOptions: {debuggerAddress: localhost:55780}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: ac3d09fac7b596cb73d1b29d0a3cdf3e\n*** Element info: {Using\u003dxpath, value\u003d//*[@id\u003d\u0027email_create\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy13.sendKeys(Unknown Source)\r\n\tat stepdefn.Baseclass.insertValues(Baseclass.java:27)\r\n\tat stepdefn.Signup.i_enter(Signup.java:27)\r\n\tat ✽.I enter email address as \"sasi223@smail.com\",\"renu1\",\"raj\",\"Asahi@123\",\"ss\",\"1234567890\",\"chennai\",\"Indiana\",\"United States\"(Feature/login.feature:4)\r\n",
  "status": "failed"
});
});