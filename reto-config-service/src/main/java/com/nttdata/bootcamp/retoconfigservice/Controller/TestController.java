package com.nttdata.bootcamp.retoconfigservice.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RefreshScope
public class TestController {
        @Value("${food.food-name}")
        private String foodName;

        @GetMapping("/getFoodName")
        public String myFood() {
            return this.foodName;
        }
}
