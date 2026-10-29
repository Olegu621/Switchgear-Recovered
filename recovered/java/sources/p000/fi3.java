            package p000;

            import android.os.Bundle;
            import com.google.android.gms.common.data.DataHolder;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class fi3 extends sc3 {
                @Override // p000.sc3
                public final /* synthetic */ void zza(Bundle bundle, Object obj) {
/* 11 */            bundle.putInt(getName(), ((Integer) obj).intValue());
                }

                @Override // p000.sc3
                public final /* synthetic */ Object zzb(Bundle bundle) {
/* 9 */             return Integer.valueOf(bundle.getInt(getName()));
                }

                @Override // p000.sc3
                public final /* synthetic */ Object zzc(DataHolder dataHolder, int i, int i2) {
/* 9 */             return Integer.valueOf(dataHolder.m2013E1(i, i2, getName()));
                }
            }
