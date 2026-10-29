            package p000;

            import android.os.Bundle;
            import com.google.android.gms.common.data.DataHolder;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class kr3 extends sc3 {
                @Override // p000.sc3
                public final /* synthetic */ void zza(Bundle bundle, Object obj) {
/* 7 */             bundle.putString(getName(), (String) obj);
                }

                @Override // p000.sc3
                public final /* synthetic */ Object zzb(Bundle bundle) {
/* 5 */             return bundle.getString(getName());
                }

                @Override // p000.sc3
                public final /* synthetic */ Object zzc(DataHolder dataHolder, int i, int i2) {
/* 5 */             return dataHolder.m2015G1(i, i2, getName());
                }
            }
