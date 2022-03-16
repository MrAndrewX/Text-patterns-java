public class Caixa<T> {

        private Object[] objectArray;
        private int nobj = 0;
        private int capacity = 0;

        public Caixa() {
            objectArray = new Object[2];
            capacity = 2;
        }

        public int size() {
            return this.nobj;
        }

        public Caixa(int capacity) {
            objectArray = new Object[capacity];
            this.capacity = capacity;
        }

        void addElement(T o) {
            if (this.nobj == this.capacity) {
                int newCapacity = this.capacity*2;
                Object[] newArray = new Object[newCapacity];
                for(int i=0; i<this.capacity; i++) {
                    newArray[i] = this.objectArray[i];
                }
                this.objectArray = newArray;
                this.capacity = newCapacity;
                System.out.println("Hem ampliat la capacitat: " + newCapacity);
            }
            this.objectArray[this.nobj] = o;
            this.nobj++;
        }

    }
