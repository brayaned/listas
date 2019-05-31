/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Brayan
 */
public class Ventana extends JFrame {
    
    Lista lista=new Lista();
    public Ventana(){
        setSize(500,500);
        setTitle("Listas");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        iniciarComponentes();
    }
    private void iniciarComponentes(){
        JPanel panel=new JPanel();
        panel.setLayout(null);
        panel.setBounds(600,600,700, 700);
        this.getContentPane().add(panel);
        JButton insertar=new JButton("1.Insertar");
        JButton imprimir=new JButton("2.Imprimir");
        JButton buscar=new JButton("3.Buscar");
        JButton retirar=new JButton("4.Retirar");
        JLabel etiqueta=new JLabel("Dato:");
        JLabel resultado=new JLabel();
        etiqueta.setBounds(60, 100, 50, 20);
        resultado.setBounds(250, 100, 200, 20);
        insertar.setBounds(10,50,100,20);
        imprimir.setBounds(130,50,100,20);
        buscar.setBounds(240,50,100,20);
        retirar.setBounds(360,50,100,20);
        panel.add(insertar);
        panel.add(imprimir);
        panel.add(buscar);
        panel.add(retirar);
        panel.add(etiqueta);
        panel.add(resultado);
        JTextField dato=new JTextField();
        dato.setBounds(100, 100, 100, 20);
        panel.add(dato);
        
        
        ActionListener accioninsertar = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String num=dato.getText();
                int d=Integer.parseInt(num);
                lista.insertar(d);
                
            }
        };
        insertar.addActionListener(accioninsertar);
        
        ActionListener accionbuscar = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                int d=Integer.parseInt(dato.getText());
                if(lista.buscar(d)==true){
                    resultado.setText("Se encontro el dato: "+d);
                }else{
                    resultado.setText("No se encontro el dato: "+d);
                }
                
            };
        };
        buscar.addActionListener(accionbuscar);
        
        ActionListener accionimprimir=new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                resultado.setText(lista.imprimir());
            }
        };
        imprimir.addActionListener(accionimprimir);
        
        ActionListener accionretirar=new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                int d=Integer.parseInt(dato.getText());
                int a =lista.retirar(d);
                resultado.setText(Integer.toString(a));
                
            }
        };
        retirar.addActionListener(accionretirar);
    }
}
