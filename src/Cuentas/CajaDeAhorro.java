package Cuentas;

import usuarios.Usuario;

public class CajaDeAhorro extends CuentaSueldo {
	private Integer cantidadDeExtracciones = 0;

	public CajaDeAhorro(Usuario usuario, Double saldoInicial) {
		super(usuario, saldoInicial);
	}
	
	@Override
	public void extraer(Double montoAExtraer) {
		if(saldo>=montoAExtraer && cantidadDeExtracciones<4) {
			saldo = saldo - montoAExtraer;
			cantidadDeExtracciones ++;
		} else {
			saldo = saldo - montoAExtraer-6;
			cantidadDeExtracciones ++;
		}
	}

}
