package prafinal

import org.grails.jaxrs.provider.DomainObjectNotFoundException

class CarteraResourceService {
    
    static create(Cartera dto) {
        dto.save()
    }

    def read(def id) {
        def obj = Cartera.get(id)
        if (!obj) {
            throw new DomainObjectNotFoundException(Cartera.class, id)
        }
        obj
    }
    
    static readAll() {
        Cartera.findAll()
    }
    
    def update(Cartera dto) {
        def obj = Cartera.get(dto.id)
        if (!obj) {
            throw new DomainObjectNotFoundException(Cartera.class, dto.id)
        }
        obj.properties = dto.properties 
        obj
    }
    
    void delete(def id) {
        def obj = Cartera.get(id)
        if (obj) { 
            obj.delete()
        }
    }
    
}

