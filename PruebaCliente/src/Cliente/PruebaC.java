/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Cliente;

import ConvertidorUnidades.*;
import java.awt.Color;
/**
 *
 * @author aless
 */
public class PruebaC extends javax.swing.JFrame {

    /**
     * Creates new form PruebaC
     */
    public PruebaC() {
        initComponents();
    }
    
    static Final fin=new Final();
    
    public void volumenes(){
        Volumen vol=new Volumen();
        double u=Double.parseDouble(txtUnidades.getText());
        double respuesta=-1;
        String conv=txtCambiar.getText().toLowerCase();
        String ertira=txtSistema.getText().toLowerCase();
        switch (conv){
            case "m3":
                if (ertira.equals("m3")) respuesta=vol.convertirM3(u,ertira);
                else if (ertira.equals("cm3")) respuesta=vol.convertirM3(u,ertira);
                else if (ertira.equals("in3")) respuesta=vol.convertirM3(u,ertira);
                else if (ertira.equals("ft3")) respuesta=vol.convertirM3(u,ertira);
                else if (ertira.equals("yd3")) respuesta=vol.convertirM3(u,ertira);
                else if (ertira.equals("l")) respuesta=vol.convertirM3(u,ertira);
                else {
                    lblError.setForeground(Color.red);
                    lblError.setText("Se ha ingresado mal la segunda unidad de medida");
                    txtRespuesta.setText("");
                }
            break;
            case "cm3":
                if (ertira.equals("m3")) respuesta=vol.convertirCm3(u,ertira);
                else if (ertira.equals("cm3")) respuesta=vol.convertirCm3(u,ertira);
                else if (ertira.equals("in3")) respuesta=vol.convertirCm3(u,ertira);
                else if (ertira.equals("ft3")) respuesta=vol.convertirCm3(u,ertira);
                else if (ertira.equals("yd3")) respuesta=vol.convertirCm3(u,ertira);
                else if (ertira.equals("l")) respuesta=vol.convertirCm3(u,ertira);
                else {
                    lblError.setForeground(Color.red);
                    lblError.setText("Se ha ingresado mal la segunda unidad de medida");
                    txtRespuesta.setText("");
                }
            break;
            case "in3":
                if (ertira.equals("m3")) respuesta=vol.convertirIn3(u,ertira);
                else if (ertira.equals("cm3")) respuesta=vol.convertirIn3(u,ertira);
                else if (ertira.equals("in3")) respuesta=vol.convertirIn3(u,ertira);
                else if (ertira.equals("ft3")) respuesta=vol.convertirIn3(u,ertira);
                else if (ertira.equals("yd3")) respuesta=vol.convertirIn3(u,ertira);
                else if (ertira.equals("l")) respuesta=vol.convertirIn3(u,ertira);
                else {
                    lblError.setForeground(Color.red);
                    lblError.setText("Se ha ingresado mal la segunda unidad de medida");
                    txtRespuesta.setText("");
                }
            break;
            case "ft3":
                if (ertira.equals("m3")) respuesta=vol.convertirFt3(u,ertira);
                else if (ertira.equals("cm3")) respuesta=vol.convertirFt3(u,ertira);
                else if (ertira.equals("in3")) respuesta=vol.convertirFt3(u,ertira);
                else if (ertira.equals("ft3")) respuesta=vol.convertirFt3(u,ertira);
                else if (ertira.equals("yd3")) respuesta=vol.convertirFt3(u,ertira);
                else if (ertira.equals("l")) respuesta=vol.convertirFt3(u,ertira);
                else {
                    lblError.setForeground(Color.red);
                    lblError.setText("Se ha ingresado mal la segunda unidad de medida");
                    txtRespuesta.setText("");
                }
            break;
            case "yd3":
                if (ertira.equals("m3")) respuesta=vol.convertirYd3(u,ertira);
                else if (ertira.equals("cm3")) respuesta=vol.convertirYd3(u,ertira);
                else if (ertira.equals("in3")) respuesta=vol.convertirYd3(u,ertira);
                else if (ertira.equals("ft3")) respuesta=vol.convertirYd3(u,ertira);
                else if (ertira.equals("yd3")) respuesta=vol.convertirYd3(u,ertira);
                else if (ertira.equals("l")) respuesta=vol.convertirYd3(u,ertira);
                else {
                    lblError.setForeground(Color.red);
                    lblError.setText("Se ha ingresado mal la segunda unidad de medida");
                    txtRespuesta.setText("");
                }
            break;
            case "l":
                if (ertira.equals("m3")) respuesta=vol.convertirLitros(u,ertira);
                else if (ertira.equals("cm3")) respuesta=vol.convertirLitros(u,ertira);
                else if (ertira.equals("in3")) respuesta=vol.convertirLitros(u,ertira);
                else if (ertira.equals("ft3")) respuesta=vol.convertirLitros(u,ertira);
                else if (ertira.equals("yd3")) respuesta=vol.convertirLitros(u,ertira);
                else if (ertira.equals("l")) respuesta=vol.convertirLitros(u,ertira);
                else {
                    lblError.setForeground(Color.red);
                    lblError.setText("Se ha ingresado mal la segunda unidad de medida");
                    txtRespuesta.setText("");
                }
            break;
            default:
                lblError.setForeground(Color.red);
                lblError.setText("Se ha ingresado mal la primer unidad de medida");
                txtRespuesta.setText("");
            break;
        }
        if (respuesta!=(-1)){
            lblError.setForeground(Color.black);
            lblError.setText("");
            txtRespuesta.setText(""+respuesta+" "+ertira);
        }
    }
    
    public void grados(){
        Grados gra=new Grados();
        double u=Double.parseDouble(txtUnidades.getText());
        double respuesta=-1;
        String conv=txtCambiar.getText().toLowerCase();
        String ertira=txtSistema.getText().toLowerCase();
        switch (conv){
            case "gra":
                if (ertira.equals("gra")) respuesta=gra.convertirGrados(u,ertira);
                else if (ertira.equals("rad")) respuesta=gra.convertirGrados(u,ertira);
                else {
                    lblError.setForeground(Color.red);
                    lblError.setText("Se ha ingresado mal la segunda unidad de medida");
                    txtRespuesta.setText("");
                }
            break;
            case "rad":
                if (ertira.equals("gra")) respuesta=gra.convertirRadianes(u,ertira);
                else if (ertira.equals("rad")) respuesta=gra.convertirRadianes(u,ertira);
                else {
                    lblError.setForeground(Color.red);
                    lblError.setText("Se ha ingresado mal la segunda unidad de medida");
                    txtRespuesta.setText("");
                }
            break;
            default:
                lblError.setForeground(Color.red);
                lblError.setText("Se ha ingresado mal la primer unidad de medida");
                txtRespuesta.setText("");
            break;
        }
        if (respuesta!=(-1)){
            lblError.setForeground(Color.black);
            lblError.setText("");
            txtRespuesta.setText(""+respuesta+" "+ertira);
        }
    }
    
    public void velocidades(){
        Velocidad vel=new Velocidad();
        double u=Double.parseDouble(txtUnidades.getText());
        double respuesta=-1;
        String conv=txtCambiar.getText().toLowerCase();
        String ertira=txtSistema.getText().toLowerCase();
        switch (conv){
            case "m/s":
                if (ertira.equals("m/s")) respuesta=vel.convertirMS(u,ertira);
                else if (ertira.equals("mi/h")) respuesta=vel.convertirMS(u,ertira);
                else if (ertira.equals("pie/s")) respuesta=vel.convertirMS(u,ertira);
                else if (ertira.equals("km/h")) respuesta=vel.convertirMS(u,ertira);
                else {
                    lblError.setForeground(Color.red);
                    lblError.setText("Se ha ingresado mal la segunda unidad de medida");
                    txtRespuesta.setText("");
                }
            break;
            case "mi/h":
                if (ertira.equals("m/s")) respuesta=vel.convertirMiH(u,ertira);
                else if (ertira.equals("mi/h")) respuesta=vel.convertirMiH(u,ertira);
                else if (ertira.equals("pie/s")) respuesta=vel.convertirMiH(u,ertira);
                else if (ertira.equals("km/h")) respuesta=vel.convertirMiH(u,ertira);
                else {
                    lblError.setForeground(Color.red);
                    lblError.setText("Se ha ingresado mal la segunda unidad de medida");
                    txtRespuesta.setText("");
                }
            break;
            case "pie/s":
                if (ertira.equals("m/s")) respuesta=vel.convertirPieS(u,ertira);
                else if (ertira.equals("mi/h")) respuesta=vel.convertirPieS(u,ertira);
                else if (ertira.equals("pie/s")) respuesta=vel.convertirPieS(u,ertira);
                else if (ertira.equals("km/h")) respuesta=vel.convertirPieS(u,ertira);
                else {
                    lblError.setForeground(Color.red);
                    lblError.setText("Se ha ingresado mal la segunda unidad de medida");
                    txtRespuesta.setText("");
                }
            break;
            case "km/h":
                if (ertira.equals("m/s")) respuesta=vel.convertirKmH(u,ertira);
                else if (ertira.equals("mi/h")) respuesta=vel.convertirKmH(u,ertira);
                else if (ertira.equals("pie/s")) respuesta=vel.convertirKmH(u,ertira);
                else if (ertira.equals("km/h")) respuesta=vel.convertirKmH(u,ertira);
                else {
                    lblError.setForeground(Color.red);
                    lblError.setText("Se ha ingresado mal la segunda unidad de medida");
                    txtRespuesta.setText("");
                }
            break;
            default:
                lblError.setForeground(Color.red);
                lblError.setText("Se ha ingresado mal la primer unidad de medida");
                txtRespuesta.setText("");
            break;
        }
        if (respuesta!=(-1)){
            lblError.setForeground(Color.black);
            lblError.setText("");
            txtRespuesta.setText(""+respuesta+" "+ertira);
        }
    }
    
    public void tiempos(){
        Tiempo tie=new Tiempo();
        double u=Double.parseDouble(txtUnidades.getText());
        double respuesta=-1;
        String conv=txtCambiar.getText().toLowerCase();
        String ertira=txtSistema.getText().toLowerCase();
        switch (conv){
            case "seg":
                if (ertira.equals("seg")) respuesta=tie.convertirSegundos(u,ertira);
                else if (ertira.equals("min")) respuesta=tie.convertirSegundos(u,ertira);
                else if (ertira.equals("hrs")) respuesta=tie.convertirSegundos(u,ertira);
                else if (ertira.equals("dias")) respuesta=tie.convertirSegundos(u,ertira);
                else if (ertira.equals("sem")) respuesta=tie.convertirSegundos(u,ertira);
                else if (ertira.equals("mes")) respuesta=tie.convertirSegundos(u,ertira);
                else if (ertira.equals("año")) respuesta=tie.convertirSegundos(u,ertira);
                else if (ertira.equals("dec")) respuesta=tie.convertirSegundos(u,ertira);
                else if (ertira.equals("sig")) respuesta=tie.convertirSegundos(u,ertira);
                else {
                    lblError.setForeground(Color.red);
                    lblError.setText("Se ha ingresado mal la segunda unidad de medida");
                    txtRespuesta.setText("");
                }
            break;
            case "min":
                if (ertira.equals("seg")) respuesta=tie.convertirMinutos(u,ertira);
                else if (ertira.equals("min")) respuesta=tie.convertirMinutos(u,ertira);
                else if (ertira.equals("hrs")) respuesta=tie.convertirMinutos(u,ertira);
                else if (ertira.equals("dias")) respuesta=tie.convertirMinutos(u,ertira);
                else if (ertira.equals("sem")) respuesta=tie.convertirMinutos(u,ertira);
                else if (ertira.equals("mes")) respuesta=tie.convertirMinutos(u,ertira);
                else if (ertira.equals("año")) respuesta=tie.convertirMinutos(u,ertira);
                else if (ertira.equals("dec")) respuesta=tie.convertirMinutos(u,ertira);
                else if (ertira.equals("sig")) respuesta=tie.convertirMinutos(u,ertira);
                else {
                    lblError.setForeground(Color.red);
                    lblError.setText("Se ha ingresado mal la segunda unidad de medida");
                    txtRespuesta.setText("");
                }
            break;
            case "hrs":
                if (ertira.equals("seg")) respuesta=tie.convertirHoras(u,ertira);
                else if (ertira.equals("min")) respuesta=tie.convertirHoras(u,ertira);
                else if (ertira.equals("hrs")) respuesta=tie.convertirHoras(u,ertira);
                else if (ertira.equals("dias")) respuesta=tie.convertirHoras(u,ertira);
                else if (ertira.equals("sem")) respuesta=tie.convertirHoras(u,ertira);
                else if (ertira.equals("mes")) respuesta=tie.convertirHoras(u,ertira);
                else if (ertira.equals("año")) respuesta=tie.convertirHoras(u,ertira);
                else if (ertira.equals("dec")) respuesta=tie.convertirHoras(u,ertira);
                else if (ertira.equals("sig")) respuesta=tie.convertirHoras(u,ertira);
                else {
                    lblError.setForeground(Color.red);
                    lblError.setText("Se ha ingresado mal la segunda unidad de medida");
                    txtRespuesta.setText("");
                }
            break;
            case "dias":
                if (ertira.equals("seg")) respuesta=tie.convertirDias(u,ertira);
                else if (ertira.equals("min")) respuesta=tie.convertirDias(u,ertira);
                else if (ertira.equals("hrs")) respuesta=tie.convertirDias(u,ertira);
                else if (ertira.equals("dias")) respuesta=tie.convertirDias(u,ertira);
                else if (ertira.equals("sem")) respuesta=tie.convertirDias(u,ertira);
                else if (ertira.equals("mes")) respuesta=tie.convertirDias(u,ertira);
                else if (ertira.equals("año")) respuesta=tie.convertirDias(u,ertira);
                else if (ertira.equals("dec")) respuesta=tie.convertirDias(u,ertira);
                else if (ertira.equals("sig")) respuesta=tie.convertirDias(u,ertira);
                else {
                    lblError.setForeground(Color.red);
                    lblError.setText("Se ha ingresado mal la segunda unidad de medida");
                    txtRespuesta.setText("");
                }
            break;
            case "sem":
                if (ertira.equals("seg")) respuesta=tie.convertirSemanas(u,ertira);
                else if (ertira.equals("min")) respuesta=tie.convertirSemanas(u,ertira);
                else if (ertira.equals("hrs")) respuesta=tie.convertirSemanas(u,ertira);
                else if (ertira.equals("dias")) respuesta=tie.convertirSemanas(u,ertira);
                else if (ertira.equals("sem")) respuesta=tie.convertirSemanas(u,ertira);
                else if (ertira.equals("mes")) respuesta=tie.convertirSemanas(u,ertira);
                else if (ertira.equals("año")) respuesta=tie.convertirSemanas(u,ertira);
                else if (ertira.equals("dec")) respuesta=tie.convertirSemanas(u,ertira);
                else if (ertira.equals("sig")) respuesta=tie.convertirSemanas(u,ertira);
                else {
                    lblError.setForeground(Color.red);
                    lblError.setText("Se ha ingresado mal la segunda unidad de medida");
                    txtRespuesta.setText("");
                }
            break;
            case "mes":
                if (ertira.equals("seg")) respuesta=tie.convertirMeses(u,ertira);
                else if (ertira.equals("min")) respuesta=tie.convertirMeses(u,ertira);
                else if (ertira.equals("hrs")) respuesta=tie.convertirMeses(u,ertira);
                else if (ertira.equals("dias")) respuesta=tie.convertirMeses(u,ertira);
                else if (ertira.equals("sem")) respuesta=tie.convertirMeses(u,ertira);
                else if (ertira.equals("mes")) respuesta=tie.convertirMeses(u,ertira);
                else if (ertira.equals("año")) respuesta=tie.convertirMeses(u,ertira);
                else if (ertira.equals("dec")) respuesta=tie.convertirMeses(u,ertira);
                else if (ertira.equals("sig")) respuesta=tie.convertirMeses(u,ertira);
                else {
                    lblError.setForeground(Color.red);
                    lblError.setText("Se ha ingresado mal la segunda unidad de medida");
                    txtRespuesta.setText("");
                }
            break;
            case "año":
                if (ertira.equals("seg")) respuesta=tie.convertirAños(u,ertira);
                else if (ertira.equals("min")) respuesta=tie.convertirAños(u,ertira);
                else if (ertira.equals("hrs")) respuesta=tie.convertirAños(u,ertira);
                else if (ertira.equals("dias")) respuesta=tie.convertirAños(u,ertira);
                else if (ertira.equals("sem")) respuesta=tie.convertirAños(u,ertira);
                else if (ertira.equals("mes")) respuesta=tie.convertirAños(u,ertira);
                else if (ertira.equals("año")) respuesta=tie.convertirAños(u,ertira);
                else if (ertira.equals("dec")) respuesta=tie.convertirAños(u,ertira);
                else if (ertira.equals("sig")) respuesta=tie.convertirAños(u,ertira);
                else {
                    lblError.setForeground(Color.red);
                    lblError.setText("Se ha ingresado mal la segunda unidad de medida");
                    txtRespuesta.setText("");
                }
            break;
            case "dec":
                if (ertira.equals("seg")) respuesta=tie.convertirDecadas(u,ertira);
                else if (ertira.equals("min")) respuesta=tie.convertirDecadas(u,ertira);
                else if (ertira.equals("hrs")) respuesta=tie.convertirDecadas(u,ertira);
                else if (ertira.equals("dias")) respuesta=tie.convertirDecadas(u,ertira);
                else if (ertira.equals("sem")) respuesta=tie.convertirDecadas(u,ertira);
                else if (ertira.equals("mes")) respuesta=tie.convertirDecadas(u,ertira);
                else if (ertira.equals("año")) respuesta=tie.convertirDecadas(u,ertira);
                else if (ertira.equals("dec")) respuesta=tie.convertirDecadas(u,ertira);
                else if (ertira.equals("sig")) respuesta=tie.convertirDecadas(u,ertira);
                else {
                    lblError.setForeground(Color.red);
                    lblError.setText("Se ha ingresado mal la segunda unidad de medida");
                    txtRespuesta.setText("");
                }
            break;
            case "sig":
                if (ertira.equals("seg")) respuesta=tie.convertirSiglos(u,ertira);
                else if (ertira.equals("min")) respuesta=tie.convertirSiglos(u,ertira);
                else if (ertira.equals("hrs")) respuesta=tie.convertirSiglos(u,ertira);
                else if (ertira.equals("dias")) respuesta=tie.convertirSiglos(u,ertira);
                else if (ertira.equals("sem")) respuesta=tie.convertirSiglos(u,ertira);
                else if (ertira.equals("mes")) respuesta=tie.convertirSiglos(u,ertira);
                else if (ertira.equals("año")) respuesta=tie.convertirSiglos(u,ertira);
                else if (ertira.equals("dec")) respuesta=tie.convertirSiglos(u,ertira);
                else if (ertira.equals("sig")) respuesta=tie.convertirSiglos(u,ertira);
                else {
                    lblError.setForeground(Color.red);
                    lblError.setText("Se ha ingresado mal la segunda unidad de medida");
                    txtRespuesta.setText("");
                }
            break;
            default:
                lblError.setForeground(Color.red);
                lblError.setText("Se ha ingresado mal la primer unidad de medida");
                txtRespuesta.setText("");
            break;
        }
        if (respuesta!=(-1)){
            lblError.setForeground(Color.black);
            lblError.setText("");
            txtRespuesta.setText(""+respuesta+" "+ertira);
        }
    }
    
    public void temperaturas(){
        Temperatura tem=new Temperatura();
        double u=Double.parseDouble(txtUnidades.getText());
        double respuesta=-1;
        String conv=txtCambiar.getText().toLowerCase();
        String ertira=txtSistema.getText().toLowerCase();
        switch (conv){
            case "c":
                if (ertira.equals("c")) respuesta=tem.convertirCelsius(u,ertira);
                else if (ertira.equals("f")) respuesta=tem.convertirCelsius(u,ertira);
                else if (ertira.equals("k")) respuesta=tem.convertirCelsius(u,ertira);
                else {
                    lblError.setForeground(Color.red);
                    lblError.setText("Se ha ingresado mal la segunda unidad de medida");
                    txtRespuesta.setText("");
                }
            break;
            case "f":
                if (ertira.equals("c")) respuesta=tem.convertirFahrenheit(u,ertira);
                else if (ertira.equals("f")) respuesta=tem.convertirFahrenheit(u,ertira);
                else if (ertira.equals("k")) respuesta=tem.convertirFahrenheit(u,ertira);
                else {
                    lblError.setForeground(Color.red);
                    lblError.setText("Se ha ingresado mal la segunda unidad de medida");
                    txtRespuesta.setText("");
                }
            break;
            case "k":
                if (ertira.equals("c")) respuesta=tem.convertirKelvin(u,ertira);
                else if (ertira.equals("f")) respuesta=tem.convertirKelvin(u,ertira);
                else if (ertira.equals("k")) respuesta=tem.convertirKelvin(u,ertira);
                else {
                    lblError.setForeground(Color.red);
                    lblError.setText("Se ha ingresado mal la segunda unidad de medida");
                    txtRespuesta.setText("");
                }
            break;
            default:
                lblError.setForeground(Color.red);
                lblError.setText("Se ha ingresado mal la primer unidad de medida");
                txtRespuesta.setText("");
            break;
        }
        if (respuesta!=(-1)){
            lblError.setForeground(Color.black);
            lblError.setText("");
            txtRespuesta.setText(""+respuesta+" "+ertira);
        }
    }
    
    public void masas(){
        Masa mas=new Masa();
        double u=Double.parseDouble(txtUnidades.getText());
        double respuesta=-1;
        String conv=txtCambiar.getText().toLowerCase();
        String ertira=txtSistema.getText().toLowerCase();
        switch (conv){
            case "mg":
                if (ertira.equals("mg")) respuesta=mas.convertirMG(u,ertira);
                else if (ertira.equals("cg")) respuesta=mas.convertirMG(u,ertira);
                else if (ertira.equals("dg")) respuesta=mas.convertirMG(u,ertira);
                else if (ertira.equals("g")) respuesta=mas.convertirMG(u,ertira);
                else if (ertira.equals("dag")) respuesta=mas.convertirMG(u,ertira);
                else if (ertira.equals("hg")) respuesta=mas.convertirMG(u,ertira);
                else if (ertira.equals("kg")) respuesta=mas.convertirMG(u,ertira);
                else if (ertira.equals("t")) respuesta=mas.convertirMG(u,ertira);
                else {
                    lblError.setForeground(Color.red);
                    lblError.setText("Se ha ingresado mal la segunda unidad de medida");
                    txtRespuesta.setText("");
                }
            break;
            case "cg":
                if (ertira.equals("mg")) respuesta=mas.convertirCG(u,ertira);
                else if (ertira.equals("cg")) respuesta=mas.convertirCG(u,ertira);
                else if (ertira.equals("dg")) respuesta=mas.convertirCG(u,ertira);
                else if (ertira.equals("g")) respuesta=mas.convertirCG(u,ertira);
                else if (ertira.equals("dag")) respuesta=mas.convertirCG(u,ertira);
                else if (ertira.equals("hg")) respuesta=mas.convertirCG(u,ertira);
                else if (ertira.equals("kg")) respuesta=mas.convertirCG(u,ertira);
                else if (ertira.equals("t")) respuesta=mas.convertirCG(u,ertira);
                else {
                    lblError.setForeground(Color.red);
                    lblError.setText("Se ha ingresado mal la segunda unidad de medida");
                    txtRespuesta.setText("");
                }
            break;
            case "dg":
                if (ertira.equals("mg")) respuesta=mas.convertirDG(u,ertira);
                else if (ertira.equals("cg")) respuesta=mas.convertirDG(u,ertira);
                else if (ertira.equals("dg")) respuesta=mas.convertirDG(u,ertira);
                else if (ertira.equals("g")) respuesta=mas.convertirDG(u,ertira);
                else if (ertira.equals("dag")) respuesta=mas.convertirDG(u,ertira);
                else if (ertira.equals("hg")) respuesta=mas.convertirDG(u,ertira);
                else if (ertira.equals("kg")) respuesta=mas.convertirDG(u,ertira);
                else if (ertira.equals("t")) respuesta=mas.convertirDG(u,ertira);
                else {
                    lblError.setForeground(Color.red);
                    lblError.setText("Se ha ingresado mal la segunda unidad de medida");
                    txtRespuesta.setText("");
                }
            break;
            case "g":
                if (ertira.equals("mg")) respuesta=mas.convertirG(u,ertira);
                else if (ertira.equals("cg")) respuesta=mas.convertirG(u,ertira);
                else if (ertira.equals("dg")) respuesta=mas.convertirG(u,ertira);
                else if (ertira.equals("g")) respuesta=mas.convertirG(u,ertira);
                else if (ertira.equals("dag")) respuesta=mas.convertirG(u,ertira);
                else if (ertira.equals("hg")) respuesta=mas.convertirG(u,ertira);
                else if (ertira.equals("kg")) respuesta=mas.convertirG(u,ertira);
                else if (ertira.equals("t")) respuesta=mas.convertirG(u,ertira);
                else {
                    lblError.setForeground(Color.red);
                    lblError.setText("Se ha ingresado mal la segunda unidad de medida");
                    txtRespuesta.setText("");
                }
            break;
            case "dag":
                if (ertira.equals("mg")) respuesta=mas.convertirDAG(u,ertira);
                else if (ertira.equals("cg")) respuesta=mas.convertirDAG(u,ertira);
                else if (ertira.equals("dg")) respuesta=mas.convertirDAG(u,ertira);
                else if (ertira.equals("g")) respuesta=mas.convertirDAG(u,ertira);
                else if (ertira.equals("dag")) respuesta=mas.convertirDAG(u,ertira);
                else if (ertira.equals("hg")) respuesta=mas.convertirDAG(u,ertira);
                else if (ertira.equals("kg")) respuesta=mas.convertirDAG(u,ertira);
                else if (ertira.equals("t")) respuesta=mas.convertirDAG(u,ertira);
                else {
                    lblError.setForeground(Color.red);
                    lblError.setText("Se ha ingresado mal la segunda unidad de medida");
                    txtRespuesta.setText("");
                }
            break;
            case "hg":
                if (ertira.equals("mg")) respuesta=mas.convertirHG(u,ertira);
                else if (ertira.equals("cg")) respuesta=mas.convertirHG(u,ertira);
                else if (ertira.equals("dg")) respuesta=mas.convertirHG(u,ertira);
                else if (ertira.equals("g")) respuesta=mas.convertirHG(u,ertira);
                else if (ertira.equals("dag")) respuesta=mas.convertirHG(u,ertira);
                else if (ertira.equals("hg")) respuesta=mas.convertirHG(u,ertira);
                else if (ertira.equals("kg")) respuesta=mas.convertirHG(u,ertira);
                else if (ertira.equals("t")) respuesta=mas.convertirHG(u,ertira);
                else {
                    lblError.setForeground(Color.red);
                    lblError.setText("Se ha ingresado mal la segunda unidad de medida");
                    txtRespuesta.setText("");
                }
            break;
            case "kg":
                if (ertira.equals("mg")) respuesta=mas.convertirKG(u,ertira);
                else if (ertira.equals("cg")) respuesta=mas.convertirKG(u,ertira);
                else if (ertira.equals("dg")) respuesta=mas.convertirKG(u,ertira);
                else if (ertira.equals("g")) respuesta=mas.convertirKG(u,ertira);
                else if (ertira.equals("dag")) respuesta=mas.convertirKG(u,ertira);
                else if (ertira.equals("hg")) respuesta=mas.convertirKG(u,ertira);
                else if (ertira.equals("kg")) respuesta=mas.convertirKG(u,ertira);
                else if (ertira.equals("t")) respuesta=mas.convertirKG(u,ertira);
                else {
                    lblError.setForeground(Color.red);
                    lblError.setText("Se ha ingresado mal la segunda unidad de medida");
                    txtRespuesta.setText("");
                }
            break;
            case "t":
                if (ertira.equals("mg")) respuesta=mas.convertirT(u,ertira);
                else if (ertira.equals("cg")) respuesta=mas.convertirT(u,ertira);
                else if (ertira.equals("dg")) respuesta=mas.convertirT(u,ertira);
                else if (ertira.equals("g")) respuesta=mas.convertirT(u,ertira);
                else if (ertira.equals("dag")) respuesta=mas.convertirT(u,ertira);
                else if (ertira.equals("hg")) respuesta=mas.convertirT(u,ertira);
                else if (ertira.equals("kg")) respuesta=mas.convertirT(u,ertira);
                else if (ertira.equals("t")) respuesta=mas.convertirT(u,ertira);
                else {
                    lblError.setForeground(Color.red);
                    lblError.setText("Se ha ingresado mal la segunda unidad de medida");
                    txtRespuesta.setText("");
                }
            break;
            default:
                lblError.setForeground(Color.red);
                lblError.setText("Se ha ingresado mal la primer unidad de medida");
                txtRespuesta.setText("");
            break;
        }
        if (respuesta!=(-1)){
            lblError.setForeground(Color.black);
            lblError.setText("");
            txtRespuesta.setText(""+respuesta+" "+ertira);
        }
    }
    
    public void liquidos(){
        Liquido liq=new Liquido();
        double u=Double.parseDouble(txtUnidades.getText());
        double respuesta=-1;
        String conv=txtCambiar.getText().toLowerCase();
        String ertira=txtSistema.getText().toLowerCase();
        switch (conv){
            case "ml":
                if (ertira.equals("ml")) respuesta=liq.convertirML(u,ertira);
                else if (ertira.equals("cl")) respuesta=liq.convertirML(u,ertira);
                else if (ertira.equals("dl")) respuesta=liq.convertirML(u,ertira);
                else if (ertira.equals("l")) respuesta=liq.convertirML(u,ertira);
                else if (ertira.equals("dal")) respuesta=liq.convertirML(u,ertira);
                else if (ertira.equals("hl")) respuesta=liq.convertirML(u,ertira);
                else if (ertira.equals("kl")) respuesta=liq.convertirML(u,ertira);
                else {
                    lblError.setForeground(Color.red);
                    lblError.setText("Se ha ingresado mal la segunda unidad de medida");
                    txtRespuesta.setText("");
                }
            break;
            case "cl":
                if (ertira.equals("ml")) respuesta=liq.convertirCL(u,ertira);
                else if (ertira.equals("cl")) respuesta=liq.convertirCL(u,ertira);
                else if (ertira.equals("dl")) respuesta=liq.convertirCL(u,ertira);
                else if (ertira.equals("l")) respuesta=liq.convertirCL(u,ertira);
                else if (ertira.equals("dal")) respuesta=liq.convertirCL(u,ertira);
                else if (ertira.equals("hl")) respuesta=liq.convertirCL(u,ertira);
                else if (ertira.equals("kl")) respuesta=liq.convertirCL(u,ertira);
                else {
                    lblError.setForeground(Color.red);
                    lblError.setText("Se ha ingresado mal la segunda unidad de medida");
                    txtRespuesta.setText("");
                }
            break;
            case "dl":
                if (ertira.equals("ml")) respuesta=liq.convertirDL(u,ertira);
                else if (ertira.equals("cl")) respuesta=liq.convertirDL(u,ertira);
                else if (ertira.equals("dl")) respuesta=liq.convertirDL(u,ertira);
                else if (ertira.equals("l")) respuesta=liq.convertirDL(u,ertira);
                else if (ertira.equals("dal")) respuesta=liq.convertirDL(u,ertira);
                else if (ertira.equals("hl")) respuesta=liq.convertirDL(u,ertira);
                else if (ertira.equals("kl")) respuesta=liq.convertirDL(u,ertira);
                else {
                    lblError.setForeground(Color.red);
                    lblError.setText("Se ha ingresado mal la segunda unidad de medida");
                    txtRespuesta.setText("");
                }
            break;
            case "l":
                if (ertira.equals("ml")) respuesta=liq.convertirL(u,ertira);
                else if (ertira.equals("cl")) respuesta=liq.convertirL(u,ertira);
                else if (ertira.equals("dl")) respuesta=liq.convertirL(u,ertira);
                else if (ertira.equals("l")) respuesta=liq.convertirL(u,ertira);
                else if (ertira.equals("dal")) respuesta=liq.convertirL(u,ertira);
                else if (ertira.equals("hl")) respuesta=liq.convertirL(u,ertira);
                else if (ertira.equals("kl")) respuesta=liq.convertirL(u,ertira);
                else {
                    lblError.setForeground(Color.red);
                    lblError.setText("Se ha ingresado mal la segunda unidad de medida");
                    txtRespuesta.setText("");
                }
            break;
            case "dal":
                if (ertira.equals("ml")) respuesta=liq.convertirDAL(u,ertira);
                else if (ertira.equals("cl")) respuesta=liq.convertirDAL(u,ertira);
                else if (ertira.equals("dl")) respuesta=liq.convertirDAL(u,ertira);
                else if (ertira.equals("l")) respuesta=liq.convertirDAL(u,ertira);
                else if (ertira.equals("dal")) respuesta=liq.convertirDAL(u,ertira);
                else if (ertira.equals("hl")) respuesta=liq.convertirDAL(u,ertira);
                else if (ertira.equals("kl")) respuesta=liq.convertirDAL(u,ertira);
                else {
                    lblError.setForeground(Color.red);
                    lblError.setText("Se ha ingresado mal la segunda unidad de medida");
                    txtRespuesta.setText("");
                }
            break;
            case "hl":
                if (ertira.equals("ml")) respuesta=liq.convertirHL(u,ertira);
                else if (ertira.equals("cl")) respuesta=liq.convertirHL(u,ertira);
                else if (ertira.equals("dl")) respuesta=liq.convertirHL(u,ertira);
                else if (ertira.equals("l")) respuesta=liq.convertirHL(u,ertira);
                else if (ertira.equals("dal")) respuesta=liq.convertirHL(u,ertira);
                else if (ertira.equals("hl")) respuesta=liq.convertirHL(u,ertira);
                else if (ertira.equals("kl")) respuesta=liq.convertirHL(u,ertira);
                else {
                    lblError.setForeground(Color.red);
                    lblError.setText("Se ha ingresado mal la segunda unidad de medida");
                    txtRespuesta.setText("");
                }
            break;
            case "kl":
                if (ertira.equals("ml")) respuesta=liq.convertirKL(u,ertira);
                else if (ertira.equals("cl")) respuesta=liq.convertirKL(u,ertira);
                else if (ertira.equals("dl")) respuesta=liq.convertirKL(u,ertira);
                else if (ertira.equals("l")) respuesta=liq.convertirKL(u,ertira);
                else if (ertira.equals("dal")) respuesta=liq.convertirKL(u,ertira);
                else if (ertira.equals("hl")) respuesta=liq.convertirKL(u,ertira);
                else if (ertira.equals("kl")) respuesta=liq.convertirKL(u,ertira);
                else {
                    lblError.setForeground(Color.red);
                    lblError.setText("Se ha ingresado mal la segunda unidad de medida");
                    txtRespuesta.setText("");
                }
            break;
            default:
                lblError.setForeground(Color.red);
                lblError.setText("Se ha ingresado mal la primer unidad de medida");
                txtRespuesta.setText("");
            break;
        }
        if (respuesta!=(-1)){
            lblError.setForeground(Color.black);
            lblError.setText("");
            txtRespuesta.setText(""+respuesta+" "+ertira);
        }
    }
    
    public void areas(){
        Area are=new Area();
        double u=Double.parseDouble(txtUnidades.getText());
        double respuesta=-1;
        String conv=txtCambiar.getText().toLowerCase();
        String ertira=txtSistema.getText().toLowerCase();
        switch (conv){
            case "mm2":
                if (ertira.equals("mm2")) respuesta=are.convertirMm2(u,ertira);
                else if (ertira.equals("cm2")) respuesta=are.convertirMm2(u,ertira);
                else if (ertira.equals("m2")) respuesta=are.convertirMm2(u,ertira);
                else if (ertira.equals("ha2")) respuesta=are.convertirMm2(u,ertira);
                else if (ertira.equals("km2")) respuesta=are.convertirMm2(u,ertira);
                else if (ertira.equals("ft2")) respuesta=are.convertirMm2(u,ertira);
                else if (ertira.equals("yd2")) respuesta=are.convertirMm2(u,ertira);
                else {
                    lblError.setForeground(Color.red);
                    lblError.setText("Se ha ingresado mal la segunda unidad de medida");
                    txtRespuesta.setText("");
                }
            break;
            case "cm2":
                if (ertira.equals("mm2")) respuesta=are.convertirCm2(u,ertira);
                else if (ertira.equals("cm2")) respuesta=are.convertirCm2(u,ertira);
                else if (ertira.equals("m2")) respuesta=are.convertirCm2(u,ertira);
                else if (ertira.equals("ha2")) respuesta=are.convertirCm2(u,ertira);
                else if (ertira.equals("km2")) respuesta=are.convertirCm2(u,ertira);
                else if (ertira.equals("ft2")) respuesta=are.convertirCm2(u,ertira);
                else if (ertira.equals("yd2")) respuesta=are.convertirCm2(u,ertira);
                else {
                    lblError.setForeground(Color.red);
                    lblError.setText("Se ha ingresado mal la segunda unidad de medida");
                    txtRespuesta.setText("");
                }
            break;
            case "m2":
                if (ertira.equals("mm2")) respuesta=are.convertirM2(u,ertira);
                else if (ertira.equals("cm2")) respuesta=are.convertirM2(u,ertira);
                else if (ertira.equals("m2")) respuesta=are.convertirM2(u,ertira);
                else if (ertira.equals("ha2")) respuesta=are.convertirM2(u,ertira);
                else if (ertira.equals("km2")) respuesta=are.convertirM2(u,ertira);
                else if (ertira.equals("ft2")) respuesta=are.convertirM2(u,ertira);
                else if (ertira.equals("yd2")) respuesta=are.convertirM2(u,ertira);
                else {
                    lblError.setForeground(Color.red);
                    lblError.setText("Se ha ingresado mal la segunda unidad de medida");
                    txtRespuesta.setText("");
                }
            break;
            case "ha2":
                if (ertira.equals("mm2")) respuesta=are.convertirHa2(u,ertira);
                else if (ertira.equals("cm2")) respuesta=are.convertirHa2(u,ertira);
                else if (ertira.equals("m2")) respuesta=are.convertirHa2(u,ertira);
                else if (ertira.equals("ha2")) respuesta=are.convertirHa2(u,ertira);
                else if (ertira.equals("km2")) respuesta=are.convertirHa2(u,ertira);
                else if (ertira.equals("ft2")) respuesta=are.convertirHa2(u,ertira);
                else if (ertira.equals("yd2")) respuesta=are.convertirHa2(u,ertira);
                else {
                    lblError.setForeground(Color.red);
                    lblError.setText("Se ha ingresado mal la segunda unidad de medida");
                    txtRespuesta.setText("");
                }
            break;
            case "km2":
                if (ertira.equals("mm2")) respuesta=are.convertirKm2(u,ertira);
                else if (ertira.equals("cm2")) respuesta=are.convertirKm2(u,ertira);
                else if (ertira.equals("m2")) respuesta=are.convertirKm2(u,ertira);
                else if (ertira.equals("ha2")) respuesta=are.convertirKm2(u,ertira);
                else if (ertira.equals("km2")) respuesta=are.convertirKm2(u,ertira);
                else if (ertira.equals("ft2")) respuesta=are.convertirKm2(u,ertira);
                else if (ertira.equals("yd2")) respuesta=are.convertirKm2(u,ertira);
                else {
                    lblError.setForeground(Color.red);
                    lblError.setText("Se ha ingresado mal la segunda unidad de medida");
                    txtRespuesta.setText("");
                }
            break;
            case "ft2":
                if (ertira.equals("mm2")) respuesta=are.convertirFt2(u,ertira);
                else if (ertira.equals("cm2")) respuesta=are.convertirFt2(u,ertira);
                else if (ertira.equals("m2")) respuesta=are.convertirFt2(u,ertira);
                else if (ertira.equals("ha2")) respuesta=are.convertirFt2(u,ertira);
                else if (ertira.equals("km2")) respuesta=are.convertirFt2(u,ertira);
                else if (ertira.equals("ft2")) respuesta=are.convertirFt2(u,ertira);
                else if (ertira.equals("yd2")) respuesta=are.convertirFt2(u,ertira);
                else {
                    lblError.setForeground(Color.red);
                    lblError.setText("Se ha ingresado mal la segunda unidad de medida");
                    txtRespuesta.setText("");
                }
            break;
            case "yd2":
                if (ertira.equals("mm2")) respuesta=are.convertirYd2(u,ertira);
                else if (ertira.equals("cm2")) respuesta=are.convertirYd2(u,ertira);
                else if (ertira.equals("m2")) respuesta=are.convertirYd2(u,ertira);
                else if (ertira.equals("ha2")) respuesta=are.convertirYd2(u,ertira);
                else if (ertira.equals("km2")) respuesta=are.convertirYd2(u,ertira);
                else if (ertira.equals("ft2")) respuesta=are.convertirYd2(u,ertira);
                else if (ertira.equals("yd2")) respuesta=are.convertirYd2(u,ertira);
                else {
                    lblError.setForeground(Color.red);
                    lblError.setText("Se ha ingresado mal la segunda unidad de medida");
                    txtRespuesta.setText("");
                }
            break;
            default:
                lblError.setForeground(Color.red);
                lblError.setText("Se ha ingresado mal la primer unidad de medida");
                txtRespuesta.setText("");
            break;
        }
        if (respuesta!=(-1)){
            lblError.setForeground(Color.black);
            lblError.setText("");
            txtRespuesta.setText(""+respuesta+" "+ertira);
        }
    }
    
    public void energias(){
        Energia ene=new Energia();
        double u=Double.parseDouble(txtUnidades.getText());
        double respuesta=-1;
        String conv=txtCambiar.getText().toLowerCase();
        String ertira=txtSistema.getText().toLowerCase();
        switch (conv){
            case "j":
                if (ertira.equals("j")) respuesta=ene.convertirJules(u,ertira);
                else if (ertira.equals("cal")) respuesta=ene.convertirJules(u,ertira);
                else if (ertira.equals("kcal")) respuesta=ene.convertirJules(u,ertira);
                else {
                    lblError.setForeground(Color.red);
                    lblError.setText("Se ha ingresado mal la segunda unidad de medida");
                    txtRespuesta.setText("");
                }
            break;
            case "cal":
                if (ertira.equals("j")) respuesta=ene.convertirCalorias(u,ertira);
                else if (ertira.equals("cal")) respuesta=ene.convertirCalorias(u,ertira);
                else if (ertira.equals("kcal")) respuesta=ene.convertirCalorias(u,ertira);
                else {
                    lblError.setForeground(Color.red);
                    lblError.setText("Se ha ingresado mal la segunda unidad de medida");
                    txtRespuesta.setText("");
                }
            break;
            case "kcal":
                if (ertira.equals("j")) respuesta=ene.convertirKiloCal(u,ertira);
                else if (ertira.equals("cal")) respuesta=ene.convertirKiloCal(u,ertira);
                else if (ertira.equals("kcal")) respuesta=ene.convertirKiloCal(u,ertira);
                else {
                    lblError.setForeground(Color.red);
                    lblError.setText("Se ha ingresado mal la segunda unidad de medida");
                    txtRespuesta.setText("");
                }
            break;
            default:
                lblError.setForeground(Color.red);
                lblError.setText("Se ha ingresado mal la primer unidad de medida");
                txtRespuesta.setText("");
            break;
        }
        if (respuesta!=(-1)){
            lblError.setForeground(Color.black);
            lblError.setText("");
            txtRespuesta.setText(""+respuesta+" "+ertira);
        }
    }
    
    public void fuerzas(){
        Fuerza fue=new Fuerza();
        double u=Double.parseDouble(txtUnidades.getText());
        double respuesta=-1;
        String conv=txtCambiar.getText().toLowerCase();
        String ertira=txtSistema.getText().toLowerCase();
        switch (conv){
            case "dyne":
                if (ertira.equals("dyne")) respuesta=fue.convertirDyne(u,ertira);
                else if (ertira.equals("lbf")) respuesta=fue.convertirDyne(u,ertira);
                else if (ertira.equals("kgf")) respuesta=fue.convertirDyne(u,ertira);
                else if (ertira.equals("n")) respuesta=fue.convertirDyne(u,ertira);
                else if (ertira.equals("kn")) respuesta=fue.convertirDyne(u,ertira);
                else if (ertira.equals("tf")) respuesta=fue.convertirDyne(u,ertira);
                else if (ertira.equals("mn")) respuesta=fue.convertirDyne(u,ertira);
                else {
                    lblError.setForeground(Color.red);
                    lblError.setText("Se ha ingresado mal la segunda unidad de medida");
                    txtRespuesta.setText("");
                }
            break;
            case "lbf":
                if (ertira.equals("dyne")) respuesta=fue.convertirLbf(u,ertira);
                else if (ertira.equals("lbf")) respuesta=fue.convertirLbf(u,ertira);
                else if (ertira.equals("kgf")) respuesta=fue.convertirLbf(u,ertira);
                else if (ertira.equals("n")) respuesta=fue.convertirLbf(u,ertira);
                else if (ertira.equals("kn")) respuesta=fue.convertirLbf(u,ertira);
                else if (ertira.equals("tf")) respuesta=fue.convertirLbf(u,ertira);
                else if (ertira.equals("mn")) respuesta=fue.convertirLbf(u,ertira);
                else {
                    lblError.setForeground(Color.red);
                    lblError.setText("Se ha ingresado mal la segunda unidad de medida");
                    txtRespuesta.setText("");
                }
            break;
            case "kgf":
                if (ertira.equals("dyne")) respuesta=fue.convertirKgf(u,ertira);
                else if (ertira.equals("lbf")) respuesta=fue.convertirKgf(u,ertira);
                else if (ertira.equals("kgf")) respuesta=fue.convertirKgf(u,ertira);
                else if (ertira.equals("n")) respuesta=fue.convertirKgf(u,ertira);
                else if (ertira.equals("kn")) respuesta=fue.convertirKgf(u,ertira);
                else if (ertira.equals("tf")) respuesta=fue.convertirKgf(u,ertira);
                else if (ertira.equals("mn")) respuesta=fue.convertirKgf(u,ertira);
                else {
                    lblError.setForeground(Color.red);
                    lblError.setText("Se ha ingresado mal la segunda unidad de medida");
                    txtRespuesta.setText("");
                }
            break;
            case "n":
                if (ertira.equals("dyne")) respuesta=fue.convertirN(u,ertira);
                else if (ertira.equals("lbf")) respuesta=fue.convertirN(u,ertira);
                else if (ertira.equals("kgf")) respuesta=fue.convertirN(u,ertira);
                else if (ertira.equals("n")) respuesta=fue.convertirN(u,ertira);
                else if (ertira.equals("kn")) respuesta=fue.convertirN(u,ertira);
                else if (ertira.equals("tf")) respuesta=fue.convertirN(u,ertira);
                else if (ertira.equals("mn")) respuesta=fue.convertirN(u,ertira);
                else {
                    lblError.setForeground(Color.red);
                    lblError.setText("Se ha ingresado mal la segunda unidad de medida");
                    txtRespuesta.setText("");
                }
            break;
            case "kn":
                if (ertira.equals("dyne")) respuesta=fue.convertirKN(u,ertira);
                else if (ertira.equals("lbf")) respuesta=fue.convertirKN(u,ertira);
                else if (ertira.equals("kgf")) respuesta=fue.convertirKN(u,ertira);
                else if (ertira.equals("n")) respuesta=fue.convertirKN(u,ertira);
                else if (ertira.equals("kn")) respuesta=fue.convertirKN(u,ertira);
                else if (ertira.equals("tf")) respuesta=fue.convertirKN(u,ertira);
                else if (ertira.equals("mn")) respuesta=fue.convertirKN(u,ertira);
                else {
                    lblError.setForeground(Color.red);
                    lblError.setText("Se ha ingresado mal la segunda unidad de medida");
                    txtRespuesta.setText("");
                }
            break;
            case "tf":
                if (ertira.equals("dyne")) respuesta=fue.convertirTF(u,ertira);
                else if (ertira.equals("lbf")) respuesta=fue.convertirTF(u,ertira);
                else if (ertira.equals("kgf")) respuesta=fue.convertirTF(u,ertira);
                else if (ertira.equals("n")) respuesta=fue.convertirTF(u,ertira);
                else if (ertira.equals("kn")) respuesta=fue.convertirTF(u,ertira);
                else if (ertira.equals("tf")) respuesta=fue.convertirTF(u,ertira);
                else if (ertira.equals("mn")) respuesta=fue.convertirTF(u,ertira);
                else {
                    lblError.setForeground(Color.red);
                    lblError.setText("Se ha ingresado mal la segunda unidad de medida");
                    txtRespuesta.setText("");
                }
            break;
            case "mn":
                if (ertira.equals("dyne")) respuesta=fue.convertirMN(u,ertira);
                else if (ertira.equals("lbf")) respuesta=fue.convertirMN(u,ertira);
                else if (ertira.equals("kgf")) respuesta=fue.convertirMN(u,ertira);
                else if (ertira.equals("n")) respuesta=fue.convertirMN(u,ertira);
                else if (ertira.equals("kn")) respuesta=fue.convertirMN(u,ertira);
                else if (ertira.equals("tf")) respuesta=fue.convertirMN(u,ertira);
                else if (ertira.equals("mn")) respuesta=fue.convertirMN(u,ertira);
                else {
                    lblError.setForeground(Color.red);
                    lblError.setText("Se ha ingresado mal la segunda unidad de medida");
                    txtRespuesta.setText("");
                }
            break;
            default:
                lblError.setForeground(Color.red);
                lblError.setText("Se ha ingresado mal la primer unidad de medida");
                txtRespuesta.setText("");
            break;
        }
        if (respuesta!=(-1)){
            lblError.setForeground(Color.black);
            lblError.setText("");
            txtRespuesta.setText(""+respuesta+" "+ertira);
        }
    }
    
    public void distancias(){
        Distancia dis=new Distancia(); 
        double u=Double.parseDouble(txtUnidades.getText());
        double respuesta=-1;
        String conv=txtCambiar.getText().toLowerCase();
        String ertira=txtSistema.getText().toLowerCase();
        switch (conv){
            case "km":
                if (ertira.equals("km")) respuesta=dis.convertirKilometro(u,ertira);
                else if (ertira.equals("hm")) respuesta=dis.convertirKilometro(u,ertira);
                else if (ertira.equals("dam")) respuesta=dis.convertirKilometro(u,ertira);
                else if (ertira.equals("m")) respuesta=dis.convertirKilometro(u,ertira);
                else if (ertira.equals("dim")) respuesta=dis.convertirKilometro(u,ertira);
                else if (ertira.equals("cm")) respuesta=dis.convertirKilometro(u,ertira);
                else if (ertira.equals("mm")) respuesta=dis.convertirKilometro(u,ertira);
                else if (ertira.equals("in")) respuesta=dis.convertirKilometro(u,ertira);
                else if (ertira.equals("pie")) respuesta=dis.convertirKilometro(u,ertira);
                else if (ertira.equals("yd")) respuesta=dis.convertirKilometro(u,ertira);
                else if (ertira.equals("mi")) respuesta=dis.convertirKilometro(u,ertira);
                else {
                    lblError.setForeground(Color.red);
                    lblError.setText("Se ha ingresado mal la segunda unidad de medida");
                    txtRespuesta.setText("");
                }
            break;
            case "hm":
                if (ertira.equals("km")) respuesta=dis.convertirHectometro(u,ertira);
                if (ertira.equals("hm")) respuesta=dis.convertirHectometro(u,ertira);
                if (ertira.equals("dam")) respuesta=dis.convertirHectometro(u,ertira);
                if (ertira.equals("m")) respuesta=dis.convertirHectometro(u,ertira);
                if (ertira.equals("dim")) respuesta=dis.convertirHectometro(u,ertira);
                if (ertira.equals("cm")) respuesta=dis.convertirHectometro(u,ertira);
                if (ertira.equals("mm")) respuesta=dis.convertirHectometro(u,ertira);
                if (ertira.equals("in")) respuesta=dis.convertirHectometro(u,ertira);
                if (ertira.equals("pie")) respuesta=dis.convertirHectometro(u,ertira);
                if (ertira.equals("yd")) respuesta=dis.convertirHectometro(u,ertira);
                if (ertira.equals("mi")) respuesta=dis.convertirHectometro(u,ertira);
                if (respuesta==0){
                    lblError.setForeground(Color.red);
                    lblError.setText("Se ha ingresado mal la segunda unidad de medida");
                    txtRespuesta.setText("");
                }
            break;
            case "dam":
                if (ertira.equals("km")) respuesta=dis.convertirDecametro(u,ertira);
                if (ertira.equals("hm")) respuesta=dis.convertirDecametro(u,ertira);
                if (ertira.equals("dam")) respuesta=dis.convertirDecametro(u,ertira);
                if (ertira.equals("m")) respuesta=dis.convertirDecametro(u,ertira);
                if (ertira.equals("dim")) respuesta=dis.convertirDecametro(u,ertira);
                if (ertira.equals("cm")) respuesta=dis.convertirDecametro(u,ertira);
                if (ertira.equals("mm")) respuesta=dis.convertirDecametro(u,ertira);
                if (ertira.equals("in")) respuesta=dis.convertirDecametro(u,ertira);
                if (ertira.equals("pie")) respuesta=dis.convertirDecametro(u,ertira);
                if (ertira.equals("yd")) respuesta=dis.convertirDecametro(u,ertira);
                if (ertira.equals("mi")) respuesta=dis.convertirDecametro(u,ertira);
                if (respuesta==0){
                    lblError.setForeground(Color.red);
                    lblError.setText("Se ha ingresado mal la segunda unidad de medida");
                    txtRespuesta.setText("");
                }
            break;
            case "m":
                if (ertira.equals("km")) respuesta=dis.convertirMetro(u,ertira);
                if (ertira.equals("hm")) respuesta=dis.convertirMetro(u,ertira);
                if (ertira.equals("dam")) respuesta=dis.convertirMetro(u,ertira);
                if (ertira.equals("m")) respuesta=dis.convertirMetro(u,ertira);
                if (ertira.equals("dim")) respuesta=dis.convertirMetro(u,ertira);
                if (ertira.equals("cm")) respuesta=dis.convertirMetro(u,ertira);
                if (ertira.equals("mm")) respuesta=dis.convertirMetro(u,ertira);
                if (ertira.equals("in")) respuesta=dis.convertirMetro(u,ertira);
                if (ertira.equals("pie")) respuesta=dis.convertirMetro(u,ertira);
                if (ertira.equals("yd")) respuesta=dis.convertirMetro(u,ertira);
                if (ertira.equals("mi")) respuesta=dis.convertirMetro(u,ertira);
                if (respuesta==0){
                    lblError.setForeground(Color.red);
                    lblError.setText("Se ha ingresado mal la segunda unidad de medida");
                    txtRespuesta.setText("");
                }
            break;
            case "dim":
                if (ertira.equals("km")) respuesta=dis.convertirDecimetro(u,ertira);
                if (ertira.equals("hm")) respuesta=dis.convertirDecimetro(u,ertira);
                if (ertira.equals("dam")) respuesta=dis.convertirDecimetro(u,ertira);
                if (ertira.equals("m")) respuesta=dis.convertirDecimetro(u,ertira);
                if (ertira.equals("dim")) respuesta=dis.convertirDecimetro(u,ertira);
                if (ertira.equals("cm")) respuesta=dis.convertirDecimetro(u,ertira);
                if (ertira.equals("mm")) respuesta=dis.convertirDecimetro(u,ertira);
                if (ertira.equals("in")) respuesta=dis.convertirDecimetro(u,ertira);
                if (ertira.equals("pie")) respuesta=dis.convertirDecimetro(u,ertira);
                if (ertira.equals("yd")) respuesta=dis.convertirDecimetro(u,ertira);
                if (ertira.equals("mi")) respuesta=dis.convertirDecimetro(u,ertira);
                if (respuesta==0){
                    lblError.setForeground(Color.red);
                    lblError.setText("Se ha ingresado mal la segunda unidad de medida");
                    txtRespuesta.setText("");
                }
            break;
            case "cm":
                if (ertira.equals("km")) respuesta=dis.convertirCentimetro(u,ertira);
                if (ertira.equals("hm")) respuesta=dis.convertirCentimetro(u,ertira);
                if (ertira.equals("dam")) respuesta=dis.convertirCentimetro(u,ertira);
                if (ertira.equals("m")) respuesta=dis.convertirCentimetro(u,ertira);
                if (ertira.equals("dim")) respuesta=dis.convertirCentimetro(u,ertira);
                if (ertira.equals("cm")) respuesta=dis.convertirCentimetro(u,ertira);
                if (ertira.equals("mm")) respuesta=dis.convertirCentimetro(u,ertira);
                if (ertira.equals("in")) respuesta=dis.convertirCentimetro(u,ertira);
                if (ertira.equals("pie")) respuesta=dis.convertirCentimetro(u,ertira);
                if (ertira.equals("yd")) respuesta=dis.convertirCentimetro(u,ertira);
                if (ertira.equals("mi")) respuesta=dis.convertirCentimetro(u,ertira);
                if (respuesta==0){
                    lblError.setForeground(Color.red);
                    lblError.setText("Se ha ingresado mal la segunda unidad de medida");
                    txtRespuesta.setText("");
                }
            break;
            case "mm":
                if (ertira.equals("hm")) respuesta=dis.convertirMilimetro(u,ertira);
                if (ertira.equals("hm")) respuesta=dis.convertirMilimetro(u,ertira);
                if (ertira.equals("dam")) respuesta=dis.convertirMilimetro(u,ertira);
                if (ertira.equals("m")) respuesta=dis.convertirMilimetro(u,ertira);
                if (ertira.equals("dim")) respuesta=dis.convertirMilimetro(u,ertira);
                if (ertira.equals("cm")) respuesta=dis.convertirMilimetro(u,ertira);
                if (ertira.equals("mm")) respuesta=dis.convertirMilimetro(u,ertira);
                if (ertira.equals("in")) respuesta=dis.convertirMilimetro(u,ertira);
                if (ertira.equals("pie")) respuesta=dis.convertirMilimetro(u,ertira);
                if (ertira.equals("yd")) respuesta=dis.convertirMilimetro(u,ertira);
                if (ertira.equals("mi")) respuesta=dis.convertirMilimetro(u,ertira);
                if (respuesta==0){
                    lblError.setForeground(Color.red);
                    lblError.setText("Se ha ingresado mal la segunda unidad de medida");
                    txtRespuesta.setText("");
                }
            break;
            case "in":
                if (ertira.equals("km")) respuesta=dis.convertirPulgada(u,ertira);
                if (ertira.equals("hm")) respuesta=dis.convertirPulgada(u,ertira);
                if (ertira.equals("dam")) respuesta=dis.convertirPulgada(u,ertira);
                if (ertira.equals("m")) respuesta=dis.convertirPulgada(u,ertira);
                if (ertira.equals("dim")) respuesta=dis.convertirPulgada(u,ertira);
                if (ertira.equals("cm")) respuesta=dis.convertirPulgada(u,ertira);
                if (ertira.equals("mm")) respuesta=dis.convertirPulgada(u,ertira);
                if (ertira.equals("in")) respuesta=dis.convertirPulgada(u,ertira);
                if (ertira.equals("pie")) respuesta=dis.convertirPulgada(u,ertira);
                if (ertira.equals("yd")) respuesta=dis.convertirPulgada(u,ertira);
                if (ertira.equals("mi")) respuesta=dis.convertirPulgada(u,ertira);
                if (respuesta==0){
                    lblError.setForeground(Color.red);
                    lblError.setText("Se ha ingresado mal la segunda unidad de medida");
                    txtRespuesta.setText("");
                }
            break;
            case "pie":
                if (ertira.equals("km")) respuesta=dis.convertirPie(u,ertira);
                if (ertira.equals("hm")) respuesta=dis.convertirPie(u,ertira);
                if (ertira.equals("dam")) respuesta=dis.convertirPie(u,ertira);
                if (ertira.equals("m")) respuesta=dis.convertirPie(u,ertira);
                if (ertira.equals("dim")) respuesta=dis.convertirPie(u,ertira);
                if (ertira.equals("cm")) respuesta=dis.convertirPie(u,ertira);
                if (ertira.equals("mm")) respuesta=dis.convertirPie(u,ertira);
                if (ertira.equals("in")) respuesta=dis.convertirPie(u,ertira);
                if (ertira.equals("pie")) respuesta=dis.convertirPie(u,ertira);
                if (ertira.equals("yd")) respuesta=dis.convertirPie(u,ertira);
                if (ertira.equals("mi")) respuesta=dis.convertirPie(u,ertira);
                if (respuesta==0){
                    lblError.setForeground(Color.red);
                    lblError.setText("Se ha ingresado mal la segunda unidad de medida");
                    txtRespuesta.setText("");
                }
            break;
            case "yd":
                if (ertira.equals("km")) respuesta=dis.convertirYarda(u,ertira);
                if (ertira.equals("hm")) respuesta=dis.convertirYarda(u,ertira);
                if (ertira.equals("dam")) respuesta=dis.convertirYarda(u,ertira);
                if (ertira.equals("m")) respuesta=dis.convertirYarda(u,ertira);
                if (ertira.equals("dim")) respuesta=dis.convertirYarda(u,ertira);
                if (ertira.equals("cm")) respuesta=dis.convertirYarda(u,ertira);
                if (ertira.equals("mm")) respuesta=dis.convertirYarda(u,ertira);
                if (ertira.equals("in")) respuesta=dis.convertirYarda(u,ertira);
                if (ertira.equals("pie")) respuesta=dis.convertirYarda(u,ertira);
                if (ertira.equals("yd")) respuesta=dis.convertirYarda(u,ertira);
                if (ertira.equals("mi")) respuesta=dis.convertirYarda(u,ertira);
                if (respuesta==0){
                    lblError.setForeground(Color.red);
                    lblError.setText("Se ha ingresado mal la segunda unidad de medida");
                    txtRespuesta.setText("");
                }
            break;
            case "mi":
                if (ertira.equals("km")) respuesta=dis.convertirMilla(u,ertira);
                if (ertira.equals("hm")) respuesta=dis.convertirMilla(u,ertira);
                if (ertira.equals("dam")) respuesta=dis.convertirMilla(u,ertira);
                if (ertira.equals("m")) respuesta=dis.convertirMilla(u,ertira);
                if (ertira.equals("dim")) respuesta=dis.convertirMilla(u,ertira);
                if (ertira.equals("cm")) respuesta=dis.convertirMilla(u,ertira);
                if (ertira.equals("mm")) respuesta=dis.convertirMilla(u,ertira);
                if (ertira.equals("in")) respuesta=dis.convertirMilla(u,ertira);
                if (ertira.equals("pie")) respuesta=dis.convertirMilla(u,ertira);
                if (ertira.equals("yd")) respuesta=dis.convertirMilla(u,ertira);
                if (ertira.equals("mi")) respuesta=dis.convertirMilla(u,ertira);
                if (respuesta==0){
                    lblError.setForeground(Color.red);
                    lblError.setText("Se ha ingresado mal la segunda unidad de medida");
                    txtRespuesta.setText("");
                }
            break;
            default:
                lblError.setForeground(Color.red);
                lblError.setText("Se ha ingresado mal la primer unidad de medida");
                txtRespuesta.setText("");
            break;
        }
        if (respuesta!=(-1)){
            lblError.setForeground(Color.black);
            lblError.setText("");
            txtRespuesta.setText(""+respuesta+" "+ertira);
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUnidades = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtCambiar = new javax.swing.JTextField();
        txtSistema = new javax.swing.JTextField();
        lblAuxiliar = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();
        txtRespuesta = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Unidades = new javax.swing.JList<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblError = new javax.swing.JLabel();
        lblNum = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        jLabel1.setText("Convertidor de Unidades");

        jLabel2.setText("Unidades:");

        jLabel3.setText("Convertir");

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        Unidades.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Área", "Distancia", "Energía", "Fuerza", "Grados", "Líquido", "Masa", "Temperatura", "Tiempo", "Velocidad", "Volumen" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        Unidades.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                UnidadesValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(Unidades);

        jLabel4.setText("Resultado:");

        jLabel5.setText("a...");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(31, 31, 31))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addGap(120, 120, 120))
                                            .addComponent(txtCambiar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtSistema, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5)))
                                    .addComponent(lblAuxiliar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(txtRespuesta)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnCalcular))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtUnidades, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblNum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(0, 49, Short.MAX_VALUE))
                            .addComponent(lblError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtUnidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNum, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCambiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSistema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblAuxiliar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtRespuesta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCalcular))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblError, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        int opcion=Unidades.getSelectedIndex();
        switch (opcion){
            case 0:
                if (fin.esPositivoValido(txtUnidades.getText())==true){
                    areas(); 
                    lblNum.setForeground(Color.black);
                    lblNum.setText("");
                }
                else{
                    lblNum.setForeground(Color.red);
                    lblNum.setText("Número Inválido");
                }
            break;
            case 1:
               if (fin.esPositivoValido(txtUnidades.getText())==true){
                    distancias(); 
                    lblNum.setForeground(Color.black);
                    lblNum.setText("");
                }
                else{
                    lblNum.setForeground(Color.red);
                    lblNum.setText("Número Inválido");
                }
            break;
            case 2:
               if (fin.esPositivoValido(txtUnidades.getText())==true){
                    energias(); 
                    lblNum.setForeground(Color.black);
                    lblNum.setText("");
                }
                else{
                    lblNum.setForeground(Color.red);
                    lblNum.setText("Número Inválido");
                }
            break;
            case 3:
                if (fin.esPositivoValido(txtUnidades.getText())==true){
                    fuerzas(); 
                    lblNum.setForeground(Color.black);
                    lblNum.setText("");
                }
                else{
                    lblNum.setForeground(Color.red);
                    lblNum.setText("Número Inválido");
                }
            break;
            case 4:
                if (fin.esPositivoValido(txtUnidades.getText())==true){
                    grados(); 
                    lblNum.setForeground(Color.black);
                    lblNum.setText("");
                }
                else{
                    lblNum.setForeground(Color.red);
                    lblNum.setText("Número Inválido");
                }
            break;
            case 5:
                if (fin.esPositivoValido(txtUnidades.getText())==true){
                    liquidos(); 
                    lblNum.setForeground(Color.black);
                    lblNum.setText("");
                }
                else{
                    lblNum.setForeground(Color.red);
                    lblNum.setText("Número Inválido");
                }
            break;
            case 6:
                if (fin.esPositivoValido(txtUnidades.getText())==true){
                    masas(); 
                    lblNum.setForeground(Color.black);
                    lblNum.setText("");
                }
                else{
                    lblNum.setForeground(Color.red);
                    lblNum.setText("Número Inválido");
                }
            break;
            case 7:
                if (fin.esNumeroValido(txtUnidades.getText())==true){
                    temperaturas(); 
                    lblNum.setForeground(Color.black);
                    lblNum.setText("");
                }
                else{
                    lblNum.setForeground(Color.red);
                    lblNum.setText("Número Inválido");
                }
            break;
            case 8:
                if (fin.esPositivoValido(txtUnidades.getText())==true){
                    tiempos(); 
                    lblNum.setForeground(Color.black);
                    lblNum.setText("");
                }
                else{
                    lblNum.setForeground(Color.red);
                    lblNum.setText("Número Inválido");
                }
            break;
            case 9:
                if (fin.esNumeroValido(txtUnidades.getText())==true){
                    velocidades(); 
                    lblNum.setForeground(Color.black);
                    lblNum.setText("");
                }
                else{
                    lblNum.setForeground(Color.red);
                    lblNum.setText("Número Inválido");
                }
            break;
            case 10:
                if (fin.esPositivoValido(txtUnidades.getText())==true){
                    volumenes(); 
                    lblNum.setForeground(Color.black);
                    lblNum.setText("");
                }
                else{
                    lblNum.setForeground(Color.red);
                    lblNum.setText("Número Inválido");
                }
            break;
        }
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void UnidadesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_UnidadesValueChanged
        int opcion=Unidades.getSelectedIndex();
        lblNum.setForeground(Color.black);
        lblNum.setText("");
        lblError.setForeground(Color.black);
        lblError.setText("");
        txtUnidades.setText("");
        txtCambiar.setText("");
        txtSistema.setText("");
        txtRespuesta.setText("");
        switch (opcion){
            case 0:
               lblAuxiliar.setText("mm2, cm2, m2, ha2, km2, ft2, yd2");
            break;
            case 1:
               lblAuxiliar.setText("km, hm, dam, m, dim, cm, mm, in, pie, yd, mi");
            break;
            case 2:
               lblAuxiliar.setText("j, cal, kcal");
            break;
            case 3:
                lblAuxiliar.setText("dyne, lbf, kgf, n, kn, tf, mn");
            break;
            case 4:
                lblAuxiliar.setText("rad, gra");
            break;
            case 5:
                lblAuxiliar.setText("ml, cl, dl, l, dal, hl, kl");
            break;
            case 6:
                lblAuxiliar.setText("mg, cg, dg, g, dag, hg, kg, t");
            break;
            case 7:
                lblAuxiliar.setText("c, f, k");
            break;
            case 8:
                lblAuxiliar.setText("seg, min, hrs, dias, sem, mes, año, dec, sig");
            break;
            case 9:
                lblAuxiliar.setText("mi/h, pie/s, m/s, km/h");
            break;
            case 10:
                lblAuxiliar.setText("m3, cm3, in3, ft3, yd3, l");
            break;
        } 
    }//GEN-LAST:event_UnidadesValueChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PruebaC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PruebaC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PruebaC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PruebaC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PruebaC().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> Unidades;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAuxiliar;
    private javax.swing.JLabel lblError;
    private javax.swing.JLabel lblNum;
    private javax.swing.JTextField txtCambiar;
    private javax.swing.JTextField txtRespuesta;
    private javax.swing.JTextField txtSistema;
    private javax.swing.JTextField txtUnidades;
    // End of variables declaration//GEN-END:variables
}
