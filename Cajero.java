import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Cajero extends JFrame {

    private double saldo = 1000.0; // Saldo inicial simulado
    private JLabel saldoLabel; // Etiqueta para mostrar el saldo actual

    public Cajero() {
        super("Cajero Automático");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);

        // Ventana de entrada para el número de cliente
        String numeroCliente = JOptionPane.showInputDialog("Ingrese su número de cliente:");
        if (numeroCliente == null || numeroCliente.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Número de cliente inválido. Saliendo del programa.");
            System.exit(0);
        }

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        JButton retirarButton = new JButton("Retirar Dinero");
        JButton saldoButton = new JButton("Ver Saldo");
        JButton pagarServicioButton = new JButton("Pagar Servicio");
        JButton recargarTelefonoButton = new JButton("Recargar Teléfono");
        JButton enviarDineroButton = new JButton("Enviar Dinero");
        JButton retiroSinTarjetaButton = new JButton("Retiro sin Tarjeta");
        JButton invertirButton = new JButton("Invertir");
        JButton depositarButton = new JButton("Depositar");
        JButton terminarButton = new JButton("Terminar Uso");
        saldoLabel = new JLabel("Saldo actual: $" + saldo);


        terminarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                terminarUso();
            }
        });

        retirarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                retirarDinero();
            }
        });

        depositarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                depositar();
            }
        });

        saldoButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mostrarSaldo();
            }
        });

        invertirButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                invertir(); // Llama a la función para la opción de inversión
            }
        });

        enviarDineroButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                enviarDinero();
            }
        });

        pagarServicioButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                pagarServicio();
            }
        });

        recargarTelefonoButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                recargarTelefono();
            }
        });

        retiroSinTarjetaButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                retiroSinTarjeta();
            }
        });


        panel.add(retirarButton);
        panel.add(saldoButton);
        panel.add(pagarServicioButton);
        panel.add(recargarTelefonoButton);
        panel.add(enviarDineroButton);
        panel.add(retiroSinTarjetaButton);
        panel.add(invertirButton);
        panel.add(depositarButton);
        panel.add(terminarButton);

        add(panel);

        setVisible(true);
    }

    private void retirarDinero() {
        String input = JOptionPane.showInputDialog("Ingrese la cantidad a retirar:");
        try {
            double cantidadARetirar = Double.parseDouble(input);

            if (cantidadARetirar > saldo) {
                JOptionPane.showMessageDialog(null, "Saldo insuficiente");
            } else {
                saldo -= cantidadARetirar;
                actualizarSaldoLabel();
                JOptionPane.showMessageDialog(null, "Retiro exitoso de $" + cantidadARetirar);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Cantidad inválida");
        }
    }

    private void retiroSinTarjeta() {
    int confirmacion = JOptionPane.showConfirmDialog(null, "¿Desea realizar un retiro sin tarjeta?", "Retiro sin Tarjeta", JOptionPane.YES_NO_OPTION);
    if (confirmacion == JOptionPane.YES_OPTION) {
        String inputMonto = JOptionPane.showInputDialog("Ingrese el monto a retirar:");
        try {
            double montoARetirar = Double.parseDouble(inputMonto);

            if (montoARetirar > saldo) {
                JOptionPane.showMessageDialog(null, "Saldo insuficiente");
            } else {
                // Generar un código aleatorio
                Random random = new Random();
                int codigoRetiro = 1000 + random.nextInt(9000); // Genera un código de 4 dígitos

                saldo -= montoARetirar; // Restar el monto retirado al saldo
                JOptionPane.showMessageDialog(null, "Su código de retiro es: " + codigoRetiro + "\nSe retiró: $" + montoARetirar);
                JOptionPane.showMessageDialog(null, "Saldo actual: $" + saldo);
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Monto inválido");
        }
    } else {
        JOptionPane.showMessageDialog(null, "Retiro cancelado.");
    }
}

private void terminarUso() {
    int confirmacion = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea terminar el uso?", "Terminar Uso", JOptionPane.YES_NO_OPTION);
    if (confirmacion == JOptionPane.YES_OPTION) {
        JOptionPane.showMessageDialog(null, "Gracias por usar el cajero automático. ¡Hasta luego!");
        System.exit(0); // Cierra la aplicación
    }
}

private void invertir() {
    String inputCantidad = JOptionPane.showInputDialog("Ingrese la cantidad a invertir:");
    try {
        double cantidadAInvertir = Double.parseDouble(inputCantidad);

        if (cantidadAInvertir <= 0) {
            JOptionPane.showMessageDialog(null, "Ingrese una cantidad válida para invertir.");
        } else {
            double tasaInteres = 0.05; // Tasa de interés del 5% (puedes ajustarla según tus necesidades)
            int tiempo = 12; // Tiempo en meses (puedes ajustarlo según tus necesidades)

            double interesGenerado = cantidadAInvertir * tasaInteres * tiempo;

            JOptionPane.showMessageDialog(null, "Cantidad invertida: $" + cantidadAInvertir +
                    "\nInterés generado después de " + tiempo + " meses al 5%: $" + interesGenerado);
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Cantidad inválida");
    }
}

    private void enviarDinero() {
        String input = JOptionPane.showInputDialog("Ingrese el monto a enviar:");
        try {
            double montoAEnviar = Double.parseDouble(input);
    
            if (montoAEnviar > saldo) {
                JOptionPane.showMessageDialog(null, "Saldo insuficiente");
            } else {
                // Aquí podrías tener lógica adicional para seleccionar destinatario, validar datos, etc.
                saldo -= montoAEnviar;
                actualizarSaldoLabel();
                JOptionPane.showMessageDialog(null, "Envío de $" + montoAEnviar + " realizado");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Cantidad inválida");
        }
    }

    private void mostrarSaldo() {
        JOptionPane.showMessageDialog(null, "Su saldo actual es: $" + saldo);
    }

    private void pagarServicio() {
        String[] servicios = { "Electricidad", "Agua", "Internet", "Teléfono" };
        String servicioSeleccionado = (String) JOptionPane.showInputDialog(
            this, "Seleccione el servicio a pagar:", "Pagar Servicio",
            JOptionPane.QUESTION_MESSAGE, null, servicios, servicios[0]
        );

        if (servicioSeleccionado != null) {
            String input = JOptionPane.showInputDialog("Ingrese el monto a pagar para " + servicioSeleccionado + ":");
            try {
                double montoAPagar = Double.parseDouble(input);

                if (montoAPagar > saldo) {
                    JOptionPane.showMessageDialog(this, "Saldo insuficiente");
                } else {
                    saldo -= montoAPagar;
                    actualizarSaldoLabel();
                    JOptionPane.showMessageDialog(this, "Pago de $" + montoAPagar + " para " + servicioSeleccionado + " realizado");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Cantidad inválida");
            }
        }
    }

    private void depositar() {
        String inputCantidad = JOptionPane.showInputDialog("Ingrese la cantidad a depositar:");
        try {
            double cantidadADepositar = Double.parseDouble(inputCantidad);
    
            if (cantidadADepositar <= 0) {
                JOptionPane.showMessageDialog(null, "Ingrese una cantidad válida para depositar.");
            } else {
                saldo += cantidadADepositar; // Agregar el monto depositado al saldo actual
                JOptionPane.showMessageDialog(null, "Se depositaron: $" + cantidadADepositar +
                        "\nSaldo actual: $" + saldo);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Cantidad inválida");
        }
    }

    private void recargarTelefono() {
        String[] companias = { "Compañía A", "Compañía B", "Compañía C", "Compañía D" };
        String companiaSeleccionada = (String) JOptionPane.showInputDialog(
            this, "Seleccione la compañía telefónica:", "Recargar Teléfono",
            JOptionPane.QUESTION_MESSAGE, null, companias, companias[0]
        );

        if (companiaSeleccionada != null) {
            String input = JOptionPane.showInputDialog("Ingrese el monto a recargar para " + companiaSeleccionada + ":");
            try {
                double montoRecarga = Double.parseDouble(input);

                if (montoRecarga > saldo) {
                    JOptionPane.showMessageDialog(this, "Saldo insuficiente");
                } else {
                    saldo -= montoRecarga;
                    actualizarSaldoLabel();
                    JOptionPane.showMessageDialog(this, "Recarga de $" + montoRecarga + " para " + companiaSeleccionada + " realizada");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Cantidad inválida");
            }
        }
    }

    private void actualizarSaldoLabel() {
        saldoLabel.setText("Saldo actual: $" + saldo);
    }

    public static void main(String[] args) {
        new Cajero();
    }
}