            package p000;

            import java.text.SimpleDateFormat;
            import java.util.Date;
            import java.util.Locale;
            import org.json.JSONArray;
            import org.json.JSONObject;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class du0 implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f7407a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ rs0 f7408b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ String f7409c;

                public /* synthetic */ du0(rs0 rs0Var, String str, int i) {
/* 1 */             this.f7407a = i;
/* 3 */             this.f7408b = rs0Var;
/* 5 */             this.f7409c = str;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (this.f7407a) {
                        case 0:
/* 24 */                    C1773iy c1773iy = this.f7408b.f16260e;
/* 26 */                    String strSubstring = this.f7409c;
                            synchronized (c1773iy) {
                                try {
                                    try {
/* 43 */                                String str = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.ENGLISH).format(new Date());
/* 51 */                                JSONArray jSONArrayM3583i = ((er0) c1773iy.f11955a).m3583i();
/* 61 */                                if (strSubstring.length() > 5000) {
/* 64 */                                    strSubstring = strSubstring.substring(0, 5000);
                                        }
/* 73 */                                String strTrim = strSubstring.trim();
/* 79 */                                JSONObject jSONObject = new JSONObject();
/* 84 */                                jSONObject.put("a", strTrim);
/* 89 */                                jSONObject.put("d", str);
/* 92 */                                jSONArrayM3583i.put(jSONObject);
/* 95 */                                int length = jSONArrayM3583i.length();
/* 101 */                               if (length > 100) {
/* 106 */                                   JSONArray jSONArray = new JSONArray();
/* 109 */                                   for (int i = length - 100; i <= 100; i++) {
/* 115 */                                       jSONArray.put(jSONArrayM3583i.getJSONObject(i));
                                            }
/* 121 */                                   jSONArrayM3583i = jSONArray;
                                        }
/* 124 */                               er0 er0Var = (er0) c1773iy.f11955a;
/* 126 */                               String string = jSONArrayM3583i.toString();
/* 130 */                               er0Var.getClass();
/* 137 */                               if (b40.m1232p(string)) {
/* 144 */                                   string = new JSONArray().toString();
                                        }
/* 150 */                               er0Var.m3595y("breadcrumbs", string);
                                    } catch (Exception e) {
/* 158 */                               xe2.m9777o("ConfigMangr", "Error pushing BreadCrumbs", e);
                                    }
                                } catch (Throwable th) {
/* 164 */                           throw th;
                                }
                                break;
                            }
/* 162 */                   return;
                        default:
/* 8 */                     C1773iy c1773iy2 = this.f7408b.f16260e;
/* 18 */                    ((er0) c1773iy2.f11955a).m3595y("language", this.f7409c);
/* 21 */                    return;
                    }
                }
            }
