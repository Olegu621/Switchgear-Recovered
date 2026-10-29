            package p000;

            import android.os.Bundle;
            import com.google.android.gms.common.data.DataHolder;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class ke3 extends sc3 {
                @Override // p000.sc3
                public final /* synthetic */ void zza(Bundle bundle, Object obj) {
/* 11 */            bundle.putBoolean(getName(), ((Boolean) obj).booleanValue());
                }

                @Override // p000.sc3
                public final /* synthetic */ Object zzb(Bundle bundle) {
/* 9 */             return Boolean.valueOf(bundle.getBoolean(getName()));
                }

                @Override // p000.sc3
                /* JADX INFO: renamed from: zze, reason: merged with bridge method [inline-methods] */
                public Boolean zzc(DataHolder dataHolder, int i, int i2) {
/* 9 */             return Boolean.valueOf(dataHolder.m2012D1(i, i2, getName()));
                }
            }
