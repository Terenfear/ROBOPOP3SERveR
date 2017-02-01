package com.company;

/**
 * Created by ZloiY on 01-Feb-17.
 */
public class POP3Message implements POP3Defines{
    private String m_szMessagePath;
    private int m_nStatus;
    private int m_dwSize;

    public POP3Message(){}

    public POP3Message(int nStatus, int nSize, String szMessagepath){
        m_nStatus = nStatus;
        m_dwSize = nSize;
        m_szMessagePath = szMessagepath;
    }
    public void SetParams(int nStatus, int nSize, String szMessagePath){
        m_nStatus = nStatus;
        m_dwSize = nSize;
        m_szMessagePath = szMessagePath;
    }
    public void SetParams(POP3Message message){
        m_nStatus = message.getStatus();
        m_dwSize = message.getSize();
        m_szMessagePath = message.getPath();
    }
    public int getStatus(){return m_nStatus;}
    public int getSize(){return m_dwSize;}
    public String getPath(){return m_szMessagePath;}
}