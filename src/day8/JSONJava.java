package day8;

import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JSONJava {

	public static void main(String[] args) {
		ObjectMapper mapper = new ObjectMapper();
		List<Employee> employees=null;
        try {
            employees = mapper.readValue(
            	//new File("D:\\EclipseJavaprogs2\\Test\\json\\employee.json"),	   //absolute path
                new File("json/employee.json"),									  //relative path
                new TypeReference<List<Employee>>() {}
            );

	}
        catch(Exception e1)
        {
        	System.out.println(e1.getMessage());
        }
        
        //System.out.println(employees);
        for(Employee employee:employees)
        	System.out.println(employee);
        
        
        List<String> empNames=employees.stream().map(emp->emp.getName()).collect(Collectors.toList());
        System.out.println(empNames);
        
//        String empNamesString=employees.stream().map(emp->emp.getName()).collect(Collectors.joining("-","{","}"));
//        System.out.println(empNamesString);
        
        
        Map<Boolean,List<Employee>> partitionByGender=employees.stream().collect(Collectors.partitioningBy(emp->emp.getGender().equalsIgnoreCase("male")));
        System.out.println(partitionByGender);
        
        System.out.println("Male Emps");
        System.out.println(partitionByGender.get(true).stream().map(s->s.getName()).collect(Collectors.toList()));

        System.out.println("Female Emps");
        System.out.println(partitionByGender.get(false).stream().map(s->s.getName()).collect(Collectors.toList()));
	}
}
