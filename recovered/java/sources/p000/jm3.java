            package p000;

            import android.os.Bundle;
            import com.google.android.gms.common.internal.ReflectedParcelable;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class jm3 extends sc3 {
                @Override // p000.sc3
                public final /* synthetic */ void zza(Bundle bundle, Object obj) {
/* 7 */             bundle.putParcelable(getName(), (ReflectedParcelable) obj);
                }

                @Override // p000.sc3
                public final /* synthetic */ Object zzb(Bundle bundle) {
/* 9 */             return (ReflectedParcelable) bundle.getParcelable(getName());
                }
            }
