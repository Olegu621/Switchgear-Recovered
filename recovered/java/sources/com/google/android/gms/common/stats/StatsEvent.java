            package com.google.android.gms.common.stats;

            import com.google.android.gms.common.internal.ReflectedParcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import p000.fm0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Deprecated
            public abstract class StatsEvent extends AbstractSafeParcelable implements ReflectedParcelable {
                public final String toString() {
/* 1 */             long jZza = zza();
/* 5 */             int iZzb = zzb();
/* 9 */             String strZzc = zzc();
/* 17 */            int length = String.valueOf(jZza).length();
/* 41 */            StringBuilder sb = new StringBuilder(length + 1 + String.valueOf(iZzb).length() + 3 + strZzc.length());
/* 44 */            sb.append(jZza);
/* 49 */            sb.append("\t");
/* 52 */            sb.append(iZzb);
/* 57 */            return fm0.m3789o(sb, "\t-1", strZzc);
                }

                public abstract long zza();

                public abstract int zzb();

                public abstract String zzc();
            }
