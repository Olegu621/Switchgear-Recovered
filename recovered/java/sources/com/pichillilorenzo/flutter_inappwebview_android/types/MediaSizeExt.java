            package com.pichillilorenzo.flutter_inappwebview_android.types;

            import android.print.PrintAttributes;
            import java.util.HashMap;
            import java.util.Map;
            import p000.AbstractC0886en;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class MediaSizeExt {
                private int heightMils;

                /* JADX INFO: renamed from: id */
                private String f5332id;
                private String label;
                private int widthMils;

                public MediaSizeExt(String str, String str2, int i, int i2) {
/* 4 */             this.f5332id = str;
/* 6 */             this.label = str2;
/* 8 */             this.widthMils = i;
/* 10 */            this.heightMils = i2;
                }

                public static MediaSizeExt fromMap(Map<String, Object> map) {
/* 1 */             if (map == null) {
/* 3 */                 return null;
                    }
/* 47 */            return new MediaSizeExt((String) map.get("id"), (String) map.get("label"), ((Integer) map.get("widthMils")).intValue(), ((Integer) map.get("heightMils")).intValue());
                }

                public static MediaSizeExt fromMediaSize(PrintAttributes.MediaSize mediaSize) {
/* 2 */             if (mediaSize == null) {
/* 1 */                 return null;
                    }
/* 19 */            return new MediaSizeExt(mediaSize.getId(), null, mediaSize.getHeightMils(), mediaSize.getWidthMils());
                }

                public boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 6 */             if (obj != null && getClass() == obj.getClass()) {
/* 19 */                MediaSizeExt mediaSizeExt = (MediaSizeExt) obj;
/* 25 */                if (this.widthMils != mediaSizeExt.widthMils || this.heightMils != mediaSizeExt.heightMils || !this.f5332id.equals(mediaSizeExt.f5332id)) {
/* 5 */                     return false;
                        }
/* 46 */                String str = this.label;
/* 48 */                String str2 = mediaSizeExt.label;
/* 50 */                if (str != null) {
/* 52 */                    return str.equals(str2);
                        }
/* 57 */                if (str2 == null) {
/* 1 */                     return true;
                        }
                    }
/* 5 */             return false;
                }

                public int getHeightMils() {
/* 1 */             return this.heightMils;
                }

                public String getId() {
/* 1 */             return this.f5332id;
                }

                public String getLabel() {
/* 1 */             return this.label;
                }

                public int getWidthMils() {
/* 1 */             return this.widthMils;
                }

                public int hashCode() {
/* 7 */             int iHashCode = this.f5332id.hashCode() * 31;
/* 9 */             String str = this.label;
/* 29 */            return ((((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.widthMils) * 31) + this.heightMils;
                }

                public void setHeightMils(int i) {
/* 1 */             this.heightMils = i;
                }

                public void setId(String str) {
/* 1 */             this.f5332id = str;
                }

                public void setLabel(String str) {
/* 1 */             this.label = str;
                }

                public void setWidthMils(int i) {
/* 1 */             this.widthMils = i;
                }

                public Map<String, Object> toMap() {
/* 3 */             HashMap map = new HashMap();
/* 10 */            map.put("id", this.f5332id);
/* 17 */            map.put("label", this.label);
/* 28 */            map.put("heightMils", Integer.valueOf(this.heightMils));
/* 39 */            map.put("widthMils", Integer.valueOf(this.widthMils));
/* 42 */            return map;
                }

                public PrintAttributes.MediaSize toMediaSize() {
/* 11 */            return new PrintAttributes.MediaSize(this.f5332id, "Custom", this.widthMils, this.heightMils);
                }

                public String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("MediaSizeExt{id='");
/* 10 */            sb.append(this.f5332id);
/* 15 */            sb.append("', label='");
/* 20 */            sb.append(this.label);
/* 25 */            sb.append("', widthMils=");
/* 30 */            sb.append(this.widthMils);
/* 35 */            sb.append(", heightMils=");
/* 42 */            return AbstractC0886en.m3510n(sb, this.heightMils, '}');
                }
            }
