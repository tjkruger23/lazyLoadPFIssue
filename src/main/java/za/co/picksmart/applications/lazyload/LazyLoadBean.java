
package za.co.picksmart.applications.lazyload;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;
/**
 *
 * @author Tim
 */

@ManagedBean(name = "lazyLoadBean")
@ViewScoped
public class LazyLoadBean {
    
    private String option;
    private List<String> options;
    
    @PostConstruct
    public void init() {
        options = new ArrayList<>();
    }

    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
    }
    
    //Used Thread.sleep() to allow a delay to simulate data being retrieved from a db, etc.
    public List<String> getOptions() throws InterruptedException {        
        options.add("First");
        options.add("Second");
        options.add("Third");
        Thread.sleep(1000);
        return options;
    }

    public void setOptions(List<String> options) {
        this.options = options;
    }
}
