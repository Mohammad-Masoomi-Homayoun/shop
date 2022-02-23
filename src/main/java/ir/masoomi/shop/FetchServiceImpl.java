package ir.masoomi.shop;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
@RequiredArgsConstructor
public class FetchServiceImpl implements FetchService{

    private final Producer producer;
    @Override
    public List<ArticleDto> getAll() {

        ArticleDto articleDto = ArticleDto.of(1l, "New Book", 1, 100);
        producer.pushToTopic(articleDto.toString());
        return Arrays.asList(articleDto);
    }
}
