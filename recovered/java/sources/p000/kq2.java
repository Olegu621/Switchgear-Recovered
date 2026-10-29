            package p000;

            import android.content.Context;
            import android.content.IntentFilter;
            import android.net.ConnectivityManager;
            import android.net.NetworkInfo;
            import android.os.Bundle;
            import android.os.PowerManager;
            import com.google.android.gms.measurement.internal.zzjc;
            import com.google.firebase.analytics.FirebaseAnalytics;
            import io.sentry.android.core.AbstractC1245n0;
            import java.io.IOException;
            import java.util.Objects;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 31 */    public final class kq2 implements Runnable {

                /* JADX INFO: renamed from: i */
                public static final Object f12977i = new Object();

                /* JADX INFO: renamed from: v */
                public static Boolean f12978v;

                /* JADX INFO: renamed from: w */
                public static Boolean f12979w;

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f12980a;

                /* JADX INFO: renamed from: b */
                public final long f12981b;

                /* JADX INFO: renamed from: c */
                public final Object f12982c;

                /* JADX INFO: renamed from: d */
                public final Object f12983d;

                /* JADX INFO: renamed from: e */
                public final Object f12984e;

                /* JADX INFO: renamed from: f */
                public final Object f12985f;

                public kq2(iq2 iq2Var, Context context, C2199sz c2199sz, long j) {
/* 2 */             this.f12980a = 0;
/* 7 */             this.f12985f = iq2Var;
/* 9 */             this.f12982c = context;
/* 11 */            this.f12981b = j;
/* 13 */            this.f12983d = c2199sz;
/* 30 */            this.f12984e = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
                }

                /* JADX INFO: renamed from: a */
                public static boolean m6273a(Context context) {
                    boolean zBooleanValue;
                    synchronized (f12977i) {
                        try {
/* 4 */                     Boolean bool = f12979w;
/* 6 */                     if (bool == null && bool == null) {
/* 25 */                        zBooleanValue = context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0;
                            } else {
/* 12 */                        zBooleanValue = bool.booleanValue();
                            }
/* 37 */                    f12979w = Boolean.valueOf(zBooleanValue);
                        } catch (Throwable th) {
/* 42 */                    throw th;
                        }
                    }
/* 40 */            return zBooleanValue;
                }

                /* JADX INFO: renamed from: b */
                public static boolean m6274b(Context context) {
                    boolean zBooleanValue;
                    synchronized (f12977i) {
                        try {
/* 4 */                     Boolean bool = f12978v;
/* 6 */                     if (bool == null && bool == null) {
/* 25 */                        zBooleanValue = context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0;
                            } else {
/* 12 */                        zBooleanValue = bool.booleanValue();
                            }
/* 37 */                    f12978v = Boolean.valueOf(zBooleanValue);
                        } catch (Throwable th) {
/* 42 */                    throw th;
                        }
                    }
/* 40 */            return zBooleanValue;
                }

                /* JADX INFO: renamed from: c */
                public synchronized boolean m6275c() {
                    NetworkInfo activeNetworkInfo;
                    try {
/* 12 */                ConnectivityManager connectivityManager = (ConnectivityManager) ((Context) this.f12982c).getSystemService("connectivity");
/* 23 */                activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
                    } catch (Throwable th) {
/* 38 */                throw th;
                    }
/* 34 */            return activeNetworkInfo != null && activeNetworkInfo.isConnected();
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zM6274b;
/* 3 */             int i = this.f12980a;
/* 5 */             long j = this.f12981b;
/* 9 */             Object obj = this.f12984e;
/* 11 */            Object obj2 = this.f12983d;
/* 13 */            Object obj3 = this.f12982c;
/* 15 */            Object obj4 = this.f12985f;
                    switch (i) {
                        case 0:
/* 144 */                   iq2 iq2Var = (iq2) obj4;
/* 146 */                   PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) obj;
/* 150 */                   Context context = (Context) obj3;
/* 156 */                   if (m6274b(context)) {
/* 161 */                       wakeLock.acquire(180000L);
                            }
                            try {
/* 165 */                       iq2Var.m5540d(true);
/* 174 */                       if (!((C2199sz) obj2).m8664d()) {
/* 176 */                           iq2Var.m5540d(false);
/* 183 */                           if (!zM6274b) {
/* 280 */                               return;
                                    }
                                } else if (!m6273a(context) || m6275c()) {
/* 233 */                           if (iq2Var.m5541e()) {
/* 235 */                               iq2Var.m5540d(false);
                                    } else {
/* 239 */                               iq2Var.m5542f(j);
                                    }
/* 246 */                           if (!zM6274b) {
/* 280 */                               return;
                                    }
                                } else {
/* 207 */                           jq2 jq2Var = new jq2();
/* 210 */                           jq2Var.f12437a = this;
/* 219 */                           context.registerReceiver(jq2Var, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
/* 226 */                           if (!zM6274b) {
/* 280 */                               return;
                                    }
                                }
                            } catch (IOException e) {
/* 267 */                       AbstractC1245n0.m4876d("FirebaseMessaging", "Failed to sync topics. Won't retry sync. " + e.getMessage());
/* 270 */                       iq2Var.m5540d(false);
/* 277 */                       if (!zM6274b) {
/* 280 */                           return;
                                }
                            } finally {
/* 285 */                       if (m6274b(context)) {
                                    try {
/* 287 */                               wakeLock.release();
                                        break;
                                    } catch (RuntimeException unused) {
                                    }
                                }
                            }
                            try {
/* 280 */                       return;
                            } catch (RuntimeException unused2) {
/* 280 */                       return;
                            }
                        case 1:
/* 83 */                    String str = (String) obj2;
/* 85 */                    zzjc zzjcVar = (zzjc) obj4;
/* 87 */                    String str2 = (String) obj3;
/* 89 */                    if (str2 == null) {
/* 91 */                        mp3 mp3Var = zzjcVar.f4212a;
/* 97 */                        mp3Var.mo4558b().mo1375y();
/* 100 */                       String str3 = mp3Var.f13933r0;
/* 102 */                       if (str3 == null || str3.equals(str)) {
/* 111 */                           mp3Var.f13933r0 = str;
/* 113 */                           mp3Var.f13932q0 = null;
/* 143 */                           return;
                                }
/* 143 */                       return;
                            }
/* 120 */                   bm3 bm3Var = new bm3((String) obj, j, str2);
/* 123 */                   mp3 mp3Var2 = zzjcVar.f4212a;
/* 129 */                   mp3Var2.mo4558b().mo1375y();
/* 132 */                   String str4 = mp3Var2.f13933r0;
/* 134 */                   if (str4 != null) {
/* 136 */                       str4.equals(str);
                            }
/* 139 */                   mp3Var2.f13933r0 = str;
/* 141 */                   mp3Var2.f13932q0 = bm3Var;
/* 143 */                   return;
                        case 2:
/* 79 */                    ((sl3) obj4).m8560K(this.f12981b, this.f12984e, (String) obj3, (String) obj2);
/* 82 */                    return;
                        default:
/* 21 */                    lm3 lm3Var = (lm3) obj4;
/* 23 */                    Bundle bundle = (Bundle) obj3;
/* 31 */                    lm3Var.getClass();
/* 36 */                    bundle.remove(FirebaseAnalytics.Param.SCREEN_NAME);
/* 41 */                    bundle.remove(FirebaseAnalytics.Param.SCREEN_CLASS);
/* 48 */                    up3 up3Var = ((ij3) lm3Var.f16749a).f9668w;
/* 50 */                    ij3.m4553j(up3Var);
/* 62 */                    lm3Var.m6507J((bm3) obj2, (bm3) obj, this.f12981b, true, up3Var.m9085H(FirebaseAnalytics.Event.SCREEN_VIEW, bundle, null, false));
/* 65 */                    return;
                    }
                }

/* 32 */        public kq2(lm3 lm3Var, Bundle bundle, bm3 bm3Var, bm3 bm3Var2, long j) {
                    this.f12980a = 3;
                    this.f12982c = bundle;
                    this.f12983d = bm3Var;
                    this.f12984e = bm3Var2;
                    this.f12981b = j;
                    Objects.requireNonNull(lm3Var);
                    this.f12985f = lm3Var;
                }

/* 33 */        public /* synthetic */ kq2(Object obj, String str, String str2, Object obj2, long j, int i) {
/* 34 */            this.f12980a = i;
                    this.f12982c = str;
                    this.f12983d = str2;
                    this.f12984e = obj2;
                    this.f12981b = j;
                    this.f12985f = obj;
                }
            }
