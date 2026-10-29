            package com.pichillilorenzo.flutter_inappwebview_android.types;

            import android.net.http.SslCertificate;
            import android.os.Build;
            import com.pichillilorenzo.flutter_inappwebview_android.Util;
            import java.security.cert.CertificateEncodingException;
            import java.security.cert.X509Certificate;
            import java.util.HashMap;
            import java.util.Map;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class SslCertificateExt extends SslCertificate {
                private SslCertificateExt(X509Certificate x509Certificate) {
/* 1 */             super(x509Certificate);
                }

                public static Map<String, Object> toMap(SslCertificate sslCertificate) {
                    HashMap map;
                    HashMap map2;
/* 1 */             byte[] encoded = null;
/* 2 */             if (sslCertificate == null) {
/* 1 */                 return null;
                    }
/* 5 */             SslCertificate.DName issuedBy = sslCertificate.getIssuedBy();
/* 17 */            if (issuedBy != null) {
/* 21 */                map = new HashMap();
/* 28 */                map.put("CName", issuedBy.getCName());
/* 35 */                map.put("DName", issuedBy.getDName());
/* 42 */                map.put("OName", issuedBy.getOName());
/* 49 */                map.put("UName", issuedBy.getUName());
                    } else {
/* 53 */                map = null;
                    }
/* 54 */            SslCertificate.DName issuedTo = sslCertificate.getIssuedTo();
/* 58 */            if (issuedTo != null) {
/* 62 */                map2 = new HashMap();
/* 69 */                map2.put("CName", issuedTo.getCName());
/* 76 */                map2.put("DName", issuedTo.getDName());
/* 83 */                map2.put("OName", issuedTo.getOName());
/* 90 */                map2.put("UName", issuedTo.getUName());
                    } else {
/* 94 */                map2 = null;
                    }
/* 99 */            if (Build.VERSION.SDK_INT >= 29) {
                        try {
/* 1 */                     X509Certificate x509Certificate = sslCertificate.getX509Certificate();
/* 105 */                   if (x509Certificate != null) {
/* 107 */                       encoded = x509Certificate.getEncoded();
                            }
                        } catch (CertificateEncodingException e) {
/* 113 */                   e.printStackTrace();
                        }
                    } else {
                        try {
/* 121 */                   encoded = Util.getX509CertFromSslCertHack(sslCertificate).getEncoded();
                        } catch (CertificateEncodingException e2) {
/* 127 */                   e2.printStackTrace();
                        }
                    }
/* 134 */           long time = sslCertificate.getValidNotAfterDate().getTime();
/* 142 */           long time2 = sslCertificate.getValidNotBeforeDate().getTime();
/* 148 */           HashMap map3 = new HashMap();
/* 153 */           map3.put("issuedBy", map);
/* 158 */           map3.put("issuedTo", map2);
/* 167 */           map3.put("validNotAfterDate", Long.valueOf(time));
/* 176 */           map3.put("validNotBeforeDate", Long.valueOf(time2));
/* 181 */           map3.put("x509Certificate", encoded);
/* 184 */           return map3;
                }
            }
