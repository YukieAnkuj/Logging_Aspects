package logging;

import banking.InsufficientBalanceException;
import java.util.Date;
import java.text.SimpleDateFormat;
import org.aspectj.lang.reflect.MethodSignature;
import java.text.DateFormat;
import banking.AccountException;
import java.util.logging.Logger;
import java.util.logging.Level;
import java.util.Calendar;
public aspect LogAspect
{
	static Logger logger = Logger.getLogger("trace");

	//##UNCOMMENT THIS BLOCK OF CODE FOR THE SIMPLE IMPLEMENTATION
//	private pointcut loggerMethodExec() : execution (* *.*(..));
//	
//    before(): loggerMethodExec() {
//    	 Calendar cal = Calendar.getInstance();
//         DateFormat df = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.MEDIUM);
//            String loggerString=(df.format(cal.getTime())+ " "+thisJoinPoint.getSignature().getDeclaringType().getSimpleName()+" "+thisJoinPoint.getSignature().getName().toString()+"method");
//            System.out.println(loggerString);
//            System.out.println("\n"+"INFO: Entering");
//            //logger.info(loggerString);
//    }
    //##
	
	
	//##UNCOMMENT THIS BLOCK OF CODE FOR THE EXCEPTION CATCHING IMPLEMENTATION
//    after() throwing(AccountException e):call (* *.*(..)throws AccountException)
//    {
//    	System.out.println("This is an exception caught by the aspect:\n"+e);
//    }
	
	//##UNCOMMENT THIS BLOCK OF CODE FOR METHOD PARAMETER IMPLEMENTATION
//    private pointcut loggerMethodExecWithParameters() : execution (* *.*(..));
//    before(): loggerMethodExecWithParameters() {
//   	 Calendar cal = Calendar.getInstance();
//        DateFormat df = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.MEDIUM);
//        MethodSignature signature=(MethodSignature)thisJoinPoint.getSignature();
//        String[] parameterNames=signature.getParameterNames();
//        Object[] parameterValues=thisJoinPoint.getArgs();
//           String loggerString=(df.format(cal.getTime())+ " "+thisJoinPointStaticPart.getSignature().getDeclaringType().getSimpleName()+" "+thisJoinPointStaticPart.getSignature().getName().toString()+"method");
//           System.out.println(loggerString);
//           System.out.println("\n"+"INFO: Entering with values: ");
//           if(parameterNames.length!=0)
//           {
//        	   for(int i=0;i<parameterNames.length;i++ )
//               {
//            	   //if(parameterValues[i].getClass().isPrimitive())
//            	   System.out.println(parameterNames[i]+"="+parameterValues[i].toString()+",");
//               }
//           }
//   }
}