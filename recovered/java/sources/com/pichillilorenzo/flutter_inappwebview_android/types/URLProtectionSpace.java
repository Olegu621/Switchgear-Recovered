            package com.pichillilorenzo.flutter_inappwebview_android.types;

            import android.net.http.SslCertificate;
            import android.net.http.SslError;
            import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLProtectionSpaceContract;
            import java.util.HashMap;
            import java.util.Map;
            import p000.pm2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 15 */    public class URLProtectionSpace {
                private String host;

                /* JADX INFO: renamed from: id */
                private Long f5335id;
                private int port;
                private String protocol;
                private String realm;
                private SslCertificate sslCertificate;
                private SslError sslError;

                public URLProtectionSpace(String str, String str2, String str3, int i, SslCertificate sslCertificate, SslError sslError) {
/* 4 */             this.host = str;
/* 6 */             this.protocol = str2;
/* 8 */             this.realm = str3;
/* 10 */            this.port = i;
/* 12 */            this.sslCertificate = sslCertificate;
/* 14 */            this.sslError = sslError;
                }

                public boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 6 */             if (obj != null && getClass() == obj.getClass()) {
/* 19 */                URLProtectionSpace uRLProtectionSpace = (URLProtectionSpace) obj;
/* 25 */                if (this.port != uRLProtectionSpace.port || !this.host.equals(uRLProtectionSpace.host) || !this.protocol.equals(uRLProtectionSpace.protocol)) {
/* 5 */                     return false;
                        }
/* 50 */                String str = this.realm;
/* 52 */                String str2 = uRLProtectionSpace.realm;
/* 54 */                if (str == null ? str2 != null : !str.equals(str2)) {
/* 5 */                     return false;
                        }
/* 66 */                SslCertificate sslCertificate = this.sslCertificate;
/* 68 */                SslCertificate sslCertificate2 = uRLProtectionSpace.sslCertificate;
/* 70 */                if (sslCertificate == null ? sslCertificate2 != null : !sslCertificate.equals(sslCertificate2)) {
/* 5 */                     return false;
                        }
/* 82 */                SslError sslError = this.sslError;
/* 84 */                SslError sslError2 = uRLProtectionSpace.sslError;
/* 86 */                if (sslError != null) {
/* 88 */                    return sslError.equals(sslError2);
                        }
/* 93 */                if (sslError2 == null) {
/* 1 */                     return true;
                        }
                    }
/* 5 */             return false;
                }

                public String getHost() {
/* 1 */             return this.host;
                }

                public Long getId() {
/* 1 */             return this.f5335id;
                }

                public int getPort() {
/* 1 */             return this.port;
                }

                public String getProtocol() {
/* 1 */             return this.protocol;
                }

                public String getRealm() {
/* 1 */             return this.realm;
                }

                public SslCertificate getSslCertificate() {
/* 1 */             return this.sslCertificate;
                }

                public SslError getSslError() {
/* 1 */             return this.sslError;
                }

                public int hashCode() {
/* 12 */            int iM7485h = pm2.m7485h(this.host.hashCode() * 31, 31, this.protocol);
/* 16 */            String str = this.realm;
/* 32 */            int iHashCode = (((iM7485h + (str != null ? str.hashCode() : 0)) * 31) + this.port) * 31;
/* 33 */            SslCertificate sslCertificate = this.sslCertificate;
/* 44 */            int iHashCode2 = (iHashCode + (sslCertificate != null ? sslCertificate.hashCode() : 0)) * 31;
/* 45 */            SslError sslError = this.sslError;
/* 53 */            return iHashCode2 + (sslError != null ? sslError.hashCode() : 0);
                }

                public void setHost(String str) {
/* 1 */             this.host = str;
                }

                public void setId(Long l) {
/* 1 */             this.f5335id = l;
                }

                public void setPort(int i) {
/* 1 */             this.port = i;
                }

                public void setProtocol(String str) {
/* 1 */             this.protocol = str;
                }

                public void setRealm(String str) {
/* 1 */             this.realm = str;
                }

                public void setSslCertificate(SslCertificate sslCertificate) {
/* 1 */             this.sslCertificate = sslCertificate;
                }

                public void setSslError(SslError sslError) {
/* 1 */             this.sslError = sslError;
                }

                public Map<String, Object> toMap() {
/* 3 */             HashMap map = new HashMap();
/* 10 */            map.put(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST, this.host);
/* 17 */            map.put(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PROTOCOL, this.protocol);
/* 24 */            map.put(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_REALM, this.realm);
/* 35 */            map.put(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PORT, Integer.valueOf(this.port));
/* 46 */            map.put("sslCertificate", SslCertificateExt.toMap(this.sslCertificate));
/* 57 */            map.put("sslError", SslErrorExt.toMap(this.sslError));
/* 63 */            map.put("authenticationMethod", null);
/* 68 */            map.put("distinguishedNames", null);
/* 73 */            map.put("receivesCredentialSecurely", null);
/* 78 */            map.put("isProxy", null);
/* 83 */            map.put("proxyType", null);
/* 86 */            return map;
                }

                public String toString() {
/* 68 */            return "URLProtectionSpace{host='" + this.host + "', protocol='" + this.protocol + "', realm='" + this.realm + "', port=" + this.port + ", sslCertificate=" + this.sslCertificate + ", sslError=" + this.sslError + '}';
                }

/* 16 */        public URLProtectionSpace(Long l, String str, String str2, String str3, int i) {
/* 18 */            this.f5335id = l;
/* 19 */            this.host = str;
/* 20 */            this.protocol = str2;
/* 21 */            this.realm = str3;
/* 22 */            this.port = i;
                }
            }
