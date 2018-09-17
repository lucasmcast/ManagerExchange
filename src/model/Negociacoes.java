//Modelo de classe das ultimas operações negociadas
package model;

/**
 *
 * @author lucas
 */
public class Negociacoes {
    
    private double high; //maior preço unitario de negociacão das ultimas 24 horas
    private double low; //menor preço unitario de negociação das ultimas 24 horas
    private double vol; //quantidade de negociada nas ultimas 24 horas
    private double last; //preço unitario da ultima negociação
    private double buy; //maior preço de oferta de compra das ultimas 24 horas
    private double sell; //menor preço de oferta de venda das ultimas 24 horas
    private int data; //data e hora da informação
   
    
    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public double getLow() {
        return low;
    }

    public void setLow(double low) {
        this.low = low;
    }

    public double getVol() {
        return vol;
    }

    public void setVol(double vol) {
        this.vol = vol;
    }

    public double getLast() {
        return last;
    }

    public void setLast(double last) {
        this.last = last;
    }

    public double getBuy() {
        return buy;
    }

    public void setBuy(double buy) {
        this.buy = buy;
    }

    public double getSell() {
        return sell;
    }

    public void setSell(double sell) {
        this.sell = sell;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Negociacoes{" + "high=" + high + ", low=" + low + ", vol=" + vol + ", last=" + last + ", buy=" + buy + ", sell=" + sell + ", data=" + data + '}';
    }

    
    
}
