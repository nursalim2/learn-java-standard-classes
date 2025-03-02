package com.nursalim.standard.classes;

import java.util.Objects;

public class ObjectsApp {
    public static class Data {
        private String data;

        public String getData() {
            return data;
        }

        public void setData(String data) {
            this.data = data;
        }

        @Override
        public boolean equals(Object object) {
            if (object == null || getClass() != object.getClass()) return false;

            Data data1 = (Data) object;
            return Objects.equals(data, data1.data);
        }

        @Override
        public int hashCode() {
            return Objects.hashCode(data);
        }
    }

    public static void main(String[] args) {

    }
}
