            package p000;

            import com.google.android.gms.internal.play_billing.zzbf;
            import com.google.android.gms.internal.play_billing.zze;
            import com.google.android.gms.internal.play_billing.zzjx;
            import com.google.android.gms.internal.play_billing.zzjz;
            import com.google.android.gms.internal.play_billing.zzkb;
            import com.google.android.gms.internal.play_billing.zzkd;
            import com.google.android.gms.internal.play_billing.zzke;
            import com.google.android.gms.internal.play_billing.zzki;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract /* synthetic */ class if3 {

                /* JADX INFO: renamed from: a */
                public static final /* synthetic */ int f9580a = 0;

                static {
/* 1 */             int i = jf3.f12251T;
                }

                /* JADX INFO: renamed from: a */
                public static String m4523a(Exception exc) {
/* 2 */             if (exc == null) {
/* 1 */                 return null;
                    }
                    try {
/* 37 */                String str = exc.getClass().getSimpleName() + ":" + zzbf.zzb(exc.getMessage());
/* 41 */                int i = zze.zza;
                        return str.length() > 40 ? str.substring(0, 40) : str;
                    } catch (Throwable th) {
/* 64 */                zze.zzm("BillingLogger", "Unable to get truncated exception info", th);
/* 1 */                 return null;
                    }
                }

                /* JADX INFO: renamed from: b */
                public static zzjz m4524b(int i, int i2, C1833kj c1833kj) {
                    try {
/* 1 */                 zzjx zzjxVarZzc = zzjz.zzc();
/* 5 */                 zzke zzkeVarZzc = zzki.zzc();
/* 11 */                zzkeVarZzc.zzn(c1833kj.f12818a);
/* 16 */                zzkeVarZzc.zzm(c1833kj.f12819b);
/* 19 */                zzkeVarZzc.zzo(i);
/* 22 */                zzjxVarZzc.zza(zzkeVarZzc);
/* 25 */                zzjxVarZzc.zzn(i2);
/* 32 */                return (zzjz) zzjxVarZzc.zzf();
                    } catch (Exception e) {
/* 40 */                zze.zzm("BillingLogger", "Unable to create logging payload", e);
/* 43 */                return null;
                    }
                }

                /* JADX INFO: renamed from: c */
                public static zzjz m4525c(int i, int i2, C1833kj c1833kj, String str) {
                    try {
/* 1 */                 zzke zzkeVarZzc = zzki.zzc();
/* 7 */                 zzkeVarZzc.zzn(c1833kj.f12818a);
/* 12 */                zzkeVarZzc.zzm(c1833kj.f12819b);
/* 15 */                zzkeVarZzc.zzo(i);
/* 18 */                if (str != null) {
/* 20 */                    zzkeVarZzc.zza(str);
                        }
/* 23 */                zzjx zzjxVarZzc = zzjz.zzc();
/* 27 */                zzjxVarZzc.zza(zzkeVarZzc);
/* 30 */                zzjxVarZzc.zzn(i2);
/* 37 */                return (zzjz) zzjxVarZzc.zzf();
                    } catch (Throwable th) {
/* 45 */                zze.zzm("BillingLogger", "Unable to create logging payload", th);
/* 48 */                return null;
                    }
                }

                /* JADX INFO: renamed from: d */
                public static zzkd m4526d(int i) {
                    try {
/* 1 */                 zzkb zzkbVarZzc = zzkd.zzc();
/* 5 */                 zzkbVarZzc.zzn(i);
/* 12 */                return (zzkd) zzkbVarZzc.zzf();
                    } catch (Exception e) {
/* 20 */                zze.zzm("BillingLogger", "Unable to create logging payload", e);
/* 23 */                return null;
                    }
                }
            }
