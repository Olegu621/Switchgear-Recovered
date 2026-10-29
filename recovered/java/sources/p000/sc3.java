            package p000;

            import android.os.Bundle;
            import com.google.android.gms.common.data.DataHolder;
            import com.google.android.gms.drive.metadata.internal.MetadataBundle;
            import java.util.Collection;
            import java.util.Collections;
            import java.util.HashSet;
            import java.util.Set;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 23 */    public abstract class sc3 implements ii1 {
                private final String fieldName;
                private final Set<String> zziw;
                private final Set<String> zzix;
                private final int zziy;

                public sc3(String str, Collection collection, Collection collection2, int i) {
/* 6 */             kb1.m6062o(str, "fieldName");
/* 9 */             this.fieldName = str;
/* 20 */            this.zziw = Collections.unmodifiableSet(new HashSet(collection));
/* 31 */            this.zzix = Collections.unmodifiableSet(new HashSet(collection2));
/* 33 */            this.zziy = i;
                }

                @Override // p000.ii1
                public final String getName() {
/* 1 */             return this.fieldName;
                }

                public String toString() {
/* 1 */             return this.fieldName;
                }

                public abstract void zza(Bundle bundle, Object obj);

                public final void zza(DataHolder dataHolder, MetadataBundle metadataBundle, int i, int i2) {
/* 3 */             kb1.m6062o(dataHolder, "dataHolder");
/* 8 */             kb1.m6062o(metadataBundle, "bundle");
/* 15 */            if (zzb(dataHolder, i, i2)) {
/* 21 */                metadataBundle.m2034E1(this, zzc(dataHolder, i, i2));
                    }
                }

                public final Collection<String> zzaz() {
/* 1 */             return this.zziw;
                }

                public abstract Object zzb(Bundle bundle);

                public boolean zzb(DataHolder dataHolder, int i, int i2) {
                    boolean z;
/* 11 */            for (String str : this.zziw) {
                        synchronized (dataHolder) {
/* 20 */                    z = dataHolder.f3471w;
                        }
/* 23 */                if (z || !dataHolder.f3465c.containsKey(str)) {
/* 52 */                    return false;
                        }
/* 33 */                dataHolder.m2017I1(i, str);
/* 50 */                if (dataHolder.f3466d[i2].isNull(i, dataHolder.f3465c.getInt(str))) {
/* 52 */                    return false;
                        }
                    }
/* 57 */            return true;
                }

                public abstract Object zzc(DataHolder dataHolder, int i, int i2);

                @Override // p000.ii1
/* 24 */        public final Object zza(Bundle bundle) {
/* 25 */            kb1.m6062o(bundle, "bundle");
/* 27 */            if (bundle.get(this.fieldName) != null) {
/* 28 */                return zzb(bundle);
                    }
                    return null;
                }

                @Override // p000.ii1
/* 28 */        public final void zza(Object obj, Bundle bundle) {
/* 29 */            kb1.m6062o(bundle, "bundle");
                    if (obj == null) {
/* 31 */                bundle.putString(this.fieldName, null);
                    } else {
/* 32 */                zza(bundle, obj);
                    }
                }

                @Override // p000.ii1
/* 32 */        public final Object zza(DataHolder dataHolder, int i, int i2) {
/* 33 */            if (zzb(dataHolder, i, i2)) {
/* 34 */                return zzc(dataHolder, i, i2);
                    }
                    return null;
                }

/* 35 */        public sc3(String str, int i) {
/* 37 */            kb1.m6062o(str, "fieldName");
                    this.fieldName = str;
/* 38 */            this.zziw = Collections.singleton(str);
/* 39 */            this.zzix = Collections.EMPTY_SET;
/* 40 */            this.zziy = i;
                }
            }
