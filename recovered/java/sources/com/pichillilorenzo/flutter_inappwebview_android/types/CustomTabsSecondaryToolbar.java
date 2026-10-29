            package com.pichillilorenzo.flutter_inappwebview_android.types;

            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class CustomTabsSecondaryToolbar {
                private List<AndroidResource> clickableIDs;
                private AndroidResource layout;

                public CustomTabsSecondaryToolbar(AndroidResource androidResource, List<AndroidResource> list) {
/* 6 */             new ArrayList();
/* 9 */             this.layout = androidResource;
/* 11 */            this.clickableIDs = list;
                }

                public static CustomTabsSecondaryToolbar fromMap(Map<String, Object> map) {
/* 1 */             if (map == null) {
/* 3 */                 return null;
                    }
/* 13 */            AndroidResource androidResourceFromMap = AndroidResource.fromMap((Map) map.get("layout"));
/* 19 */            ArrayList arrayList = new ArrayList();
/* 28 */            List list = (List) map.get("clickableIDs");
/* 30 */            if (list != null) {
/* 32 */                Iterator it = list.iterator();
/* 40 */                while (it.hasNext()) {
/* 56 */                    AndroidResource androidResourceFromMap2 = AndroidResource.fromMap((Map) ((Map) it.next()).get("id"));
/* 60 */                    if (androidResourceFromMap2 != null) {
/* 62 */                        arrayList.add(androidResourceFromMap2);
                            }
                        }
                    }
/* 68 */            return new CustomTabsSecondaryToolbar(androidResourceFromMap, arrayList);
                }

                public boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 3 */                 return true;
                    }
/* 6 */             if (obj == null || getClass() != obj.getClass()) {
/* 5 */                 return false;
                    }
/* 19 */            CustomTabsSecondaryToolbar customTabsSecondaryToolbar = (CustomTabsSecondaryToolbar) obj;
/* 29 */            if (this.layout.equals(customTabsSecondaryToolbar.layout)) {
/* 36 */                return this.clickableIDs.equals(customTabsSecondaryToolbar.clickableIDs);
                    }
/* 5 */             return false;
                }

                public List<AndroidResource> getClickableIDs() {
/* 1 */             return this.clickableIDs;
                }

                public AndroidResource getLayout() {
/* 1 */             return this.layout;
                }

                public int hashCode() {
/* 15 */            return this.clickableIDs.hashCode() + (this.layout.hashCode() * 31);
                }

                public void setClickableIDs(List<AndroidResource> list) {
/* 1 */             this.clickableIDs = list;
                }

                public void setLayout(AndroidResource androidResource) {
/* 1 */             this.layout = androidResource;
                }

                public String toString() {
/* 28 */            return "CustomTabsSecondaryToolbar{layout=" + this.layout + ", clickableIDs=" + this.clickableIDs + '}';
                }
            }
