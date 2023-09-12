package university.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class main_class extends JFrame implements ActionListener {
    main_class(){
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/third.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1540,750, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel img = new JLabel(i3);
        add(img);

        JMenuBar mb = new JMenuBar();

        // new information

        JMenu newInfo = new JMenu("New Information");
        newInfo.setForeground(Color.black);
        mb.add(newInfo);

        JMenuItem facultyInfo = new JMenuItem("New Faculty Information");
        facultyInfo.setBackground(Color.white);
        facultyInfo.addActionListener(this);
        newInfo.add(facultyInfo);

        JMenuItem studentInfo = new JMenuItem("New Student Information");
        studentInfo.setBackground(Color.white);
        studentInfo.addActionListener(this);
        newInfo.add(studentInfo);

        // Details

        JMenu details = new JMenu("View Details");
        details.setForeground(Color.black);
        details.addActionListener(this);
        mb.add(details);

        JMenuItem facultydetails = new JMenuItem("View Faculty Details");
        facultydetails.setBackground(Color.white);
        facultydetails.addActionListener(this);
        details.add(facultydetails);

        JMenuItem studentdetails = new JMenuItem("View Student Details");
        studentdetails.setBackground(Color.white);
        studentdetails.addActionListener(this);
        details.add(studentdetails);

        // Leave

        JMenu leave = new JMenu("Apply Leave");
        leave.setForeground(Color.black);
        leave.addActionListener(this);
        mb.add(leave);

        JMenuItem facultyleave = new JMenuItem("Faculty Leave");
        facultyleave.setBackground(Color.white);
        facultyleave.addActionListener(this);
        leave.add(facultyleave);

        JMenuItem studentleave = new JMenuItem("Student Leave");
        studentleave.setBackground(Color.white);
        studentleave.addActionListener(this);
        leave.add(studentleave);

        // Leave Details

        JMenu leaveDetails = new JMenu("Leave Details");
        leaveDetails.setForeground(Color.black);
        leaveDetails.addActionListener(this);
        mb.add(leaveDetails);

        JMenuItem facultyleaveDetails = new JMenuItem("Faculty Leave Details");
        facultyleaveDetails.setBackground(Color.white);
        facultyleaveDetails.addActionListener(this);
        leaveDetails.add(facultyleaveDetails);

        JMenuItem studentleaveDetails = new JMenuItem("Student Leave Details");
        studentleaveDetails.setBackground(Color.white);
        studentleaveDetails.addActionListener(this);
        leaveDetails.add(studentleaveDetails);

        // Exams

        JMenu exam = new JMenu("Examination");
        exam.setForeground(Color.black);
        exam.addActionListener(this);
        mb.add(exam);

        JMenuItem ExaminationDetails = new JMenuItem("Examination Details");
        ExaminationDetails.setBackground(Color.white);
        ExaminationDetails.addActionListener(this);
        exam.add(ExaminationDetails);

        JMenuItem EnterMarks = new JMenuItem("Enter Marks");
        EnterMarks.setBackground(Color.white);
        EnterMarks.addActionListener(this);
        exam.add(EnterMarks);

        // update Info

        JMenu updateInfo = new JMenu("Update Details");
        updateInfo.setForeground(Color.black);
        updateInfo.addActionListener(this);
        mb.add(updateInfo);

        JMenuItem updatefacultyinfo = new JMenuItem("Update Faculty Details");
        updatefacultyinfo.setBackground(Color.white);
        updatefacultyinfo.addActionListener(this);
        updateInfo.add(updatefacultyinfo);

        JMenuItem updatestudentinfo = new JMenuItem("Update Student Details");
        updatestudentinfo.setBackground(Color.white);
        updatestudentinfo.addActionListener(this);
        updateInfo.add(updatestudentinfo);

        //fee

        JMenu fee = new JMenu("Fee Details");
        fee.setForeground(Color.black);
        fee.addActionListener(this);
        mb.add(fee);

        JMenuItem feestructure = new JMenuItem("Fee Structure");
        feestructure.setBackground(Color.white);
        feestructure.addActionListener(this);
        fee.add(feestructure);

        JMenuItem feeform = new JMenuItem("Student Fee form");
        feeform.setBackground(Color.white);
        feeform.addActionListener(this);
        fee.add(feeform);

        // utility

        JMenu utility = new JMenu("Utility");
        utility.setForeground(Color.black);
        mb.add(utility);

        JMenuItem Calculator = new JMenuItem("Calculator");
        Calculator.setBackground(Color.white);
        Calculator.addActionListener(this);
        utility.add(Calculator);

        JMenuItem Notepad = new JMenuItem("Notepad");
        Notepad.setBackground(Color.white);
        Notepad.addActionListener(this);
        utility.add(Notepad);

        // About

        JMenu about = new JMenu("About");
        about.setForeground(Color.black);
        mb.add(about);

        JMenuItem About = new JMenuItem("About");
        About.setBackground(Color.white);
        About.addActionListener(this);
        about.add(About);

        // exit

        JMenu exit = new JMenu("Exit");
        exit.setForeground(Color.black);
        mb.add(exit);

        JMenuItem Exit = new JMenuItem("Exit");
        Exit.setBackground(Color.white);
        Exit.addActionListener(this);
        exit.add(Exit);










        setJMenuBar(mb);




        setSize(1540,850);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String sm = e.getActionCommand();
        if(sm.equals("Exit") ){
            System.exit(15);

        }else if (sm.equals("Calculator")){
            try{
                Runtime.getRuntime().exec("calc.exe");

            }catch (Exception E){
                E.printStackTrace();
            }
        } else if (sm.equals("Notepad")){
            try{
                Runtime.getRuntime().exec("notepad.exe");

            }catch (Exception E){
                E.printStackTrace();
            }
        } else if (sm.equals("New Faculty Information")){
            new AddFaculty();
        } else if (sm.equals("New Student Information")) {
            new AddStudent();
        }else if (sm.equals("View Faculty Details")){
            new TeacherDetails();
        }else if (sm.equals("View Student Details")){
            new StudentDetails();
        }else if (sm.equals("Faculty Leave")){
            new TeacherLeave();
        }else if (sm.equals("Student Leave")){
            new StudentLeave();
        } else if (sm.equals("Faculty Leave Details")) {
            new TeacherLeaveDetails();
        } else if (sm.equals("Student Leave Details")) {
            new StudentLeaveDetails();
        }else if (sm.equals("Update Faculty Details")){
            new UpdateTeacher();
        } else if (sm.equals("Update Student Details")) {
            new updateStudent();
        } else if (sm.equals("Enter Marks")) {
            new EnterMarks();
        } else if (sm.equals("Examination Details")) {
            new ExaminationDetails();
        }else if (sm.equals("Fee Structure")){
            new FeeStructure();
        } else if (sm.equals("Student Fee form")) {
            new StudentFeeForm();
        } else if (sm.equals("About")) {
            new About();

        }


    }

    public static void main(String[] args) {
        new main_class();

    }
}
