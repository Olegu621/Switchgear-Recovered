            package com.pichillilorenzo.flutter_inappwebview_android.types;

            import android.print.PrintAttributes;
            import java.util.HashMap;
            import java.util.Map;
            import p000.AbstractC0886en;
            import p000.pm2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class ResolutionExt {
                private int horizontalDpi;

                /* JADX INFO: renamed from: id */
                private String f5333id;
                private String label;
                private int verticalDpi;

                public ResolutionExt(String str, String str2, int i, int i2) {
/* 4 */             this.f5333id = str;
/* 6 */             this.label = str2;
/* 8 */             this.verticalDpi = i;
/* 10 */            this.horizontalDpi = i2;
                }

                public static ResolutionExt fromMap(Map<String, Object> map) {
/* 1 */             if (map == null) {
/* 3 */                 return null;
                    }
/* 47 */            return new ResolutionExt((String) map.get("id"), (String) map.get("label"), ((Integer) map.get("verticalDpi")).intValue(), ((Integer) map.get("horizontalDpi")).intValue());
                }

                public static ResolutionExt fromResolution(PrintAttributes.Resolution resolution) {
/* 1 */             if (resolution == null) {
/* 3 */                 return null;
                    }
/* 23 */            return new ResolutionExt(resolution.getId(), resolution.getLabel(), resolution.getVerticalDpi(), resolution.getHorizontalDpi());
                }

                public boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 3 */                 return true;
                    }
/* 6 */             if (obj == null || getClass() != obj.getClass()) {
/* 5 */                 return false;
                    }
/* 19 */            ResolutionExt resolutionExt = (ResolutionExt) obj;
/* 25 */            if (this.verticalDpi == resolutionExt.verticalDpi && this.horizontalDpi == resolutionExt.horizontalDpi && this.f5333id.equals(resolutionExt.f5333id)) {
/* 50 */                return this.label.equals(resolutionExt.label);
                    }
/* 5 */             return false;
                }

                public int getHorizontalDpi() {
/* 1 */             return this.horizontalDpi;
                }

                public String getId() {
/* 1 */             return this.f5333id;
                }

                public String getLabel() {
/* 1 */             return this.label;
                }

                public int getVerticalDpi() {
/* 1 */             return this.verticalDpi;
                }

                public int hashCode() {
/* 22 */            return ((pm2.m7485h(this.f5333id.hashCode() * 31, 31, this.label) + this.verticalDpi) * 31) + this.horizontalDpi;
                }

                public void setHorizontalDpi(int i) {
/* 1 */             this.horizontalDpi = i;
                }

                public void setId(String str) {
/* 1 */             this.f5333id = str;
                }

                public void setLabel(String str) {
/* 1 */             this.label = str;
                }

                public void setVerticalDpi(int i) {
/* 1 */             this.verticalDpi = i;
                }

                public Map<String, Object> toMap() {
/* 3 */             HashMap map = new HashMap();
/* 10 */            map.put("id", this.f5333id);
/* 17 */            map.put("label", this.label);
/* 28 */            map.put("verticalDpi", Integer.valueOf(this.verticalDpi));
/* 39 */            map.put("horizontalDpi", Integer.valueOf(this.horizontalDpi));
/* 42 */            return map;
                }

                public PrintAttributes.Resolution toResolution() {
/* 11 */            return new PrintAttributes.Resolution(this.f5333id, this.label, this.horizontalDpi, this.verticalDpi);
                }

                public String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("ResolutionExt{id='");
/* 10 */            sb.append(this.f5333id);
/* 15 */            sb.append("', label='");
/* 20 */            sb.append(this.label);
/* 25 */            sb.append("', verticalDpi=");
/* 30 */            sb.append(this.verticalDpi);
/* 35 */            sb.append(", horizontalDpi=");
/* 42 */            return AbstractC0886en.m3510n(sb, this.horizontalDpi, '}');
                }
            }
