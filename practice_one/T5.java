package Class;

public class T5 {
	private String sName = "Ҧ��";
     private String strHex;//���ڴ��ÿ���ֵ�Unicode����
     private String  strRes="";  //�������Ӹ����룬��������
     public void print(){
    	  for(int i = 0; i < this.sName.length() ; i++ ){//����������ַ��ĸ���
	     	char c = this.sName.charAt(i) ;   //��������еĵ����ַ���
	     	int intAsc = (int)c;  //���ַ�ת��int��
//	     	System.out.println(intAsc);
	     	if(intAsc > 128) {
	     	    strHex = Integer.toHexString(intAsc);  //ͨ��Integer��toHexString���������ַ�ת��Unicode����
	     	    strRes += "&#x" + strHex + ";";  //����������������
	     	}
	     	else {
	     		strRes += c;
	     	}
	     }        
	     System.out.println(strRes);
     }
    
}
