package org.bee.webBee.handler;

import org.bee.webBee.BeeResult;

import java.util.Map;

/**
 * @author wangtonghe
 * @date 2017/5/3 21:47
 */
public class ConsoleHandler implements Handler {
    @Override
    public void handle(BeeResult beeResult) {

       for(Map.Entry<String,String> entry:beeResult.getResult().entrySet() ){
           System.out.println(entry.getKey()+":\t"+entry.getValue());
       }

    }
}