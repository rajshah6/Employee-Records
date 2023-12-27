/*
 * Name: Raj Shah
 * Date: Aug 9, 2023
 * Course: ICS4UE
 * Description: This program will take an employee's name, id, salary, and the 
 * start date and put them in a list. All the employees can be listed, and an 
 * employee can be removed using their ID. 
 */

import java.util.ArrayList;

class Employee {
    // instance variables
    int employeeIdNumber;
    String firstName;
    String lastName;
    double annualSalary;
    String startDate;
    
    // getter methods
    public int getEmployeeId() {
        return employeeIdNumber;
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public double getAnnualSalary() {
        return annualSalary;
    }
    
    public String getDate() {
        return startDate;
    }
    
    // setter methods
    public void setEmployeeID(int employeeIdNumber) {
       this.employeeIdNumber = employeeIdNumber;
   }
    
    public void setFirstName(String firstName) {
       this.firstName = firstName;
   }
    
    public void setLastName(String lastName) {
       this.lastName = lastName;
   }
    
    public void setAnnualSalary(double annualSalary) {
       this.annualSalary = annualSalary;
   }
    
    public void setStartDate(String startDate) {
       this.startDate = startDate;
   }
    
    // constructor method
    public Employee(int employeeIdNumber, String firstName, String lastName, double annualSalary, String startDate) {
        // initialize instance variables which will change based on the object
        this.employeeIdNumber = employeeIdNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.annualSalary = annualSalary;
        this.startDate = startDate;
    }
    
    // Overriding toString() method
    @Override
    public String toString() {
        return "ID #: " + employeeIdNumber + "\nName: " + firstName + " " + lastName + "\nSalary: $" + annualSalary + "\nStart Date (dd/mm/yyyy): " + startDate + "\n----------------------------------------------\n";
    }
}

public class U2A2 extends javax.swing.JFrame {
    
    public U2A2() {
        initComponents();
    }

        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        userId = new javax.swing.JTextField();
        userFirstName = new javax.swing.JTextField();
        userLastName = new javax.swing.JTextField();
        userAnnualSalary = new javax.swing.JTextField();
        userStartDate = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        addBtn = new javax.swing.JButton();
        removeBtn = new javax.swing.JButton();
        listBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtBox = new javax.swing.JTextArea();
        msgBox = new javax.swing.JTextField();
        exitBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Employee Records");

        jLabel1.setFont(new java.awt.Font("Hiragino Sans GB", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 153));
        jLabel1.setText("Employee Records");

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel2.setText("ID #:");

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel3.setText("First Name:");

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel4.setText("Last Name:");

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel5.setText("Annual Salary:");

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel6.setText("Start Date (dd/mm/yyyy):");

        userId.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N

        userFirstName.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N

        userLastName.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N

        userAnnualSalary.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N

        userStartDate.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel7.setText("Enter an ID# and press Remove");

        jLabel8.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel8.setText("to delete an Employee's Records.");

        addBtn.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        addBtn.setText("Add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        removeBtn.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        removeBtn.setText("Remove");
        removeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeBtnActionPerformed(evt);
            }
        });

        listBtn.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        listBtn.setText("List");
        listBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listBtnActionPerformed(evt);
            }
        });

        txtBox.setEditable(false);
        txtBox.setColumns(20);
        txtBox.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        txtBox.setRows(5);
        jScrollPane1.setViewportView(txtBox);

        msgBox.setEditable(false);
        msgBox.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        msgBox.setForeground(new java.awt.Color(0, 51, 153));
        msgBox.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        exitBtn.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        exitBtn.setText("Exit");
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(129, 129, 129)
                                        .addComponent(userLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel2))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(userId, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(userFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel8)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(167, 167, 167)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(removeBtn)
                                            .addComponent(addBtn)
                                            .addComponent(listBtn)
                                            .addComponent(exitBtn))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(userAnnualSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)
                                        .addComponent(userStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(295, 295, 295)
                        .addComponent(jLabel1)))
                .addGap(52, 52, 52))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(msgBox)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 791, Short.MAX_VALUE))
                .addGap(66, 66, 66))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(userId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(userFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(addBtn)))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(userLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(removeBtn))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(userAnnualSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listBtn))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(userStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exitBtn))
                .addGap(39, 39, 39)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(msgBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // initialize empty array of type Employee
    ArrayList<Employee> employees = new ArrayList<>();
    
    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        
        String input1 = userId.getText(); // get user input, this will be converted into an integer later
        String firstName = userFirstName.getText(); // get user input
        String lastName = userLastName.getText(); // get user input
        String input2 = userAnnualSalary.getText(); // get user input, this will be converted into a double later
        String startDate = userStartDate.getText(); // get user input
        
        if (input1.equals("")) { // check for empty text
            msgBox.setText("You must enter an ID");
            return; // exit the method
        }
       
        else if (firstName.equals("")) { // check for empty text
            msgBox.setText("You must enter a first name");
            return; // exit the method
        }
        
        else if (lastName.equals("")) { // check for empty text
            msgBox.setText("You must enter a last name");
            return; // exit the method
        }
        
        else if (input2.equals("")) { // check for empty text
            msgBox.setText("You must enter a salary");
            return; // exit the method
        }
        
        else if (startDate.equals("")) { // check for empty text
            msgBox.setText("You must enter a date");
            return; // exit the method
        }
        
        try { // check for correct user input
            int employeeIdNumber = Integer.parseInt(input1); // convert to int
            double annualSalary = Double.parseDouble(input2); // convert to double
            
            // check if id already exists
            for (int i = 0; i < employees.size(); i++) { // iterate through array
                Employee employee = employees.get(i); // get each value of type Employee from the array 
                
                if (employee.getEmployeeId() == employeeIdNumber) { // use getter to obtain employee id and check if id is in the array
                    msgBox.setText("Employee ID already exists");
                    return; // exit the method
                } 
            }
            
            // add employee to array with Employee class
            employees.add(new Employee(employeeIdNumber, firstName, lastName, annualSalary, startDate));
            msgBox.setText("Employee Added");

        } catch (Exception e) {
            msgBox.setText("Incorrect Input"); // inform user about incorrect input
        }
          
    }//GEN-LAST:event_addBtnActionPerformed

    private void removeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeBtnActionPerformed

        String input1 = userId.getText(); // get user input, this will be converted into an integer later

        try { // check for correct user input
            int employeeIdNumber = Integer.parseInt(input1); // convert to int
            
            // check if id exists
            for (int i = 0; i < employees.size(); i++) { // iterate through array
                Employee employee = employees.get(i); // get each value of type Employee from the array 
                
                if (employee.getEmployeeId() == employeeIdNumber) { // use getter to obtain employee id and check if id is in the array
                    employees.remove(i); // remove employee from array at the index
                    msgBox.setText("Employee Removed");
                    return; // exit the method
                } 
            }
            
            // otherwise, if no match was found, inform the user
            msgBox.setText("Employee ID does not exist");

        } catch (Exception e) {
            msgBox.setText("Incorrect Input"); // inform user about incorrect input
        }
    }//GEN-LAST:event_removeBtnActionPerformed

    private void listBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listBtnActionPerformed

        txtBox.setText(""); // reset text area
        
        for (int i = 0; i < employees.size(); i++) { // iterate through array
            String employee = String.valueOf(employees.get(i)); // convert to string
            txtBox.append(employee + "\n"); // add to text box
        
        }
    }//GEN-LAST:event_listBtnActionPerformed

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed

        System.exit(0); // exit the application
    }//GEN-LAST:event_exitBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(U2A2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(U2A2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(U2A2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(U2A2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new U2A2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton exitBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton listBtn;
    private javax.swing.JTextField msgBox;
    private javax.swing.JButton removeBtn;
    private javax.swing.JTextArea txtBox;
    private javax.swing.JTextField userAnnualSalary;
    private javax.swing.JTextField userFirstName;
    private javax.swing.JTextField userId;
    private javax.swing.JTextField userLastName;
    private javax.swing.JTextField userStartDate;
    // End of variables declaration//GEN-END:variables
}
