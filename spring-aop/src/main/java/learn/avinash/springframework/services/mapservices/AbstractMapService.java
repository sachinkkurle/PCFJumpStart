package learn.avinash.springframework.services.mapservices;

import java.util.*;

import learn.avinash.springframework.domain.DomainObject;

/**
 * Created by jt on 11/14/15.
 */
public abstract class AbstractMapService  {
    protected Map<Integer, DomainObject> domainMap;

    public AbstractMapService() {
        domainMap = new HashMap<>();
    }

    public List<DomainObject> listAll() {
        return new ArrayList<>(domainMap.values());
    }

    public DomainObject getById(Integer id) {
        return domainMap.get(id);
    }

    public DomainObject saveOrUpdate(DomainObject domainObject) {
        if (domainObject != null){

            if (domainObject.getId() == null){
                domainObject.setId(getNextKey());
            }
            domainMap.put(domainObject.getId(), domainObject);

            return domainObject;
        } else {
            throw new RuntimeException("Object Can't be null");
        }
    }

    public void delete(Integer id) {
        domainMap.remove(id);
    }

    private Integer getNextKey(){
        return Collections.max(domainMap.keySet()) + 1;
    }

}
