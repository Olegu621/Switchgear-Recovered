            package p000;

            import java.io.UnsupportedEncodingException;
            import java.net.URLEncoder;
            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.Map;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class lp0 extends AbstractC2211ta {

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ int f13441c;

                public lp0(ec0 ec0Var, String str, int i) {
/* 1 */             this.f13441c = i;
/* 6 */             this.f17001b = ec0Var;
/* 8 */             this.f17000a = str;
                }

                @Override // p000.AbstractC2211ta
                /* JADX INFO: renamed from: j */
                public final ur3 mo6516j(wc0 wc0Var) {
                    String str;
/* 1 */             int i = this.f13441c;
/* 4 */             ym1 ym1Var = ym1.f19695f;
                    switch (i) {
                        case 0:
/* 150 */                   StringBuilder sb = new StringBuilder();
/* 157 */                   sb.append((String) this.f17000a);
/* 162 */                   sb.append("?");
/* 167 */                   Map map = (Map) wc0Var.f18578c;
/* 171 */                   ArrayList arrayList = new ArrayList();
/* 186 */                   for (Map.Entry entry : map.entrySet()) {
                                try {
/* 228 */                           arrayList.add(((String) entry.getKey()) + "=" + URLEncoder.encode((String) entry.getValue(), "UTF-8"));
                                } catch (UnsupportedEncodingException e) {
/* 237 */                           throw gt0.m4014a(e, ym1Var, null);
                                }
                            }
/* 242 */                   sb.append(b40.m1237u(arrayList));
/* 258 */                   return new ur3(2, sb.toString(), (HashMap) wc0Var.f18577b, HttpUrl.FRAGMENT_ENCODE_SET);
                        default:
/* 17 */                    String str2 = (String) this.f17000a;
/* 21 */                    HashMap map2 = (HashMap) wc0Var.f18577b;
/* 25 */                    Map map3 = (Map) wc0Var.f18578c;
/* 29 */                    HashMap map4 = new HashMap();
/* 44 */                    for (String str3 : map3.keySet()) {
/* 52 */                        if (str3 != null && (str = (String) map3.get(str3)) != null) {
/* 62 */                            map4.put(str3, str);
                                }
                            }
/* 68 */                    ArrayList arrayList2 = new ArrayList();
/* 83 */                    for (Map.Entry entry2 : map4.entrySet()) {
                                try {
/* 129 */                           arrayList2.add(URLEncoder.encode((String) entry2.getKey(), "UTF-8") + "=" + URLEncoder.encode((String) entry2.getValue(), "UTF-8"));
                                } catch (UnsupportedEncodingException e2) {
/* 138 */                           throw gt0.m4014a(e2, ym1Var, null);
                                }
                            }
/* 144 */                   return new ur3(1, str2, map2, b40.m1237u(arrayList2));
                    }
                }
            }
