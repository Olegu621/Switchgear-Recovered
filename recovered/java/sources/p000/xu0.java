            package p000;

            import java.io.BufferedOutputStream;
            import java.io.IOException;
            import java.io.OutputStream;
            import java.net.HttpURLConnection;
            import java.net.ProtocolException;
            import java.util.LinkedHashMap;
            import java.util.Map;
            import kotlin.Pair;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class xu0 {

                /* JADX INFO: renamed from: a */
                public final C0945g8 f19379a;

                /* JADX INFO: renamed from: b */
                public final nl1 f19380b;

                /* JADX INFO: renamed from: c */
                public final x80 f19381c;

                public xu0(C0945g8 c0945g8, nl1 nl1Var, x80 x80Var) {
/* 1 */             c0945g8.getClass();
/* 4 */             nl1Var.getClass();
/* 7 */             x80Var.getClass();
/* 13 */            this.f19379a = c0945g8;
/* 15 */            this.f19380b = nl1Var;
/* 17 */            this.f19381c = x80Var;
                }

                /* JADX INFO: renamed from: a */
                public final LinkedHashMap m10029a(Map map) {
/* 3 */             e13 e13VarM6997a = this.f19380b.m6997a();
/* 14 */            String str = e13VarM6997a.f7481g ? "M" : HttpUrl.FRAGMENT_ENCODE_SET;
/* 16 */            String str2 = e13VarM6997a.f7475a;
/* 18 */            String str3 = e13VarM6997a.f7476b;
/* 20 */            String str4 = e13VarM6997a.f7477c;
/* 22 */            String str5 = e13VarM6997a.f7478d;
/* 24 */            String str6 = e13VarM6997a.f7479e;
/* 26 */            String str7 = e13VarM6997a.f7480f;
/* 34 */            StringBuilder sbM3514r = AbstractC0886en.m3514r("Mobile/", str2, "/", str3, "/2.24.4/");
/* 38 */            fm0.m3796v(sbM3514r, str4, "/", str5, "/");
/* 41 */            fm0.m3796v(sbM3514r, str6, "/", str7, "/");
/* 44 */            sbM3514r.append(str);
/* 62 */            LinkedHashMap linkedHashMapM7132f = oc1.m7132f(new Pair("User-Agent", sbM3514r.toString()));
/* 66 */            if (map != null) {
/* 80 */                for (Map.Entry entry : map.entrySet()) {
/* 96 */                    linkedHashMapM7132f.put(entry.getKey(), entry.getValue());
                        }
                    }
/* 100 */           return linkedHashMapM7132f;
                }

                /* JADX INFO: renamed from: b */
                public final zu0 m10030b(String str) throws ProtocolException {
/* 1 */             str.getClass();
/* 4 */             jb1.m5748h();
/* 8 */             LinkedHashMap linkedHashMapM10029a = m10029a(null);
/* 12 */            C0945g8 c0945g8 = this.f19379a;
/* 14 */            c0945g8.getClass();
/* 17 */            HttpURLConnection httpURLConnectionM3886a = c0945g8.m3886a(str, linkedHashMapM10029a);
/* 23 */            httpURLConnectionM3886a.setRequestMethod("GET");
/* 26 */            return C0945g8.m3885d(httpURLConnectionM3886a);
                }

                /* JADX INFO: renamed from: c */
                public final Object m10031c(String str, Map map, d10 d10Var) {
/* 1 */             jb1.m5748h();
/* 14 */            return k50.m5966c(new u80(this, str, map, null, 1), d10Var);
                }

                /* JADX INFO: renamed from: d */
                public final String m10032d(String str, String str2, Map map) throws IOException {
/* 1 */             jb1.m5748h();
/* 4 */             LinkedHashMap linkedHashMapM10029a = m10029a(map);
/* 8 */             C0945g8 c0945g8 = this.f19379a;
/* 10 */            c0945g8.getClass();
/* 13 */            HttpURLConnection httpURLConnectionM3886a = c0945g8.m3886a(str, linkedHashMapM10029a);
/* 18 */            httpURLConnectionM3886a.setDoOutput(true);
/* 23 */            httpURLConnectionM3886a.setRequestMethod("POST");
/* 30 */            httpURLConnectionM3886a.setRequestProperty("Content-Type", c0945g8.f8513d);
/* 33 */            OutputStream outputStream = httpURLConnectionM3886a.getOutputStream();
/* 39 */            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);
/* 44 */            byte[] bytes = str2.getBytes(c0945g8.f8512c);
/* 48 */            bytes.getClass();
/* 51 */            bufferedOutputStream.write(bytes);
/* 54 */            bufferedOutputStream.flush();
/* 57 */            bufferedOutputStream.close();
/* 60 */            if (outputStream != null) {
/* 62 */                outputStream.close();
                    }
/* 69 */            return C0945g8.m3885d(httpURLConnectionM3886a).f20332b;
                }
            }
