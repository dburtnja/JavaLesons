package net.denys.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class CollectionInjection {
    private List        documentList;
    private Set         documentSet;
    private Map         documentMap;
    private Properties  documentProperties;

    public void setDocumentList(List documentList) {
        this.documentList = documentList;
    }

    public void setDocumentSet(Set documentSet) {
        this.documentSet = documentSet;
    }

    public void setDocumentMap(Map documentMap) {
        this.documentMap = documentMap;
    }

    public void setDocumentProperties(Properties documentProperties) {
        this.documentProperties = documentProperties;
    }

    public List getDocumentList() {
        System.out.println("Get List " + documentList);
        return documentList;
    }

    public Set getDocumentSet() {
        System.out.println("Get Set " + documentSet);
        return documentSet;
    }

    public Map getDocumentMap() {
        System.out.println("Get Map " + documentMap);
        return documentMap;
    }

    public Properties getDocumentProperties() {
        System.out.println("Get Properties " + documentProperties);
        return documentProperties;
    }
}
