            package p000;

            import android.os.Bundle;
            import android.os.Parcelable;
            import java.util.ArrayList;
            import java.util.Collection;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class ll3 extends je3 {
                @Override // p000.sc3
                public final /* synthetic */ void zza(Bundle bundle, Object obj) {
/* 1 */             Collection collection = (Collection) obj;
/* 20 */            bundle.putParcelableArrayList(getName(), collection instanceof ArrayList ? (ArrayList) collection : new ArrayList<>(collection));
                }

                @Override // p000.sc3
                /* JADX INFO: renamed from: zzc, reason: merged with bridge method [inline-methods] */
                public Collection<Parcelable> zzb(Bundle bundle) {
/* 5 */             return bundle.getParcelableArrayList(getName());
                }
            }
