            package com.pichillilorenzo.flutter_inappwebview_android.types;

            import com.supercell.p007id.scid_plugin.platform_interface.SharedDataContentProvider;
            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            import java.util.Objects;
            import p000.i63;
            import p000.xe2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class WebMessageCompatExt {
                private Object data;
                private List<WebMessagePortCompatExt> ports;
                private int type;

                public WebMessageCompatExt(Object obj, int i, List<WebMessagePortCompatExt> list) {
/* 4 */             this.data = obj;
/* 6 */             this.type = i;
/* 8 */             this.ports = list;
                }

                public static WebMessageCompatExt fromMap(Map<String, Object> map) {
/* 1 */             ArrayList arrayList = null;
/* 2 */             if (map == null) {
/* 1 */                 return null;
                    }
/* 7 */             Object obj = map.get(SharedDataContentProvider.BASE_PATH);
/* 17 */            Integer num = (Integer) map.get("type");
/* 25 */            List list = (List) map.get("ports");
/* 27 */            if (list != null && !list.isEmpty()) {
/* 37 */                arrayList = new ArrayList();
/* 40 */                Iterator it = list.iterator();
/* 48 */                while (it.hasNext()) {
/* 60 */                    arrayList.add(WebMessagePortCompatExt.fromMap((Map) it.next()));
                        }
                    }
/* 70 */            return new WebMessageCompatExt(obj, num.intValue(), arrayList);
                }

                public static WebMessageCompatExt fromMapWebMessageCompat(i63 i63Var) {
                    Object obj;
/* 7 */             if (xe2.m9786x("WEB_MESSAGE_ARRAY_BUFFER") && i63Var.f9475d == 1) {
/* 14 */                i63Var.m4482a(1);
/* 17 */                obj = i63Var.f9474c;
/* 19 */                Objects.requireNonNull(obj);
                    } else {
/* 24 */                i63Var.m4482a(0);
/* 27 */                obj = i63Var.f9473b;
                    }
/* 34 */            return new WebMessageCompatExt(obj, i63Var.f9475d, null);
                }

                public boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 3 */                 return true;
                    }
/* 6 */             if (obj == null || getClass() != obj.getClass()) {
/* 5 */                 return false;
                    }
/* 19 */            WebMessageCompatExt webMessageCompatExt = (WebMessageCompatExt) obj;
/* 25 */            if (this.type == webMessageCompatExt.type && Objects.equals(this.data, webMessageCompatExt.data)) {
/* 43 */                return Objects.equals(this.ports, webMessageCompatExt.ports);
                    }
/* 5 */             return false;
                }

                public Object getData() {
/* 1 */             return this.data;
                }

                public List<WebMessagePortCompatExt> getPorts() {
/* 1 */             return this.ports;
                }

                public int getType() {
/* 1 */             return this.type;
                }

                public int hashCode() {
/* 1 */             Object obj = this.data;
/* 17 */            int iHashCode = (((obj != null ? obj.hashCode() : 0) * 31) + this.type) * 31;
/* 19 */            List<WebMessagePortCompatExt> list = this.ports;
/* 27 */            return iHashCode + (list != null ? list.hashCode() : 0);
                }

                public void setData(Object obj) {
/* 1 */             this.data = obj;
                }

                public void setPorts(List<WebMessagePortCompatExt> list) {
/* 1 */             this.ports = list;
                }

                public void setType(int i) {
/* 1 */             this.type = i;
                }

                public Map<String, Object> toMap() {
/* 3 */             HashMap map = new HashMap();
/* 10 */            map.put(SharedDataContentProvider.BASE_PATH, this.data);
/* 21 */            map.put("type", Integer.valueOf(this.type));
/* 24 */            return map;
                }

                public String toString() {
/* 38 */            return "WebMessageCompatExt{data=" + this.data + ", type=" + this.type + ", ports=" + this.ports + '}';
                }
            }
