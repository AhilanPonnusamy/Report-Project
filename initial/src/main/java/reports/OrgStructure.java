package reports;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class OrgStructure {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private String uniqueId;

    private String name;

    private String reportsTo;

    private String lineDetail1;

    private String lineDetail2;

    private String orgName;

    private String topLevelManager;

    private String manager1;

    private String manager2;

    private String manager3;

    private String manager4;

    private String manager5;


    public String getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReportsTo() {
        return reportsTo;
    }

    public void setReportsTo(String reportsTo) {
        this.reportsTo = reportsTo;
    }

    public String getLineDetail1() {
        return lineDetail1;
    }

    public void setLineDetail1(String lineDetail1) {
        this.lineDetail1 = lineDetail1;
    }

    public String getLineDetail2() {
        return lineDetail2;
    }

    public void setLineDetail2(String lineDetail2) {
        this.lineDetail2 = lineDetail2;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getTopLevelManager() {
        return topLevelManager;
    }

    public void setTopLevelManager(String topLevelManager) {
        this.topLevelManager = topLevelManager;
    }

    public String getManager1() {
        return manager1;
    }

    public void setManager1(String manager1) {
        this.manager1 = manager1;
    }

    public String getManager2() {
        return manager2;
    }

    public void setManager2(String manager2) {
        this.manager2 = manager2;
    }

    public String getManager3() {
        return manager3;
    }

    public void setManager3(String manager3) {
        this.manager3 = manager3;
    }

    public String getManager4() {
        return manager4;
    }

    public void setManager4(String manager4) {
        this.manager4 = manager4;
    }

    public String getManager5() {
        return manager5;
    }

    public void setManager5(String manager5) {
        this.manager5 = manager5;
    }
}