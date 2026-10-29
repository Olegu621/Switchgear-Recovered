            package p000;

            import android.content.Context;
            import android.os.Bundle;
            import android.os.SystemClock;
            import com.google.android.gms.internal.measurement.zzoy;
            import com.google.android.gms.internal.measurement.zzpe;
            import com.google.android.gms.internal.measurement.zzpt;
            import com.google.android.gms.internal.measurement.zzqr;
            import com.google.android.gms.internal.measurement.zzrd;
            import io.flutter.Build;
            import io.flutter.plugin.editing.FlutterTextUtils;
            import java.util.Arrays;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.HashSet;
            import java.util.List;
            import java.util.Set;
            import java.util.concurrent.TimeUnit;
            import okhttp3.internal.p013ws.WebSocketProtocol;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class p62 implements sg0, bs2, InterfaceC2512yv, tr1, od3, te3 {

                /* JADX INFO: renamed from: b */
                public static p62 f14990b;

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f15002a;

                /* JADX INFO: renamed from: c */
                public static final /* synthetic */ p62 f14992c = new p62(12);

                /* JADX INFO: renamed from: d */
                public static final /* synthetic */ p62 f14994d = new p62(13);

                /* JADX INFO: renamed from: e */
                public static final /* synthetic */ p62 f14996e = new p62(14);

                /* JADX INFO: renamed from: f */
                public static final /* synthetic */ p62 f14998f = new p62(15);

                /* JADX INFO: renamed from: i */
                public static final /* synthetic */ p62 f14999i = new p62(16);

                /* JADX INFO: renamed from: v */
                public static final /* synthetic */ p62 f15000v = new p62(17);

                /* JADX INFO: renamed from: w */
                public static final /* synthetic */ p62 f15001w = new p62(18);

                /* JADX INFO: renamed from: U */
                public static final /* synthetic */ p62 f14983U = new p62(19);

                /* JADX INFO: renamed from: V */
                public static final /* synthetic */ p62 f14984V = new p62(20);

                /* JADX INFO: renamed from: W */
                public static final /* synthetic */ p62 f14985W = new p62(21);

                /* JADX INFO: renamed from: X */
                public static final /* synthetic */ p62 f14986X = new p62(22);

                /* JADX INFO: renamed from: Y */
                public static final /* synthetic */ p62 f14987Y = new p62(23);

                /* JADX INFO: renamed from: Z */
                public static final /* synthetic */ p62 f14988Z = new p62(24);

                /* JADX INFO: renamed from: a0 */
                public static final /* synthetic */ p62 f14989a0 = new p62(25);

                /* JADX INFO: renamed from: b0 */
                public static final /* synthetic */ p62 f14991b0 = new p62(26);

                /* JADX INFO: renamed from: c0 */
                public static final /* synthetic */ p62 f14993c0 = new p62(27);

                /* JADX INFO: renamed from: d0 */
                public static final /* synthetic */ p62 f14995d0 = new p62(28);

                /* JADX INFO: renamed from: e0 */
                public static final /* synthetic */ p62 f14997e0 = new p62(29);

                public /* synthetic */ p62(int i) {
/* 1 */             this.f15002a = i;
                }

                @Override // p000.InterfaceC2512yv
                /* JADX INFO: renamed from: a */
                public long mo7340a() {
/* 1 */             return SystemClock.elapsedRealtime();
                }

                @Override // p000.tr1
                /* JADX INFO: renamed from: b */
                public /* bridge */ /* synthetic */ Object mo197b(p42 p42Var) {
/* 1 */             return null;
                }

                @Override // p000.bs2
                /* JADX INFO: renamed from: c */
                public Bundle mo1159c() {
/* 3 */             Bundle bundle = new Bundle();
/* 9 */             bundle.putInt("androidx.browser.trusted.displaymode.KEY_ID", 0);
/* 12 */            return bundle;
                }

                @Override // p000.od3
                /* JADX INFO: renamed from: d */
                public /* synthetic */ String mo7139d(String str, String str2) {
/* 1 */             return null;
                }

                /* JADX INFO: renamed from: e */
                public synchronized za2 m7341e(Context context, long j, long j2, TimeUnit timeUnit, String str, Runnable[] runnableArr) {
                    za2 za2Var;
                    try {
/* 4 */                 context.getClass();
/* 7 */                 timeUnit.getClass();
/* 18 */                za2Var = new za2(j, j2, timeUnit, str, context);
/* 22 */                Runnable[] runnableArr2 = {null, null, null, null};
/* 26 */                if (runnableArr != null && runnableArr.length == 4) {
/* 32 */                    runnableArr2 = runnableArr;
                        }
/* 40 */                za2Var.f20049l = runnableArr2[0];
/* 45 */                za2Var.f20050m = runnableArr2[1];
/* 50 */                za2Var.f20051n = runnableArr2[2];
/* 55 */                za2Var.f20052o = runnableArr2[3];
                    } catch (Throwable th) {
/* 60 */                throw th;
                    }
/* 58 */            return za2Var;
                }

                @Override // javax.inject.Provider
                public Object get() {
/* 5 */             q62 q62Var = new q62(9);
/* 10 */            HashMap map = new HashMap();
/* 13 */            Set set = Collections.EMPTY_SET;
/* 18 */            if (set == null) {
/* 135 */               C1951n4.m6868s("Null flags");
/* 15 */                return null;
                    }
/* 32 */            map.put(px1.f15322a, new C1889lg(30000L, 86400000L, set));
/* 35 */            if (set == null) {
/* 131 */               C1951n4.m6868s("Null flags");
/* 15 */                return null;
                    }
/* 49 */            map.put(px1.f15324c, new C1889lg(1000L, 86400000L, set));
/* 52 */            if (set == null) {
/* 127 */               C1951n4.m6868s("Null flags");
/* 15 */                return null;
                    }
/* 69 */            Set setUnmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(g72.f8507b)));
/* 73 */            if (setUnmodifiableSet == null) {
/* 123 */               C1951n4.m6868s("Null flags");
/* 15 */                return null;
                    }
/* 88 */            map.put(px1.f15323b, new C1889lg(86400000L, 86400000L, setUnmodifiableSet));
/* 104 */           if (map.keySet().size() >= px1.values().length) {
/* 108 */               new HashMap();
/* 113 */               return new C1830kg(q62Var, map);
                    }
/* 119 */           f42.m3656l("Not all priorities have been configured");
/* 15 */            return null;
                }

                @Override // p000.te3
                public /* synthetic */ Object zza() {
                    switch (this.f15002a) {
                        case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 178 */                   return new Boolean(zzpe.zzb());
                        case 14:
/* 168 */                   return new Boolean(zzpt.zza());
                        case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 151 */                   List list = vg3.f18115a;
/* 157 */                   return Long.valueOf(zzoy.zzb());
                        case 16:
/* 140 */                   List list2 = vg3.f18115a;
/* 146 */                   return Boolean.valueOf(zzrd.zza());
                        case 17:
/* 129 */                   List list3 = vg3.f18115a;
/* 135 */                   return Boolean.valueOf(zzqr.zza());
                        case 18:
/* 122 */                   List list4 = vg3.f18115a;
/* 124 */                   return zzoy.zzl();
                        case 19:
/* 110 */                   List list5 = vg3.f18115a;
/* 117 */                   return Integer.valueOf((int) zzoy.zzao());
                        case 20:
/* 98 */                    List list6 = vg3.f18115a;
/* 105 */                   return Integer.valueOf((int) zzoy.zzaq());
                        case Build.API_LEVELS.API_21 /* 21 */:
/* 91 */                    List list7 = vg3.f18115a;
/* 93 */                    return zzoy.zzau();
                        case Build.API_LEVELS.API_22 /* 22 */:
/* 84 */                    List list8 = vg3.f18115a;
/* 86 */                    return zzoy.zzM();
                        case Build.API_LEVELS.API_23 /* 23 */:
/* 73 */                    List list9 = vg3.f18115a;
/* 79 */                    return Long.valueOf(zzoy.zzT());
                        case 24:
/* 62 */                    List list10 = vg3.f18115a;
/* 68 */                    return Long.valueOf(zzoy.zzU());
                        case Build.API_LEVELS.API_25 /* 25 */:
/* 51 */                    List list11 = vg3.f18115a;
/* 57 */                    return Long.valueOf(zzoy.zzL());
                        case Build.API_LEVELS.API_26 /* 26 */:
/* 39 */                    List list12 = vg3.f18115a;
/* 46 */                    return Integer.valueOf((int) zzoy.zzP());
                        case Build.API_LEVELS.API_27 /* 27 */:
/* 28 */                    List list13 = vg3.f18115a;
/* 34 */                    return Long.valueOf(zzoy.zzS());
                        case Build.API_LEVELS.API_28 /* 28 */:
/* 17 */                    List list14 = vg3.f18115a;
/* 23 */                    return Long.valueOf(zzoy.zzR());
                        default:
/* 6 */                     List list15 = vg3.f18115a;
/* 12 */                    return Long.valueOf(zzoy.zzI());
                    }
                }
            }
