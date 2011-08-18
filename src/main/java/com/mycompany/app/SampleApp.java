package com.mycompany.app;

import com.mycompany.app.RequestId;
import com.thoughtworks.impersonator.http.record.Recorder;
import com.thoughtworks.impersonator.http.replay.Impersonator;

import java.io.File;

/**
 * Created by IntelliJ IDEA.
 * User: Brett
 * Date: 18/08/11
 * Time: 8:53 PM
 * To change this template use File | Settings | File Templates.
 */
public class SampleApp {

      public static class Mock {

          public static void main(String[] args) {
            new Recorder(9999, "api.technorati.com", 80, new File("C:\\Development\\mavenSample"), new RequestId());
          }
      }

      public static class Listener {
          public static void main(String[] args){
              System.out.println("Entered");
              File f = new File("C:\\Development\\mavenSample");
              new Impersonator(9999, f, new RequestId());
              System.out.println("Exited");
          }
      }
}
