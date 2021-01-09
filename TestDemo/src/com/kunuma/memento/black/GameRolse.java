package com.kunuma.memento.black;

public class GameRolse {

	private int vit;
	private int atk;
	private int def;
	
	public int getVit() {
		return vit;
	}

	public void setVit(int vit) {
		this.vit = vit;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

	public int getDef() {
		return def;
	}

	public void setDef(int def) {
		this.def = def;
	}

	void initState() {
		vit =100;
		atk = 100;
		def = 100;
		
	}
	
	public void fight() {
		vit = 0;
		atk = 0;
		def = 0;
	}
	
	public Memento saveState() {
		return new RoleStateMemento(vit,atk,def);
	}
	
	public void recoverState(Memento memento) {
		RoleStateMemento roleStateMemento =  (RoleStateMemento) memento;
		
		this.atk = roleStateMemento.getAtk();
		this.def = roleStateMemento.getDef();
		this.vit = roleStateMemento.getVit();
	}
	
	@Override
	public String toString() {
		return "GameRolse [vit=" + vit + ", atk=" + atk + ", def=" + def + "]";
	}

	@SuppressWarnings("unused")
	private class RoleStateMemento implements Memento{
		private int vit;
		private int atk;
		private int def;
		public int getAtk() {
			return atk;
		}
		public void setAtk(int atk) {
			this.atk = atk;
		}
		public int getVit() {
			return vit;
		}
		public void setVit(int vit) {
			this.vit = vit;
		}
		public int getDef() {
			return def;
		}
		public void setDef(int def) {
			this.def = def;
		}
		public RoleStateMemento() {
			// TODO Auto-generated constructor stub
		}
		public RoleStateMemento(int vit, int atk, int def) {
			super();
			this.vit = vit;
			this.atk = atk;
			this.def = def;
		}
		
		
	}
	
}
