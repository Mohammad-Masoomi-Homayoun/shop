package ir.masoomi.shop;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class DeviceController {

    private final FetchService fetchService;

    @GetMapping("/all")
    public List<ArticleDto> getAll() {

        return fetchService.getAll();
    }

}
