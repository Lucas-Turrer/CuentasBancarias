package Cuentas;

import usuarios.Usuario;

public class CuentaCorriente extends CuentaSueldo {

	public CuentaCorriente(Usuario usuario, Double saldoInicial) {
		super(usuario, saldoInicial);
	}
	
	@Override
	public void extraer(Double montoAExtraer) {
		if(saldo>=montoAExtraer) {
			saldo = saldo - montoAExtraer;
		} else {
			saldo = saldo -(montoAExtraer*1.05);
		}
	}

}
