package br.ufscar.latosensu

class Servidor {

    String numeroUFSCar
    Pessoa pessoa

    static hasMany = ['funcoes': Funcao]


    static constraints = {
        numeroUFSCar unique: true
    }
}
