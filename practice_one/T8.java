package Class;

public class T8 {
	private int total;
	private int last_empty;
	private int bottle = 1000;
	//setter����getter������
	public void print(){
		System.out.println("test");
		int bottleEmpty;
        int tempBottle = this.bottle; //����bottle���ݲ����޸�
		do{
			this.total += tempBottle;
			bottleEmpty = tempBottle%3; //
			tempBottle /= 3;
			tempBottle = (tempBottle + bottleEmpty);
		}while(tempBottle >= 3);
		last_empty = tempBottle;
		System.out.println("�ܹ��ܺȶ���ƿ��ˮ" + this.total + ",���ʣ����ٸ���ƿ��" + this.last_empty);
	}
}
