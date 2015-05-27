package br.ufscar.latosensu

import grails.rest.Resource

@Resource(uri = "/pessoas", formats = ["json","xml"], readOnly = false)
class Pessoa {

    String nome
    String cpf
    String rg

    static constraints = {
    }
}
