package br.ufscar.latosensu

import grails.rest.RestfulController

class ServidorController extends RestfulController {

    static responseFormats = ['json', 'xml']
    ServidorController() {
        super(Servidor)
    }
}
