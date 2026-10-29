            package p000;

            import android.os.Bundle;
            import com.google.android.gms.common.data.DataHolder;
            import java.util.Date;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class wf3 extends sc3 {
                @Override // p000.sc3
                public final /* synthetic */ void zza(Bundle bundle, Object obj) {
/* 11 */            bundle.putLong(getName(), ((Date) obj).getTime());
                }

                @Override // p000.sc3
                public final /* synthetic */ Object zzb(Bundle bundle) {
/* 11 */            return new Date(bundle.getLong(getName()));
                }

                @Override // p000.sc3
                public final /* synthetic */ Object zzc(DataHolder dataHolder, int i, int i2) {
/* 11 */            return new Date(dataHolder.m2014F1(i, i2, getName()));
                }
            }
