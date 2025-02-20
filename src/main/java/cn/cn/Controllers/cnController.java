package cn.cn.Controllers;

import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import cn.cn.DTOs.cardInfo;

@RestController
public class cnController {
    
    @PostMapping("/apiScore")
    public ResponseEntity<Map<String, String>> cnRes(@RequestBody cardInfo ci)
    {
        String              cnumber = ci.getCardNumber();
        Map<String, String> map = new HashMap<>();
        
        map.put("5766893400014444", "005");
        map.put("5766893400014305", "075");
        map.put("5766893400014761", "100");

        if (map.get(cnumber) == null)
            return ResponseEntity.notFound().build();
        
        Map<String, String> response = new HashMap<>();
        response.put("score", map.get(cnumber));
        return ResponseEntity.ok(response);
    }
}
