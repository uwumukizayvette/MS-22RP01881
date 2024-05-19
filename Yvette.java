package sms.pkg22rp01881;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Yvette extends javax.swing.JFrame {

    ArrayList<Integer> marks = new ArrayList<Integer>();


    public Yvette() {
        initComponents();
    }
    // Function to determine if a string is a valid integer

    public static boolean isNumber(String num) {

        try {
            // Attempt to parse the string as an integer
            Integer.parseInt(num);
            return true;  // If no exception is thrown, it's a valid
        } catch (NumberFormatException e) {
            return false;// If an exception is caught, it's not a valid integer
        }

    }

 


    

    public static boolean CheckRange(ArrayList<Integer> marks) {
        int i;

        boolean flag = true;

        int value;

        for (i = 0; i < marks.size(); i++) {
            value = marks.get(i);

            // If any mark is not in the range of 0 to 100, set flag to false and break the loop
            if (!((value >= 0 && value <= 100))) {
                flag = false;
                break;
            }

        }

        return flag;
    }
    
    public static ArrayList<String> getMaxStudent(ArrayList<ArrayList<String>> studentList, int max){
        
        
        ArrayList<String> StudentWithHighAvg = null;
        
        for(ArrayList<String> currentRow : studentList){
            
            if(Integer.parseInt(currentRow.get(2))== max){
                    StudentWithHighAvg = currentRow;
//                StudentWithHighAvg = new Student(currentRow.get(0),currentRow.get(1),currentRow.get(2) );
             
            } 
            
//            int i;
//            for(i=0;i<currentRow.size();i++){
//                 
//              if(currentRow.get(i) == )
//            }
            
        }
        
        return StudentWithHighAvg;
        
    }

    // Initializing GUI components
    // Setting properties for jPanel1,JTextfield,JButton
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("School Management System");

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setText("Reg Number:");

        jLabel12.setBackground(new java.awt.Color(0, 0, 0));
        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setText("PHP Marks:");

        jLabel13.setBackground(new java.awt.Color(0, 0, 0));
        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setText("Java Marks:");

        jLabel14.setBackground(new java.awt.Color(0, 0, 0));
        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setText("Name: ");

        jLabel15.setBackground(new java.awt.Color(0, 0, 0));
        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel15.setText("Math Marks:");

        jTextField2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));

        jTextField3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));

        jTextField4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jTextField5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));

        jTextField6.setToolTipText("");
        jTextField6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));

        jButton3.setBackground(new java.awt.Color(0, 204, 51));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("ADD STUDENT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(204, 0, 0));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("EXIT");
        jButton4.setActionCommand("");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Reg Number", "Average Marks"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel15)
                    .addComponent(jLabel11)
                    .addComponent(jLabel14)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
                    .addComponent(jTextField4)
                    .addComponent(jTextField6)
                    .addComponent(jTextField5)
                    .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(23, 23, 23))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:

    // TODO add your handling code here:

    // Retrieve values from text fields
    String Name = jTextField2.getText();
    String regno = jTextField4.getText();
    String math = jTextField6.getText();
    String java = jTextField5.getText();
    String php = jTextField3.getText();

    if (math.isEmpty() || java.isEmpty() || php.isEmpty() || Name.isEmpty() || regno.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Please Fill in all inputs");

    } else if (!isNumber(jTextField6.getText()) || !isNumber(jTextField5.getText()) || !isNumber(jTextField3.getText())) {
        JOptionPane.showMessageDialog(null, "Please enter valid numeric values for marks.");
    } else if (!CheckRange(marks)) {
        JOptionPane.showMessageDialog(null, "Marks should be between 0 and 100");
    } else {

        // Parse the marks from strings to integers
        int mathInt = Integer.parseInt(math);
        int phpInt = Integer.parseInt(php);
        int javaInt = Integer.parseInt(java);
        int avg;

        ArrayList<Integer> marks = new ArrayList<Integer>();
        // adding marks values in the marks arrayList

        marks.add(mathInt);
        marks.add(phpInt);
        marks.add(javaInt);
        
        if (!CheckRange(marks)) {
        JOptionPane.showMessageDialog(null, "Marks should be between 0 and 100");
    
    }
        else{
            
            
              
//           System.out.println("size of 1d array now : "+marks.size());
        System.out.println("Raw marks: "+marks.toString());

        avg = Student.getAverageMarks(marks);

        // Create a new student object    
        Student student = new Student(Name, regno, avg);

        // Add the new student to the table
        DefaultTableModel tableModel = (DefaultTableModel) jTable2.getModel();
        Object[] newRow = {student.name, student.regno, student.averageMarks};
        tableModel.addRow(newRow);

        // Add the new student to the allStudents ArrayList
        
        
        
     
        


    ArrayList<String> list;

ArrayList<ArrayList<String>> stList = new ArrayList<>();
ArrayList<Integer> stMarks =  new ArrayList<Integer>();

int i;
for(i=0;i<jTable2.getRowCount();i++){

   list = new  ArrayList<String>(); // to avoid to expand the existing ArrayList so that it can stand as a new ArrayList.
   
   stMarks.add((Integer)jTable2.getValueAt(i, 2));
    
    list.add(jTable2.getValueAt(i, 0).toString());
        list.add(jTable2.getValueAt(i, 1).toString() );
        list.add(jTable2.getValueAt(i, 2).toString() );
        stList.add(list);
}

//System.out.println("Display list 1-d : "+list.toString());
System.out.println("Display list 2-d : "+stList.toString());

         int max = Collections.max(stMarks);
         System.out.println("The max values is : "+max);

         
 ArrayList<String> st = getMaxStudent(stList,max);
 
 
// JOptionPane.showMessageDialog(null,"Student with High avg is : "+st.get(0)+" avg : "+st.get(2));

// get numbers of  rows in the table
int rowsNum = tableModel.getRowCount();
int counterRow;
int HighestIndexRow=0;

int highestAvg = Integer.parseInt(tableModel.getValueAt(0, 2).toString());


for(counterRow=0;counterRow<rowsNum;counterRow++){
    
    int currentAvg = Integer.parseInt(tableModel.getValueAt(counterRow, 2).toString());
    System.out.println("Current Index row!!!: "+counterRow);
    if(currentAvg > highestAvg){
        
       highestAvg = currentAvg;

       HighestIndexRow = counterRow;
       
    }
    
    
}

System.out.println("Current Highest row index : "+HighestIndexRow);
selectHighStudent(HighestIndexRow);





 
 
 
 
      System.out.println("FINAL RAW marks: "+marks.toString());
            
            
        }
      

    }


    }//GEN-LAST:event_jButton3ActionPerformed
    // Action performed when the "EXIT" button is clicked
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        System.exit(0); //Exit the application
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Yvette().setVisible(true);
            }
        });
    }
    
    public  void selectHighStudent(int HighrowIndex){
        
       
      jTable2.clearSelection();
      jTable2.setRowSelectionInterval(HighrowIndex, HighrowIndex);
      jTable2.setSelectionBackground(Color.green);

      
        
        
        
        
    }

    // illustration of encapsulation
    public class Student {

        private static String name;
        private static String regno;
        public static int averageMarks;
        // Constructor for the Student class

        public Student(String name, String regno, int averageMarks) {
            this.name = name;
            this.regno = regno;
            this.averageMarks = averageMarks;
        }
        // Getter for the name

        public String getName() {
            return name;
        }
        // Getter for the registration number

        public String getRegNo() {

            return regno;
        }
        // Method to calculate the average marks

        public static int getAverageMarks(ArrayList<Integer> marks) {
            
           averageMarks  = 0;
           
            for (int num : marks) {
                averageMarks += num;
            }

            return averageMarks / marks.size();
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
