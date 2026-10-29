            package com.pichillilorenzo.flutter_inappwebview_android.types;

            import android.net.http.SslCertificate;
            import android.net.http.SslError;
            import java.util.HashMap;
            import java.util.Map;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class SslErrorExt extends SslError {
                private SslErrorExt(int i, SslCertificate sslCertificate, String str) {
/* 1 */             super(i, sslCertificate, str);
                }

                public static Map<String, Object> toMap(SslError sslError) {
                    String str;
/* 2 */             if (sslError == null) {
/* 1 */                 return null;
                    }
/* 5 */             int primaryError = sslError.getPrimaryError();
/* 9 */             if (primaryError == 0) {
/* 43 */                str = "The certificate is not yet valid";
                    } else if (primaryError == 1) {
/* 40 */                str = "The certificate has expired";
                    } else if (primaryError == 2) {
/* 37 */                str = "Hostname mismatch";
                    } else if (primaryError == 3) {
/* 34 */                str = "The certificate authority is not trusted";
                    } else if (primaryError != 4) {
/* 28 */                str = primaryError != 5 ? null : "A generic error occurred";
                    } else {
/* 31 */                str = "The date of the certificate is invalid";
                    }
/* 47 */            HashMap map = new HashMap();
/* 58 */            map.put("code", primaryError >= 0 ? Integer.valueOf(primaryError) : null);
/* 63 */            map.put("message", str);
/* 66 */            return map;
                }
            }
