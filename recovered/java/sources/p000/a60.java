            package p000;

            import android.util.Base64OutputStream;
            import java.io.ByteArrayOutputStream;
            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.concurrent.Callable;
            import java.util.zip.GZIPOutputStream;
            import org.json.JSONArray;
            import org.json.JSONObject;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final /* synthetic */ class a60 implements Callable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f95a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ b60 f96b;

                public /* synthetic */ a60(b60 b60Var, int i) {
/* 1 */             this.f95a = i;
/* 3 */             this.f96b = b60Var;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    String string;
                    switch (this.f95a) {
                        case 0:
/* 42 */                    b60 b60Var = this.f96b;
                            synchronized (b60Var) {
                                try {
/* 51 */                            ts0 ts0Var = (ts0) b60Var.f2233a.get();
/* 53 */                            ArrayList arrayListM8899h = ts0Var.m8899h();
/* 57 */                            ts0Var.m8897e();
/* 62 */                            JSONArray jSONArray = new JSONArray();
/* 70 */                            for (int i = 0; i < arrayListM8899h.size(); i++) {
/* 76 */                                C2291vf c2291vf = (C2291vf) arrayListM8899h.get(i);
/* 80 */                                JSONObject jSONObject = new JSONObject();
/* 87 */                                jSONObject.put("agent", c2291vf.f18026a);
/* 99 */                                jSONObject.put("dates", new JSONArray((Collection) c2291vf.f18027b));
/* 102 */                               jSONArray.put(jSONObject);
                                    }
/* 112 */                           JSONObject jSONObject2 = new JSONObject();
/* 117 */                           jSONObject2.put("heartbeats", jSONArray);
/* 124 */                           jSONObject2.put("version", "2");
/* 129 */                           ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
/* 136 */                           Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 11);
                                    try {
/* 141 */                               GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                                        try {
/* 154 */                                   gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
/* 157 */                                   gZIPOutputStream.close();
/* 160 */                                   base64OutputStream.close();
/* 165 */                                   string = byteArrayOutputStream.toString("UTF-8");
                                        } catch (Throwable th) {
                                            try {
/* 174 */                                       gZIPOutputStream.close();
                                                break;
                                            } catch (Throwable th2) {
/* 179 */                                       th.addSuppressed(th2);
                                            }
/* 182 */                                   throw th;
                                        }
                                    } catch (Throwable th3) {
                                        try {
/* 183 */                                   base64OutputStream.close();
                                            break;
                                        } catch (Throwable th4) {
/* 188 */                                   th3.addSuppressed(th4);
                                        }
/* 191 */                               throw th3;
                                    }
                                } catch (Throwable th5) {
/* 193 */                           throw th5;
                                }
                            }
/* 170 */                   return string;
                        default:
/* 6 */                     b60 b60Var2 = this.f96b;
                            synchronized (b60Var2) {
/* 33 */                        ((ts0) b60Var2.f2233a.get()).m8892F(((a70) b60Var2.f2235c.get()).m93a(), System.currentTimeMillis());
                                break;
                            }
/* 37 */                    return null;
                    }
                }
            }
