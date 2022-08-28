package Cuentas;

import usuarios.Usuario;

public class CuentaSueldo {
	private Usuario usuario;
	private Double saldoInicial;
	protected Double saldo;

	public CuentaSueldo(Usuario usuario, Double saldoInicial) {
		this.usuario = usuario;
		this.saldoInicial = saldoInicial;
		this.saldoInicial = saldoInicial;
		
		saldo=saldoInicial;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Double getSaldoInicial() {
		return saldoInicial;
	}

	public void setSaldoInicial(Double saldoInicial) {
		this.saldoInicial = saldoInicial;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public void depositar(Double montoIngresado) {
		saldo = saldo + montoIngresado;
	}

	public void extraer(Double montoAExtraer) {
		if(saldo>=montoAExtraer) {
			saldo = saldo - montoAExtraer;
		}
	}
	
	

}
