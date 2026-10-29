            package com.pichillilorenzo.flutter_inappwebview_android.types;

            import android.webkit.WebResourceError;
            import java.lang.reflect.Proxy;
            import java.util.HashMap;
            import java.util.Map;
            import okhttp3.HttpUrl;
            import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
            import p000.AbstractC1993o9;
            import p000.b73;
            import p000.c73;
            import p000.er0;
            import p000.fm0;
            import p000.n63;
            import p000.o63;
            import p000.xe2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 111 */   public class WebResourceErrorExt {
                private String description;
                private int type;

                public WebResourceErrorExt(int i, String str) {
/* 4 */             this.type = i;
/* 6 */             this.description = str;
                }

                public static WebResourceErrorExt fromWebResourceError(n63 n63Var) {
                    int iM7119f;
                    String string;
/* 7 */             if (xe2.m9786x("WEB_RESOURCE_ERROR_GET_CODE")) {
/* 10 */                o63 o63Var = (o63) n63Var;
/* 12 */                o63Var.getClass();
/* 17 */                b73.f2314o.getClass();
/* 22 */                if (o63Var.f14651a == null) {
/* 24 */                    er0 er0Var = c73.f2756a;
/* 42 */                    o63Var.f14651a = (WebResourceError) ((WebkitToCompatConverterBoundaryInterface) er0Var.f7853b).convertWebResourceError(Proxy.getInvocationHandler(o63Var.f14652b));
                        }
/* 46 */                iM7119f = AbstractC1993o9.m7119f(o63Var.f14651a);
                    } else {
/* 51 */                iM7119f = -1;
                    }
/* 58 */            if (xe2.m9786x("WEB_RESOURCE_ERROR_GET_DESCRIPTION")) {
/* 60 */                o63 o63Var2 = (o63) n63Var;
/* 62 */                o63Var2.getClass();
/* 67 */                b73.f2313n.getClass();
/* 72 */                if (o63Var2.f14651a == null) {
/* 74 */                    er0 er0Var2 = c73.f2756a;
/* 92 */                    o63Var2.f14651a = (WebResourceError) ((WebkitToCompatConverterBoundaryInterface) er0Var2.f7853b).convertWebResourceError(Proxy.getInvocationHandler(o63Var2.f14652b));
                        }
/* 100 */               string = AbstractC1993o9.m7118e(o63Var2.f14651a).toString();
                    } else {
/* 105 */               string = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
/* 109 */           return new WebResourceErrorExt(iM7119f, string);
                }

                public boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 3 */                 return true;
                    }
/* 6 */             if (obj == null || getClass() != obj.getClass()) {
/* 5 */                 return false;
                    }
/* 19 */            WebResourceErrorExt webResourceErrorExt = (WebResourceErrorExt) obj;
/* 25 */            if (this.type != webResourceErrorExt.type) {
/* 5 */                 return false;
                    }
/* 32 */            return this.description.equals(webResourceErrorExt.description);
                }

                public String getDescription() {
/* 1 */             return this.description;
                }

                public int getType() {
/* 1 */             return this.type;
                }

                public int hashCode() {
/* 11 */            return this.description.hashCode() + (this.type * 31);
                }

                public void setDescription(String str) {
/* 1 */             this.description = str;
                }

                public void setType(int i) {
/* 1 */             this.type = i;
                }

                public Map<String, Object> toMap() {
/* 3 */             HashMap map = new HashMap();
/* 16 */            map.put("type", Integer.valueOf(getType()));
/* 25 */            map.put("description", getDescription());
/* 28 */            return map;
                }

                public String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("WebResourceErrorExt{type=");
/* 10 */            sb.append(this.type);
/* 15 */            sb.append(", description='");
/* 22 */            return fm0.m3789o(sb, this.description, "'}");
                }

/* 112 */       public static WebResourceErrorExt fromWebResourceError(WebResourceError webResourceError) {
/* 113 */           return new WebResourceErrorExt(webResourceError.getErrorCode(), webResourceError.getDescription().toString());
                }
            }
