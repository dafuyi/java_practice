package Class;

public class T10 {
	private String get;
	
	public T10(){
		
	}
	public T10(String str){
		this.get = str;
	}
	public char judge(){
		char c = ' ';
		this.get += 'd';
		String max[] = {};
//		char result[] = this.get.toCharArray();
		for(int i = 0 ; i < this.get.lastIndexOf('d'); i ++){
			char get = this.get.charAt(i);
			String regex = "[" + get +"]"; 				//����split�����и���������ַ������鳤�����ж�ÿһ�����ֳ����޴���
			String temp[] = this.get.split(regex);
			if(temp.length > max.length){
				max = temp;
				c = get;
			}else if(temp.length == max.length){
				if(get>c){  		//�ж�c ��  get �Ĵ�С��ϵ
					c = get; 
				}
			}
		}
		return c;
	}
}
