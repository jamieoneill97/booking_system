package coursemanager;

import java.text.ParseException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import twitter4j.TwitterException;

//@author JamieOneill
//CourseManagementSysGUI
public class CourseManagementSysGUI extends javax.swing.JFrame {

    public CourseManagementSysGUI() {
        initComponents();
        myOwnSetup();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        overallPanel = new javax.swing.JTabbedPane();
        systemPanel = new javax.swing.JPanel();
        loadDataButton = new javax.swing.JButton();
        coursePanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        courseListOnCoursePanel = new javax.swing.JList<String>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        courseRunListOnCoursePanel = new javax.swing.JList<String>();
        addCourseButton = new javax.swing.JButton();
        addCourseRunButton = new javax.swing.JButton();
        refreshCourseListButton = new javax.swing.JButton();
        refreshCouseRunListButton = new javax.swing.JButton();
        bookingPanel = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        courseRunListonBookingPanel = new javax.swing.JList<String>();
        adddBookingButton = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        refreshCourseRunButtonBookingPanel = new javax.swing.JButton();
        refreshAllBookingsButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        bookingTextArea = new javax.swing.JTextArea();
        marketPanel = new javax.swing.JPanel();
        checkMarketInfoButton = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        marketInfoTextArea = new javax.swing.JTextArea();
        rankCourseCoursesButton = new javax.swing.JButton();
        setupTwitterButton = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bumble Learning");

        loadDataButton.setText("Load specified test data");
        loadDataButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadDataButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout systemPanelLayout = new javax.swing.GroupLayout(systemPanel);
        systemPanel.setLayout(systemPanelLayout);
        systemPanelLayout.setHorizontalGroup(
            systemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(systemPanelLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(loadDataButton)
                .addContainerGap(432, Short.MAX_VALUE))
        );
        systemPanelLayout.setVerticalGroup(
            systemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(systemPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(loadDataButton)
                .addContainerGap(226, Short.MAX_VALUE))
        );

        overallPanel.addTab("System Admin", systemPanel);

        jScrollPane1.setViewportView(courseListOnCoursePanel);

        jLabel2.setText("List of courses");

        jLabel3.setText("List of Course Run");

        jScrollPane2.setViewportView(courseRunListOnCoursePanel);

        addCourseButton.setText("AddCourse");
        addCourseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCourseButtonActionPerformed(evt);
            }
        });

        addCourseRunButton.setText("Select a course and add a course run");
        addCourseRunButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCourseRunButtonActionPerformed(evt);
            }
        });

        refreshCourseListButton.setText("Refresh List of Courses");
        refreshCourseListButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshCourseListButtonActionPerformed(evt);
            }
        });

        refreshCouseRunListButton.setText("Refresh List of Course Runs");
        refreshCouseRunListButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshCouseRunListButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout coursePanelLayout = new javax.swing.GroupLayout(coursePanel);
        coursePanel.setLayout(coursePanelLayout);
        coursePanelLayout.setHorizontalGroup(
            coursePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(coursePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(coursePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(coursePanelLayout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addGroup(coursePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addCourseRunButton)
                            .addComponent(refreshCouseRunListButton)))
                    .addGroup(coursePanelLayout.createSequentialGroup()
                        .addGroup(coursePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(coursePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(refreshCourseListButton)
                    .addComponent(addCourseButton))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        coursePanelLayout.setVerticalGroup(
            coursePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(coursePanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(coursePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(coursePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addGap(18, 18, 18)
                .addGroup(coursePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addCourseButton)
                    .addComponent(addCourseRunButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(coursePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(refreshCourseListButton)
                    .addComponent(refreshCouseRunListButton))
                .addContainerGap())
        );

        overallPanel.addTab("Course Management", coursePanel);

        jLabel7.setText("List of Course Runs");

        jScrollPane6.setViewportView(courseRunListonBookingPanel);

        adddBookingButton.setText("2. select a course run to add a booking");
        adddBookingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adddBookingButtonActionPerformed(evt);
            }
        });

        jLabel11.setText("All Bookings");

        refreshCourseRunButtonBookingPanel.setText("1. Refresh list of course run");
        refreshCourseRunButtonBookingPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshCourseRunButtonBookingPanelActionPerformed(evt);
            }
        });

        refreshAllBookingsButton.setText("3. Refresh all bookings");
        refreshAllBookingsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshAllBookingsButtonActionPerformed(evt);
            }
        });

        bookingTextArea.setColumns(20);
        bookingTextArea.setRows(5);
        jScrollPane3.setViewportView(bookingTextArea);

        javax.swing.GroupLayout bookingPanelLayout = new javax.swing.GroupLayout(bookingPanel);
        bookingPanel.setLayout(bookingPanelLayout);
        bookingPanelLayout.setHorizontalGroup(
            bookingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookingPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bookingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bookingPanelLayout.createSequentialGroup()
                        .addGroup(bookingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(bookingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(bookingPanelLayout.createSequentialGroup()
                        .addComponent(refreshCourseRunButtonBookingPanel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(adddBookingButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(refreshAllBookingsButton)
                        .addGap(27, 27, 27))))
        );
        bookingPanelLayout.setVerticalGroup(
            bookingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookingPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bookingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(bookingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                    .addComponent(jScrollPane3))
                .addGap(18, 18, 18)
                .addGroup(bookingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(refreshCourseRunButtonBookingPanel)
                    .addComponent(adddBookingButton)
                    .addComponent(refreshAllBookingsButton))
                .addContainerGap())
        );

        overallPanel.addTab(" Booking Panel", bookingPanel);

        checkMarketInfoButton.setText("Check Market Info");
        checkMarketInfoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkMarketInfoButtonActionPerformed(evt);
            }
        });

        marketInfoTextArea.setColumns(20);
        marketInfoTextArea.setRows(5);
        jScrollPane4.setViewportView(marketInfoTextArea);

        rankCourseCoursesButton.setText("rank courses by booking");
        rankCourseCoursesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rankCourseCoursesButtonActionPerformed(evt);
            }
        });

        setupTwitterButton.setText("Setup twitter app");
        setupTwitterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setupTwitterButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout marketPanelLayout = new javax.swing.GroupLayout(marketPanel);
        marketPanel.setLayout(marketPanelLayout);
        marketPanelLayout.setHorizontalGroup(
            marketPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(marketPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(marketPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(marketPanelLayout.createSequentialGroup()
                        .addComponent(rankCourseCoursesButton)
                        .addGap(49, 49, 49)
                        .addComponent(setupTwitterButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkMarketInfoButton)
                        .addGap(0, 154, Short.MAX_VALUE))
                    .addComponent(jScrollPane4))
                .addContainerGap())
        );
        marketPanelLayout.setVerticalGroup(
            marketPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(marketPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(marketPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(setupTwitterButton)
                    .addComponent(checkMarketInfoButton)
                    .addComponent(rankCourseCoursesButton))
                .addGap(4, 4, 4)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                .addContainerGap())
        );

        overallPanel.addTab("Market Assessment", marketPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(overallPanel)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(overallPanel)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loadDataButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadDataButtonActionPerformed
        Scanner scancourses = new Scanner(
                CourseManagementSysGUI.class.getResourceAsStream("testdatacourses.txt"));
        Scanner scandates = new Scanner(CourseManagementSysGUI.class.getResourceAsStream("testdatacoursesrundates.txt"));

        while (scancourses.hasNext()) { //While loop to Scan over the txt files
            try {
                courseMgr.addCourse(scancourses.nextLine()); 
                int index = courseMgr.getCourseIDindex();
                index--;
                String dates = scandates.nextLine();
                String cid = "C" + index;
                courseMgr.addCourseRun(cid, dates);
                dates = scandates.nextLine();
                courseMgr.addCourseRun(cid, dates);

            } catch (ParseException ex) { //Exception Handling
                Logger.getLogger(CourseManagementSysGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_loadDataButtonActionPerformed

    private void adddBookingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adddBookingButtonActionPerformed
        
        String selected = courseRunListonBookingPanel.getSelectedValue();
        String rid = "";
        String attendee = JOptionPane.showInputDialog("Enter Attendee's Name: ");
        rid = selected.substring(0, selected.indexOf(" "));
        bookingMgr.makeBooking(courseMgr.searchCourseRun(rid), attendee); //Makes booking which clicked
        
    }//GEN-LAST:event_adddBookingButtonActionPerformed

    private void addCourseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCourseButtonActionPerformed
        String courseName;
        courseName = JOptionPane.showInputDialog("Enter a Course Name: ");
        courseMgr.addCourse(courseName); //Adds the course

    }//GEN-LAST:event_addCourseButtonActionPerformed

    private void refreshCourseListButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshCourseListButtonActionPerformed
        Course course;
        DefaultListModel model = new DefaultListModel();
        
        for (int a = 0; a < courseMgr.getCourseIDindex(); a++) {
            course = courseMgr.searchCourse("C" + a);
            
            if (course != null) {
                model.addElement(course.toString());
            }
        }
        courseListOnCoursePanel.setModel(model); //Refeshes the JList
    }//GEN-LAST:event_refreshCourseListButtonActionPerformed

    private void addCourseRunButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCourseRunButtonActionPerformed
        try {
            String selected = courseListOnCoursePanel.getSelectedValue();
            String cid = "";
            String date = JOptionPane.showInputDialog("Enter Course Run Date, Format DD/MM/YYYY");
            cid = selected.substring(0, selected.indexOf(" "));

            courseMgr.addCourseRun(cid, date);
        } catch (ParseException ex) { //Exception Handling
            Logger.getLogger(CourseManagementSysGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_addCourseRunButtonActionPerformed

    private void refreshCouseRunListButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshCouseRunListButtonActionPerformed
        CourseRun courseRun;
        String idx;
        DefaultListModel model = new DefaultListModel();
        
        for (int i = 0; i < courseMgr.getCourseIDindex(); i++) {
            idx = "C" + i;
            for (int x = 0; x < courseMgr.getCourseRunIDindex(); x++) {
                courseRun = courseMgr.searchCourseRun(idx + "_R" + x);
                if (courseRun != null) {
                    model.addElement(courseRun.toString());
                }
            }
        }
        courseRunListOnCoursePanel.setModel(model); //Refeshes the JList

    }//GEN-LAST:event_refreshCouseRunListButtonActionPerformed

    private void rankCourseCoursesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rankCourseCoursesButtonActionPerformed
        busIntMgr.setbookingList(bookingMgr.getBookings());
        String text = busIntMgr.rankCoursesbyBooking();
        marketInfoTextArea.setText(" ");
        marketInfoTextArea.append(text);
    }//GEN-LAST:event_rankCourseCoursesButtonActionPerformed

    private void refreshCourseRunButtonBookingPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshCourseRunButtonBookingPanelActionPerformed
        CourseRun courseRun;
        String idx;
        DefaultListModel model = new DefaultListModel(); //Default model 
        for (int i = 0; i < courseMgr.getCourseIDindex(); i++) {
            idx = "C" + i;
            
            for (int j = 0; j < courseMgr.getCourseRunIDindex(); j++) {
                courseRun = courseMgr.searchCourseRun(idx + "_R" + j);
                if (courseRun != null) {
                    model.addElement(courseRun.toString());
                }
            }
        }
        courseRunListonBookingPanel.setModel(model); //Refeshes the JList
    }//GEN-LAST:event_refreshCourseRunButtonBookingPanelActionPerformed

    private void refreshAllBookingsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshAllBookingsButtonActionPerformed
        bookingTextArea.setText("");
        String cid;
        String rid;
        String bid;

        for (int i = 0; i < courseMgr.getCourseIDindex(); i++) { //For loop for courseIDindex
            cid = "C" + i;
            
            for (int x = 0; x < courseMgr.getCourseRunIDindex(); x++) { //For loop for courseRunIDindex
                rid = cid + "_R" + Integer.toString(x);
                
                for (int y = bookingMgr.getbookingIDindex(); 0 <= y; y--) { //For loop for bookingIDindex
                    bid = "B" + Integer.toString(y) + "_" + rid;
                    Booking booking = bookingMgr.searchBooking(bid);

                    if (booking != null) {
                        bookingTextArea.append(booking.toString() + "\n");
                    }
                }
            }
        }

       
    }//GEN-LAST:event_refreshAllBookingsButtonActionPerformed

    private void setupTwitterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setupTwitterButtonActionPerformed
        busIntMgr.setupTwitterApp(oosd2TwitterAPI);
        JOptionPane.showMessageDialog(rootPane, "Twitter connection is setup.");
    }//GEN-LAST:event_setupTwitterButtonActionPerformed

    private void checkMarketInfoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkMarketInfoButtonActionPerformed
        try {
            String term = JOptionPane.showInputDialog("Enter a topic area that you would like to search on Twiiter:");
            String res = busIntMgr.checkTwitterInfoForSubject(term, oosd2TwitterAPI);
            marketInfoTextArea.setText(res);

        } catch (TwitterException ex) {
            Logger.getLogger(CourseManagementSysGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_checkMarketInfoButtonActionPerformed

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
            java.util.logging.Logger.getLogger(CourseManagementSysGUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CourseManagementSysGUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CourseManagementSysGUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CourseManagementSysGUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CourseManagementSysGUI().setVisible(true);
            }
        });
    }

    //My own methods:
    private void myOwnSetup() {
        // setup your classes here
        busIntMgr = new BusIntManager();
        oosd2TwitterAPI = new OOSD2TwitterAPI();
        courseMgr = new CourseManager();
        bookingMgr = new BookingManager();
    }

    //My own varables declaration:
    private CourseManager courseMgr;
    private BookingManager bookingMgr;
    private BusIntManager busIntMgr;
    private OOSD2TwitterAPI oosd2TwitterAPI;


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCourseButton;
    private javax.swing.JButton addCourseRunButton;
    private javax.swing.JButton adddBookingButton;
    private javax.swing.JPanel bookingPanel;
    private javax.swing.JTextArea bookingTextArea;
    private javax.swing.JButton checkMarketInfoButton;
    private javax.swing.JList<String> courseListOnCoursePanel;
    private javax.swing.JPanel coursePanel;
    private javax.swing.JList<String> courseRunListOnCoursePanel;
    private javax.swing.JList<String> courseRunListonBookingPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JButton loadDataButton;
    private javax.swing.JTextArea marketInfoTextArea;
    private javax.swing.JPanel marketPanel;
    private javax.swing.JTabbedPane overallPanel;
    private javax.swing.JButton rankCourseCoursesButton;
    private javax.swing.JButton refreshAllBookingsButton;
    private javax.swing.JButton refreshCourseListButton;
    private javax.swing.JButton refreshCourseRunButtonBookingPanel;
    private javax.swing.JButton refreshCouseRunListButton;
    private javax.swing.JButton setupTwitterButton;
    private javax.swing.JPanel systemPanel;
    // End of variables declaration//GEN-END:variables

}
