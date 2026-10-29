            package p000;

            import android.content.Context;
            import android.content.SharedPreferences;
            import android.os.StrictMode;
            import java.util.Date;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.UUID;
            import java.util.concurrent.TimeUnit;
            import java.util.concurrent.atomic.AtomicBoolean;
            import kotlin.text.Regex;
            import org.json.JSONException;
            import org.json.JSONObject;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class za2 {

                /* JADX INFO: renamed from: r */
                public static final p62 f20037r = new p62(2);

                /* JADX INFO: renamed from: a */
                public final String f20038a;

                /* JADX INFO: renamed from: b */
                public int f20039b;

                /* JADX INFO: renamed from: c */
                public volatile int f20040c;

                /* JADX INFO: renamed from: d */
                public volatile int f20041d;

                /* JADX INFO: renamed from: e */
                public C1837kn f20042e;

                /* JADX INFO: renamed from: f */
                public final AtomicBoolean f20043f;

                /* JADX INFO: renamed from: g */
                public long f20044g;

                /* JADX INFO: renamed from: h */
                public final AtomicBoolean f20045h;

                /* JADX INFO: renamed from: i */
                public volatile boolean f20046i;

                /* JADX INFO: renamed from: j */
                public final long f20047j;

                /* JADX INFO: renamed from: k */
                public final long f20048k;

                /* JADX INFO: renamed from: l */
                public Runnable f20049l;

                /* JADX INFO: renamed from: m */
                public Runnable f20050m;

                /* JADX INFO: renamed from: n */
                public Runnable f20051n;

                /* JADX INFO: renamed from: o */
                public Runnable f20052o;

                /* JADX INFO: renamed from: p */
                public c00 f20053p;

                /* JADX INFO: renamed from: q */
                public final SharedPreferences f20054q;

                /* JADX WARN: Code duplicated, block: B:17:0x006b A[Catch: all -> 0x00b5, TryCatch #0 {, blocks: (B:15:0x0065, B:18:0x0078, B:21:0x0089, B:17:0x006b), top: B:31:0x0065, outer: #1 }] */
                /* JADX WARN: Code duplicated, block: B:20:0x0087  */
                /* JADX WARN: Code duplicated, block: B:21:0x0089 A[Catch: all -> 0x00b5, TRY_LEAVE, TryCatch #0 {, blocks: (B:15:0x0065, B:18:0x0078, B:21:0x0089, B:17:0x006b), top: B:31:0x0065, outer: #1 }] */
                public za2(long j, long j2, TimeUnit timeUnit, String str, Context context) {
                    String string;
                    SharedPreferences sharedPreferences;
                    String string2;
/* 1 */             timeUnit.getClass();
/* 4 */             context.getClass();
/* 16 */            this.f20043f = new AtomicBoolean(false);
/* 24 */            this.f20045h = new AtomicBoolean(true);
/* 30 */            this.f20047j = timeUnit.toMillis(j);
/* 36 */            this.f20048k = timeUnit.toMillis(j2);
/* 38 */            this.f20046i = true;
/* 63 */            String strM3507k = str.length() > 0 ? AbstractC0886en.m3507k("snowplow_session_vars_", new Regex("[^a-zA-Z0-9_]+").replace(str, "-")) : "snowplow_session_vars";
/* 67 */            StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
/* 71 */                HashMap mapM10300b = m10300b(context, strM3507k);
/* 75 */                if (mapM10300b == null) {
/* 83 */                    k50.m5957K("za2", "No previous session info available", new Object[0]);
                        } else {
/* 93 */                    this.f20042e = yy1.m10211c(mapM10300b);
                        }
/* 95 */                p62 p62Var = f20037r;
/* 97 */                C1837kn c1837kn = this.f20042e;
                        synchronized (p62Var) {
/* 100 */                   if (c1837kn != null) {
/* 104 */                       string = (String) c1837kn.f12885e;
/* 106 */                       if (string == null) {
/* 108 */                           int i = mn0.f13881p;
/* 114 */                           string = UUID.randomUUID().toString();
/* 118 */                           string.getClass();
                                }
/* 123 */                       sharedPreferences = context.getSharedPreferences("snowplow_general_vars", 0);
/* 130 */                       string2 = sharedPreferences.getString("SPInstallationUserId", null);
/* 134 */                       if (string2 != null) {
/* 136 */                           string = string2;
                                } else {
/* 148 */                           sharedPreferences.edit().putString("SPInstallationUserId", string).commit();
                                }
                            } else {
/* 108 */                       int i2 = mn0.f13881p;
/* 114 */                       string = UUID.randomUUID().toString();
/* 118 */                       string.getClass();
/* 123 */                       sharedPreferences = context.getSharedPreferences("snowplow_general_vars", 0);
/* 130 */                       string2 = sharedPreferences.getString("SPInstallationUserId", null);
/* 134 */                       if (string2 != null) {
/* 136 */                           string = string2;
                                } else {
/* 148 */                           sharedPreferences.edit().putString("SPInstallationUserId", string).commit();
                                }
                            }
/* 184 */                   throw th;
                        }
/* 152 */               this.f20038a = string;
/* 154 */               SharedPreferences sharedPreferences2 = context.getSharedPreferences(strM3507k, 0);
/* 158 */               sharedPreferences2.getClass();
/* 161 */               this.f20054q = sharedPreferences2;
/* 167 */               this.f20044g = System.currentTimeMillis();
/* 169 */               StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
/* 178 */               k50.m5958L("za2", "Tracker Session Object created.", new Object[0]);
                    } catch (Throwable th) {
/* 185 */               StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
/* 188 */               throw th;
                    }
                }

                /* JADX INFO: renamed from: a */
                public static void m10299a(Runnable runnable) {
/* 1 */             if (runnable == null) {
/* 3 */                 return;
                    }
                    try {
/* 4 */                 runnable.run();
                    } catch (Exception unused) {
/* 15 */                k50.m5980q("za2", "Session event callback failed", new Object[0]);
                    }
                }

                /* JADX INFO: renamed from: b */
                public static HashMap m10300b(Context context, String str) {
/* 3 */             StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
/* 9 */                 SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
/* 17 */                if (!sharedPreferences.contains("session_state")) {
/* 8 */                     return null;
                        }
/* 25 */                HashMap map = new HashMap();
/* 28 */                String string = sharedPreferences.getString("session_state", null);
/* 44 */                JSONObject jSONObject = string != null ? new JSONObject(string) : null;
/* 52 */                Iterator<String> itKeys = jSONObject != null ? jSONObject.keys() : null;
/* 53 */                while (itKeys != null && itKeys.hasNext()) {
/* 62 */                    String next = itKeys.next();
/* 72 */                    map.put(next, jSONObject.get(next));
                        }
/* 79 */                return map;
                    } catch (JSONException e) {
/* 80 */                e.printStackTrace();
/* 8 */                 return null;
                    } finally {
/* 87 */                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                    }
                }

                /* JADX INFO: renamed from: c */
                public final void m10301c(boolean z) {
/* 13 */            k50.m5968e("za2", "Session is suspended: %s", Boolean.valueOf(z));
/* 18 */            this.f20046i = !z;
                }

                /* JADX INFO: renamed from: d */
                public final synchronized void m10302d(String str, long j) {
                    String str2;
                    String str3;
                    int i;
                    try {
/* 5 */                 this.f20045h.set(false);
/* 8 */                 int i2 = mn0.f13881p;
/* 14 */                String string = UUID.randomUUID().toString();
/* 18 */                string.getClass();
/* 26 */                String strM6699o = mn0.m6699o(new Date(j));
/* 30 */                this.f20039b = 0;
/* 34 */                C1837kn c1837kn = this.f20042e;
/* 37 */                if (c1837kn != null) {
/* 41 */                    int i3 = c1837kn.f12882b + 1;
/* 44 */                    str2 = (String) c1837kn.f12884d;
/* 50 */                    i = i3;
/* 48 */                    str3 = (String) c1837kn.f12886f;
                        } else {
/* 57 */                    str2 = null;
/* 32 */                    str3 = "LOCAL_STORAGE";
/* 59 */                    i = 1;
                        }
/* 66 */                C1837kn c1837kn2 = new C1837kn(str, strM6699o, string, str2, i, this.f20038a, str3);
/* 69 */                this.f20042e = c1837kn2;
/* 80 */                String string2 = new JSONObject((HashMap) c1837kn2.f12883c).toString();
/* 84 */                string2.getClass();
/* 89 */                SharedPreferences.Editor editorEdit = this.f20054q.edit();
/* 95 */                editorEdit.putString("session_state", string2);
/* 98 */                editorEdit.apply();
/* 101 */               c00 c00Var = this.f20053p;
/* 103 */               if (c00Var != null) {
/* 115 */                   Thread thread = new Thread(new ji1(8, c00Var, c1837kn2));
/* 118 */                   thread.setDaemon(true);
/* 121 */                   thread.start();
                        }
                    } catch (Throwable th) {
/* 127 */               throw th;
                    }
                }
            }
