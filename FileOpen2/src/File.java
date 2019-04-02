import java.awt.Container;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;



public class File extends JFrame
{
	Container contentPane;
	JLabel imageLabel = new JLabel();
	TextField fil = new TextField();
	
	File()
	{
		setTitle("Test");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.add(imageLabel);
		CreateMeun();
		fil.setText("�˻� â");
		fil.setBounds(10, 10, 5, 5);
		setSize(300,200);
        add(fil);
		setVisible(true);
		fil.setVisible(true);
		
	}
	
	void CreateMeun()
	{
		JMenuBar mb = new JMenuBar();
		JMenu filemeun = new JMenu("File");
		JMenuItem openitem = new JMenuItem("Open");
		
		
		//������ ���
		openitem.addActionListener(new OpenActionListener() );
	    filemeun.add(openitem);
	    mb.add(filemeun);
	    this.setJMenuBar(mb);
	}
	
	class OpenActionListener implements ActionListener
	{

		JFileChooser chooser;
		public OpenActionListener()
		{
			//���� ���̾�α� ����
			chooser = new JFileChooser();
		}
		
		@Override
		public void actionPerformed(ActionEvent e)
		{
              FileNameExtensionFilter filter = new FileNameExtensionFilter
            		  ("java " ,"java");
              chooser.setFileFilter(filter);
              
              // ���� ���̾�α� ���
              int ret = chooser.showOpenDialog(null);
			 
              if(ret != JFileChooser.APPROVE_OPTION)
              {
            	  JOptionPane.showMessageDialog(null,"������ ���� ���� �ʾҽ��ϴ�","���",JOptionPane.WARNING_MESSAGE );
                  return;
              } 
              
              // ����ڰ� ������ ������ "����" ���� ���
              
              String filepath = chooser.getSelectedFile().getPath();
              String name = chooser.getSelectedFile().getName();
              String s ="";
               
              for(int i =0;i<name.length()-1;i++)
              {
            	  if(name.charAt(i) != '.')
            	  {
            		 s+=name.charAt(i); 
            	  }else
            	  {
            		  s+=".txt";
            		  break;
            	  }
              }
              
              
              try {
				//FileReader reader = new FileReader(filepath);
				BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(filepath), "UTF-8"));
				
				FileWriter fw = new FileWriter(s,false);
				BufferedWriter bw = new BufferedWriter(fw);
				
				String str = null;
				
				while((str=br.readLine()) != null)
				{
					bw.write(str);
					System.out.println(str);
					bw.newLine();
				}
				
				
				br.close();
				//.close();
				
				bw.close();
				fw.close();
				
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
              
              imageLabel.setIcon(new ImageIcon(filepath));
              pack();
		}
		
	}
	

	public static void main(String[] args)
	{
		new File();
	}

}
