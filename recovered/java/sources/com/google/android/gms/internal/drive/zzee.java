            package com.google.android.gms.internal.drive;

            import android.content.Context;
            import android.os.Looper;
            import android.os.RemoteException;
            import android.util.Pair;
            import com.google.android.gms.drive.events.DriveEvent;
            import java.util.ArrayList;
            import java.util.List;
            import okhttp3.HttpUrl;
            import p000.ej3;
            import p000.kb1;
            import p000.mr0;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzee extends zzet {
                private static final mr0 zzbz = new mr0("EventCallback", HttpUrl.FRAGMENT_ENCODE_SET);
                private final ej3 zzgt;
                private final zzeg zzgu;
                private final List<Integer> zzgv = new ArrayList();
                private final int zzda = 1;

                public zzee(Looper looper, Context context, int i, ej3 ej3Var) {
/* 14 */            this.zzgt = ej3Var;
/* 22 */            this.zzgu = new zzeg(looper, context);
                }

                @Override // com.google.android.gms.internal.drive.zzes
                public final void zzc(zzfp zzfpVar) throws RemoteException {
/* 1 */             DriveEvent driveEventZzat = zzfpVar.zzat();
/* 17 */            kb1.m6065r(this.zzda == driveEventZzat.getType());
/* 34 */            kb1.m6065r(this.zzgv.contains(Integer.valueOf(driveEventZzat.getType())));
/* 37 */            zzeg zzegVar = this.zzgu;
/* 50 */            zzegVar.sendMessage(zzegVar.obtainMessage(1, new Pair(this.zzgt, driveEventZzat)));
                }

                public final void zzf(int i) {
/* 8 */             this.zzgv.add(1);
                }

                public final boolean zzg(int i) {
/* 8 */             return this.zzgv.contains(1);
                }
            }
