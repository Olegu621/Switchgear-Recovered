            package com.pichillilorenzo.flutter_inappwebview_android.types;

            import android.content.Context;
            import java.util.HashMap;
            import java.util.Map;
            import p000.fm0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class AndroidResource {
                private String defPackage;
                private String defType;
                private String name;

                public AndroidResource(String str, String str2, String str3) {
/* 4 */             this.name = str;
/* 6 */             this.defType = str2;
/* 8 */             this.defPackage = str3;
                }

                public static AndroidResource fromMap(Map<String, Object> map) {
/* 1 */             if (map == null) {
/* 3 */                 return null;
                    }
/* 31 */            return new AndroidResource((String) map.get("name"), (String) map.get("defType"), (String) map.get("defPackage"));
                }

                public boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 6 */             if (obj != null && getClass() == obj.getClass()) {
/* 19 */                AndroidResource androidResource = (AndroidResource) obj;
/* 29 */                if (!this.name.equals(androidResource.name)) {
/* 5 */                     return false;
                        }
/* 32 */                String str = this.defType;
/* 34 */                String str2 = androidResource.defType;
/* 36 */                if (str == null ? str2 != null : !str.equals(str2)) {
/* 5 */                     return false;
                        }
/* 48 */                String str3 = this.defPackage;
/* 50 */                String str4 = androidResource.defPackage;
/* 52 */                if (str3 != null) {
/* 54 */                    return str3.equals(str4);
                        }
/* 59 */                if (str4 == null) {
/* 1 */                     return true;
                        }
                    }
/* 5 */             return false;
                }

                public String getDefPackage() {
/* 1 */             return this.defPackage;
                }

                public String getDefType() {
/* 1 */             return this.defType;
                }

                public int getIdentifier(Context context) {
/* 11 */            return context.getResources().getIdentifier(this.name, this.defType, this.defPackage);
                }

                public String getName() {
/* 1 */             return this.name;
                }

                public int hashCode() {
/* 7 */             int iHashCode = this.name.hashCode() * 31;
/* 9 */             String str = this.defType;
/* 21 */            int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
/* 23 */            String str2 = this.defPackage;
/* 31 */            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
                }

                public void setDefPackage(String str) {
/* 1 */             this.defPackage = str;
                }

                public void setDefType(String str) {
/* 1 */             this.defType = str;
                }

                public void setName(String str) {
/* 1 */             this.name = str;
                }

                public Map<String, Object> toMap() {
/* 3 */             HashMap map = new HashMap();
/* 10 */            map.put("name", this.name);
/* 17 */            map.put("defType", this.defType);
/* 24 */            map.put("defPackage", this.defPackage);
/* 27 */            return map;
                }

                public String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("AndroidResource{name='");
/* 10 */            sb.append(this.name);
/* 15 */            sb.append("', type='");
/* 20 */            sb.append(this.defType);
/* 25 */            sb.append("', defPackage='");
/* 32 */            return fm0.m3789o(sb, this.defPackage, "'}");
                }
            }
