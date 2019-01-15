package io.xream.x7;

import io.xream.x7.demo.Cat;
import x7.core.web.IdView;

import java.util.List;
import java.util.Map;

public class PetVo implements IdView {

    private Cat cat;
    private List<Cat> catList;

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public List<Cat> getCatList() {
        return catList;
    }

    public void setCatList(List<Cat> catList) {
        this.catList = catList;
    }

    public void render(Map<Object,Object> viewMap){
        cat.render(viewMap);
        if (catList != null){
            for (Cat c : catList) {
                c.render(viewMap);
            }
        }
    }
}
