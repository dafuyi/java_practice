package Class;

public class T7 {
	private int hen 	= 5;
	private int cock 	= 3;
	private int chick3 	= 1; //��Ϊ�������1/3��2/3ֻ����Ϊ�˱��ڼ��㣬��ֻ��һ����
	private int money 	= 100;
	private int num		= 100;
	public void printNum(){
		int i,k,j;
		for(i = 1; i<= 100 ; i++){ //С�� 1 => 3ֻ
			for(j = 0; j <= 33  ; j ++){ // ĸ��
				for(k = 0 ; k <= 20 ; k ++){ // ����
					 if(((i*3 + j + k) == 100) && ((k*hen + j*cock+ i*chick3) == 100))
					 	System.out.println("С��"+i*3+"ֻ��ĸ��"+j+"ֻ������"+k+"ֻ");
				}
			}
		}
	}
}
