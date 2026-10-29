            package com.pichillilorenzo.flutter_inappwebview_android.types;

            import java.util.HashMap;
            import java.util.Map;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class Size2D {
                static final /* synthetic */ boolean $assertionsDisabled = false;
                private double height;
                private double width;

                public Size2D(double d, double d2) {
/* 4 */             this.width = d;
/* 6 */             this.height = d2;
                }

                public static Size2D fromMap(Map<String, Object> map) {
/* 1 */             if (map == null) {
/* 3 */                 return null;
                    }
/* 31 */            return new Size2D(((Double) map.get("width")).doubleValue(), ((Double) map.get("height")).doubleValue());
                }

                public boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 6 */             if (obj != null && getClass() == obj.getClass()) {
/* 19 */                Size2D size2D = (Size2D) obj;
/* 29 */                if (Double.compare(size2D.width, this.width) == 0 && Double.compare(size2D.height, this.height) == 0) {
/* 1 */                     return true;
                        }
                    }
/* 5 */             return false;
                }

                public double getHeight() {
/* 1 */             return this.height;
                }

                public double getWidth() {
/* 1 */             return this.width;
                }

                public int hashCode() {
/* 3 */             long jDoubleToLongBits = Double.doubleToLongBits(this.width);
/* 12 */            int i = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
/* 15 */            long jDoubleToLongBits2 = Double.doubleToLongBits(this.height);
/* 25 */            return (i * 31) + ((int) ((jDoubleToLongBits2 >>> 32) ^ jDoubleToLongBits2));
                }

                public void setHeight(double d) {
/* 1 */             this.height = d;
                }

                public void setWidth(double d) {
/* 1 */             this.width = d;
                }

                public Map<String, Object> toMap() {
/* 3 */             HashMap map = new HashMap();
/* 14 */            map.put("width", Double.valueOf(this.width));
/* 25 */            map.put("height", Double.valueOf(this.height));
/* 28 */            return map;
                }

                public String toString() {
/* 28 */            return "Size{width=" + this.width + ", height=" + this.height + '}';
                }
            }
