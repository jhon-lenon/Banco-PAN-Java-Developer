package C_Filas_FIFO_FirstIn_FirstOut.com.digitalInovation;

public class Fila<T> {

    private No<T> refEntradaFila;

    public Fila() {
        this.refEntradaFila = null;
    }

    public T first() {
        if (!this.isEmpty()) {
            No<T> primeiroNo = refEntradaFila;
            while (true) {
                if (primeiroNo.getRefNo() != null) {
                    primeiroNo = primeiroNo.getRefNo();
                } else {
                    break;
                }
            }
            return primeiroNo.getObject();
        }
        return null;
    }

    public T dequeue() {
        if (!this.isEmpty()) {
            No<T> primeiroNo = refEntradaFila;
            No<T> noAuxiliar = refEntradaFila;
            while (true) {
                if (primeiroNo.getRefNo() != null) {
                    noAuxiliar = primeiroNo;
                    primeiroNo = primeiroNo.getRefNo();
                } else {
                    noAuxiliar.setRefNo(null);
                    break;
                }
            }
            return primeiroNo.getObject();
        }
        return null;
    }

    public void enqueue(T obj) {
        No<T> novoNo = new No(obj);
        novoNo.setRefNo(refEntradaFila);
        refEntradaFila = novoNo;
    }

    public boolean isEmpty() {
        return refEntradaFila == null ? true : false;
    }

    @Override
    public String toString() {
        String stringRetorno = "";
        No noAuxiliar = refEntradaFila;

        if (refEntradaFila != null) {
            while (true) {
                stringRetorno += "[No{Objeto= " + noAuxiliar.getObject() + "}]--->";
                if (noAuxiliar.getRefNo() != null) {
                    noAuxiliar = noAuxiliar.getRefNo();
                } else {
                    stringRetorno += "null";
                    break;
                }
            }
        } else {
            stringRetorno = "null";
        }

        return stringRetorno;
    }
}
