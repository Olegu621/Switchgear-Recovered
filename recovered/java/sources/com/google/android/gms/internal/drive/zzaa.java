            package com.google.android.gms.internal.drive;

            import android.os.Bundle;
            import com.google.android.gms.drive.metadata.internal.MetadataBundle;
            import p000.di1;
            import p000.ii1;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzaa extends di1 {
                private final MetadataBundle zzdt;

                public zzaa(MetadataBundle metadataBundle) {
/* 4 */             this.zzdt = metadataBundle;
                }

                @Override // p000.un0
                public final Object freeze() {
/* 3 */             MetadataBundle metadataBundle = this.zzdt;
/* 5 */             metadataBundle.getClass();
/* 20 */            return new zzaa(new MetadataBundle(new Bundle(metadataBundle.f3683a)));
                }

                public final boolean isDataValid() {
                    return this.zzdt != null;
                }

                public final String toString() {
/* 3 */             String strValueOf = String.valueOf(this.zzdt);
/* 15 */            StringBuilder sb = new StringBuilder(strValueOf.length() + 17);
/* 20 */            sb.append("Metadata [mImpl=");
/* 23 */            sb.append(strValueOf);
/* 28 */            sb.append("]");
/* 31 */            return sb.toString();
                }

                @Override // p000.di1
                public final <T> T zza(ii1 ii1Var) {
/* 5 */             return (T) ii1Var.zza(this.zzdt.f3683a);
                }
            }
