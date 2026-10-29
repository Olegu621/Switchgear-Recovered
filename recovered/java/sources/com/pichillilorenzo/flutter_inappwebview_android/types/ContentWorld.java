            package com.pichillilorenzo.flutter_inappwebview_android.types;

            import java.util.Map;
            import p000.fm0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class ContentWorld {
                static final /* synthetic */ boolean $assertionsDisabled = false;
                private String name;
                public static final ContentWorld PAGE = new ContentWorld("page");
                public static final ContentWorld DEFAULT_CLIENT = new ContentWorld("defaultClient");

                private ContentWorld(String str) {
/* 4 */             this.name = str;
                }

                public static ContentWorld fromMap(Map<String, Object> map) {
/* 1 */             if (map == null) {
/* 3 */                 return null;
                    }
/* 15 */            return new ContentWorld((String) map.get("name"));
                }

                public static ContentWorld world(String str) {
/* 3 */             return new ContentWorld(str);
                }

                public boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 3 */                 return true;
                    }
/* 5 */             if (obj == null || getClass() != obj.getClass()) {
/* 29 */                return false;
                    }
/* 24 */            return this.name.equals(((ContentWorld) obj).name);
                }

                public String getName() {
/* 1 */             return this.name;
                }

                public int hashCode() {
/* 3 */             return this.name.hashCode();
                }

                public void setName(String str) {
/* 1 */             this.name = str;
                }

                public String toString() {
/* 12 */            return fm0.m3789o(new StringBuilder("ContentWorld{name='"), this.name, "'}");
                }
            }
