package com.js.mock.web.services;

import com.js.mock.gsongenerator.factory.GameFactory;
import com.js.mock.web.pojos.HandicapEntity;
import com.js.mock.web.repositorys.HandicapRepository;
import com.js.mock.web.requests.GamePropertyReq;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by root on 2017/3/28.
 */
@RestController
public class HonhiDataCenter {
    @Autowired
    private HandicapRepository handicapRepository;

    @RequestMapping(value = "add",method= RequestMethod.POST)
    public String getConnect(@RequestBody GamePropertyReq gamePropertyReq ) {
//        String jsonString = "[{\"source\":\"pin\",\"game_class\":\"mlb\",\"game_type\":\"full\",\"status\":0,\"event_time\":\"2017-02-27 04:05:00\",\"source_updatetime\":\"636237166869117078\",\"live\":\"false\",\"information\":{\"league\":\"美國職業棒球大聯盟 - 賽季前\",\"home\":{\"rot_id\":0,\"team_name\":\"堪薩斯皇家\",\"pitcher\":\"\"},\"away\":{\"rot_id\":0,\"team_name\":\"德州遊騎兵\",\"pitcher\":\"\"}},\"score\":{\"home\":0,\"away\":0},\"handicap\":{\"zf\":{},\"zf_tw\":{},\"ds\":{},\"ds_tw\":{},\"de\":{\"home\":\"-107\",\"away\":\"-105\"},\"esre\":{}}},{\"source\":\"pin\",\"game_class\":\"mlb\",\"game_type\":\"full\",\"status\":0,\"event_time\":\"2017-02-27 02:05:00\",\"source_updatetime\":\"636237166869117078\",\"live\":\"false\",\"information\":{\"league\":\"美國職業棒球大聯盟 - 賽季前\",\"home\":{\"rot_id\":0,\"team_name\":\"聖路易紅雀\",\"pitcher\":\"\"},\"away\":{\"rot_id\":0,\"team_name\":\"邁阿密馬林魚\",\"pitcher\":\"\"}},\"score\":{\"home\":0,\"away\":0},\"handicap\":{\"zf\":{},\"zf_tw\":{},\"ds\":{},\"ds_tw\":{},\"de\":{\"home\":\"-118\",\"away\":\"105\"},\"esre\":{}}},{\"source\":\"pin\",\"game_class\":\"mlb\",\"game_type\":\"full\",\"status\":0,\"event_time\":\"2017-02-27 02:05:00\",\"source_updatetime\":\"636237166869117078\",\"live\":\"false\",\"information\":{\"league\":\"美國職業棒球大聯盟 - 賽季前\",\"home\":{\"rot_id\":0,\"team_name\":\"明尼蘇達雙城\",\"pitcher\":\"\"},\"away\":{\"rot_id\":0,\"team_name\":\"華盛頓國人\",\"pitcher\":\"\"}},\"score\":{\"home\":0,\"away\":0},\"handicap\":{\"zf\":{},\"zf_tw\":{},\"ds\":{},\"ds_tw\":{},\"de\":{\"home\":\"-105\",\"away\":\"-107\"},\"esre\":{}}},{\"source\":\"pin\",\"game_class\":\"mlb\",\"game_type\":\"full\",\"status\":0,\"event_time\":\"2017-02-27 02:10:00\",\"source_updatetime\":\"636237166869117078\",\"live\":\"false\",\"information\":{\"league\":\"美國職業棒球大聯盟 - 賽季前\",\"home\":{\"rot_id\":0,\"team_name\":\"紐約大都會\",\"pitcher\":\"\"},\"away\":{\"rot_id\":0,\"team_name\":\"底特律老虎\",\"pitcher\":\"\"}},\"score\":{\"home\":0,\"away\":0},\"handicap\":{\"zf\":{},\"zf_tw\":{},\"ds\":{},\"ds_tw\":{},\"de\":{\"home\":\"-125\",\"away\":\"111\"},\"esre\":{}}},{\"source\":\"pin\",\"game_class\":\"mlb\",\"game_type\":\"full\",\"status\":0,\"event_time\":\"2017-02-27 04:05:00\",\"source_updatetime\":\"636237166869117078\",\"live\":\"false\",\"information\":{\"league\":\"美國職業棒球大聯盟 - 賽季前\",\"home\":{\"rot_id\":0,\"team_name\":\"密爾瓦基釀酒人\",\"pitcher\":\"\"},\"away\":{\"rot_id\":0,\"team_name\":\"洛杉磯道奇\",\"pitcher\":\"\"}},\"score\":{\"home\":0,\"away\":0},\"handicap\":{\"zf\":{},\"zf_tw\":{},\"ds\":{},\"ds_tw\":{},\"de\":{\"home\":\"102\",\"away\":\"-115\"},\"esre\":{}}},{\"source\":\"pin\",\"game_class\":\"mlb\",\"game_type\":\"full\",\"status\":0,\"event_time\":\"2017-02-27 04:05:00\",\"source_updatetime\":\"636237166869117078\",\"live\":\"false\",\"information\":{\"league\":\"美國職業棒球大聯盟 - 賽季前\",\"home\":{\"rot_id\":0,\"team_name\":\"芝加哥小熊\",\"pitcher\":\"\"},\"away\":{\"rot_id\":0,\"team_name\":\"克里夫蘭印地安人\",\"pitcher\":\"\"}},\"score\":{\"home\":0,\"away\":0},\"handicap\":{\"zf\":{},\"zf_tw\":{},\"ds\":{},\"ds_tw\":{},\"de\":{\"home\":\"-130\",\"away\":\"116\"},\"esre\":{}}},{\"source\":\"pin\",\"game_class\":\"mlb\",\"game_type\":\"full\",\"status\":0,\"event_time\":\"2017-02-27 02:05:00\",\"source_updatetime\":\"636237166869117078\",\"live\":\"false\",\"information\":{\"league\":\"美國職業棒球大聯盟 - 賽季前\",\"home\":{\"rot_id\":0,\"team_name\":\"阿特蘭大勇士\",\"pitcher\":\"\"},\"away\":{\"rot_id\":0,\"team_name\":\"休士頓太空人\",\"pitcher\":\"\"}},\"score\":{\"home\":0,\"away\":0},\"handicap\":{\"zf\":{},\"zf_tw\":{},\"ds\":{},\"ds_tw\":{},\"de\":{\"home\":\"-120\",\"away\":\"107\"},\"esre\":{}}},{\"source\":\"pin\",\"game_class\":\"mlb\",\"game_type\":\"full\",\"status\":0,\"event_time\":\"2017-02-27 02:05:00\",\"source_updatetime\":\"636237166869117078\",\"live\":\"false\",\"information\":{\"league\":\"美國職業棒球大聯盟 - 賽季前\",\"home\":{\"rot_id\":0,\"team_name\":\"巴爾第摩金鶯\",\"pitcher\":\"\"},\"away\":{\"rot_id\":0,\"team_name\":\"匹茲堡海盜\",\"pitcher\":\"\"}},\"score\":{\"home\":0,\"away\":0},\"handicap\":{\"zf\":{},\"zf_tw\":{},\"ds\":{},\"ds_tw\":{},\"de\":{\"home\":\"-125\",\"away\":\"111\"},\"esre\":{}}},{\"source\":\"pin\",\"game_class\":\"mlb\",\"game_type\":\"full\",\"status\":0,\"event_time\":\"2017-02-27 04:10:00\",\"source_updatetime\":\"636237166869117078\",\"live\":\"false\",\"information\":{\"league\":\"美國職業棒球大聯盟 - 賽季前\",\"home\":{\"rot_id\":0,\"team_name\":\"西雅圖水手\",\"pitcher\":\"\"},\"away\":{\"rot_id\":0,\"team_name\":\"聖地牙哥教士\",\"pitcher\":\"\"}},\"score\":{\"home\":0,\"away\":0},\"handicap\":{\"zf\":{},\"zf_tw\":{},\"ds\":{},\"ds_tw\":{},\"de\":{\"home\":\"-130\",\"away\":\"116\"},\"esre\":{}}},{\"source\":\"pin\",\"game_class\":\"mlb\",\"game_type\":\"full\",\"status\":0,\"event_time\":\"2017-02-27 04:05:00\",\"source_updatetime\":\"636237166869117078\",\"live\":\"false\",\"information\":{\"league\":\"美國職業棒球大聯盟 - 賽季前\",\"home\":{\"rot_id\":0,\"team_name\":\"辛辛那提紅人\",\"pitcher\":\"\"},\"away\":{\"rot_id\":0,\"team_name\":\"舊金山巨人\",\"pitcher\":\"\"}},\"score\":{\"home\":0,\"away\":0},\"handicap\":{\"zf\":{},\"zf_tw\":{},\"ds\":{},\"ds_tw\":{},\"de\":{\"home\":\"-127\",\"away\":\"113\"},\"esre\":{}}},{\"source\":\"pin\",\"game_class\":\"mlb\",\"game_type\":\"full\",\"status\":0,\"event_time\":\"2017-02-27 02:05:00\",\"source_updatetime\":\"636237166869117078\",\"live\":\"false\",\"information\":{\"league\":\"美國職業棒球大聯盟 - 賽季前\",\"home\":{\"rot_id\":0,\"team_name\":\"坦帕灣光芒\",\"pitcher\":\"\"},\"away\":{\"rot_id\":0,\"team_name\":\"波士頓紅襪\",\"pitcher\":\"\"}},\"score\":{\"home\":0,\"away\":0},\"handicap\":{\"zf\":{},\"zf_tw\":{},\"ds\":{},\"ds_tw\":{},\"de\":{\"home\":\"-124\",\"away\":\"110\"},\"esre\":{}}},{\"source\":\"pin\",\"game_class\":\"mlb\",\"game_type\":\"full\",\"status\":0,\"event_time\":\"2017-02-27 04:05:00\",\"source_updatetime\":\"636237166869117078\",\"live\":\"false\",\"information\":{\"league\":\"美國職業棒球大聯盟 - 賽季前\",\"home\":{\"rot_id\":0,\"team_name\":\"奧克蘭運動家\",\"pitcher\":\"\"},\"away\":{\"rot_id\":0,\"team_name\":\"洛杉磯安拿漢\",\"pitcher\":\"\"}},\"score\":{\"home\":0,\"away\":0},\"handicap\":{\"zf\":{},\"zf_tw\":{},\"ds\":{},\"ds_tw\":{},\"de\":{\"home\":\"-116\",\"away\":\"103\"},\"esre\":{}}}]";
        String jsonString ="[{\"source\":\"bet365\",\"game_class\":\"basketball\",\"game_type\":\"full\",\"status\":0,\"event_time\":\"2017-03-29 07:35:00\",\"source_updatetime\":\"2017-03-28 14:58:16\",\"live\":\"false\",\"information\":{\"league\":\"NBA\",\"home\":{\"rot_id\":0,\"team_name\":\"\\u963F\\u7279\\u862D\\u5927\\u9DF9\",\"pitcher\":\"\"},\"away\":{\"rot_id\":0,\"team_name\":\"\\u9CF3\\u51F0\\u57CE\\u592A\\u967D\",\"pitcher\":\"\"}},\"score\":{\"home\":0,\"away\":0},\"handicap\":{\"zf\":{\"A\":{\"home\":{\"line\":\"-8\",\"odds\":\"-111\"},\"away\":{\"line\":\"+8\",\"odds\":\"-111\"}}},\"zf_tw\":{\"home\":{\"line\":\"-8\",\"odds\":\"0.95\"},\"away\":{\"line\":\"+8\",\"odds\":\"0.95\"}},\"ds\":{\"A\":{\"line\":\"215\",\"over\":\"-111\",\"under\":\"-111\"}},\"ds_tw\":{\"line\":\"215\",\"over\":\"0.94\",\"under\":\"0.94\"},\"de\":{\"home\":\"-370\",\"away\":\"280\"},\"esre\":{}}},{\"source\":\"bet365\",\"game_class\":\"basketball\",\"game_type\":\"full\",\"status\":0,\"event_time\":\"2017-03-29 10:35:00\",\"source_updatetime\":\"2017-03-28 14:58:16\",\"live\":\"false\",\"information\":{\"league\":\"NBA\",\"home\":{\"rot_id\":0,\"team_name\":\"\\u6D1B\\u6749\\u78EF\\u6E56\\u4EBA\",\"pitcher\":\"\"},\"away\":{\"rot_id\":0,\"team_name\":\"\\u83EF\\u76DB\\u9813\\u5DEB\\u5E2B\",\"pitcher\":\"\"}},\"score\":{\"home\":0,\"away\":0},\"handicap\":{\"zf\":{\"A\":{\"home\":{\"line\":\"+9\",\"odds\":\"-111\"},\"away\":{\"line\":\"-9\",\"odds\":\"-111\"}}},\"zf_tw\":{\"home\":{\"line\":\"+9\",\"odds\":\"0.95\"},\"away\":{\"line\":\"-9\",\"odds\":\"0.95\"}},\"ds\":{\"A\":{\"line\":\"226.5\",\"over\":\"-111\",\"under\":\"-111\"}},\"ds_tw\":{\"line\":\"226-100\",\"over\":\"0.94\",\"under\":\"0.94\"},\"de\":{\"home\":\"375\",\"away\":\"-500\"},\"esre\":{}}},{\"source\":\"bet365\",\"game_class\":\"basketball\",\"game_type\":\"full\",\"status\":0,\"event_time\":\"2017-03-29 07:05:00\",\"source_updatetime\":\"2017-03-28 14:58:16\",\"live\":\"false\",\"information\":{\"league\":\"NBA\",\"home\":{\"rot_id\":0,\"team_name\":\"\\u590F\\u6D1B\\u7279\\u9EC3\\u8702\",\"pitcher\":\"\"},\"away\":{\"rot_id\":0,\"team_name\":\"\\u5BC6\\u723E\\u74E6\\u57FA\\u516C\\u9E7F\",\"pitcher\":\"\"}},\"score\":{\"home\":0,\"away\":0},\"handicap\":{\"zf\":{\"A\":{\"home\":{\"line\":\"-3\",\"odds\":\"-111\"},\"away\":{\"line\":\"+3\",\"odds\":\"-111\"}}},\"zf_tw\":{\"home\":{\"line\":\"-3\",\"odds\":\"0.95\"},\"away\":{\"line\":\"+3\",\"odds\":\"0.95\"}},\"ds\":{\"A\":{\"line\":\"203\",\"over\":\"-111\",\"under\":\"-111\"}},\"ds_tw\":{\"line\":\"203\",\"over\":\"0.94\",\"under\":\"0.94\"},\"de\":{\"home\":\"-156\",\"away\":\"135\"},\"esre\":{}}},{\"source\":\"bet365\",\"game_class\":\"basketball\",\"game_type\":\"full\",\"status\":0,\"event_time\":\"2017-03-29 07:35:00\",\"source_updatetime\":\"2017-03-28 14:58:16\",\"live\":\"false\",\"information\":{\"league\":\"NBA\",\"home\":{\"rot_id\":0,\"team_name\":\"\\u5E95\\u7279\\u5F8B\\u6D3B\\u585E\",\"pitcher\":\"\"},\"away\":{\"rot_id\":0,\"team_name\":\"\\u9081\\u963F\\u5BC6\\u71B1\\u706B\",\"pitcher\":\"\"}},\"score\":{\"home\":0,\"away\":0},\"handicap\":{\"zf\":{\"A\":{\"home\":{\"line\":\"+2.5\",\"odds\":\"-111\"},\"away\":{\"line\":\"-2.5\",\"odds\":\"-111\"}}},\"zf_tw\":{\"home\":{\"line\":\"+2-100\",\"odds\":\"0.95\"},\"away\":{\"line\":\"-2-100\",\"odds\":\"0.95\"}},\"ds\":{\"A\":{\"line\":\"202\",\"over\":\"-111\",\"under\":\"-111\"}},\"ds_tw\":{\"line\":\"202\",\"over\":\"0.94\",\"under\":\"0.94\"},\"de\":{\"home\":\"115\",\"away\":\"-135\"},\"esre\":{}}},{\"source\":\"bet365\",\"game_class\":\"basketball\",\"game_type\":\"full\",\"status\":0,\"event_time\":\"2017-03-29 08:05:00\",\"source_updatetime\":\"2017-03-28 14:58:16\",\"live\":\"false\",\"information\":{\"league\":\"NBA\",\"home\":{\"rot_id\":0,\"team_name\":\"\\u4F11\\u58EB\\u9813\\u706B\\u7BAD\",\"pitcher\":\"\"},\"away\":{\"rot_id\":0,\"team_name\":\"\\u91D1\\u5DDE\\u52C7\\u58EB\",\"pitcher\":\"\"}},\"score\":{\"home\":0,\"away\":0},\"handicap\":{\"zf\":{\"A\":{\"home\":{\"line\":\"-1.5\",\"odds\":\"-111\"},\"away\":{\"line\":\"+1.5\",\"odds\":\"-111\"}}},\"zf_tw\":{\"home\":{\"line\":\"-1-100\",\"odds\":\"0.95\"},\"away\":{\"line\":\"+1-100\",\"odds\":\"0.95\"}},\"ds\":{\"A\":{\"line\":\"234\",\"over\":\"-111\",\"under\":\"-111\"}},\"ds_tw\":{\"line\":\"234\",\"over\":\"0.94\",\"under\":\"0.94\"},\"de\":{\"home\":\"-131\",\"away\":\"110\"},\"esre\":{\"let\":\"home\",\"home\":\"-111\",\"away\":\"-111\"}}},{\"source\":\"bet365\",\"game_class\":\"basketball\",\"game_type\":\"full\",\"status\":0,\"event_time\":\"2017-03-29 10:05:00\",\"source_updatetime\":\"2017-03-28 14:58:16\",\"live\":\"false\",\"information\":{\"league\":\"NBA\",\"home\":{\"rot_id\":0,\"team_name\":\"\\u6CE2\\u7279\\u862D\\u62D3\\u8352\\u8005\",\"pitcher\":\"\"},\"away\":{\"rot_id\":0,\"team_name\":\"\\u4E39\\u4F5B\\u91D1\\u584A\",\"pitcher\":\"\"}},\"score\":{\"home\":0,\"away\":0},\"handicap\":{\"zf\":{\"A\":{\"home\":{\"line\":\"-2\",\"odds\":\"-111\"},\"away\":{\"line\":\"+2\",\"odds\":\"-111\"}}},\"zf_tw\":{\"home\":{\"line\":\"-2\",\"odds\":\"0.95\"},\"away\":{\"line\":\"+2\",\"odds\":\"0.95\"}},\"ds\":{\"A\":{\"line\":\"226.5\",\"over\":\"-111\",\"under\":\"-111\"}},\"ds_tw\":{\"line\":\"226-100\",\"over\":\"0.94\",\"under\":\"0.94\"},\"de\":{\"home\":\"-135\",\"away\":\"115\"},\"esre\":{}}},{\"source\":\"bet365\",\"game_class\":\"basketball\",\"game_type\":\"full\",\"status\":0,\"event_time\":\"2017-03-29 07:05:00\",\"source_updatetime\":\"2017-03-28 14:58:16\",\"live\":\"false\",\"information\":{\"league\":\"NBA\",\"home\":{\"rot_id\":0,\"team_name\":\"\\u5370\\u7B2C\\u5B89\\u90A3\\u6E9C\\u99AC\",\"pitcher\":\"\"},\"away\":{\"rot_id\":0,\"team_name\":\"\\u660E\\u5C3C\\u8607\\u9054\\u6728\\u72FC\",\"pitcher\":\"\"}},\"score\":{\"home\":0,\"away\":0},\"handicap\":{\"zf\":{\"A\":{\"home\":{\"line\":\"-5\",\"odds\":\"-111\"},\"away\":{\"line\":\"+5\",\"odds\":\"-111\"}}},\"zf_tw\":{\"home\":{\"line\":\"-5\",\"odds\":\"0.95\"},\"away\":{\"line\":\"+5\",\"odds\":\"0.95\"}},\"ds\":{\"A\":{\"line\":\"208\",\"over\":\"-111\",\"under\":\"-111\"}},\"ds_tw\":{\"line\":\"208\",\"over\":\"0.94\",\"under\":\"0.94\"},\"de\":{\"home\":\"-212\",\"away\":\"175\"},\"esre\":{}}},{\"source\":\"bet365\",\"game_class\":\"basketball\",\"game_type\":\"full\",\"status\":0,\"event_time\":\"2017-03-29 07:35:00\",\"source_updatetime\":\"2017-03-28 14:58:16\",\"live\":\"false\",\"information\":{\"league\":\"NBA\",\"home\":{\"rot_id\":0,\"team_name\":\"\\u5E03\\u9B6F\\u514B\\u6797\\u7C43\\u7DB2\",\"pitcher\":\"\"},\"away\":{\"rot_id\":0,\"team_name\":\"\\u8CBB\\u57CE76\\u4EBA\",\"pitcher\":\"\"}},\"score\":{\"home\":0,\"away\":0},\"handicap\":{\"zf\":{\"A\":{\"home\":{\"line\":\"-3\",\"odds\":\"-111\"},\"away\":{\"line\":\"+3\",\"odds\":\"-111\"}}},\"zf_tw\":{\"home\":{\"line\":\"-3\",\"odds\":\"0.95\"},\"away\":{\"line\":\"+3\",\"odds\":\"0.95\"}},\"ds\":{\"A\":{\"line\":\"221\",\"over\":\"-111\",\"under\":\"-111\"}},\"ds_tw\":{\"line\":\"221\",\"over\":\"0.94\",\"under\":\"0.94\"},\"de\":{\"home\":\"-151\",\"away\":\"130\"},\"esre\":{}}}]";
        GameFactory gameFactory1 = new GameFactory().create(jsonString, gamePropertyReq.getGames());
        new Thread(()->{
            while (true) {
                String fulldata = gameFactory1.oddsChanged();
                HandicapEntity handicapEntity=new HandicapEntity();
//                handicapEntity.setId(22);
//                handicapEntity.setSource("pin");
//                handicapEntity.setFullData(fulldata);
//                handicapEntity.setGameClass("basketball");
//                handicapEntity.setGameType("full");
//                handicapEntity.setStatus(0);
                handicapEntity.setId(gamePropertyReq.getHandicapId());
                handicapEntity.setSource(gamePropertyReq.getHandicapSource());
                handicapEntity.setFullData(fulldata);
                handicapEntity.setGameClass(gamePropertyReq.getHadicapGameClass());
                handicapEntity.setGameType(gamePropertyReq.getHandicapGameType());
                handicapEntity.setStatus(gamePropertyReq.getHadicapStatus());
                handicapRepository.save(handicapEntity);
                try {
                    Thread.sleep(gamePropertyReq.getDelaySecond()*1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();


//        HandicapEntity handicapEntity=new HandicapEntity();
//        handicapEntity.setId(21);
//        handicapEntity.setSource("pin");
//        handicapEntity.setFullData("123");
//        handicapEntity.setGameClass("mlb");
//        handicapEntity.setGameType("live full");
//        handicapEntity.setStatus(0);
//        HandicapEntity handicapEntity2=new HandicapEntity();
//        handicapEntity2.setId(20);
//        handicapEntity2.setSource("pin");
//        handicapEntity2.setFullData("223");
//        handicapEntity2.setGameClass("mlb");
//        handicapEntity2.setGameType("1st half");
//        handicapEntity2.setStatus(0);
//        HandicapEntity handicapEntity3=new HandicapEntity();
////        handicapEntity3.setId(20);
//        handicapEntity3.setSource("pin");
//        handicapEntity3.setFullData("223");
//        handicapEntity3.setGameClass("mlb");
//        handicapEntity3.setGameType("1st half");
//        handicapEntity3.setStatus(0);
//        handicapRepository.save(handicapEntity);
//
//        List<HandicapEntity> list=new ArrayList<>();
//        list.add(handicapEntity);
//        list.add(handicapEntity2);
//        list.add(handicapEntity3);
//        handicapRepository.save(list);
//        String x = "";
//        Iterable<HandicapEntity> all = handicapRepository.findAll();
//        Iterator<HandicapEntity> iterator = all.iterator();
//        while (iterator.hasNext()) {
//            x+=iterator.next().getFullData()+",";
//        }
        return "";
    }
}
