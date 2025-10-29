package com.nt.runner;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Candidate;
import com.nt.service.ICandidateMgmtService;

@Component
public class LocalTxMgmtRunner implements CommandLineRunner {

	@Autowired
	private ICandidateMgmtService canService;
	
	@Override
	public void run(String... args) throws Exception {
		
		try(Scanner sc = new Scanner(System.in))
		{
			System.out.println("Enter Candidate's name:");
			String name = sc.next();
			System.out.println("Enter Candidate's age:");
			int age = sc.nextInt();
			System.out.println("Enter Candidate's marital status:");
			boolean flag = sc.nextBoolean();
			System.out.println("Enter Candidate's Photo path:");
			String imgPath = sc.next();
			System.out.println("Enter Candidate's resume path:");
			String resumePath = sc.next();
			
			//convert imgPath and resumePath to byte[] and char[]
			
//			File file = new File(imgPath);
//			byte[] imageContent = new byte[(int) file.length()];
			byte[] imageContent;
			try(FileInputStream fis = new FileInputStream(imgPath))
			{
				imageContent = fis.readAllBytes();
			}
			
			File file1 = new File(resumePath);
			char[] resumeContent = new char[(int) file1.length()];
//			char[] resumeContent;
			try(FileReader reader = new FileReader(resumePath))
			{
				reader.read(resumeContent);
			}
		
			//create object and set values
			Candidate cnd = new Candidate();
			cnd.setCname(name);
			cnd.setCage(age);
			cnd.setMaritalstatus(flag);
			cnd.setPhoto(imageContent);
			cnd.setResume(resumeContent);
			
			//invoke business method
			String msg = canService.registerCandidate(cnd);
			System.out.println(msg);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		 
	}

}
