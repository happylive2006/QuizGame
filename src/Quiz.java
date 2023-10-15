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
        frame.setSize(650,650);
        frame.getContentPane().setBackground(new Color(50,50,50));
        frame.setLayout(null);
        frame.setResizable(false);

        textField.setBounds(0,0,650,50);
        textField.setBackground(new Color(25,25,25));
        textField.setForeground(new Color(25,255,0));
        textField.setFont(new Font("Ink Free", Font.BOLD,25));
        textField.setBorder(BorderFactory.createBevelBorder(1));
        textField.setHorizontalAlignment(JTextField.CENTER);
        textField.setEditable(false);

        textArea.setBounds(0,50,650,50);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setBackground(new Color(25,25,25));
        textArea.setForeground(new Color(25,255,0));
        textArea.setFont(new Font("MV Boli", Font.BOLD,25));
        textArea.setBorder(BorderFactory.createBevelBorder(1));
        textArea.setEditable(false);
        textArea.setText("This is just testing");

        buttonA.setBounds(0,100,100,100);
        buttonA.setFont(new Font("MV Boli", Font.BOLD,35));
        buttonA.setFocusable(false);
        buttonA.addActionListener(this);
        buttonA.setText("A");

        buttonB.setBounds(0,200,100,100);
        buttonB.setFont(new Font("MV Boli", Font.BOLD,35));
        buttonB.setFocusable(false);
        buttonB.addActionListener(this);
        buttonB.setText("B");

        buttonC.setBounds(0,300,100,100);
        buttonC.setFont(new Font("MV Boli", Font.BOLD,35));
        buttonC.setFocusable(false);
        buttonC.addActionListener(this);
        buttonC.setText("C");

        buttonD.setBounds(0,400,100,100);
        buttonD.setFont(new Font("MV Boli", Font.BOLD,35));
        buttonD.setFocusable(false);
        buttonD.addActionListener(this);
        buttonD.setText("D");

        answer_labelA.setBounds(125,100,500,100);
        answer_labelA.setBackground(new Color(50,50,50));
        answer_labelA.setForeground(new Color(25,255,0));
        answer_labelA.setFont(new Font("MV Boli",Font.PLAIN,35));

        answer_labelB.setBounds(125,200,500,100);
        answer_labelB.setBackground(new Color(50,50,50));
        answer_labelB.setForeground(new Color(25,255,0));
        answer_labelB.setFont(new Font("MV Boli",Font.PLAIN,35));


        answer_labelC.setBounds(125,300,500,100);
        answer_labelC.setBackground(new Color(50,50,50));
        answer_labelC.setForeground(new Color(25,255,0));
        answer_labelC.setFont(new Font("MV Boli",Font.PLAIN,35));


        answer_labelD.setBounds(125,400,500,100);
        answer_labelD.setBackground(new Color(50,50,50));
        answer_labelD.setForeground(new Color(25,255,0));
        answer_labelD.setFont(new Font("MV Boli",Font.PLAIN,35));

        seconds_left.setBounds(535,510,100,100);
        seconds_left.setBackground(new Color(25,25,25));
        seconds_left.setForeground(new Color(255,0,0));
        seconds_left.setFont(new Font("Ink Free",Font.BOLD,60));
        seconds_left.setBorder(BorderFactory.createBevelBorder(1));
        seconds_left.setOpaque(true);
        seconds_left.setHorizontalAlignment(JTextField.CENTER);
        seconds_left.setText(String.valueOf(seconds));

        frame.add(seconds_left);
        frame.add(answer_labelA);
        frame.add(answer_labelB);
        frame.add(answer_labelC);
        frame.add(answer_labelD);
        frame.add(buttonA);
        frame.add(buttonB);
        frame.add(buttonC);
        frame.add(buttonD);
        frame.add(textArea);
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
