package com;

public class Clon {
        public static class A implements Cloneable {
            private int i;
            private int j;

            public A(int i, int j) {
                this.i = i;
                this.j = j;
            }

            @Override
            protected Object clone() throws CloneNotSupportedException {
                return super.clone();
            }

            public int getI() {
                return i;
            }

            public int getJ() {
                return j;
            }


            public static class B extends A {
                private String name;

                public B(int i, int j, String name) {
                    super(i, j);
                    this.name = name;
                }

                @Override
                protected Object clone() throws CloneNotSupportedException {
                    throw new CloneNotSupportedException();
                }
                public String getName () {
                    return name;
                }
            }


            public static class C extends B {
                public C(int i, int j, String name) {
                    super(i, j, name);
                }

                @Override
                protected Object clone() throws CloneNotSupportedException {
                    return new C(getI(), getJ(), getName());
                }
            }
            public static void main(String[] args) {

            }
        }
    }


