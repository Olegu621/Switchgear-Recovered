            package p000;

            import android.content.SharedPreferences;
            import android.content.pm.ApplicationInfo;
            import android.util.Log;
            import java.io.IOException;
            import java.util.Map;
            import okio.Segment;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 21 */    public final class qh3 implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f15565a = 1;

                /* JADX INFO: renamed from: b */
                public final int f15566b;

                /* JADX INFO: renamed from: c */
                public final String f15567c;

                /* JADX INFO: renamed from: d */
                public final Object f15568d;

                /* JADX INFO: renamed from: e */
                public final Object f15569e;

                /* JADX INFO: renamed from: f */
                public final Object f15570f;

                /* JADX INFO: renamed from: i */
                public final Object f15571i;

                public /* synthetic */ qh3(String str, yh3 yh3Var, int i, IOException iOException, byte[] bArr, Map map) {
/* 7 */             kb1.m6061n(yh3Var);
/* 10 */            this.f15568d = yh3Var;
/* 12 */            this.f15566b = i;
/* 14 */            this.f15569e = iOException;
/* 16 */            this.f15570f = bArr;
/* 18 */            this.f15567c = str;
/* 20 */            this.f15571i = map;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (this.f15565a) {
                        case 0:
/* 36 */                    uh3 uh3Var = (uh3) this.f15571i;
/* 42 */                    ki3 ki3Var = ((ij3) uh3Var.f16749a).f9653e;
/* 44 */                    ij3.m4553j(ki3Var);
/* 49 */                    if (!ki3Var.f9127b) {
/* 402 */                       Log.println(6, uh3Var.m9021J(), "Persisted config not initialized. Not logging error/warn");
/* 405 */                       return;
                            }
/* 55 */                    if (uh3Var.f17535c == 0) {
/* 61 */                        pd3 pd3Var = ((ij3) uh3Var.f16749a).f9651d;
/* 65 */                        if (pd3Var.f15076e == null) {
                                    synchronized (pd3Var) {
                                        try {
/* 70 */                                    if (pd3Var.f15076e == null) {
/* 74 */                                        ij3 ij3Var = (ij3) pd3Var.f16749a;
/* 78 */                                        ApplicationInfo applicationInfo = ij3Var.f9645a.getApplicationInfo();
/* 82 */                                        String strM6702r = mn0.m6702r();
/* 86 */                                        if (applicationInfo != null) {
/* 88 */                                            String str = applicationInfo.processName;
/* 109 */                                           pd3Var.f15076e = Boolean.valueOf(str != null && str.equals(strM6702r));
                                                }
/* 113 */                                       if (pd3Var.f15076e == null) {
/* 117 */                                           pd3Var.f15076e = Boolean.TRUE;
/* 119 */                                           uh3 uh3Var2 = ij3Var.f9655f;
/* 121 */                                           ij3.m4555l(uh3Var2);
/* 128 */                                           uh3Var2.f17538f.m8510a("My process not in the list of running processes");
                                                }
                                            }
                                        } catch (Throwable th) {
/* 134 */                                   throw th;
                                        }
                                    }
                                }
/* 141 */                       if (pd3Var.f15076e.booleanValue()) {
/* 145 */                           uh3Var.f17535c = 'C';
                                } else {
/* 150 */                           uh3Var.f17535c = 'c';
                                }
                                break;
                            }
/* 158 */                   if (uh3Var.f17536d < 0) {
/* 166 */                       ((ij3) uh3Var.f16749a).f9651d.m7401E();
/* 172 */                       uh3Var.f17536d = 130000L;
                            }
/* 174 */                   int i = this.f15566b;
/* 176 */                   char c = uh3Var.f17535c;
/* 178 */                   long j = uh3Var.f17536d;
/* 180 */                   String str2 = this.f15567c;
/* 182 */                   Object obj = this.f15568d;
/* 184 */                   Object obj2 = this.f15569e;
/* 186 */                   Object obj3 = this.f15570f;
/* 190 */                   char cCharAt = "01VDIWEA?".charAt(i);
/* 194 */                   String strM9014K = uh3.m9014K(true, str2, obj, obj2, obj3);
/* 233 */                   StringBuilder sb = new StringBuilder(String.valueOf(cCharAt).length() + 1 + String.valueOf(c).length() + String.valueOf(j).length() + 1 + strM9014K.length());
/* 238 */                   sb.append("2");
/* 241 */                   sb.append(cCharAt);
/* 244 */                   sb.append(c);
/* 247 */                   sb.append(j);
/* 252 */                   sb.append(":");
/* 255 */                   sb.append(strM9014K);
/* 258 */                   String string = sb.toString();
/* 268 */                   if (string.length() > 1024) {
/* 270 */                       string = str2.substring(0, Segment.SHARE_MINIMUM);
                            }
/* 274 */                   ji3 ji3Var = ki3Var.f12807e;
/* 276 */                   if (ji3Var != null) {
/* 280 */                       String str3 = (String) ji3Var.f12322d;
/* 284 */                       ki3 ki3Var2 = (ki3) ji3Var.f12323e;
/* 286 */                       ki3Var2.mo1375y();
/* 307 */                       if (((ki3) ji3Var.f12323e).m6113D().getLong((String) ji3Var.f12320b, 0L) == 0) {
/* 309 */                           ji3Var.m5840b();
                                }
/* 312 */                       SharedPreferences sharedPreferencesM6113D = ki3Var2.m6113D();
/* 318 */                       String str4 = (String) ji3Var.f12321c;
/* 320 */                       long j2 = sharedPreferencesM6113D.getLong(str4, 0L);
/* 328 */                       if (j2 <= 0) {
/* 334 */                           SharedPreferences.Editor editorEdit = ki3Var2.m6113D().edit();
/* 338 */                           editorEdit.putString(str3, string);
/* 341 */                           editorEdit.putLong(str4, 1L);
/* 344 */                           editorEdit.apply();
/* 405 */                           return;
                                }
/* 352 */                       up3 up3Var = ((ij3) ki3Var2.f16749a).f9668w;
/* 354 */                       ij3.m4553j(up3Var);
/* 370 */                       long jNextLong = up3Var.m9116w0().nextLong() & Long.MAX_VALUE;
/* 371 */                       long j3 = j2 + 1;
/* 372 */                       long j4 = Long.MAX_VALUE / j3;
/* 377 */                       SharedPreferences.Editor editorEdit2 = ki3Var2.m6113D().edit();
/* 383 */                       if (jNextLong < j4) {
/* 385 */                           editorEdit2.putString(str3, string);
                                }
/* 388 */                       editorEdit2.putLong(str4, j3);
/* 391 */                       editorEdit2.apply();
/* 405 */                       return;
                            }
/* 405 */                   return;
                        default:
/* 30 */                    ((yh3) this.f15568d).mo1405a(this.f15567c, this.f15566b, (Throwable) this.f15569e, (byte[]) this.f15570f, (Map) this.f15571i);
/* 33 */                    return;
                    }
                }

/* 22 */        public qh3(uh3 uh3Var, int i, String str, Object obj, Object obj2, Object obj3) {
                    this.f15566b = i;
                    this.f15567c = str;
                    this.f15568d = obj;
                    this.f15569e = obj2;
                    this.f15570f = obj3;
                    this.f15571i = uh3Var;
                }
            }
