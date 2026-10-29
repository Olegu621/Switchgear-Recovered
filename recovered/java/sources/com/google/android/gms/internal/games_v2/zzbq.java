            package com.google.android.gms.internal.games_v2;

            import android.app.PendingIntent;
            import androidx.core.app.NotificationCompat;
            import com.google.android.gms.common.api.Status;
            import java.util.Arrays;
            import p000.de3;
            import p000.kb1;
            import p000.wc0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzbq {
                private final String zza;
                private final Status zzb;

                private zzbq(Status status, String str) {
/* 4 */             this.zzb = status;
/* 6 */             this.zza = str;
                }

                public static zzbq zzb(Status status) {
/* 7 */             kb1.m6054g(!status.m2006D1());
/* 13 */            return new zzbq(status, null);
                }

                public static zzbq zzc(String str) {
/* 5 */             return new zzbq(Status.f3440e, str);
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof zzbq)) {
/* 7 */                 return false;
                    }
/* 11 */            zzbq zzbqVar = (zzbq) obj;
                    return de3.m3029k(this.zzb, zzbqVar.zzb) && de3.m3029k(this.zza, zzbqVar.zza);
                }

                public final int hashCode() {
/* 9 */             return Arrays.hashCode(new Object[]{this.zzb, this.zza});
                }

                public final String toString() {
/* 3 */             wc0 wc0Var = new wc0(this);
/* 10 */            wc0Var.m9529d(this.zzb, NotificationCompat.CATEGORY_STATUS);
/* 17 */            wc0Var.m9529d(this.zza, "gameRunToken");
/* 20 */            return wc0Var.toString();
                }

                public final PendingIntent zza() {
/* 3 */             return this.zzb.f3447c;
                }

                public final String zzd() {
/* 1 */             return this.zza;
                }

                public final boolean zze() {
/* 3 */             return this.zzb.m2006D1();
                }
            }
