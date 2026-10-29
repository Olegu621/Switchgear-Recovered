            package com.pichillilorenzo.flutter_inappwebview_android.types;

            import android.print.PrintAttributes;
            import java.util.HashMap;
            import java.util.Map;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 11 */    public class MarginsExt {
                private double bottom;
                private double left;
                private double right;
                private double top;

                public MarginsExt(double d, double d2, double d3, double d4) {
/* 4 */             this.top = d;
/* 6 */             this.right = d2;
/* 8 */             this.bottom = d3;
/* 10 */            this.left = d4;
                }

                public static MarginsExt fromMap(Map<String, Object> map) {
/* 1 */             if (map == null) {
/* 3 */                 return null;
                    }
/* 55 */            return new MarginsExt(((Double) map.get("top")).doubleValue(), ((Double) map.get("right")).doubleValue(), ((Double) map.get("bottom")).doubleValue(), ((Double) map.get("left")).doubleValue());
                }

                public static MarginsExt fromMargins(PrintAttributes.Margins margins) {
/* 1 */             if (margins == null) {
/* 3 */                 return null;
                    }
/* 7 */             MarginsExt marginsExt = new MarginsExt();
/* 18 */            marginsExt.top = milsToPixels(margins.getTopMils());
/* 28 */            marginsExt.right = milsToPixels(margins.getRightMils());
/* 38 */            marginsExt.bottom = milsToPixels(margins.getBottomMils());
/* 48 */            marginsExt.left = milsToPixels(margins.getLeftMils());
/* 50 */            return marginsExt;
                }

                private static double milsToPixels(int i) {
/* 7 */             return ((double) i) * 0.09600001209449d;
                }

                private static int pixelsToMils(double d) {
/* 11 */            return (int) Math.round(d * 10.416665354331d);
                }

                public boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 6 */             if (obj != null && getClass() == obj.getClass()) {
/* 19 */                MarginsExt marginsExt = (MarginsExt) obj;
/* 29 */                if (Double.compare(marginsExt.top, this.top) == 0 && Double.compare(marginsExt.right, this.right) == 0 && Double.compare(marginsExt.bottom, this.bottom) == 0 && Double.compare(marginsExt.left, this.left) == 0) {
/* 1 */                     return true;
                        }
                    }
/* 5 */             return false;
                }

                public double getBottom() {
/* 1 */             return this.bottom;
                }

                public double getLeft() {
/* 1 */             return this.left;
                }

                public double getRight() {
/* 1 */             return this.right;
                }

                public double getTop() {
/* 1 */             return this.top;
                }

                public int hashCode() {
/* 3 */             long jDoubleToLongBits = Double.doubleToLongBits(this.top);
/* 15 */            long jDoubleToLongBits2 = Double.doubleToLongBits(this.right);
/* 25 */            int i = (((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) * 31) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)));
/* 28 */            long jDoubleToLongBits3 = Double.doubleToLongBits(this.bottom);
/* 38 */            int i2 = (i * 31) + ((int) (jDoubleToLongBits3 ^ (jDoubleToLongBits3 >>> 32)));
/* 41 */            long jDoubleToLongBits4 = Double.doubleToLongBits(this.left);
/* 51 */            return (i2 * 31) + ((int) ((jDoubleToLongBits4 >>> 32) ^ jDoubleToLongBits4));
                }

                public void setBottom(double d) {
/* 1 */             this.bottom = d;
                }

                public void setLeft(double d) {
/* 1 */             this.left = d;
                }

                public void setRight(double d) {
/* 1 */             this.right = d;
                }

                public void setTop(double d) {
/* 1 */             this.top = d;
                }

                public Map<String, Object> toMap() {
/* 3 */             HashMap map = new HashMap();
/* 14 */            map.put("top", Double.valueOf(this.top));
/* 25 */            map.put("right", Double.valueOf(this.right));
/* 36 */            map.put("bottom", Double.valueOf(this.bottom));
/* 47 */            map.put("left", Double.valueOf(this.left));
/* 50 */            return map;
                }

                public PrintAttributes.Margins toMargins() {
/* 27 */            return new PrintAttributes.Margins(pixelsToMils(this.left), pixelsToMils(this.top), pixelsToMils(this.right), pixelsToMils(this.bottom));
                }

                public String toString() {
/* 48 */            return "MarginsExt{top=" + this.top + ", right=" + this.right + ", bottom=" + this.bottom + ", left=" + this.left + '}';
                }

/* 12 */        public MarginsExt() {
                }
            }
