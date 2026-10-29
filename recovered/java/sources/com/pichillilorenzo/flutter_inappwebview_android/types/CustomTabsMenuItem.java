            package com.pichillilorenzo.flutter_inappwebview_android.types;

            import java.util.Map;
            import p000.fm0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class CustomTabsMenuItem {

                /* JADX INFO: renamed from: id */
                private int f5330id;
                private String label;

                public CustomTabsMenuItem(int i, String str) {
/* 4 */             this.f5330id = i;
/* 6 */             this.label = str;
                }

                public static CustomTabsMenuItem fromMap(Map<String, Object> map) {
/* 1 */             if (map == null) {
/* 3 */                 return null;
                    }
/* 27 */            return new CustomTabsMenuItem(((Integer) map.get("id")).intValue(), (String) map.get("label"));
                }

                public boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 3 */                 return true;
                    }
/* 6 */             if (obj == null || getClass() != obj.getClass()) {
/* 5 */                 return false;
                    }
/* 19 */            CustomTabsMenuItem customTabsMenuItem = (CustomTabsMenuItem) obj;
/* 25 */            if (this.f5330id != customTabsMenuItem.f5330id) {
/* 5 */                 return false;
                    }
/* 32 */            return this.label.equals(customTabsMenuItem.label);
                }

                public int getId() {
/* 1 */             return this.f5330id;
                }

                public String getLabel() {
/* 1 */             return this.label;
                }

                public int hashCode() {
/* 11 */            return this.label.hashCode() + (this.f5330id * 31);
                }

                public void setId(int i) {
/* 1 */             this.f5330id = i;
                }

                public void setLabel(String str) {
/* 1 */             this.label = str;
                }

                public String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("CustomTabsMenuItem{id=");
/* 10 */            sb.append(this.f5330id);
/* 15 */            sb.append(", label='");
/* 22 */            return fm0.m3789o(sb, this.label, "'}");
                }
            }
