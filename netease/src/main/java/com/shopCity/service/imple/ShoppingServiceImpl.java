package com.shopCity.service.imple;

import com.shopCity.dto.IndexCategory;
import com.shopCity.service.ShoppingService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ShoppingServiceImpl implements ShoppingService {


    @Override
    public List<IndexCategory> queryIndexCategoryList() {
        ArrayList<IndexCategory> list = new ArrayList<>();
        IndexCategory indexCategory = new IndexCategory();
        indexCategory.setId("1");
        indexCategory.setName("严选推荐");
        list.add(indexCategory);
         indexCategory = new IndexCategory();
        indexCategory.setId("2");
        indexCategory.setName("衣服鞋帽");
        list.add(indexCategory);
        indexCategory.setId("3");
        indexCategory.setName("面奶粮油");
        list.add(indexCategory);
        indexCategory = new IndexCategory();
        indexCategory.setId("4");
        indexCategory.setName("生活家居");
        list.add(indexCategory);
        indexCategory = new IndexCategory();
        indexCategory.setId("5");
        indexCategory.setName("宠物用品");
        list.add(indexCategory);
        indexCategory = new IndexCategory();
        indexCategory = new IndexCategory();
        indexCategory.setId("6");
        indexCategory.setName("男人用品");
        list.add(indexCategory);
        return list;
    }
}
