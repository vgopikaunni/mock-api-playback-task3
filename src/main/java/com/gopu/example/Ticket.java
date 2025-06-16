package com.gopu.example;

public class Ticket {
    private int ticketId;
    private String issueType;
    private String description;

    public Ticket() {}

    public Ticket(int ticketId, String issueType, String description) {
        this.ticketId = ticketId;
        this.issueType = issueType;
        this.description = description;
    }

    public int getTicketId() { return ticketId; }
    public String getIssueType() { return issueType; }
    public String getDescription() { return description; }

    public void setTicketId(int ticketId) { this.ticketId = ticketId; }
    public void setIssueType(String issueType) { this.issueType = issueType; }
    public void setDescription(String description) { this.description = description; }
}
