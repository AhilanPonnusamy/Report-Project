package reports;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class Attendance {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String eventNo;

    private String eventName;

    private String participantName;

    private String company;

    private String topLevelManager;

    private String manager1;

    private String manager2;

    private String manager3;

    private String manager4;

    private String manager5;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEventNo() {
        return eventNo;
    }

    public void setEventNo(String eventNo) {
        this.eventNo = eventNo;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getParticipantName() {
        return participantName;
    }

    public void setParticipantName(String participantName) {
        this.participantName = participantName;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
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