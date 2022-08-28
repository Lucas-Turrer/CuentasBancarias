package TestCuentasBancarias;

import static org.junit.Assert.*;

import org.junit.Test;

import Cuentas.CajaDeAhorro;
import Cuentas.CuentaCorriente;
import Cuentas.CuentaSueldo;
import usuarios.Usuario;

public class TestCuentaBancaria {

	@Test
	public void QueSePuedaCrearUnUsuario() {
		Usuario usuarioNuevo = new Usuario ("Lucas", "Gustavo", 37931874);
		
		assertNotNull(usuarioNuevo);
	}
	
	@Test
	public void QueSePuedaCrearUnaCuentaSueldo() {
		Usuario usuarioNuevo = new Usuario ("Lucas", "Gustavo", 37931874);
		CuentaSueldo cuentaNueva = new CuentaSueldo (usuarioNuevo, 1000.00);
		
		Double valorEsperado = 1000.00;
		Double valorObtenido = cuentaNueva.getSaldo();
		
		assertEquals(valorEsperado, valorObtenido);
	}
	
	@Test
	public void QueSePuedaDepoitarDineroEnLaCuenta() {
		Usuario usuarioNuevo = new Usuario ("Lucas", "Gustavo", 37931874);
		CuentaSueldo cuentaNueva = new CuentaSueldo (usuarioNuevo, 1000.00);
		
		cuentaNueva.depositar(500.00);
		Double valorEsperado = 1500.00;
		Double valorObtenido = cuentaNueva.getSaldo();
		
		assertEquals(valorEsperado, valorObtenido);
	}
	
	@Test
	public void QueSePuedaExtraerDineroEnLaCuenta() {
		Usuario usuarioNuevo = new Usuario ("Lucas", "Gustavo", 37931874);
		CuentaSueldo cuentaNueva = new CuentaSueldo (usuarioNuevo, 1000.00);
		
		cuentaNueva.extraer(200.00);
		Double valorEsperado = 800.00;
		Double valorObtenido = cuentaNueva.getSaldo();
		
		assertEquals(valorEsperado, valorObtenido);
	}
	
	@Test
	public void QueSePuedaCrearUnaCajaDeAhorro() {
		Usuario usuario = new Usuario ("Lucas", "Turrer", 37931874);
		CajaDeAhorro cajaNueva = new CajaDeAhorro(usuario, 2000.00);
		
		Double valorEsperado = 2000.00;
		Double valorObtenido = cajaNueva.getSaldo();
		
		assertEquals(valorEsperado, valorObtenido);
	}
	
	@Test
	public void QueSePuedaDepositarEnUnaCajaDeAhorro() {
		Usuario usuario = new Usuario ("Lucas", "Turrer", 37931874);
		CajaDeAhorro cajaNueva = new CajaDeAhorro(usuario, 2000.00);
		
		cajaNueva.depositar(1000.00);
		Double valorEsperado = 3000.00;
		Double valorObtenido = cajaNueva.getSaldo();
		
		assertEquals(valorEsperado, valorObtenido);
	}
	
	@Test
	public void QueSePuedaExtraerEnUnaCajaDeAhorroSinCostoAdicional() {
		Usuario usuario = new Usuario ("Lucas", "Turrer", 37931874);
		CajaDeAhorro cajaNueva = new CajaDeAhorro(usuario, 2000.00);
		
		cajaNueva.extraer(500.00);
		Double valorEsperado = 1500.00;
		Double valorObtenido = cajaNueva.getSaldo();
		
		assertEquals(valorEsperado, valorObtenido);
	}
	
	@Test
	public void QueSePuedaExtraerEnUnaCajaDeAhorroConCostoAdicional() {
		Usuario usuario = new Usuario ("Lucas", "Turrer", 37931874);
		CajaDeAhorro cajaNueva = new CajaDeAhorro(usuario, 2000.00);
		
		cajaNueva.extraer(500.00);
		cajaNueva.extraer(100.00);
		cajaNueva.extraer(50.00);
		cajaNueva.extraer(100.00);
		cajaNueva.extraer(100.00);
		Double valorEsperado = 1144.00;
		Double valorObtenido = cajaNueva.getSaldo();
		
		assertEquals(valorEsperado, valorObtenido);
	}

	@Test
	public void QueSePuedaCrearUnaCuentaCorriente() {
		Usuario usuario = new Usuario ("Lucas", "Turrer", 37931874);
		CuentaCorriente CuentaNueva = new CuentaCorriente(usuario, 2000.00);
		
		Double valorEsperado = 2000.00;
		Double valorObtenido = CuentaNueva.getSaldo();
		
		assertEquals(valorEsperado, valorObtenido);
	}
	
	@Test
	public void QueSePuedaExtraerDeUnaCuentaCorriente() {
		Usuario usuario = new Usuario ("Lucas", "Turrer", 37931874);
		CuentaCorriente cuentaNueva = new CuentaCorriente(usuario, 2000.00);
		
		cuentaNueva.extraer(1000.00);
		Double valorEsperado = 1000.00;
		Double valorObtenido = cuentaNueva.getSaldo();
		
		assertEquals(valorEsperado, valorObtenido);
	}
	
	@Test
	public void QueSePuedaExtraerDeUnaCuentaCorrienteSinSaldo() {
		Usuario usuario = new Usuario ("Lucas", "Turrer", 37931874);
		CuentaCorriente cuentaNueva = new CuentaCorriente(usuario, 2000.00);
		
		cuentaNueva.extraer(2100.00);
		Double valorEsperado = -205.00;
		Double valorObtenido = cuentaNueva.getSaldo();
		
		assertEquals(valorEsperado, valorObtenido);
	}
}
