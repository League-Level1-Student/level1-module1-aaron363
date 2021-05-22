package _05_vault;

import java.util.Random;

import javax.swing.JOptionPane;

public class _Vault {
	public static void main(String[] args) {
		Vault vault = new Vault();
		JamesBond jamesBond = new JamesBond();
		System.out.println(jamesBond.findCode(vault));
	}
}

class Vault{
	Random rand = new Random();
	int code = rand.nextInt(1000000) + 1;
	boolean tryCode(int num){
		if(num == code) {
			return true;
		}else {
			return false;
		}
	}
}

class JamesBond{
	int findCode(Vault vault) {
		for(int i = 0; i < 1000001; i++) {
			if(vault.tryCode(i)) {
				return i;
			}
		}
		return -1;
	}
}


