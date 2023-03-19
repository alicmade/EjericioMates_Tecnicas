package org.example;

public class Polinomio {
        private int grado;
        private Nodo mayor;

        public Polinomio() {
            grado = 0;
            mayor = null;
        }

        public int getGrado() {
            return grado;
        }

        public void setGrado(int grado) {
            this.grado = grado;
        }

        public Nodo getMayor() {
            return mayor;
        }

        public void setMayor(Nodo mayor) {
            this.mayor = mayor;
        }

        public double obtenerValor(int termino) {
            double valor = 0;
            Nodo actual = mayor;

            while (actual != null) {
                datoPolinomio dato = actual.getDato();
                if (dato.getTermino() == termino) {
                    valor = dato.getValor();
                    break;
                }
                actual = actual.getSiguiente();
            }

            return valor;
        }

        public void cargarTermino(datoPolinomio termino) {
            if (mayor == null) {
                mayor = new NodoImpl(termino);
                grado = termino.getTermino();
                return;
            }

            Nodo actual = mayor;
            Nodo anterior = null;

            while (actual != null && actual.getDato().getTermino() > termino.getTermino()) {
                anterior = actual;
                actual = actual.getSiguiente();
            }

            if (actual != null && actual.getDato().getTermino() == termino.getTermino()) {
                actual.getDato().setValor(termino.getValor());
                return;
            }

            Nodo nuevoNodo = new NodoImpl(termino);
            if (anterior == null) {
                nuevoNodo.setSiguiente(mayor);
                mayor = nuevoNodo;
            } else {
                nuevoNodo.setSiguiente(actual);
                anterior.setSiguiente(nuevoNodo);
            }

            if (grado < termino.getTermino()) {
                grado = termino.getTermino();
            }
        }


        public void sumar(Polinomio polinomio) {
            Nodo actual = polinomio.getMayor();
            while (actual != null) {
                datoPolinomio dato = actual.getDato();
                double valor = obtenerValor(dato.getTermino());
                dato.setValor(valor + dato.getValor());
                cargarTermino(dato);
                actual = actual.getSiguiente();
            }
        }

        public void restar(Polinomio polinomio) {
            Nodo actual = polinomio.getMayor();
            while (actual != null) {
                datoPolinomio dato = actual.getDato();
                double valor = obtenerValor(dato.getTermino());
                dato.setValor(valor - dato.getValor());
                cargarTermino(dato);
                actual = actual.getSiguiente();
            }
        }

        public void multiplicar(Polinomio polinomio) {
            Nodo actual = polinomio.getMayor();
            while (actual != null) {
                datoPolinomio dato = actual.getDato();
                double valor = obtenerValor(dato.getTermino());
                dato.setValor(valor * dato.getValor());
                cargarTermino(dato);
                actual = actual.getSiguiente();
            }
        }

       //metodo para dividir polinomios
        public void dividir(Polinomio polinomio) {
            Nodo actual = polinomio.getMayor();
            while (actual != null) {
                datoPolinomio dato = actual.getDato();
                double valor = obtenerValor(dato.getTermino());
                dato.setValor(valor / dato.getValor());
                cargarTermino(dato);
                actual = actual.getSiguiente();
            }
        }

        public void mostrar() {
            Nodo actual = mayor;
            while (actual != null) {
                datoPolinomio dato = actual.getDato();
                System.out.println(dato.getValor() + "x^" + dato.getTermino());
                actual = actual.getSiguiente();
            }
        }

}

