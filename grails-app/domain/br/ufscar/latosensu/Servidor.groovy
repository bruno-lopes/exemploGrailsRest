package br.ufscar.latosensu

class Servidor {

    String numeroUFSCar
    Pessoa pessoa


    static constraints = {
        numeroUFSCar unique: true
    }
}
