/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package katasmain;

import java.sql.*;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import java.util.Vector;
import java.util.*;
import net.proteanit.sql.DbUtils;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.table.*;
import javax.swing.RowFilter;

/**
 *
 * @author jxseff
 */
public class User {
    private int containerID;
    private String customerName;
    private String customerAddress;
    private String orderStatus;
    
    public User(int ID, String Name, String Address, String OrderStatus){
        this.containerID = ID;
        this.customerName = Name;
        this.customerAddress = Address;
        this.orderStatus = OrderStatus;
    }
    
    public int getcontainerID(){
        return containerID;
    }
    
    public String getcustomerName(){
        return customerName;
    }
    
    public String getcustomerAddress(){
        return customerAddress;
    }
    
    public String getorderStatus(){
        return orderStatus;
    }


}
