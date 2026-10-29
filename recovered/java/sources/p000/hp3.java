            package p000;

            import android.os.Bundle;
            import com.google.android.gms.common.data.DataHolder;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class hp3 implements zg3 {
                @Override // p000.zg3
                public final void zzb(DataHolder dataHolder) {
/* 1 */             Bundle bundle = dataHolder.f3468f;
/* 3 */             if (bundle == null) {
/* 5 */                 return;
                    }
                    synchronized (dataHolder) {
                        try {
/* 13 */                    DataHolder dataHolder2 = (DataHolder) bundle.getParcelable("parentsExtraHolder");
/* 15 */                    if (dataHolder2 != null) {
/* 17 */                        dataHolder2.close();
/* 22 */                        bundle.remove("parentsExtraHolder");
                            }
                        } catch (Throwable th) {
/* 31 */                    throw th;
                        }
                    }
                }

                @Override // p000.zg3
                public final String zzbd() {
/* 1 */             return "parentsExtraHolder";
                }
            }
