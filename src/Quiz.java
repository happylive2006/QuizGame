import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Quiz implements ActionListener {

    String[] questions = {
                            "1. Who invented Java Programming?",
                            "2. Which statement is true about Java?",
                            "3. Which component is used to compile, debug and execute the java programs?",
                            "4. Which one of the following is not a Java feature?",
                            "5. Which of these cannot be used for a variable name in Java?",
                            "6. What is the extension of java code files?",
                            "7. What will be the output of the following Java code? " +
                                    "    class increment {\n" +
                                    "        public static void main(String args[]) \n" +
                                    "        {        \n" +
                                    "             int g = 3;\n" +
                                    "             System.out.print(++g * 8);\n" +
                                    "        } \n" +
                                    "    }",
                            "8. Which environment variable is used to set the java path?",
                            "9. What will be the output of the following Java program?" +
                                    "class output {\n" +
                                    "        public static void main(String args[]) \n" +
                                    "        {\n" +
                                    "            double a, b,c;\n" +
                                    "            a = 3.0/0;\n" +
                                    "            b = 0/4.0;\n" +
                                    "            c=0/0.0;\n" +
                                    " \n" +
                                    "\t    System.out.println(a);\n" +
                                    "            System.out.println(b);\n" +
                                    "            System.out.println(c);\n" +
                                    "        } \n" +
                                    "    }",
                            "10. Which of the following is not an OOPS concept in Java?"
                        };
    String[][] options = {
                            {"Guido van Rossum", "James Gosling", "Dennis Ritchie", "Bjarne Stroustrup"},
                            {"Java is a sequence-dependent programming language", "Java is a code dependent programming language", "Java is a platform-dependent programming language", "Java is a platform-independent programming language"},
                            {"JRE", "JIT", "JDK", "JVM"},
                            {"Object-oriented", "Use of pointers", "Portable", "Dynamic and Extensible"},
                            {"identifier & keyword", "identifier", "keyword", "none of the mentioned"},
                            {".js", "txt", ".class", ".java"},
                            {"32", "33", "24", "25"},
                            {"MAVEN_Path", "JavaPATH", "JAVA", "JAVA_HOME"},
                            {"NaN", "Infinity", "0.0", "all of the mentioned"},
                            {"Polymorphism", "Inheritance", "Compilation", "Encapsulation"}
                         };
    char[] answers = {
                       'B',
                       'D',
                       'C',
                       'B',
                       'C',
                       'D',
                       'A',
                       'D',
                       'D',
                       'C'
                     };
    char guess;
    char answer;
    int index;
    int correct_guesses = 0;
    int total_questions = questions.length;
    int result;
    int seconds = 10;

    JFrame frame = new JFrame();
    JTextField textField = new JTextField();
    JTextArea textArea = new JTextArea();
    JButton buttonA = new JButton();
    JButton buttonB = new JButton();
    JButton buttonC = new JButton();
    JButton buttonD = new JButton();
    JLabel answer_labelA = new JLabel();
    JLabel answer_labelB = new JLabel();
    JLabel answer_labelC = new JLabel();
    JLabel answer_labelD = new JLabel();
    JLabel time_label = new JLabel();
    JLabel seconds_left = new JLabel();
    JTextField number_right = new JTextField();
    JTextField percentage = new JTextField();

    public Quiz() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,650);
        frame.getContentPane().setBackground(new Color(222,227,216));
        frame.setLayout(null);
        frame.setResizable(false);

        textField.setBounds(0,0,650,50);
        textField.setBackground(new Color(50,50,50));
        textField.setForeground(new Color(25,255,0));
        textField.setFont(new Font("Ink Free", Font.BOLD,30));
        textField.setBorder(BorderFactory.createBevelBorder(1));
        textField.setHorizontalAlignment(JTextField.CENTER);
        textField.setEditable(false);

        frame.add(textField);
        frame.setVisible(true);
    }
    public void nextQuestion() {

    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }
    public void displayAnswer() {
    }
    public void results(){

    }
}