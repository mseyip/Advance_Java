package Generics.classes;

public class NonGenericClass {

    //field(özellik): Farklı data tiplerini referans alabilsin
    private Object object; //Farklı data tipleri ile bu field'ı oluşturabilmek istiyorsam Object Class'ını kullanabilirim

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }
}
